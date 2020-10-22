# INGP2020_GROUP5
# GROUP5:
Akula Supriya : Database and Backend

Ganesh Akhil : Frontend
        
SCRUM MASTER : Supriya Akula

# In this visa application registration form we created a visa registration form with Spring Boot, Spring Security, Hibernate and Thymeleaf. We validate the user registration fields with hibernate validator annotations and a custom field matching validator to validate if the email and password fields match. If those fields are matched then it shows your visa application form is being processed. Those registration details are stored in DNA DATABASE in MYSQL.

# Tools
Spring Boot 

JDK - 1.8

Spring Framework 

Hibernate 

Maven 

IDE - Spring Tool Suite (STS)

Tomcat 

Thymeleaf 

Bootstrap 

JQuery 

MySQL 

# Generate: Maven Project
Java Version: 1.8 (Default)

Spring Boot:2.0.4

Group: com.visaapp

Artifact: Visa-Registration-Application-Form

Name: Visa-Registration-Application-Form

Package Name : com.visa.app

Dependencies: Web, JPA, MySQL,Thymeleaf,Security

# DATABASES
CREATE DATABASE DNA;

USE DNA;


CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKob8kqyqqgmefl0aco34akdtpe` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




CREATE TABLE `users_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  KEY `FKt4v0rrweyk393bdgt107vdx0x` (`role_id`),
  KEY `FKgd3iendaoyh04b95ykqise6qh` (`user_id`),
  CONSTRAINT `FKgd3iendaoyh04b95ykqise6qh` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `FKt4v0rrweyk393bdgt107vdx0x` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

SELECT * FROM user;

# AUTHOR
SUPRIYA AKULA

GANESH AKHIL
