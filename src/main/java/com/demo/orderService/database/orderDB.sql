-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema orderdb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema orderdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `orderdb` DEFAULT CHARACTER SET latin1 ;
USE `orderdb` ;

-- -----------------------------------------------------
-- Table `orderdb`.`order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `orderdb`.`order` (
  `orderID` INT(11) NOT NULL AUTO_INCREMENT,
  `tableNumber` INT(11) NOT NULL,
  `orderName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`orderID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
