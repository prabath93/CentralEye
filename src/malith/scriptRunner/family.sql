-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: centraldb
-- ------------------------------------------------------
-- Server version	5.6.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `family`
--
create database if not exists centraldb;

use centraldb;
DROP TABLE IF EXISTS `family`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `family` (
  `FamilyKey` int(11) NOT NULL AUTO_INCREMENT,
  `FatherName` varchar(100) DEFAULT NULL,
  `FatherJob` varchar(45) DEFAULT NULL,
  `FatherWorkPlace` varchar(45) DEFAULT NULL,
  `FatherWorkAddress` varchar(300) DEFAULT NULL,
  `FatherWorkTelephone` varchar(15) DEFAULT NULL,
  `FatherHomeTelephone` varchar(15) DEFAULT NULL,
  `FatherMobile` varchar(15) DEFAULT NULL,
  `MotherName` varchar(100) DEFAULT NULL,
  `MotherJob` varchar(45) DEFAULT NULL,
  `MotherWorkPlace` varchar(45) DEFAULT NULL,
  `MotherWorkAddress` varchar(300) DEFAULT NULL,
  `MotherWorkTelephone` varchar(15) DEFAULT NULL,
  `MotherHomeTelephone` varchar(15) DEFAULT NULL,
  `MotherMobile` varchar(15) DEFAULT NULL,
  `BroSis1AdmissionNumber` varchar(10) DEFAULT NULL,
  `BroSis2AdmissionNumber` varchar(10) DEFAULT NULL,
  `BroSis3AdmissionNumber` varchar(10) DEFAULT NULL,
  `BroSis4AdmissionNumber` varchar(10) DEFAULT NULL,
  `BroSis5AdmissionNumber` varchar(10) DEFAULT NULL,
  `BroSis1Name` varchar(200) DEFAULT NULL,
  `BroSis2Name` varchar(200) DEFAULT NULL,
  `BroSis3Name` varchar(200) DEFAULT NULL,
  `BroSis4Name` varchar(200) DEFAULT NULL,
  `BroSis5Name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`FamilyKey`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `family`
--

LOCK TABLES `family` WRITE;
/*!40000 ALTER TABLE `family` DISABLE KEYS */;
INSERT INTO `family` (`FamilyKey`, `FatherName`, `FatherJob`, `FatherWorkPlace`, `FatherWorkAddress`, `FatherWorkTelephone`, `FatherHomeTelephone`, `FatherMobile`, `MotherName`, `MotherJob`, `MotherWorkPlace`, `MotherWorkAddress`, `MotherWorkTelephone`, `MotherHomeTelephone`, `MotherMobile`, `BroSis1AdmissionNumber`, `BroSis2AdmissionNumber`, `BroSis3AdmissionNumber`, `BroSis4AdmissionNumber`, `BroSis5AdmissionNumber`, `BroSis1Name`, `BroSis2Name`, `BroSis3Name`, `BroSis4Name`, `BroSis5Name`) VALUES (1,'Mr, Mallawa Arachchi.','','','','','','','','','','','','','','130238X','','','','','Sachithra Dilini Jayasiri','','','',''),(2,'Mr. Dayarathna','','','','','','','','','','','','','','','','','','','','','','',''),(3,'Mr. Jayasiri','','','','','','','Mrs. Jayasiri','','','','','','','','','','','','','','','',''),(4,'','','','','','','','','','','','','','','','','','','','','','','',''),(5,'K. M. D. Karunarathne','Business','Liyangahavela','39, 7th mile post, Liyangahawela, Bandarawela.','-','-','0773711161','H. P. Maduri Karunarathne','-','-','-','-','-','-','130281M','','130281M','130281M','130281M','K. M. Chirantha madushan karunarathne','','Karunarathne Mudiyanselage Chanaka Maduranga Karunarathne','Karunarathne Mudiyanselage Chanaka Maduranga Karunarathne','Karunarathne Mudiyanselage Chanaka Maduranga Karunarathne'),(6,'','','','','','','','','','','','','','','','','','','','','','','',''),(7,'','','','','','','','','','','','','','','','','','','','','','','',''),(8,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(26,'','','','','','','','','','','','','','','','','','','','','','','',''),(35,'','','','','','','','','','','','','','','130281M','ddfdf','dfdf','dfdf','dfdf','Karunarathne Mudiyanselage Chanaka Maduranga Karunarathne','d','f','df','f'),(36,'','','','','','','','','','','','','','','130281M','ddfdf','dfdf','dfdf','dfdf','Karunarathne Mudiyanselage Chanaka Maduranga Karunarathne','d','f','df','f'),(39,'M.W.D.Gamini','Manager','sarvodaya','','','','','M.W.D.Kumuduni','','','','','','','130281M','','','','','Karunarathne Mudiyanselage Chanaka Maduranga Karunarathne','','','','');
/*!40000 ALTER TABLE `family` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-19 12:32:04
