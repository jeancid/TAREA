SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema fastdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `fastdb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `fastdb` ;

-- -----------------------------------------------------
-- Table `fastdb`.`usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `fastdb`.`usuario` ;

CREATE TABLE IF NOT EXISTS `fastdb`.`usuario` (
  `idusuario` INT NOT NULL AUTO_INCREMENT,
  `pass` VARCHAR(45) NULL,
  `usuario` VARCHAR(45) NULL,
  PRIMARY KEY (`idusuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `fastdb`.`Venta`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `fastdb`.`Venta` ;

CREATE TABLE IF NOT EXISTS `fastdb`.`Venta` (
  `idventa` INT NOT NULL,
  `monto` INT NULL,
  `fecha` DATETIME NULL,
  `usuario_idusuario` INT NOT NULL,
  PRIMARY KEY (`idventa`, `usuario_idusuario`),
  INDEX `fk_Venta_usuario_idx` (`usuario_idusuario` ASC),
  CONSTRAINT `fk_Venta_usuario`
    FOREIGN KEY (`usuario_idusuario`)
    REFERENCES `fastdb`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `fastdb`.`proveedor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `fastdb`.`proveedor` ;

CREATE TABLE IF NOT EXISTS `fastdb`.`proveedor` (
  `id_rut` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `telefono` INT NULL,
  `email` VARCHAR(45) NULL,
  `paginaweb` VARCHAR(45) NULL,
  `direccion` VARCHAR(100) NULL,
  PRIMARY KEY (`id_rut`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `fastdb`.`producto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `fastdb`.`producto` ;

CREATE TABLE IF NOT EXISTS `fastdb`.`producto` (
  `id_barra` VARCHAR(50) NOT NULL,
  `precio` INT NULL,
  `nombre` VARCHAR(45) NULL,
  `cantidad` INT NULL,
  `categoria` VARCHAR(45) NULL,
  `proveedor_id_rut` INT NOT NULL,
  PRIMARY KEY (`id_barra`),
  INDEX `fk_producto_proveedor1_idx` (`proveedor_id_rut` ASC),
  CONSTRAINT `fk_producto_proveedor1`
    FOREIGN KEY (`proveedor_id_rut`)
    REFERENCES `fastdb`.`proveedor` (`id_rut`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `fastdb`.`Detalle`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `fastdb`.`Detalle` ;

CREATE TABLE IF NOT EXISTS `fastdb`.`Detalle` (
  `producto_id_barra` VARCHAR(50) NOT NULL,
  `Venta_idventa` INT NOT NULL,
  `Venta_usuario_idusuario` INT NOT NULL,
  `cantidadventa` VARCHAR(45) NULL,
  PRIMARY KEY (`producto_id_barra`, `Venta_idventa`, `Venta_usuario_idusuario`),
  INDEX `fk_producto_has_Venta_Venta1_idx` (`Venta_idventa` ASC, `Venta_usuario_idusuario` ASC),
  INDEX `fk_producto_has_Venta_producto1_idx` (`producto_id_barra` ASC),
  CONSTRAINT `fk_producto_has_Venta_producto1`
    FOREIGN KEY (`producto_id_barra`)
    REFERENCES `fastdb`.`producto` (`id_barra`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_producto_has_Venta_Venta1`
    FOREIGN KEY (`Venta_idventa` , `Venta_usuario_idusuario`)
    REFERENCES `fastdb`.`Venta` (`idventa` , `usuario_idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
