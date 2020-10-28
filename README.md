# INGP2020_GROUP5
# GROUP5:
Supriya Akula : Database and Backend

Ganesh Akhil : Frontend
        
SCRUM MASTER : Supriya

# Frontend : Angular 8
# Backend : Spring Boot(STS4)
# Database : MYSQL

#  In this visa registration form we created a visa application registration form with Angular and connected with Spring Boot and MYSQL.If we enter those details in Frontend Page and submit the form.Then, automatically those registration details are stored in DNA_DB DATABASE in MYSQL.

# Tools
Spring Boot 

JDK - 1.8

Spring Framework 

Hibernet

Maven 

IDE - Spring Tool Suite (STS)

Tomcat  

MySQL 

# Generate: Maven Project
Java Version: 1.8 (Default)

Spring Boot

Group: com.visa

Artifact: Visaapp-Registration-Form

Name: Visaapp-Registration-Form

Package Name : com.app.visa

Dependencies: Web, JPA, MySQL

# DATABASE :
CREATE DATABASE DNA_DB;

USE DNA_DB;

create table USER_REG_TBL(id integer not null,country varchar(255),email varchar(255),experience integer not null,name varchar(255),primary key(id)) engine = MyISAM;

select * from USER_REG_TBL;

# Sprintboot: http://localhost:9090/      
# Angular:run in url - http://localhost:4200/register  and http://localhost:4200/search

# AUTHOR
SUPRIYA AKULA

GANESH AKHIL

