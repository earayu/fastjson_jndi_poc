# Alibaba Fastjson 远程代码执行漏洞 JNDI POC

调试步骤：

1. 将`Exploit.java`编译后的`class`文件放入`resources\static`目录
2. 运行`FastjsonJndiPocApplication`、启动web环境，暴露`http://127.0.0.1/Exploit.class`
3. 运行`JNDIServer`
4. 运行`SomeFastjsonApp`， `Exploit.java`构造函数中的恶意代码将执行

前3步由攻击者在远程搭建、第4步为Fastjson正常使用流程，恶意代码将会在受害者本地执行。



影响：fastjson在1.2.24以及之前版本

官方通告：https://github.com/alibaba/fastjson/wiki/security_update_20170315



### 相关资料

[基于JdbcRowSetImpl的Fastjson RCE PoC构造与分析](http://xxlegend.com/2017/12/06/%E5%9F%BA%E4%BA%8EJdbcRowSetImpl%E7%9A%84Fastjson%20RCE%20PoC%E6%9E%84%E9%80%A0%E4%B8%8E%E5%88%86%E6%9E%90/) (影响版本1.2.24以及之前版本)

[fastjson 远程反序列化poc的构造和分析](http://xxlegend.com/2017/04/29/title-%20fastjson%20%E8%BF%9C%E7%A8%8B%E5%8F%8D%E5%BA%8F%E5%88%97%E5%8C%96poc%E7%9A%84%E6%9E%84%E9%80%A0%E5%92%8C%E5%88%86%E6%9E%90/) (影响版本1.2.22-1.2.24)

[Fastjson Unserialize Vulnerability Write Up](https://ricterz.me/posts/Fastjson%20Unserialize%20Vulnerability%20Write%20Up)

[fastjson 漏洞调试利用记录](http://5alt.me/2017/09/fastjson%E8%B0%83%E8%AF%95%E5%88%A9%E7%94%A8%E8%AE%B0%E5%BD%95/)

