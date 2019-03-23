-- MySQL Script generated by MySQL Workbench
-- 03/22/19 17:47:30
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Libro`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Libro` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Libro` (
  `ISBN` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `autor` VARCHAR(45) NOT NULL,
  `editorial` VARCHAR(45) NOT NULL,
  `precio` DOUBLE NOT NULL,
  `portada` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ISBN`),
  UNIQUE INDEX `portada_UNIQUE` (`portada` ASC),
  UNIQUE INDEX `ISBN_UNIQUE` (`ISBN` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Pedido`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Pedido` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Pedido` (
  `idPedido` INT NOT NULL,
  `fecha` DATE NULL,
  `hora_inicio` TIME(0) NULL,
  `hora_fin` TIME(0) NULL,
  PRIMARY KEY (`idPedido`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Usuario` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `IP` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE INDEX `idUsuario_UNIQUE` (`idUsuario` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Sesion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Sesion` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Sesion` (
  `Libro_ISBN` INT NOT NULL,
  `Pedido_idPedido` INT NOT NULL,
  `id_sesion` INT NOT NULL,
  PRIMARY KEY (`Libro_ISBN`, `Pedido_idPedido`, `id_sesion`),
  INDEX `fk_Libro_has_Pedido_Pedido1_idx` (`Pedido_idPedido` ASC),
  INDEX `fk_Libro_has_Pedido_Libro1_idx` (`Libro_ISBN` ASC),
  CONSTRAINT `fk_Libro_has_Pedido_Libro1`
    FOREIGN KEY (`Libro_ISBN`)
    REFERENCES `mydb`.`Libro` (`ISBN`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Libro_has_Pedido_Pedido1`
    FOREIGN KEY (`Pedido_idPedido`)
    REFERENCES `mydb`.`Pedido` (`idPedido`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`UsuarioSesion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`UsuarioSesion` ;

CREATE TABLE IF NOT EXISTS `mydb`.`UsuarioSesion` (
  `Pedido_idPedido` INT NOT NULL,
  `Usuario_idUsuario` INT NOT NULL,
  `tiempo_usuario` TIME(0) NOT NULL,
  `lugar_jugador` VARCHAR(45) NOT NULL,
  `id_usuariosesion` INT NOT NULL,
  PRIMARY KEY (`Pedido_idPedido`, `Usuario_idUsuario`, `id_usuariosesion`),
  INDEX `fk_Libro_has_Pedido_has_Usuario_Usuario1_idx` (`Usuario_idUsuario` ASC),
  INDEX `fk_Libro_has_Pedido_has_Usuario_Libro_has_Pedido1_idx` (`Pedido_idPedido` ASC),
  CONSTRAINT `fk_Libro_has_Pedido_has_Usuario_Libro_has_Pedido1`
    FOREIGN KEY (`Pedido_idPedido`)
    REFERENCES `mydb`.`Sesion` (`Pedido_idPedido`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Libro_has_Pedido_has_Usuario_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `mydb`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
