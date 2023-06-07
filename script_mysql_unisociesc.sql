CREATE DATABASE `mydb` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `cursos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `data_criacao` datetime NOT NULL,
  `ativo` tinyint NOT NULL DEFAULT '1',
  `data_encerramento` datetime DEFAULT NULL,
  `apelido` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

CREATE TABLE `turmas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `semestre` int NOT NULL,
  `ano` int NOT NULL,
  `tipo` char(1) NOT NULL,
  `Unidades_curriculares_id` int NOT NULL,
  PRIMARY KEY (`id`,`Unidades_curriculares_id`),
  KEY `fk_turmas_Unidades_curriculares_idx` (`Unidades_curriculares_id`),
  CONSTRAINT `fk_turmas_Unidades_curriculares` FOREIGN KEY (`Unidades_curriculares_id`) REFERENCES `unidades_curriculares` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

CREATE TABLE `uc_x_cursos` (
  `Unidades_curriculares_id` int NOT NULL,
  `cursos_id` int NOT NULL,
  PRIMARY KEY (`Unidades_curriculares_id`,`cursos_id`),
  KEY `fk_Unidades_curriculares_has_cursos_cursos1_idx` (`cursos_id`),
  KEY `fk_Unidades_curriculares_has_cursos_Unidades_curriculares1_idx` (`Unidades_curriculares_id`),
  CONSTRAINT `fk_Unidades_curriculares_has_cursos_cursos1` FOREIGN KEY (`cursos_id`) REFERENCES `cursos` (`id`),
  CONSTRAINT `fk_Unidades_curriculares_has_cursos_Unidades_curriculares1` FOREIGN KEY (`Unidades_curriculares_id`) REFERENCES `unidades_curriculares` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `unidades_curriculares` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
