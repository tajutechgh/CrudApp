-- MySQL dump 10.13  Distrib 8.0.34, for macos13 (x86_64)
--
-- Host: localhost    Database: crud_app_db
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dob` datetime(6) NOT NULL,
  `email_address` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `phone_number` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'2025-09-10 00:00:00.000000','sam@gmail.com','Samuel','Oyintey','0242760337'),(2,'2025-09-11 00:00:00.000000','hamamat@gmail.com','Hamamat','Suraj','0259870653'),(3,'2025-09-23 00:00:00.000000','koo@gmail.com','Koo','Nimo','0242760448'),(5,'2025-09-04 00:00:00.000000','aziz@gmail.com','Abdul-Aziz','Mohammed','0278956434'),(7,'2025-09-08 00:00:00.000000','yamin@gmail.com','Yamin','Mohammed','0246785436'),(8,'2025-09-10 00:00:00.000000','yaw@gmail.com','Yaw','Maanu','0278956000'),(11,'2025-09-12 00:00:00.000000','suraj@gmail.com','Suraj','Mohammed','0246785769'),(12,'3921-01-20 00:00:00.000000','koo@gmail.com','Koo','Manu','0242760448'),(13,'3921-01-20 00:00:00.000000','emma@gmail.com','Emanuel','Masah','0242760448'),(14,'3921-01-20 00:00:00.000000','nuru@gmail.com','Ibrahim','Nurundeen','0242760448'),(15,'3921-01-20 00:00:00.000000','sumaila@gmail.com','Sumaila','Issaka','0242760448'),(16,'3921-01-20 00:00:00.000000','koo@gmail.com','Koo','Manu','0242760448'),(17,'3921-01-20 00:00:00.000000','koo@gmail.com','Koo','Manu','0242760448'),(18,'3921-01-20 00:00:00.000000','koo@gmail.com','Koo','Manu','0242760448'),(19,'3921-01-20 00:00:00.000000','koo@gmail.com','Koo','Manu','0242760448'),(20,'3921-01-20 00:00:00.000000','koo@gmail.com','Koo','Manu','0242760448');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-10-03 20:58:29
