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
-- Table structure for table `club`
--
create database if not exists centraldb;

use centraldb;


DROP TABLE IF EXISTS `club`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `club` (
  `ClubId` varchar(10) NOT NULL,
  `ClubName` varchar(100) NOT NULL,
  `Advisor` varchar(500) DEFAULT NULL,
  `PresidentId` varchar(10) DEFAULT NULL,
  `VisePresidentId` varchar(10) DEFAULT NULL,
  `SecretaryId` varchar(10) DEFAULT NULL,
  `AssSecretaryId` varchar(10) DEFAULT NULL,
  `TreasurerId` varchar(10) DEFAULT NULL,
  `Task` varchar(1000) DEFAULT NULL,
  `Suggestions` varchar(1000) DEFAULT NULL,
  `DateOfEstablish` date DEFAULT NULL,
  `MemberIdList` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ClubId`),
  UNIQUE KEY `ClubId_UNIQUE` (`ClubId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `club`
--

LOCK TABLES `club` WRITE;
/*!40000 ALTER TABLE `club` DISABLE KEYS */;
INSERT INTO `club` (`ClubId`, `ClubName`, `Advisor`, `PresidentId`, `VisePresidentId`, `SecretaryId`, `AssSecretaryId`, `TreasurerId`, `Task`, `Suggestions`, `DateOfEstablish`, `MemberIdList`) VALUES ('1','leo','A.S.A.Saman,A.K. wimutha','130037X','130238X','130274U','130546G','130306x','Motivate inter school.','make more funtions for motivate','2015-08-04','130281M,130023N,120031K,132412O,1234242P'),('12','Debet','','130282','','','','','','','1970-01-01',''),('2','moraspirit','H.K.Wimalasiri	','130281M','130037X','130282','130306x','17984','do social works.','collect some money','2001-01-05','130281A,130212Q,130342X,12233X'),('3','Cricket','A.S. wimalasiri','130281M','','','','','','','1999-01-02',''),('5','Foot Ball','','130306x','','','','','','','1998-01-03',''),('8','Music','','','','','','','','','1970-01-01',''),('9','athletic','','','','','','','','','1970-01-01','');
/*!40000 ALTER TABLE `club` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `incharge`
--

DROP TABLE IF EXISTS `incharge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `incharge` (
  `Incharge` varchar(45) DEFAULT NULL,
  `ClubId` varchar(45) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `incharge`
--

LOCK TABLES `incharge` WRITE;
/*!40000 ALTER TABLE `incharge` DISABLE KEYS */;
INSERT INTO `incharge` (`Incharge`, `ClubId`, `id`) VALUES ('933002406v','1',9),('933002406V','2',10),('933002406V','3',11),('933002406V','5',12),('933002406V','8',13),('933002406V','9',14),('933002406v','12',15);
/*!40000 ALTER TABLE `incharge` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'centraldb'
--

--
-- Dumping routines for database 'centraldb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-19 14:03:27
