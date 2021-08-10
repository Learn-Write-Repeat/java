# Untitled

> **JAR**, or Java Archive, is a file format for storing packages. It is possible for JAR files to contain libraries, resources and metadata files. What it is, in essence, is a zip file containing the compressed versions of Java class files and resources. JAR files can be created with the .jar command or with tools such as Maven.

```java
META-INF/
    MANIFEST.MF // There may be additional metadata about files stored in the archive.
com/
    devincept/
        MyApplication.class
```

> WAR stands for Web Application Archive or Web Application Resource. These .war files are used to package web applications that we can deploy on any Servlet/JSP container. To create a .war archive, we can use the same tools and commands that we used to create a JAR.

```java
META-INF/
    MANIFEST.MF // Holds useful information in the about the web archive.
WEB-INF/
		/* Each of the static web resources is located in the WEB-INF public directory.
		This includes HTML pages, images and JS files. Web.xml and servlet classes and
		libraries are also included.*/
    web.xml
    jsp/
        devincept.jsp
    classes/
        static/
        templates/
        application.properties
    lib/
```