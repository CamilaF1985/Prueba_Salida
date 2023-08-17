CREATE DATABASE  IF NOT EXISTS `prueba` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `prueba`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: prueba
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `citas`
--

DROP TABLE IF EXISTS `citas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `citas` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Paciente_ID` int DEFAULT NULL,
  `Doctor_ID` int DEFAULT NULL,
  `Fecha` date DEFAULT NULL,
  `Factura_ID` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Paciente_ID` (`Paciente_ID`),
  KEY `Doctor_ID` (`Doctor_ID`),
  KEY `Factura_ID` (`Factura_ID`),
  CONSTRAINT `citas_ibfk_1` FOREIGN KEY (`Paciente_ID`) REFERENCES `pacientes` (`ID`),
  CONSTRAINT `citas_ibfk_2` FOREIGN KEY (`Doctor_ID`) REFERENCES `doctores` (`ID`),
  CONSTRAINT `citas_ibfk_3` FOREIGN KEY (`Factura_ID`) REFERENCES `facturas` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `citas`
--

LOCK TABLES `citas` WRITE;
/*!40000 ALTER TABLE `citas` DISABLE KEYS */;
INSERT INTO `citas` VALUES (1,1,1,'2023-07-25',1),(2,2,2,'2023-07-26',2),(3,3,3,'2023-07-27',3),(4,4,4,'2023-07-28',4),(5,5,5,'2023-07-29',5),(6,1,2,'2023-07-30',6),(7,2,3,'2023-07-31',7),(8,3,4,'2023-08-01',8),(9,4,5,'2023-08-02',9),(10,5,1,'2023-08-03',10);
/*!40000 ALTER TABLE `citas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctores`
--

DROP TABLE IF EXISTS `doctores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctores` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) DEFAULT NULL,
  `Especialidad_ID` int DEFAULT NULL,
  `Experiencia` int DEFAULT NULL,
  `id_usuario` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Especialidad_ID` (`Especialidad_ID`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `doctores_ibfk_1` FOREIGN KEY (`Especialidad_ID`) REFERENCES `especialidades` (`ID`),
  CONSTRAINT `doctores_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctores`
--

LOCK TABLES `doctores` WRITE;
/*!40000 ALTER TABLE `doctores` DISABLE KEYS */;
INSERT INTO `doctores` VALUES (1,'Dr. Ramírez',1,5,1),(2,'Dra. Rodríguez',2,5,2),(3,'Dr. Fernández',3,10,3),(4,'Dra. González',4,15,4),(5,'Dr. Sánchez',5,20,5);
/*!40000 ALTER TABLE `doctores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialidades`
--

DROP TABLE IF EXISTS `especialidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `especialidades` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidades`
--

LOCK TABLES `especialidades` WRITE;
/*!40000 ALTER TABLE `especialidades` DISABLE KEYS */;
INSERT INTO `especialidades` VALUES (1,'Cardiología'),(2,'Dermatología'),(3,'Neurología'),(4,'Endocrinología'),(5,'Oncología');
/*!40000 ALTER TABLE `especialidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturas`
--

DROP TABLE IF EXISTS `facturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facturas` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Monto` decimal(8,2) DEFAULT NULL,
  `Fecha_Pago` date DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturas`
--

LOCK TABLES `facturas` WRITE;
/*!40000 ALTER TABLE `facturas` DISABLE KEYS */;
INSERT INTO `facturas` VALUES (1,100.00,'2023-07-26'),(2,150.00,NULL),(3,200.00,'2023-07-27'),(4,250.00,'2023-07-28'),(5,300.00,NULL),(6,350.00,'2023-07-29'),(7,400.00,NULL),(8,450.00,'2023-07-30'),(9,500.00,NULL),(10,550.00,'2023-07-31');
/*!40000 ALTER TABLE `facturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historia_clinica`
--

DROP TABLE IF EXISTS `historia_clinica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historia_clinica` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Paciente_ID` int DEFAULT NULL,
  `Doctor_ID` int DEFAULT NULL,
  `Fecha_Cita` date DEFAULT NULL,
  `Sintomas` text,
  `Diagnostico` text,
  `Tratamiento` text,
  PRIMARY KEY (`ID`),
  KEY `Paciente_ID` (`Paciente_ID`),
  KEY `Doctor_ID` (`Doctor_ID`),
  CONSTRAINT `historia_clinica_ibfk_1` FOREIGN KEY (`Paciente_ID`) REFERENCES `pacientes` (`ID`),
  CONSTRAINT `historia_clinica_ibfk_2` FOREIGN KEY (`Doctor_ID`) REFERENCES `doctores` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historia_clinica`
--

LOCK TABLES `historia_clinica` WRITE;
/*!40000 ALTER TABLE `historia_clinica` DISABLE KEYS */;
INSERT INTO `historia_clinica` VALUES (1,1,1,'2023-07-25','Dolor en el pecho','Angina de pecho','Medicación y reposo'),(2,2,2,'2023-07-26','Erupción cutánea','Alergia','Antihistamínicos'),(3,3,3,'2023-07-27','Dolor de cabeza','Migraña','Medicación y reposo'),(4,4,4,'2023-07-28','Aumento de peso','Hipotiroidismo','Medicación'),(5,5,5,'2023-07-29','Fatiga','Anemia','Suplementos de hierro'),(6,1,2,'2023-07-30','Acné','Acné común','Antibióticos tópicos'),(7,2,3,'2023-07-31','Pérdida de memoria','Estrés','Terapia y relajación'),(8,3,4,'2023-08-01','Sed excesiva','Diabetes','Dieta y medicación'),(9,4,5,'2023-08-02','Pérdida de peso','Cáncer','Quimioterapia'),(10,5,1,'2023-08-03','Palpitaciones','Arritmia','Medicación');
/*!40000 ALTER TABLE `historia_clinica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pacientes`
--

DROP TABLE IF EXISTS `pacientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pacientes` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) DEFAULT NULL,
  `Fecha_Nacimiento` date DEFAULT NULL,
  `id_usuario` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `pacientes_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pacientes`
--

LOCK TABLES `pacientes` WRITE;
/*!40000 ALTER TABLE `pacientes` DISABLE KEYS */;
INSERT INTO `pacientes` VALUES (1,'Juan Pérez','1985-03-15',6),(2,'María López','1990-07-25',7),(3,'José García','1978-05-10',8),(4,'Marta González','2001-01-20',9),(5,'Luisa Fernández','1995-12-30',10);
/*!40000 ALTER TABLE `pacientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `user` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `rol` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `tipo` enum('Paciente','Doctor') NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'ramirez','$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.','ROLE_doctor','ramirez@gmail.com','Doctor'),(2,'rodriguez','$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.','ROLE_doctor','rodriguez@gmail.com','Doctor'),(3,'fernandez','$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.','ROLE_doctor','fernandez@gmail.com','Doctor'),(4,'gonzalez','$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.','ROLE_doctor','gonzalez@gmail.com','Doctor'),(5,'sanchez','$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.','ROLE_doctor','sanchez@gmail.com','Doctor'),(6,'jperez','$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.','ROLE_paciente','perez@gmail.com','Paciente'),(7,'mlopez','$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.','ROLE_paciente','lopez@gmail.com','Paciente'),(8,'jgarcia','$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.','ROLE_paciente','garcia@gmail.com','Paciente'),(9,'mgonzalez','$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.','ROLE_paciente','gonzalez@gmail.com','Paciente'),(10,'lfernandez','$2a$12$SwioMN5fx7J1pmYwgoeZpeeO3kL0uoxcCQk5Qq0aNM8V3NpukYjp.','ROLE_paciente','fernandez@gmail.com','Paciente');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-17  9:51:32
