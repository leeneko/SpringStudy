# SpringStudy(스프링 공부)</br>

`Program development environment`</br>
`Tomcat : 8.5.42`</br>
`STS : 3.9.8`</br>
`Spring : 4.3.24`</br>
`Usable DB : oracle, mysql, mssql, hana, (+ mongo?)`</br>

---

## 스프링 프로젝트 초기 설정

#### 1. 프로젝트 생성
* File - Spring Legacy Project
* Spring MVC Project 선택

#### 2. pom.xml에서 JDK의 버전과 스프링 버전 수정
~~~
<properties>
  <java-version>1.8</java-version>
  <org.springframework-version>4.3.24.RELEASE</org.springframework-version>
  <org.aspectj-version>1.6.10</org.aspectj-version>
  <org.slf4j-version>1.6.6</org.slf4j-version>
</properties>
~~~

#### 3. 프로젝트의 Properties - Project Facts 에서 JDK 버전 설정
![projectFacts](./images/projectFacts.png)

#### 4. pom.xml에 라이브러리 추가 (참고 : [Mavenrepository](https://mvnrepository.com/))
* Spring-test 모듈
~~~
<!-- https://mvnrepository.com/artifact/org.springframework/spring-test -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-test</artifactId>
    <version>4.3.24.RELEASE</version>
    <scope>test</scope>
</dependency>
~~~
* Spring-jdbc 모듈
~~~
<!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>4.3.24.RELEASE</version>
</dependency>
~~~
* SQL 드라이버(oracle, mysql, mssql, hana, (+ mongo?)) _개발환경에 맞춰서_
* MyBatis 모듈
~~~
<!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.4.6</version>
</dependency>
~~~
* MyBatis-spring 모듈
~~~
<!-- https://mvnrepository.com/artifact/org.mybatis/mybatis-spring -->
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis-spring</artifactId>
    <version>1.3.2</version>
</dependency>
~~~
* MyBatis 로그 모듈
~~~
<!-- https://mvnrepository.com/artifact/org.bgee.log4jdbc-log4j2/log4jdbc-log4j2-jdbc4 -->
<dependency>
    <groupId>org.bgee.log4jdbc-log4j2</groupId>
    <artifactId>log4jdbc-log4j2-jdbc4</artifactId>
    <version>1.16</version>
</dependency>
~~~

#### 5. pom.xml 에서 JUnit 버전과 Servlet 버전 변경
* Servlet 버전 변경
~~~
<!-- https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api -->
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>3.1.0</version>
    <scope>provided</scope>
</dependency>
~~~
* JUnit 버전 변경
~~~
<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>
~~~

---

## 스프링 프로젝트 AOP 설정
