# multi-spring-xml
spring的命名空间配置方式，在此基础上不断地学习研究新技术，添加新功能
+ spring-web可以通过实现接口ApplicationContextAware，实现便捷获取bean实例
+ 如果想使用aop功能，必须配置`<aop:aspectj-autoproxy proxy-target-class="true"></aop:aspectj-autoproxy>`打开aop功能，<br/>
   `proxy-target-class="true"`表示是否启用cglib，默认对service的代理使用的是Java代理。
+ 切点（pointcut）的表达式(expression)可以参考博客：`https://www.cnblogs.com/rainy-shurun/p/5195439.html`

#####发现与疑问
+ `<aop:config>`必须配置在applicationContext.xml中才起效，servlet.xml中没用。不明就里。