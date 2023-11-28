-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: peliculasdb
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `peliculas`
--

DROP TABLE IF EXISTS `peliculas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `peliculas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(255) NOT NULL,
  `año` int DEFAULT NULL,
  `genero` varchar(100) DEFAULT NULL,
  `plataforma` varchar(100) DEFAULT NULL,
  `director` varchar(255) DEFAULT NULL,
  `productora` varchar(255) DEFAULT NULL,
  `actores_actrices` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peliculas`
--

LOCK TABLES `peliculas` WRITE;
/*!40000 ALTER TABLE `peliculas` DISABLE KEYS */;
INSERT INTO `peliculas` VALUES (1,'Inception',2010,'Ciencia Ficción','Netflix','Christopher Nolan','Warner Bros.','Leonardo DiCaprio, Ellen Page, Joseph Gordon-Levitt'),(2,'The Dark Knight',2008,'Acción','HBO','Christopher Nolan','Warner Bros.','Christian Bale, Heath Ledger, Aaron Eckhart'),(3,'Titanic',1997,'Romance','Amazon Prime','James Cameron','20th Century Fox','Leonardo DiCaprio, Kate Winslet, Billy Zane'),(4,'The Godfather',1972,'Crimen','Hulu','Francis Ford Coppola','Paramount Pictures','Marlon Brando, Al Pacino, James Caan'),(5,'Avatar',2009,'Aventura','Netflix','James Cameron','20th Century Fox','Sam Worthington, Zoe Saldana, Sigourney Weaver'),(6,'Pulp Fiction',1994,'Drama','Amazon Prime','Quentin Tarantino','Miramax Films','John Travolta, Uma Thurman, Samuel L. Jackson'),(7,'Forrest Gump',1994,'Drama','Hulu','Robert Zemeckis','Paramount Pictures','Tom Hanks, Robin Wright, Gary Sinise'),(8,'The Shawshank Redemption',1994,'Drama','Netflix','Frank Darabont','Columbia Pictures','Tim Robbins, Morgan Freeman, Bob Gunton'),(9,'Jurassic Park',1993,'Aventura','HBO','Steven Spielberg','Universal Pictures','Sam Neill, Laura Dern, Jeff Goldblum'),(10,'The Matrix',1999,'Ciencia Ficción','Amazon Prime','Lana Wachowski, Lilly Wachowski','Warner Bros.','Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss'),(11,'The Lord of the Rings: The Fellowship of the Ring',2001,'Fantasía','Netflix','Peter Jackson','New Line Cinema','Elijah Wood, Ian McKellen, Viggo Mortensen'),(12,'The Social Network',2010,'Drama','Hulu','David Fincher','Columbia Pictures','Jesse Eisenberg, Andrew Garfield, Justin Timberlake'),(13,'La La Land',2016,'Musical','Amazon Prime','Damien Chazelle','Lionsgate','Ryan Gosling, Emma Stone, John Legend'),(14,'Eternal Sunshine of the Spotless Mind',2004,'Romance','Netflix','Michel Gondry','Focus Features','Jim Carrey, Kate Winslet, Elijah Wood'),(15,'Casablanca',1942,'Drama','HBO','Michael Curtiz','Warner Bros.','Humphrey Bogart, Ingrid Bergman, Paul Henreid'),(16,'Gone with the Wind',1939,'Romance','Hulu','Victor Fleming','Metro-Goldwyn-Mayer','Clark Gable, Vivien Leigh, Leslie Howard'),(17,'Fight Club',1999,'Drama','Amazon Prime','David Fincher','20th Century Fox','Brad Pitt, Edward Norton, Helena Bonham Carter'),(18,'The Great Gatsby',2013,'Drama','Netflix','Baz Luhrmann','Warner Bros.','Leonardo DiCaprio, Tobey Maguire, Carey Mulligan'),(19,'Schindler\'s List',1993,'Drama','Hulu','Steven Spielberg','Universal Pictures','Liam Neeson, Ben Kingsley, Ralph Fiennes'),(20,'The Silence of the Lambs',1991,'Thriller','HBO','Jonathan Demme','Orion Pictures','Jodie Foster, Anthony Hopkins, Scott Glenn'),(21,'The Shining',1980,'Terror','Amazon Prime','Stanley Kubrick','Warner Bros.','Jack Nicholson, Shelley Duvall, Danny Lloyd'),(22,'Inglourious Basterds',2009,'Bélico','Netflix','Quentin Tarantino','The Weinstein Company','Brad Pitt, Christoph Waltz, Melanie Laurent'),(23,'The Departed',2006,'Crimen','Hulu','Martin Scorsese','Warner Bros.','Leonardo DiCaprio, Matt Damon, Jack Nicholson'),(24,'The Revenant',2015,'Aventura','Amazon Prime','Alejandro G. Iñárritu','20th Century Fox','Leonardo DiCaprio, Tom Hardy, Domhnall Gleeson'),(25,'Amélie',2001,'Comedia','Netflix','Jean-Pierre Jeunet','Miramax Films','Audrey Tautou, Mathieu Kassovitz, Rufus');
/*!40000 ALTER TABLE `peliculas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-28 20:46:48
