-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`usuario` (
  `idusuario` INT NOT NULL,
  `genero_usuario` VARCHAR(45) NULL,
  `clave_usuario` VARCHAR(45) NULL,
  `nombre_usuario` VARCHAR(45) NULL,
  `correo_usuairio` VARCHAR(45) NULL,
  `rol_usuario` VARCHAR(45) NULL,
  `usuariocol` VARCHAR(45) NULL,
  PRIMARY KEY (`idusuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`escritos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`escritos` (
  `id_escrito` INT NOT NULL,
  `genero_escrito` VARCHAR(45) NULL,
  `titulo_escrito` VARCHAR(45) NULL,
  `cantidad_de_paginas` VARCHAR(45) NULL,
  PRIMARY KEY (`id_escrito`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`eventos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`eventos` (
  `id_evento` INT NOT NULL,
  `fecha_inicio_evento` VARCHAR(45) NULL,
  `fecha_final_evento` VARCHAR(45) NULL,
  `tematica_evento` VARCHAR(45) NULL,
  PRIMARY KEY (`id_evento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`usuario_has_escritos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`usuario_has_escritos` (
  `usuario_idusuario` INT NOT NULL,
  `escritos_id_escrito` INT NOT NULL,
  PRIMARY KEY (`usuario_idusuario`, `escritos_id_escrito`),
  INDEX `fk_usuario_has_escritos_escritos1_idx` (`escritos_id_escrito` ASC) VISIBLE,
  INDEX `fk_usuario_has_escritos_usuario1_idx` (`usuario_idusuario` ASC) VISIBLE,
  CONSTRAINT `fk_usuario_has_escritos_usuario1`
    FOREIGN KEY (`usuario_idusuario`)
    REFERENCES `mydb`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_has_escritos_escritos1`
    FOREIGN KEY (`escritos_id_escrito`)
    REFERENCES `mydb`.`escritos` (`id_escrito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`escritos_has_eventos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`escritos_has_eventos` (
  `escritos_id_escrito` INT NOT NULL,
  `eventos_id_evento` INT NOT NULL,
  PRIMARY KEY (`escritos_id_escrito`, `eventos_id_evento`),
  INDEX `fk_escritos_has_eventos_eventos1_idx` (`eventos_id_evento` ASC) VISIBLE,
  INDEX `fk_escritos_has_eventos_escritos1_idx` (`escritos_id_escrito` ASC) VISIBLE,
  CONSTRAINT `fk_escritos_has_eventos_escritos1`
    FOREIGN KEY (`escritos_id_escrito`)
    REFERENCES `mydb`.`escritos` (`id_escrito`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_escritos_has_eventos_eventos1`
    FOREIGN KEY (`eventos_id_evento`)
    REFERENCES `mydb`.`eventos` (`id_evento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
