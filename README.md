# SpringStudy(스프링 공부)
==========

`Program development environment`</br>
`Tomcat : 8.5.42`</br>
`STS : 3.9.8`</br>
`Spring : 4.3.24`</br>
`Usable DB : mssql, oracle, mysql, hana, (+ mongo?)`</br>

### 스프링 프로젝트 초기 설정
---
1.프로젝트 생성
* File - Spring Legacy Project
* Spring MVC Project 선택
2.pom.xml에서 JDK의 버전과 스프링 버전 수정
~~~
<properties>
  <java-version>1.8</java-version>
  <org.springframework-version>4.3.24.RELEASE</org.springframework-version>
  <org.aspectj-version>1.6.10</org.aspectj-version>
  <org.slf4j-version>1.6.6</org.slf4j-version>
</properties>
~~~
3.프로젝트의 Properties - Project Facts 에서 JDK 버전 설정
<img>
