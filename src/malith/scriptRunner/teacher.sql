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
-- Table structure for table `teacher`
--
create database if not exists centraldb;

use centraldb;


DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `NIC` varchar(10) NOT NULL,
  `RNo` varchar(11) NOT NULL,
  `NameWithIn` varchar(50) NOT NULL,
  `FullName` varchar(100) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Dob` date NOT NULL,
  `CivilStatus` varchar(10) DEFAULT NULL,
  `Address` varchar(150) DEFAULT NULL,
  `TelNoMobile` varchar(20) DEFAULT NULL,
  `TelNoRecident` varchar(20) DEFAULT NULL,
  `DateOfAssignmentAsTeacher` date DEFAULT NULL,
  `DateOfAssignmentToSchool` date DEFAULT NULL,
  `EducationQual` varchar(1000) DEFAULT NULL,
  `ProffessionalQual` varchar(1000) DEFAULT NULL,
  `SubjectsAndClasses` varchar(1000) DEFAULT NULL,
  `SubjectsWishToTeach` varchar(100) DEFAULT NULL,
  `GradesWishToTeach` varchar(40) DEFAULT NULL,
  `NatureOfPresentPost` varchar(20) DEFAULT NULL,
  `GradeOfService` varchar(5) DEFAULT NULL,
  `DateOfPromotion` date DEFAULT NULL,
  `SectionTaught` varchar(10) DEFAULT NULL,
  `ServiceRecord` varchar(1000) DEFAULT NULL,
  `PositionInSchool` varchar(20) DEFAULT NULL,
  `AccessPriviledge` int(11) NOT NULL,
  `ClubIncharge` varchar(500) DEFAULT NULL,
  `Password` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`NIC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` (`NIC`, `RNo`, `NameWithIn`, `FullName`, `Gender`, `Dob`, `CivilStatus`, `Address`, `TelNoMobile`, `TelNoRecident`, `DateOfAssignmentAsTeacher`, `DateOfAssignmentToSchool`, `EducationQual`, `ProffessionalQual`, `SubjectsAndClasses`, `SubjectsWishToTeach`, `GradesWishToTeach`, `NatureOfPresentPost`, `GradeOfService`, `DateOfPromotion`, `SectionTaught`, `ServiceRecord`, `PositionInSchool`, `AccessPriviledge`, `ClubIncharge`, `Password`) VALUES ('865552306v','789','M.V.D.Kanchana','Kanchana Mahakumara','female','1986-08-29','Married','','0771928776','','2011-08-27','2011-08-01','*Graduate in University of colombo','','Science#8/9/10%null#null%null#null%null#null%null#null%null#null%null#null%null#null%null#null%null#null','Maths\nEnglish','10/11','Graduated','2-1','2015-08-14','O/L','Sri sumangala#2011#2013#2yrs#2%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null','Teacher',4,NULL,'Og8wgdPjN5n5oOWnCzOA06Zt6oCsNu4ejDw/xqoeN+fPawNYzDVFvKdR5jq2f/LZ'),('922452197v','156','D.C.B.Wickramarathne','Chamin Wickramarathne','male','1992-05-05','Married','No 55/Bellana/Agalawatta','0712347654','','2011-08-04','2013-08-01','','','Sinhala#11%null#null%null#null%null#null%null#null%null#null%null#null%null#null%null#null%null#null','English','','Graduated','1','2014-08-04','O/L','Central college#2011#2013#2yrs#1%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null','Teacher',4,NULL,'2IMa4BdAjikefZwW0sIjJ7aYiwlHagQLSptlDjjdIvVGpHWXOPKz6NseQkRSAsJX'),('932105425v','456','K.D.N.Sandaruwan','Nilanka Sandaruwan','male','1993-04-14','Unmarried','No 73/Palawatta para/Agalawatta','0719563636','','2013-08-01','2014-08-28','','','History#9/10/11%null#null%null#null%null#null%null#null%null#null%null#null%null#null%null#null%null#null','Sinhala','12/13','Graduated','2-2','2015-08-02','O/L','null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null','Principal',1,NULL,'ieEEmtWw5uM9CQCenIEJQlCTDGoKGj8f+OBCvszKZ6nyDTFNPwTXHpnPBUBsubtA'),('933002406v','134','J.K.M.M.Thilakarathne','Malith Thilakarathne','male','1993-05-01','Unmarried','No51/Agalawatta road/Mathugama','0777597565','','2012-08-01','2013-08-09','','','chemistry#13%null#null%null#null%null#null%null#null%null#null%null#null%null#null%null#null%null#null','Biology','12','Graduated','2-1','2015-08-04','Not given','Ananda college#2012#2015#2yrs#1%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null%null#null#null#null#null','Teacher Incharge',3,NULL,'5DA9A9fW4ndLfmVNtMMsNmIxFGbSgkIfbaqGC1kZw9Pl53KtFsUvBVKl2Ohi/Fn+'),('933112306v','098','K.M.C.M.Karunarathne','Chanaka Maduranga','male','1993-08-31','Married','No66/Mahabage/Ragama','0712347659','','2013-03-12','2013-09-24','','','History #9/10/11%null#null%null#null%null#null%null#null%null#null%null#null%null#null%null#null%null#null','Sinhala','12/13','Graduated','2-2','2015-01-05','O/L',NULL,'Librarian',6,NULL,'oXEI7bbtV8oeLOCiI6eWLBZRpkdpKP/YtyYq/c64rx+HpW+yLAZXrBp8OCmlRpdW'),('933662306v','123','M.W.D.P.Sandaruwan','Mahakumara Weediyage Don Prabath Sandaruwan','male','1993-12-31','Unmarried','No62/Ambagahagoda/Beragama/Agalawatta','0719561619','0342244009','2014-08-13','2015-08-13','*Undergraduate in university of moratuwa','',NULL,'physics,chemistry','12','Graduated','3-2',NULL,'A/L',NULL,'Teacher',4,NULL,'65bq1resPDcJjDMhokiNss87XZOfk6BbGT9vse2L/rYsB83qOLLbhC1tfLt7ojdH');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
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

-- Dump completed on 2015-08-19 14:29:43
