# Java3FinalProject
GalaxyView

--------
http://localhost:8080/Java3FinalProject/planets/planetList

--------

Schema name: galaxyview

CREATE TABLE `buildings` (
  `buildingId` int(11) NOT NULL AUTO_INCREMENT,
  `buildingName` varchar(45) DEFAULT NULL,
  `buildingCost` int(11) DEFAULT NULL,
  `buildingLevel` int(11) DEFAULT NULL,
  `planetId` int(11) DEFAULT NULL,
  PRIMARY KEY (`buildingId`),
  KEY `FK_planetId_idx` (`planetId`),
  CONSTRAINT `FK_planetId` FOREIGN KEY (`planetId`) REFERENCES `planets` (`planetId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `planets` (
  `planetId` int(11) NOT NULL AUTO_INCREMENT,
  `planetName` varchar(45) DEFAULT NULL,
  `planetResource` int(11) DEFAULT NULL,
  PRIMARY KEY (`planetId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
