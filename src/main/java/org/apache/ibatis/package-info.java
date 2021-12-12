package org.apache.ibatis;

/*
mybatis 3.5.4最新稳定版

需要导入模块：需要将mybatis-parent模块导入。mybatis-parent模块链接 https://github.com/mybatis/parent

1.注解
org.apache.ibatis.annotations

2.绑定
org.apache.ibatis.binding

3.构建
org.apache.ibatis.builder
org.apache.ibatis.builder.annotation
org.apache.ibatis.builder.xml

4.缓存
org.apache.ibatis.cache
org.apache.ibatis.cache.decorators
org.apache.ibatis.cache.impl

5.游标功能
org.apache.ibatis.cursor
org.apache.ibatis.cursor.defaults

6.数据源
org.apache.ibatis.datasource
org.apache.ibatis.datasource.jndi
org.apache.ibatis.datasource.pooled
org.apache.ibatis.datasource.unpooled

7.异常
org.apache.ibatis.exceptions

8.执行器
org.apache.ibatis.executor
org.apache.ibatis.executor.keygen
org.apache.ibatis.executor.loader
org.apache.ibatis.executor.loader.cglib
org.apache.ibatis.executor.loader.javassist
org.apache.ibatis.executor.parameter
org.apache.ibatis.executor.result
org.apache.ibatis.executor.resultset
org.apache.ibatis.executor.statement

9.IO
org.apache.ibatis.io
通过类加载器在jar包中寻找一个package下满足条件(比如某个接口的子类)的所有类

10.jdbc单元测试工具
org.apache.ibatis.jdbc

11.在pom.xml文件中指明使用jdk的版本
org.apache.ibatis.lang

12.日志
org.apache.ibatis.logging
org.apache.ibatis.logging.commons
org.apache.ibatis.logging.jdbc
org.apache.ibatis.logging.jdk14
org.apache.ibatis.logging.log4j
org.apache.ibatis.logging.log4j2
org.apache.ibatis.logging.nologging
org.apache.ibatis.logging.slf4j
org.apache.ibatis.logging.stdout
对象适配器设计模式
设计模式可参考:https://www.processon.com/view/link/5ebac2241e08530a9bf4b169

13.映射
org.apache.ibatis.mapping

14.解析
org.apache.ibatis.parsing
xml解析，${} 格式的字符串解析

15.插件
org.apache.ibatis.plugin

16.反射
org.apache.ibatis.reflection
org.apache.ibatis.reflection.factory
org.apache.ibatis.reflection.invoker
org.apache.ibatis.reflection.property
org.apache.ibatis.reflection.wrapper
可以参考MetaObjectTest来跟踪调试，基本上用到了reflection包下所有的类

17.脚本
org.apache.ibatis.scripting
org.apache.ibatis.scripting.defaults
org.apache.ibatis.scripting.xmltags

18.会话
org.apache.ibatis.session
org.apache.ibatis.session.defaults

19.事务
org.apache.ibatis.transaction
org.apache.ibatis.transaction.jdbc
org.apache.ibatis.transaction.managed

20.类型处理器
org.apache.ibatis.type
实现java和jdbc中的类型之间转换

 */