jersey Web API 作成
https://eclipse-ee4j.github.io/jersey/download.html

//Tomcatへリリース、。。。。うまくうごいていない　Tomcat１０でOK
mvn archetype:generate -DarchetypeGroupId=org.glassfish.jersey.archetypes -DarchetypeArtifactId=jersey-quickstart-webapp -DarchetypeVersion=3.0.2
http://localhost:8080/webApi1.0/




Tomcat 9 uses javax.servlet.Filter. Jersey 3.x, part of Jakarta EE 9, depends on jakarta based API packages. jakarta.servlet.Filter is available in Tomcat 10.

If you want to use Tomcat 9, use Jersey 2.x. If you want to use Jersey 3.x with Servlets, you need to use a servlet container that implements Servlet 5 API, e.g. Tomcat 10, Jetty 11, Glassfish 6.


