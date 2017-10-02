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
-- Table structure for table `student`
--
create database if not exists centraldb;

use centraldb;
DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `AdmissionNumber` varchar(10) NOT NULL,
  `FullNameEnglish` varchar(200) NOT NULL,
  `FullNameSinhala` varchar(200) DEFAULT NULL,
  `BirthDate` date DEFAULT NULL,
  `House` varchar(20) DEFAULT NULL,
  `Religion` varchar(25) DEFAULT NULL,
  `Address` varchar(300) DEFAULT NULL,
  `TelephoneNumber` varchar(20) DEFAULT NULL,
  `DateOfAdmission` date DEFAULT NULL,
  `ClassOfAdmission` varchar(5) DEFAULT NULL,
  `Gender` varchar(6) NOT NULL,
  `NameWithInitials` varchar(100) DEFAULT NULL,
  `GramaNiladhariVasama` varchar(50) DEFAULT NULL,
  `ComeToSchoolBy` varchar(100) DEFAULT NULL,
  `FamilyKey` int(11) DEFAULT NULL,
  `Password` varchar(256) DEFAULT NULL,
  `AccesPriviledge` int(11) DEFAULT NULL,
  PRIMARY KEY (`AdmissionNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`AdmissionNumber`, `FullNameEnglish`, `FullNameSinhala`, `BirthDate`, `House`, `Religion`, `Address`, `TelephoneNumber`, `DateOfAdmission`, `ClassOfAdmission`, `Gender`, `NameWithInitials`, `GramaNiladhariVasama`, `ComeToSchoolBy`, `FamilyKey`, `Password`, `AccesPriviledge`) VALUES ('130037X','Ravidu Lashan Mallawa Arachchi','','1992-09-15','Gamunu','Islam','19/3,Walpola ,Angoda','0112568412','2015-08-05','5K','Male','R. L. M. Arachchi','Beragama','Van',1,'MKf4pnBpUp2sLAqoFwE3tOroia1FB8NQw8/HLibaG6k5IX6souFPZIxJBV+R7xR/',5),('130101N','Nadeeshani Kawshalya Dayarathna','','2000-08-08','Gamunu','Catholic','\"\"kaushalya\", walasmulla',' 072534234','2012-08-09','1','Female','N. K. Dayarathna','Pibura','Foot',2,'MKf4pnBpUp2sLAqoFwE3tOroia1FB8NQw8/HLibaG6k5IX6souFPZIxJBV+R7xR/',5),('130238X','Sachithra Dilini Jayasiri','','1992-05-26','Thissa','Buddhism','12, Ranaviru Chathurasraya, Dencil Kobbakaduwa Mawatha, Galle Road, Thangalle.','0711234578','2004-03-02','6A','Female','S. D. Jayasiri','Beragama','Van',3,'MKf4pnBpUp2sLAqoFwE3tOroia1FB8NQw8/HLibaG6k5IX6souFPZIxJBV+R7xR/',5),('130274U','Charuni Kaushalya Karunanayake','','1993-07-19','Gamunu','Catholic','Bulath kela paara, Padikkama, Gampaha.','0712324256','2014-03-03','6C','Female','C. K. Karunanayake','Beragama','None of the above',4,'MKf4pnBpUp2sLAqoFwE3tOroia1FB8NQw8/HLibaG6k5IX6souFPZIxJBV+R7xR/',5),('130281M','Karunarathne Mudiyanselage Chanaka Maduranga Karunarathne','','1993-10-26','Parakrama','Buddhism','29/A, \"Sumadura\" Bandaranayaka mawatha, Maththumagala, Ragama.','0717899366','2014-03-03','6J','Male','K. M. C. M. Karunarathne','Agalawaththa','Train and Bus',5,'MKf4pnBpUp2sLAqoFwE3tOroia1FB8NQw8/HLibaG6k5IX6souFPZIxJBV+R7xR/',5),('130282','Nuwan Chathuranga Karunarathna','','1994-01-06','Parakrama','Islam','I don\'t know where, Galle.','07146333','2014-05-07','B1','Male','N. C. Karunarathna','Udawela','Train and Bus',26,'MKf4pnBpUp2sLAqoFwE3tOroia1FB8NQw8/HLibaG6k5IX6souFPZIxJBV+R7xR/',5),('130306x','Kumarage Tharindu Sandaruwan Kumarage ','','1993-06-10','Gamunu','Buddhism','','0710866395','2005-11-16','6C','Male','K. T. S. Kumarage','Beragama','Bus',6,'MKf4pnBpUp2sLAqoFwE3tOroia1FB8NQw8/HLibaG6k5IX6souFPZIxJBV+R7xR/',5),('130546G','Wedige Melanka Saroad','','1993-11-08','Parakrama','Hindu','207/3A, Koswaththa, Baththaramulla.','0771406826','2015-08-17','13M','Male','W. M. Saroad','Beragama','Bus',7,'MKf4pnBpUp2sLAqoFwE3tOroia1FB8NQw8/HLibaG6k5IX6souFPZIxJBV+R7xR/',5),('17984','Mahakumara Weediyage Don Prabath Sandaruwan','','1993-12-31','Vijaya','Buddhism','No 62/Beragama /Agalawatta','0719561619','2008-08-20','7','Male','M. W. D. P. Sandaruwan','Udawela','Train and Bus',39,'MKf4pnBpUp2sLAqoFwE3tOroia1FB8NQw8/HLibaG6k5IX6souFPZIxJBV+R7xR/',5);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-19 12:56:36
