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
  `ID_User` int(11) NOT NULL,
  `ID_Portofolio` int(11) NOT NULL,
  `Projects_List` varchar(100) DEFAULT NULL,
  `Contract_List` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_Account`),
  KEY `userID_idx` (`ID_User`),
  CONSTRAINT `FKID_User` FOREIGN KEY (`ID_User`) REFERENCES `user` (`ID_User`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `ID_Administrator` int(11) NOT NULL AUTO_INCREMENT,
  `Administrator_Name` varchar(45) DEFAULT NULL,
  `Administrator_Email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_Administrator`),
  KEY `ID_Administrator_idx` (`ID_Administrator`),
  CONSTRAINT `FKID_Administrator` FOREIGN KEY (`ID_Administrator`) REFERENCES `user` (`ID_User`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `ID_Subcontractor` int(11) NOT NULL,
  `Company_Subcontractor_Name` varchar(45) DEFAULT NULL,
  `Company_Subcontractor_Address` varchar(45) DEFAULT NULL,
  `Company_Subcontractor_Contact_Details` varchar(45) DEFAULT NULL,
  `Company_Subcontractor_Phone_Number` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKSubcontractorCS_idx` (`ID_Subcontractor`),
  CONSTRAINT `FKSubcontractorCS` FOREIGN KEY (`ID_Subcontractor`) REFERENCES `subcontractor` (`ID_Subcontractor`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `Contract_Type` varchar(45) DEFAULT NULL,
  `Contract_Name` varchar(45) DEFAULT NULL,
  `Contract_Description` varchar(45) DEFAULT NULL,
  `Contract_Project_ID` int(11) DEFAULT NULL,
  `Client_Company_ID` int(11) NOT NULL,
  `Company_ID` int(11) NOT NULL,
  `Subcontractor_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID_Contract`),
  KEY `ID_Client_idx` (`Client_Company_ID`),
  KEY `ID_Company_idx` (`Company_ID`),
  KEY `ID_Subcontractor_idx` (`Subcontractor_ID`),
  CONSTRAINT `FKClient_Company_ID` FOREIGN KEY (`Client_Company_ID`) REFERENCES `employercompany` (`ID_Client_Company`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKCompany_ID` FOREIGN KEY (`Company_ID`) REFERENCES `nighthawkinterteh` (`ID_Company`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKSubcontractor_ID` FOREIGN KEY (`Subcontractor_ID`) REFERENCES `subcontractor` (`ID_Subcontractor`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  KEY `Id_1_Project_idx` (`Project_ID`),
  KEY `FKContract_ID` (`Contract_ID`),
  CONSTRAINT `FKContract_ID` FOREIGN KEY (`Contract_ID`) REFERENCES `contract` (`ID_Contract`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FKProject_ID` FOREIGN KEY (`Project_ID`) REFERENCES `project` (`ID_Project`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `Client_Company_Name` varchar(45) DEFAULT NULL,
  `Client_Company_Type` varchar(45) DEFAULT NULL,
  `Client_Company_Description` varchar(45) DEFAULT NULL,
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
  `Document_ID` int(11) NOT NULL,
  `File_Content` varchar(100) DEFAULT NULL,
  `Last_Updated` datetime DEFAULT NULL,
  PRIMARY KEY (`Document_Content_ID`),
  KEY `documentID_idx` (`Document_ID`),
  CONSTRAINT `FKDocumentId` FOREIGN KEY (`Document_ID`) REFERENCES `filedocument` (`Document_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `Account_ID` int(11) NOT NULL,
  `File_Name` varchar(45) DEFAULT NULL,
  `File_Extenstion` varchar(45) DEFAULT NULL,
  `Document_Content` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Document_ID`),
  KEY `accountID_idx` (`Account_ID`),
  CONSTRAINT `FKAccountID` FOREIGN KEY (`Account_ID`) REFERENCES `account` (`ID_Account`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
-- Table structure for table `nighthawkinterteh`
--

DROP TABLE IF EXISTS `nighthawkinterteh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nighthawkinterteh` (
  `ID_Company` int(11) NOT NULL AUTO_INCREMENT,
  `Company_Name` varchar(45) DEFAULT NULL,
  `Company_Address` varchar(45) DEFAULT NULL,
  `Company_Type` varchar(45) DEFAULT NULL,
  `Company_Description` varchar(45) DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nwrole`
--

LOCK TABLES `nwrole` WRITE;
/*!40000 ALTER TABLE `nwrole` DISABLE KEYS */;
INSERT INTO `nwrole` VALUES (1,'subcontractor'),(2,'admin');
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
  `ID_Contract` int(11) NOT NULL,
  `Payment_Date` datetime DEFAULT NULL,
  `Payment_Bill` varchar(45) DEFAULT NULL,
  `Payment_Type` varchar(45) DEFAULT NULL,
  `Payment_Description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_Payment`),
  KEY `ID_Contract_idx` (`ID_Contract`),
  CONSTRAINT `FKID_Contract` FOREIGN KEY (`ID_Contract`) REFERENCES `contract` (`ID_Contract`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `ID_Payroll` int(11) NOT NULL AUTO_INCREMENT,
  `Payroll_Name` varchar(45) DEFAULT NULL,
  `Payroll_Email` varchar(45) DEFAULT NULL,
  `Payroll_Date_Of_Birth` date DEFAULT NULL,
  `Payroll_Address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_Payroll`),
  KEY `ID_Payroll_idx` (`ID_Payroll`),
  CONSTRAINT `FKID_Payroll` FOREIGN KEY (`ID_Payroll`) REFERENCES `user` (`ID_User`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `ID_Subcontractor` int(11) NOT NULL,
  `Person_Name` varchar(45) DEFAULT NULL,
  `Person_Address` varchar(45) DEFAULT NULL,
  `Person_Phone_Number` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Person`),
  KEY `ID_Person_idx` (`ID_Subcontractor`),
  CONSTRAINT `FKID_Person` FOREIGN KEY (`ID_Subcontractor`) REFERENCES `subcontractor` (`ID_Subcontractor`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `ID_Account` int(11) NOT NULL,
  `File_Name` varchar(45) DEFAULT NULL,
  `Fiile_Extension` varchar(45) DEFAULT NULL,
  `Document_Content` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Document_ID`),
  KEY `accountID_idx` (`ID_Account`),
  CONSTRAINT `FKID_Account` FOREIGN KEY (`ID_Account`) REFERENCES `account` (`ID_Account`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `ID_Project` int(11) NOT NULL AUTO_INCREMENT,
  `Project_Status` varchar(45) DEFAULT NULL,
  `Project_Name` varchar(45) DEFAULT NULL,
  `Project_Type` varchar(45) DEFAULT NULL,
  `Project_Description` varchar(45) DEFAULT NULL,
  `Project_Start_Date` date DEFAULT NULL,
  `Project_Company_ID` int(11) DEFAULT NULL,
  `List_Of_Contracts` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_Project`),
  KEY `accountID_idx` (`ID_Project`),
  CONSTRAINT `FKID_Project` FOREIGN KEY (`ID_Project`) REFERENCES `account` (`ID_Account`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `ID_Subcontractor` int(11) NOT NULL AUTO_INCREMENT,
  `Subcontractor_Name` varchar(45) DEFAULT NULL,
  `Subcontractor_Email` varchar(45) DEFAULT NULL,
  `Subcontractor_Date_Of_Birth` date DEFAULT NULL,
  `Subcontractor_Address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_Subcontractor`),
  KEY `ID_Subcontractor_idx` (`ID_Subcontractor`),
  CONSTRAINT `FKID_Subcontractor` FOREIGN KEY (`ID_Subcontractor`) REFERENCES `user` (`ID_User`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `User_Role_ID` int(11) NOT NULL,
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_User`),
  UNIQUE KEY `username_UNIQUE` (`Username`),
  UNIQUE KEY `password_UNIQUE` (`Password`),
  KEY `FKUserRoleId_idx` (`User_Role_ID`),
  CONSTRAINT `FKUserRoleId` FOREIGN KEY (`User_Role_ID`) REFERENCES `nwrole` (`User_Role_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
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

-- Dump completed on 2022-02-13 15:39:06
