https://eclipse-ee4j.github.io/jersey/download.html

//Javaアプリとして実行する
mvn archetype:generate -DarchetypeGroupId=org.glassfish.jersey.archetypes -DarchetypeArtifactId=jersey-quickstart-grizzly2 -DarchetypeVersion=3.0.2
http://localhost:8080/myresource




//Tomcatへリリース、。。。。うまくうごいていない　Tomcat１０でOK
mvn archetype:generate -DarchetypeGroupId=org.glassfish.jersey.archetypes -DarchetypeArtifactId=jersey-quickstart-webapp -DarchetypeVersion=3.0.2
http://localhost:8080/webApi1.0/




Tomcat 9 uses javax.servlet.Filter. Jersey 3.x, part of Jakarta EE 9, depends on jakarta based API packages. jakarta.servlet.Filter is available in Tomcat 10.

If you want to use Tomcat 9, use Jersey 2.x. If you want to use Jersey 3.x with Servlets, you need to use a servlet container that implements Servlet 5 API, e.g. Tomcat 10, Jetty 11, Glassfish 6.



---
Spring boot : jersey
---
使用Eclipse搭建SpringBoot开发环境
https://www.jianshu.com/p/f706ff4f9e2f

Spring Boot Jersey 教程
https://geek-docs.com/spring-boot/spring-boot-tutorials/jersey.html#Spring_Boot_Jersey


Spring Boot Jersey
https://zetcode.com/springboot/jersey/
https://www.baeldung.com/jersey-rest-api-with-spring




Lombok　　：java getter setter 
「pleiades-2019-03-ultimate-win-64bit-jre_20190508.zip」にはインストールずみです。

使い方：https://www.jianshu.com/p/2ea9ff98f7d6
https://qiita.com/opengl-8080/items/671ffd4bf84fe5e32557