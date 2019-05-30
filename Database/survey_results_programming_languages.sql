CREATE DATABASE  IF NOT EXISTS `survey_results` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `survey_results`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: survey_results
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `programming_languages`
--

DROP TABLE IF EXISTS `programming_languages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `programming_languages` (
  `form_data_id` bigint(20) NOT NULL,
  `programming_language` varchar(255) DEFAULT NULL,
  KEY `FK9b3dsgd6kl94j0h2l5mb1lf5a` (`form_data_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `programming_languages`
--

LOCK TABLES `programming_languages` WRITE;
/*!40000 ALTER TABLE `programming_languages` DISABLE KEYS */;
INSERT INTO `programming_languages` VALUES (60,'Python'),(60,'Perl'),(60,'PHP'),(60,'Other'),(60,'Objective-C'),(60,'Kotlin'),(60,'JavaScript'),(60,'Java (Android)'),(60,'Java'),(60,'Haskell'),(60,'Golang'),(60,'Flex/Flash/AIR'),(60,'Erlang'),(60,'Delphi'),(60,'Clojure'),(60,'C++'),(60,'C#/.NET'),(60,'C'),(60,'APL'),(60,'ABAP'),(60,'1С'),(60,'Ruby/Rails'),(60,'SQL'),(60,'Scala'),(60,'Swift');
/*!40000 ALTER TABLE `programming_languages` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-30  7:36:18
