-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: java_2022
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `wimbledon`
--

DROP TABLE IF EXISTS `wimbledon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wimbledon` (
  `id` int NOT NULL AUTO_INCREMENT,
  `anno` varchar(10) DEFAULT NULL,
  `tennista` varchar(45) DEFAULT NULL,
  `nazionalita` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=136 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wimbledon`
--

LOCK TABLES `wimbledon` WRITE;
/*!40000 ALTER TABLE `wimbledon` DISABLE KEYS */;
INSERT INTO `wimbledon` VALUES (1,'Year[d]','Champion','Cou'),(2,'1877','Spencer Gore','BRI'),(3,'1878','Frank Hadow â€¡','BRI'),(4,'1879','John Hartley â—Š','BRI'),(5,'1880','John Hartley â€ ','BRI'),(6,'1881','William Renshaw â€¡','BRI'),(7,'1882','William Renshaw â€ ','BRI'),(8,'1883','William Renshaw â€ ','BRI'),(9,'1884','William Renshaw â€ ','BRI'),(10,'1885','William Renshaw â€ ','BRI'),(11,'1886','William Renshaw â€ ','BRI'),(12,'1887','Herbert Lawford â—Š','BRI'),(13,'1888','Ernest Renshaw â€¡','BRI'),(14,'1889','William Renshaw â€¡','BRI'),(15,'1890','Willoughby Hamilton â€¡','BRI'),(16,'1891','Wilfred Baddeley â—Š','BRI'),(17,'1892','Wilfred Baddeley â€ ','BRI'),(18,'1893','Joshua Pim â€¡','BRI'),(19,'1894','Joshua Pim â€ ','BRI'),(20,'1895','Wilfred Baddeley â—Š','BRI'),(21,'1896','Harold Mahony â€¡','BRI'),(22,'1897','Reginald Doherty â€¡','BRI'),(23,'1898','Reginald Doherty â€ ','BRI'),(24,'1899','Reginald Doherty â€ ','BRI'),(25,'1900','Reginald Doherty â€ ','BRI'),(26,'1901','Arthur Gore â€¡','BRI'),(27,'1902','Laurence Doherty â€¡','BRI'),(28,'1903','Laurence Doherty â€ ','BRI'),(29,'1904','Laurence Doherty â€ ','BRI'),(30,'1905','Laurence Doherty â€ ','BRI'),(31,'1906','Laurence Doherty â€ ','BRI'),(32,'1907','Norman Brookes â—Š','AUS'),(33,'1908','Arthur Gore â—Š','BRI'),(34,'1909','Arthur Gore â€ ','BRI'),(35,'1910','Anthony Wilding â€¡','NZL'),(36,'1911','Anthony Wilding â€ ','NZL'),(37,'1912','Anthony Wilding â€ ','NZL'),(38,'1913','Anthony Wilding â€ ','NZL'),(39,'1914','Norman Brookes â€¡','AUS'),(40,'1919','Gerald Patterson â€¡','AUS'),(41,'1920','Bill Tilden â€¡','USA'),(42,'1921','Bill Tilden â€ ','USA'),(43,'1922','Gerald Patterson','AUS'),(44,'1923','Bill Johnston','USA'),(45,'1924','Jean Borotra','FRA'),(46,'1925','RenÃ© Lacoste','FRA'),(47,'1926','Jean Borotra','FRA'),(48,'1927','Henri Cochet','FRA'),(49,'1928','RenÃ© Lacoste','FRA'),(50,'1929','Henri Cochet','FRA'),(51,'1930','Bill Tilden','USA'),(52,'1931','Sidney Wood','USA'),(53,'1932','Ellsworth Vines','USA'),(54,'1933','Jack Crawford','AUS'),(55,'1934','Fred Perry','GBR'),(56,'1935','Fred Perry','GBR'),(57,'1936','Fred Perry','GBR'),(58,'1937','Don Budge','USA'),(59,'1938','Don Budge','USA'),(60,'1939','Bobby Riggs','USA'),(61,'1946','Yvon Petra','FRA'),(62,'1947','Jack Kramer','USA'),(63,'1948','Bob Falkenburg','USA'),(64,'1949','Ted Schroeder','USA'),(65,'1950','Budge Patty','USA'),(66,'1951','Dick Savitt','USA'),(67,'1952','Frank Sedgman','AUS'),(68,'1953','Vic Seixas','USA'),(69,'1954','Jaroslav DrobnÃ½','EGY'),(70,'1955','Tony Trabert','USA'),(71,'1956','Lew Hoad','AUS'),(72,'1957','Lew Hoad','AUS'),(73,'1958','Ashley Cooper','AUS'),(74,'1959','Alex Olmedo[j]','USA'),(75,'1960','Neale Fraser','AUS'),(76,'1961','Rod Laver','AUS'),(77,'1962','Rod Laver','AUS'),(78,'1963','Chuck McKinley','USA'),(79,'1964','Roy Emerson','AUS'),(80,'1965','Roy Emerson','AUS'),(81,'1966','Manuel Santana','ESP'),(82,'1967','John Newcombe','AUS'),(83,'1968','Rod Laver','AUS'),(84,'1969','Rod Laver','AUS'),(85,'1970','John Newcombe','AUS'),(86,'1971','John Newcombe','AUS'),(87,'1972','Stan Smith','USA'),(88,'1973','Jan KodeÅ¡','TCH'),(89,'1974','Jimmy Connors','USA'),(90,'1975','Arthur Ashe','USA'),(91,'1976','BjÃ¶rn Borg','SWE'),(92,'1977','BjÃ¶rn Borg','SWE'),(93,'1978','BjÃ¶rn Borg','SWE'),(94,'1979','BjÃ¶rn Borg','SWE'),(95,'1980','BjÃ¶rn Borg','SWE'),(96,'1981','John McEnroe','USA'),(97,'1982','Jimmy Connors','USA'),(98,'1983','John McEnroe','USA'),(99,'1984','John McEnroe','USA'),(100,'1985','Boris Becker','FRG'),(101,'1986','Boris Becker','FRG'),(102,'1987','Pat Cash','AUS'),(103,'1988','Stefan Edberg','SWE'),(104,'1989','Boris Becker','FRG'),(105,'1990','Stefan Edberg','SWE'),(106,'1991','Michael Stich','GER'),(107,'1992','Andre Agassi','USA'),(108,'1993','Pete Sampras','USA'),(109,'1994','Pete Sampras','USA'),(110,'1995','Pete Sampras','USA'),(111,'1996','Richard Krajicek','NED'),(112,'1997','Pete Sampras','USA'),(113,'1998','Pete Sampras','USA'),(114,'1999','Pete Sampras','USA'),(115,'2000','Pete Sampras','USA'),(116,'2001','Goran IvaniÅ¡eviÄ‡','CRO'),(117,'2002','Lleyton Hewitt','AUS'),(118,'2003','Roger Federer','SUI'),(119,'2004','Roger Federer','SUI'),(120,'2005','Roger Federer','SUI'),(121,'2006','Roger Federer','SUI'),(122,'2007','Roger Federer','SUI'),(123,'2008','Rafael Nadal','ESP'),(124,'2009','Roger Federer','SUI'),(125,'2010','Rafael Nadal','ESP'),(126,'2011','Novak Djokovic','SRB'),(127,'2012','Roger Federer','SUI'),(128,'2013','Andy Murray','GBR'),(129,'2014','Novak Djokovic','SRB'),(130,'2015','Novak Djokovic','SRB'),(131,'2016','Andy Murray','GBR'),(132,'2017','Roger Federer','SUI'),(133,'2018','Novak Djokovic','SRB'),(134,'2019','Novak Djokovic','SRB'),(135,'2021','Novak Djokovic','SRB');
/*!40000 ALTER TABLE `wimbledon` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-27 15:07:58
