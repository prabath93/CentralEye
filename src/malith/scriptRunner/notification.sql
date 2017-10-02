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
-- Table structure for table `notification`
--
create database if not exists centraldb;

use centraldb;

DROP TABLE IF EXISTS `notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notification` (
  `idOfPersonTryToChange` varchar(20) NOT NULL,
  `nameWhoChange` varchar(50) NOT NULL,
  `typeOfPersonGoingToBeChanged` varchar(20) DEFAULT NULL,
  `nameWhoGoingToBeChanged` varchar(50) DEFAULT NULL,
  `NIC` varchar(10) DEFAULT NULL,
  `RNo` varchar(11) DEFAULT NULL,
  `NameWithIn` varchar(50) DEFAULT NULL,
  `FullName` varchar(100) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Dob` date DEFAULT NULL,
  `CivilStatus` varchar(10) DEFAULT NULL,
  `Address` varchar(150) DEFAULT NULL,
  `TelNoMobile` varchar(20) DEFAULT NULL,
  `TelNoRecident` varchar(20) DEFAULT NULL,
  `DateOfAssignmentAsTeacher` date DEFAULT NULL,
  `DateOfAssignmentToSchool` date DEFAULT NULL,
  `EducationalQual` varchar(1000) DEFAULT NULL,
  `ProffesionalQual` varchar(1000) DEFAULT NULL,
  `SubjectsAndClasses` varchar(1000) DEFAULT NULL,
  `SubjectsWishToTeach` varchar(100) DEFAULT NULL,
  `GradesWishToTeach` varchar(100) DEFAULT NULL,
  `NatureOfPresentPost` varchar(45) DEFAULT NULL,
  `GradeOfService` varchar(5) DEFAULT NULL,
  `DateOfPromotion` date DEFAULT NULL,
  `SectionTaught` varchar(10) DEFAULT NULL,
  `ServiceRecord` varchar(1000) DEFAULT NULL,
  `PositionInSchool` varchar(20) DEFAULT NULL,
  `AdmissionNumber` varchar(10) DEFAULT NULL,
  `FullNameEnglish` varchar(200) DEFAULT NULL,
  `FullNameSinhala` varchar(200) DEFAULT NULL,
  `BirthDate` date DEFAULT NULL,
  `House` varchar(20) DEFAULT NULL,
  `Religion` varchar(25) DEFAULT NULL,
  `FamilyKey` int(11) DEFAULT NULL,
  `TelephoneNumber` varchar(20) DEFAULT NULL,
  `DateOfAdmission` date DEFAULT NULL,
  `ClassOfAdmission` varchar(5) DEFAULT NULL,
  `NameWithInitials` varchar(100) DEFAULT NULL,
  `GramaNiladhariVasama` varchar(50) DEFAULT NULL,
  `ComeToSchoolBy` varchar(100) DEFAULT NULL,
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
  `BroSis5Name` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notification`
--

LOCK TABLES `notification` WRITE;
/*!40000 ALTER TABLE `notification` DISABLE KEYS */;
INSERT INTO `notification` (`idOfPersonTryToChange`, `nameWhoChange`, `typeOfPersonGoingToBeChanged`, `nameWhoGoingToBeChanged`, `NIC`, `RNo`, `NameWithIn`, `FullName`, `Gender`, `Dob`, `CivilStatus`, `Address`, `TelNoMobile`, `TelNoRecident`, `DateOfAssignmentAsTeacher`, `DateOfAssignmentToSchool`, `EducationalQual`, `ProffesionalQual`, `SubjectsAndClasses`, `SubjectsWishToTeach`, `GradesWishToTeach`, `NatureOfPresentPost`, `GradeOfService`, `DateOfPromotion`, `SectionTaught`, `ServiceRecord`, `PositionInSchool`, `AdmissionNumber`, `FullNameEnglish`, `FullNameSinhala`, `BirthDate`, `House`, `Religion`, `FamilyKey`, `TelephoneNumber`, `DateOfAdmission`, `ClassOfAdmission`, `NameWithInitials`, `GramaNiladhariVasama`, `ComeToSchoolBy`, `FatherName`, `FatherJob`, `FatherWorkPlace`, `FatherWorkAddress`, `FatherWorkTelephone`, `FatherHomeTelephone`, `FatherMobile`, `MotherName`, `MotherJob`, `MotherWorkPlace`, `MotherWorkAddress`, `MotherWorkTelephone`, `MotherHomeTelephone`, `MotherMobile`, `BroSis1AdmissionNumber`, `BroSis2AdmissionNumber`, `BroSis3AdmissionNumber`, `BroSis4AdmissionNumber`, `BroSis5AdmissionNumber`, `BroSis1Name`, `BroSis2Name`, `BroSis3Name`, `BroSis4Name`, `BroSis5Name`) VALUES ('Teacher','M.W.D.Sandaruwan','Teacher','Mahakumara Weediyage Don Prabath Sandaruwan','933662306v','123','M.W.D.Sandaruwan','Mahakumara Weediyage Don Prabath Sandaruwan','male','1993-12-31','Unmarried','No62/Ambagahagoda/Beragama/Agalawatta','0719561619','0342244009','2014-08-13','2015-08-13','*Undergraduate in university of moratuwa','',NULL,'physics,chemistry','12','Graduated','3-2',NULL,'A/L',NULL,'Teacher',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('933662306v','M.W.D.P.Sandaruwan','Student','Ravidu Lashan Mallawa Arachchi',NULL,NULL,NULL,NULL,'Male',NULL,NULL,'19/3,Walpola ,Angoda',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'130037X','Ravidu Lashan Mallawa Arachchi','','1992-09-15','Gamunu','Islam',1,'0112568413','2015-08-05','5K','R. L. M. Arachchi','Beragama','Van','Mr, Mallawa Arachchi.','','','','','','','','','','','','','','130238X','','','','','Sachithra Dilini Jayasiri','','','',''),('933662306v','M.W.D.P.Sandaruwan','Student','Kumarage Tharindu Sandaruwan Kumarage ',NULL,NULL,NULL,NULL,'Male',NULL,NULL,'',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'130306x','Kumarage Tharindu Sandaruwan Kumarage ','','1993-06-10','Gamunu','Buddhism',6,'0710866396','2005-11-16','6C','K. T. S. Kumarage','Beragama','Bus','','','','','','','','','','','','','','','','','','','','','','','','');
/*!40000 ALTER TABLE `notification` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-19 13:41:43
