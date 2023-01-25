CREATE DATABASE  IF NOT EXISTS `nighthawk_interteh` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `nighthawk_interteh`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: nighthawk_interteh
-- ------------------------------------------------------
-- Server version	5.6.51-log

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
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account` (
  `ID_Account` int(11) NOT NULL AUTO_INCREMENT,
  `Contract_List` varchar(100) DEFAULT NULL,
  `ID_Portofolio` int(11) NOT NULL,
  `Projects_List` varchar(100) DEFAULT NULL,
  `ID_User` int(11) NOT NULL,
  PRIMARY KEY (`ID_Account`),
  KEY `FK9clif0snw3g15r5pfxxipvqmr` (`ID_User`),
  CONSTRAINT `FK9clif0snw3g15r5pfxxipvqmr` FOREIGN KEY (`ID_User`) REFERENCES `user` (`ID_User`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `administrator`
--

DROP TABLE IF EXISTS `administrator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administrator` (
  `ID_Administrator` int(11) NOT NULL,
  `Administrator_Email` varchar(45) DEFAULT NULL,
  `Administrator_Name` varchar(45) DEFAULT NULL,
  `User_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID_Administrator`),
  KEY `FKhyk2p8w82a2fl3548b7w59mn7` (`User_ID`),
  CONSTRAINT `FKhyk2p8w82a2fl3548b7w59mn7` FOREIGN KEY (`User_ID`) REFERENCES `user` (`ID_User`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrator`
--

LOCK TABLES `administrator` WRITE;
/*!40000 ALTER TABLE `administrator` DISABLE KEYS */;
/*!40000 ALTER TABLE `administrator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `companysubcontractor`
--

DROP TABLE IF EXISTS `companysubcontractor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `companysubcontractor` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Company_Subcontractor_Address` varchar(45) DEFAULT NULL,
  `Company_Subcontractor_Contact_Details` varchar(45) DEFAULT NULL,
  `Company_Subcontractor_Name` varchar(45) DEFAULT NULL,
  `Company_Subcontractor_Phone_Number` int(11) DEFAULT NULL,
  `ID_Subcontractor` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKpiwltasb9eh9h61y9lubfxdxt` (`ID_Subcontractor`),
  CONSTRAINT `FKpiwltasb9eh9h61y9lubfxdxt` FOREIGN KEY (`ID_Subcontractor`) REFERENCES `subcontractor` (`ID_Subcontractor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `companysubcontractor`
--

LOCK TABLES `companysubcontractor` WRITE;
/*!40000 ALTER TABLE `companysubcontractor` DISABLE KEYS */;
/*!40000 ALTER TABLE `companysubcontractor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contract`
--

DROP TABLE IF EXISTS `contract`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contract` (
  `ID_Contract` int(11) NOT NULL AUTO_INCREMENT,
  `Contract_Description` varchar(45) DEFAULT NULL,
  `Contract_Name` varchar(45) DEFAULT NULL,
  `Contract_Project_ID` int(11) DEFAULT NULL,
  `Contract_Type` varchar(45) DEFAULT NULL,
  `Client_Company_ID` int(11) NOT NULL,
  `Company_ID` int(11) NOT NULL,
  `Subcontractor_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID_Contract`),
  KEY `FKr7lapmvhvg76uy39w3sy6qlxl` (`Client_Company_ID`),
  KEY `FKo23awngl1s4de0r93xj2x45a2` (`Company_ID`),
  KEY `FKtavm7egsn96jw4kq4biybsaow` (`Subcontractor_ID`),
  CONSTRAINT `FKo23awngl1s4de0r93xj2x45a2` FOREIGN KEY (`Company_ID`) REFERENCES `nighthawkinterteh` (`ID_Company`),
  CONSTRAINT `FKr7lapmvhvg76uy39w3sy6qlxl` FOREIGN KEY (`Client_Company_ID`) REFERENCES `employercompany` (`ID_Client_Company`),
  CONSTRAINT `FKtavm7egsn96jw4kq4biybsaow` FOREIGN KEY (`Subcontractor_ID`) REFERENCES `subcontractor` (`ID_Subcontractor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contract`
--

LOCK TABLES `contract` WRITE;
/*!40000 ALTER TABLE `contract` DISABLE KEYS */;
/*!40000 ALTER TABLE `contract` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contract_project`
--

DROP TABLE IF EXISTS `contract_project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contract_project` (
  `Contract_ID` int(11) NOT NULL,
  `Project_ID` int(11) NOT NULL,
  PRIMARY KEY (`Contract_ID`,`Project_ID`),
  KEY `FKkx2rvps9nt86jteul75tj53k7` (`Project_ID`),
  CONSTRAINT `FKjx5ncpdvf2blhu63pjatbs1yh` FOREIGN KEY (`Contract_ID`) REFERENCES `contract` (`ID_Contract`),
  CONSTRAINT `FKkx2rvps9nt86jteul75tj53k7` FOREIGN KEY (`Project_ID`) REFERENCES `project` (`ID_Project`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contract_project`
--

LOCK TABLES `contract_project` WRITE;
/*!40000 ALTER TABLE `contract_project` DISABLE KEYS */;
/*!40000 ALTER TABLE `contract_project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employercompany`
--

DROP TABLE IF EXISTS `employercompany`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employercompany` (
  `ID_Client_Company` int(11) NOT NULL AUTO_INCREMENT,
  `Client_Company_Address` varchar(45) DEFAULT NULL,
  `Client_Company_Description` varchar(45) DEFAULT NULL,
  `Client_Company_Name` varchar(45) DEFAULT NULL,
  `Client_Company_Type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_Client_Company`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employercompany`
--

LOCK TABLES `employercompany` WRITE;
/*!40000 ALTER TABLE `employercompany` DISABLE KEYS */;
/*!40000 ALTER TABLE `employercompany` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `filecontent`
--

DROP TABLE IF EXISTS `filecontent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `filecontent` (
  `Document_Content_ID` int(11) NOT NULL AUTO_INCREMENT,
  `File_Content` varchar(100) DEFAULT NULL,
  `Last_Updated` datetime DEFAULT NULL,
  `Document_ID` int(11) NOT NULL,
  PRIMARY KEY (`Document_Content_ID`),
  KEY `FKrleusw5ymlqr7p612ffyx2oeb` (`Document_ID`),
  CONSTRAINT `FKrleusw5ymlqr7p612ffyx2oeb` FOREIGN KEY (`Document_ID`) REFERENCES `filedocument` (`Document_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filecontent`
--

LOCK TABLES `filecontent` WRITE;
/*!40000 ALTER TABLE `filecontent` DISABLE KEYS */;
/*!40000 ALTER TABLE `filecontent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `filedocument`
--

DROP TABLE IF EXISTS `filedocument`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `filedocument` (
  `Document_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Document_Content` varchar(45) DEFAULT NULL,
  `File_Extenstion` varchar(45) DEFAULT NULL,
  `File_Name` varchar(45) DEFAULT NULL,
  `Account_ID` int(11) NOT NULL,
  PRIMARY KEY (`Document_ID`),
  KEY `FK9opp8es7bsrxxd16k9psfbx0g` (`Account_ID`),
  CONSTRAINT `FK9opp8es7bsrxxd16k9psfbx0g` FOREIGN KEY (`Account_ID`) REFERENCES `account` (`ID_Account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filedocument`
--

LOCK TABLES `filedocument` WRITE;
/*!40000 ALTER TABLE `filedocument` DISABLE KEYS */;
/*!40000 ALTER TABLE `filedocument` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nighthawkinterteh`
--

DROP TABLE IF EXISTS `nighthawkinterteh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nighthawkinterteh` (
  `ID_Company` int(11) NOT NULL AUTO_INCREMENT,
  `Company_Address` varchar(45) DEFAULT NULL,
  `Company_Description` varchar(45) DEFAULT NULL,
  `Company_Name` varchar(45) DEFAULT NULL,
  `Company_Type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_Company`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nighthawkinterteh`
--

LOCK TABLES `nighthawkinterteh` WRITE;
/*!40000 ALTER TABLE `nighthawkinterteh` DISABLE KEYS */;
/*!40000 ALTER TABLE `nighthawkinterteh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nwrole`
--

DROP TABLE IF EXISTS `nwrole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nwrole` (
  `User_Role_ID` int(11) NOT NULL AUTO_INCREMENT,
  `User_Role_Name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`User_Role_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nwrole`
--

LOCK TABLES `nwrole` WRITE;
/*!40000 ALTER TABLE `nwrole` DISABLE KEYS */;
/*!40000 ALTER TABLE `nwrole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment` (
  `ID_Payment` int(11) NOT NULL AUTO_INCREMENT,
  `Payment_Bill` varchar(45) DEFAULT NULL,
  `Payment_Date` datetime DEFAULT NULL,
  `Payment_Description` varchar(45) DEFAULT NULL,
  `Payment_Type` varchar(45) DEFAULT NULL,
  `ID_Contract` int(11) NOT NULL,
  PRIMARY KEY (`ID_Payment`),
  KEY `FKncrr08qk7av3o0sccdawnn622` (`ID_Contract`),
  CONSTRAINT `FKncrr08qk7av3o0sccdawnn622` FOREIGN KEY (`ID_Contract`) REFERENCES `contract` (`ID_Contract`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payroll`
--

DROP TABLE IF EXISTS `payroll`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payroll` (
  `ID_Payroll` int(11) NOT NULL,
  `Payroll_Address` varchar(45) DEFAULT NULL,
  `Payroll_Date_Of_Birth` date DEFAULT NULL,
  `Payroll_Email` varchar(45) DEFAULT NULL,
  `Payroll_Name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_Payroll`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payroll`
--

LOCK TABLES `payroll` WRITE;
/*!40000 ALTER TABLE `payroll` DISABLE KEYS */;
/*!40000 ALTER TABLE `payroll` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `ID_Person` int(11) NOT NULL AUTO_INCREMENT,
  `Person_Address` varchar(45) DEFAULT NULL,
  `Person_Name` varchar(45) DEFAULT NULL,
  `Person_Phone_Number` int(11) DEFAULT NULL,
  `ID_Subcontractor` int(11) NOT NULL,
  PRIMARY KEY (`ID_Person`),
  KEY `FKj188aim9bnc5tkh03a984sj1c` (`ID_Subcontractor`),
  CONSTRAINT `FKj188aim9bnc5tkh03a984sj1c` FOREIGN KEY (`ID_Subcontractor`) REFERENCES `subcontractor` (`ID_Subcontractor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `portofolio`
--

DROP TABLE IF EXISTS `portofolio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `portofolio` (
  `Document_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Document_Content` varchar(100) DEFAULT NULL,
  `Fiile_Extension` varchar(45) DEFAULT NULL,
  `File_Name` varchar(45) DEFAULT NULL,
  `ID_Account` int(11) NOT NULL,
  PRIMARY KEY (`Document_ID`),
  KEY `FKmvb7yl3wde7h9eubgq0axgove` (`ID_Account`),
  CONSTRAINT `FKmvb7yl3wde7h9eubgq0axgove` FOREIGN KEY (`ID_Account`) REFERENCES `account` (`ID_Account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `portofolio`
--

LOCK TABLES `portofolio` WRITE;
/*!40000 ALTER TABLE `portofolio` DISABLE KEYS */;
/*!40000 ALTER TABLE `portofolio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project` (
  `ID_Project` int(11) NOT NULL,
  `List_Of_Contracts` varchar(100) DEFAULT NULL,
  `Project_Company_ID` int(11) DEFAULT NULL,
  `Project_Description` varchar(45) DEFAULT NULL,
  `Project_Name` varchar(45) DEFAULT NULL,
  `Project_Start_Date` date DEFAULT NULL,
  `Project_Status` varchar(45) DEFAULT NULL,
  `Project_Type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_Project`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subcontractor`
--

DROP TABLE IF EXISTS `subcontractor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subcontractor` (
  `ID_Subcontractor` int(11) NOT NULL,
  `Subcontractor_Address` varchar(45) DEFAULT NULL,
  `Subcontractor_Date_Of_Birth` date DEFAULT NULL,
  `Subcontractor_Email` varchar(45) DEFAULT NULL,
  `Subcontractor_Name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_Subcontractor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subcontractor`
--

LOCK TABLES `subcontractor` WRITE;
/*!40000 ALTER TABLE `subcontractor` DISABLE KEYS */;
/*!40000 ALTER TABLE `subcontractor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `ID_User` int(11) NOT NULL AUTO_INCREMENT,
  `active` bit(1) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Username` varchar(45) NOT NULL,
  `User_Role_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID_User`),
  UNIQUE KEY `UK_mlsmxro9u0s4l4y4hpr7s5o3v` (`Password`),
  UNIQUE KEY `UK_3fwf1qdgfhtmivqs75d6runwx` (`Username`),
  KEY `FKbn39ngfvo2fqdru3ha7gtgtmn` (`User_Role_ID`),
  CONSTRAINT `FKbn39ngfvo2fqdru3ha7gtgtmn` FOREIGN KEY (`User_Role_ID`) REFERENCES `nwrole` (`User_Role_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-26 23:10:08
