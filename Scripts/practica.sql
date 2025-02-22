-- MySQL Script generated by MySQL Workbench
-- Tue Dec 15 11:42:56 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema practica
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema practica
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `practica` DEFAULT CHARACTER SET utf8 ;
USE `practica` ;

-- -----------------------------------------------------
-- Table `practica`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `practica`.`usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(20) NOT NULL,
  `apellido` VARCHAR(25) NOT NULL,
  `correo` VARCHAR(60) NOT NULL,
  `password` VARCHAR(60) NOT NULL,
  `token` VARCHAR(256),
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_usuario_UNIQUE` (`id` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;