package com.mercy.service.impl;

import com.mercy.excption.MyOwnerException;
import com.mercy.service.CoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@Service
public class CoreServiceImpl implements CoreService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${myldap.url}")
    private String url;
    @Value("${myldap.adminName}")
    private String name;
    @Value("${myldap.adminPassword}")
    private String password;


    @Override
    public void getContextInfo() throws Exception {
        logger.info("CoreServiceImpl.getContextInfo param:{}");
        Hashtable<String, Object> initTable = new Hashtable<>();
        initTable.put(Context.SECURITY_PRINCIPAL, name);
        initTable.put(Context.SECURITY_CREDENTIALS, password);
        initTable.put(Context.PROVIDER_URL, url);
        //Ldap工厂类
        initTable.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        //ldap安全级别
        initTable.put(Context.SECURITY_AUTHENTICATION, "simple");
        //连接超时设置为3秒
        initTable.put("com.sun.jndi.ldap.connect.timeout", "3000");
        try {
            //建立连接
            LdapContext ldapContext = new InitialLdapContext(initTable, null);
            //创建索引及定制返回属性
            SearchControls searchCtls = new SearchControls(); //Create the search controls
            searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
            //String dn="";
            String searchFilter = "objectClass=User";
            //搜索域节点
            String searchBase = "OU=中联中国,OU=Activity Users,DC=adtest,DC=com";
            //String returnedAtts[] = {"memberOf"};//定制返回属性
            String reAttrs[] = {"distinguishedName", "LastLogon", "LastLogoff", "name", "sAMAccountName",
                    "displayName", "pwdLastSet", "userAccountControl", "userPrincipalName", "whenChanged",
                    "whenCreated"};
            searchCtls.setReturningAttributes(reAttrs);
            NamingEnumeration<SearchResult> enumeration = ldapContext.search(searchBase, searchFilter, searchCtls);
            while (enumeration != null && enumeration.hasMoreElements()) {
                //map 转换存储用户信息
                Map<String, Object> userMap = new HashMap<>();
                SearchResult next = enumeration.next();
                Attributes attributes = next.getAttributes();
                if (attributes != null) {
                    NamingEnumeration<? extends Attribute> all = attributes.getAll();
                    NamingEnumeration<String> iDs = attributes.getIDs();
                    while (all.hasMoreElements()) {
                        Attribute attribute = all.next();
                        String id = attribute.getID();
                        Object o = attribute.get();
                        //NamingEnumeration<?> attributeAll = attribute.getAll();
                        //if (attributeAll != null) {
                        //    while (attributeAll.hasMoreElements()) {
                        //        Object element = attributeAll.nextElement();
                        //        String string = element.toString();
                        //
                        //
                        //    }
                        //}
                    }
                }
            }

        } catch (NamingException e) {
            throw new MyOwnerException("链接ad域异常");
        }

    }

}
