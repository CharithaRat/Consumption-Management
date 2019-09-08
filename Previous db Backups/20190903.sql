/*
SQLyog Ultimate v8.55 
MySQL - 5.1.48-community : Database - mcms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mcms` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `mcms`;

/*Table structure for table `bom` */

DROP TABLE IF EXISTS `bom`;

CREATE TABLE `bom` (
  `BOM_ID` varchar(255) NOT NULL,
  `BOM_DATE` varchar(255) DEFAULT NULL,
  `BOM_DES` varchar(255) DEFAULT NULL,
  `BOM_GUR_PER` varchar(255) DEFAULT NULL,
  `BOM_TYPE` varchar(255) DEFAULT NULL,
  `BOM_UNIT` varchar(255) DEFAULT NULL,
  `BOM_VALUE` double NOT NULL,
  PRIMARY KEY (`BOM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bom` */

/*Table structure for table `bom_materialmaster` */

DROP TABLE IF EXISTS `bom_materialmaster`;

CREATE TABLE `bom_materialmaster` (
  `boms_BOM_ID` varchar(255) NOT NULL,
  `materialMasters_MATERIAL_ID` varchar(255) NOT NULL,
  KEY `FKhxkfsuf7spfl9xyv6w0a7bsxt` (`materialMasters_MATERIAL_ID`),
  KEY `FKbjas8rpjbefvoisjs3gd5aajr` (`boms_BOM_ID`),
  CONSTRAINT `FKbjas8rpjbefvoisjs3gd5aajr` FOREIGN KEY (`boms_BOM_ID`) REFERENCES `bom` (`BOM_ID`),
  CONSTRAINT `FKhxkfsuf7spfl9xyv6w0a7bsxt` FOREIGN KEY (`materialMasters_MATERIAL_ID`) REFERENCES `materialmaster` (`MATERIAL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bom_materialmaster` */

/*Table structure for table `bomassigned` */

DROP TABLE IF EXISTS `bomassigned`;

CREATE TABLE `bomassigned` (
  `BOM_USAGE` varchar(255) NOT NULL,
  `ASSIGN_DATE` varchar(255) DEFAULT NULL,
  `BOM_COST` double NOT NULL,
  `BOM_ID` varchar(255) DEFAULT NULL,
  `COST_PER_UNITAREA` double NOT NULL,
  `COV_AREA` double NOT NULL,
  `COV_AREA_UNIT` varchar(255) DEFAULT NULL,
  `HEIGHT` double NOT NULL,
  `LENGTH` double NOT NULL,
  `WIDTH` double NOT NULL,
  `budget_BUDGET_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`BOM_USAGE`),
  KEY `FK8fxkxb19tm99mqx8hy2b2g16c` (`budget_BUDGET_ID`),
  CONSTRAINT `FK8fxkxb19tm99mqx8hy2b2g16c` FOREIGN KEY (`budget_BUDGET_ID`) REFERENCES `budget` (`BUDGET_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bomassigned` */

/*Table structure for table `bomassigned_bom` */

DROP TABLE IF EXISTS `bomassigned_bom`;

CREATE TABLE `bomassigned_bom` (
  `bomAssigneds_BOM_USAGE` varchar(255) NOT NULL,
  `bomsList_BOM_ID` varchar(255) NOT NULL,
  KEY `FKmsewxox049eaei5jqdo7d1tfn` (`bomsList_BOM_ID`),
  KEY `FK1x552hbknbkc369sim9ypn6ue` (`bomAssigneds_BOM_USAGE`),
  CONSTRAINT `FK1x552hbknbkc369sim9ypn6ue` FOREIGN KEY (`bomAssigneds_BOM_USAGE`) REFERENCES `bomassigned` (`BOM_USAGE`),
  CONSTRAINT `FKmsewxox049eaei5jqdo7d1tfn` FOREIGN KEY (`bomsList_BOM_ID`) REFERENCES `bom` (`BOM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bomassigned_bom` */

/*Table structure for table `bommat` */

DROP TABLE IF EXISTS `bommat`;

CREATE TABLE `bommat` (
  `MAT_ID` varchar(255) NOT NULL,
  `BOM_ID` varchar(255) DEFAULT NULL,
  `MAT_NAME` varchar(255) DEFAULT NULL,
  `MAT_QTY` double NOT NULL,
  `MAT_TTL_AMOUNT` double NOT NULL,
  `MAT_UNIT` varchar(255) DEFAULT NULL,
  `MAT_UNIT_COST` double NOT NULL,
  PRIMARY KEY (`MAT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bommat` */

/*Table structure for table `budget` */

DROP TABLE IF EXISTS `budget`;

CREATE TABLE `budget` (
  `BUDGET_ID` varchar(255) NOT NULL,
  `ACT_COST` double NOT NULL,
  `BOM_COST` double NOT NULL,
  `BOM_ID` varchar(255) DEFAULT NULL,
  `BOM_TYPE` varchar(255) DEFAULT NULL,
  `BOM_USAGE` varchar(255) DEFAULT NULL,
  `BUD_DATE` varchar(255) DEFAULT NULL,
  `COV_AREA_BY_CMT` double NOT NULL,
  `HEIGHT` double NOT NULL,
  `LENGTH` double NOT NULL,
  `MODEL_ID` varchar(255) DEFAULT NULL,
  `NO_OF_BOM_UNITS` double NOT NULL,
  `REQ_AREA` double NOT NULL,
  `TTL_BUDGET_COST` double NOT NULL,
  `WIDTH` double NOT NULL,
  `XBOM_ID` varchar(255) DEFAULT NULL,
  `model_MODEL_ID` varchar(255) DEFAULT NULL,
  `xbom_XBOM_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`BUDGET_ID`),
  KEY `FKd4h50ps3h4dca9fbwnn7jrsev` (`model_MODEL_ID`),
  KEY `FKjme040qwflbo4u4stu0vw3x19` (`xbom_XBOM_ID`),
  CONSTRAINT `FKjme040qwflbo4u4stu0vw3x19` FOREIGN KEY (`xbom_XBOM_ID`) REFERENCES `xbom` (`XBOM_ID`),
  CONSTRAINT `FKd4h50ps3h4dca9fbwnn7jrsev` FOREIGN KEY (`model_MODEL_ID`) REFERENCES `model` (`MODEL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `budget` */

/*Table structure for table `contractor` */

DROP TABLE IF EXISTS `contractor`;

CREATE TABLE `contractor` (
  `CONT_ID` int(11) NOT NULL,
  `ADDRESS1` varchar(255) DEFAULT NULL,
  `ADDRESS2` varchar(255) DEFAULT NULL,
  `ADDRESS3` varchar(255) DEFAULT NULL,
  `CONT_CONTACT` varchar(255) DEFAULT NULL,
  `CONT_JOIN_DATE` varchar(255) DEFAULT NULL,
  `CONT_NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`CONT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contractor` */

insert  into `contractor`(`CONT_ID`,`ADDRESS1`,`ADDRESS2`,`ADDRESS3`,`CONT_CONTACT`,`CONT_JOIN_DATE`,`CONT_NAME`) values (6,'No: 25','Wilson De Silve Mawatha','Colombo 05','011548936','25/06/2019','Navaloka Constructions(Pvt) Ltd');

/*Table structure for table `detailmaster` */

DROP TABLE IF EXISTS `detailmaster`;

CREATE TABLE `detailmaster` (
  `DETAIL_ID` varchar(255) NOT NULL,
  `DETAIL_NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`DETAIL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detailmaster` */

insert  into `detailmaster`(`DETAIL_ID`,`DETAIL_NAME`) values ('MON','qqwewewewew');

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `EMP_ID` int(11) NOT NULL,
  `ADDRESS1` varchar(255) DEFAULT NULL,
  `ADDRESS2` varchar(255) DEFAULT NULL,
  `ADDRESS3` varchar(255) DEFAULT NULL,
  `EMP_CONTACT` varchar(255) DEFAULT NULL,
  `EMP_DESIGNATION` varchar(255) DEFAULT NULL,
  `EMP_JOIN_DATE` varchar(255) DEFAULT NULL,
  `EMP_NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`EMP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employee` */

insert  into `employee`(`EMP_ID`,`ADDRESS1`,`ADDRESS2`,`ADDRESS3`,`EMP_CONTACT`,`EMP_DESIGNATION`,`EMP_JOIN_DATE`,`EMP_NAME`) values (1,'No. 01','Pugalla','Kalugamuwa','0777205678','Software Engineer','08/20/2019','Charitha'),(3,'','','','','','',''),(4,'afafa','gdgd','gdgd','dggdg','dgdgd','rtururu','afafa');

/*Table structure for table `grn` */

DROP TABLE IF EXISTS `grn`;

CREATE TABLE `grn` (
  `GRN_ID` varchar(255) NOT NULL,
  `GRN_AMOUT` double NOT NULL,
  `GRN_DATE` varchar(255) DEFAULT NULL,
  `MAT_DES` varchar(255) DEFAULT NULL,
  `MAT_GRN_QTY` double NOT NULL,
  `MAT_ID` varchar(255) DEFAULT NULL,
  `MAT_UNIT` varchar(255) DEFAULT NULL,
  `MAT_UNIT_PRICE` double NOT NULL,
  `SUP_DES` varchar(255) DEFAULT NULL,
  `SUP_ID` varchar(255) DEFAULT NULL,
  `TTL_AMOUNT` double NOT NULL,
  PRIMARY KEY (`GRN_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `grn` */

/*Table structure for table `grn_materialmaster` */

DROP TABLE IF EXISTS `grn_materialmaster`;

CREATE TABLE `grn_materialmaster` (
  `grns_GRN_ID` varchar(255) NOT NULL,
  `mats_MATERIAL_ID` varchar(255) NOT NULL,
  KEY `FKl63uxur3651qm784jwru580qv` (`mats_MATERIAL_ID`),
  KEY `FK54w2oypwb94yg5jxd0ypykegy` (`grns_GRN_ID`),
  CONSTRAINT `FK54w2oypwb94yg5jxd0ypykegy` FOREIGN KEY (`grns_GRN_ID`) REFERENCES `grn` (`GRN_ID`),
  CONSTRAINT `FKl63uxur3651qm784jwru580qv` FOREIGN KEY (`mats_MATERIAL_ID`) REFERENCES `materialmaster` (`MATERIAL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `grn_materialmaster` */

/*Table structure for table `hibernate_sequence` */

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hibernate_sequence` */

insert  into `hibernate_sequence`(`next_val`) values (9),(9),(9);

/*Table structure for table `issuedtl` */

DROP TABLE IF EXISTS `issuedtl`;

CREATE TABLE `issuedtl` (
  `ISU_NOTE_NO` varchar(255) NOT NULL,
  `ISU_BY` varchar(255) DEFAULT NULL,
  `ISU_DATE` varchar(255) DEFAULT NULL,
  `MAT_DES` varchar(255) DEFAULT NULL,
  `MAT_ID` varchar(255) DEFAULT NULL,
  `MAT_ISU_QTY` double NOT NULL,
  `MAT_REQ_QTY` double NOT NULL,
  `MAT_SER_NO` varchar(255) DEFAULT NULL,
  `MAT_UNIT` varchar(255) DEFAULT NULL,
  `REQ_BY` varchar(255) DEFAULT NULL,
  `REQ_DATE` varchar(255) DEFAULT NULL,
  `REQ_ID` varchar(255) DEFAULT NULL,
  `contractordet_CONT_ID` int(11) DEFAULT NULL,
  `mainStks_BIN_ITEM` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ISU_NOTE_NO`),
  KEY `FKtrcs41a3qt4jhqguijty6yt6n` (`contractordet_CONT_ID`),
  KEY `FKk4f0ml2178qxqw68y0wrj8t6` (`mainStks_BIN_ITEM`),
  CONSTRAINT `FKk4f0ml2178qxqw68y0wrj8t6` FOREIGN KEY (`mainStks_BIN_ITEM`) REFERENCES `mainstock` (`BIN_ITEM`),
  CONSTRAINT `FKtrcs41a3qt4jhqguijty6yt6n` FOREIGN KEY (`contractordet_CONT_ID`) REFERENCES `contractor` (`CONT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `issuedtl` */

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `USER_NAME` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `S_PASSWORD` varchar(255) DEFAULT NULL,
  `USER_TYPE` varchar(255) DEFAULT NULL,
  `employee_EMP_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`USER_NAME`),
  KEY `FK5a9yw3kd1rpb4wge5i1kw48nb` (`employee_EMP_ID`),
  CONSTRAINT `FK5a9yw3kd1rpb4wge5i1kw48nb` FOREIGN KEY (`employee_EMP_ID`) REFERENCES `employee` (`EMP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

/*Table structure for table `mainmaster` */

DROP TABLE IF EXISTS `mainmaster`;

CREATE TABLE `mainmaster` (
  `MAIN_ID` varchar(255) NOT NULL,
  `MAIN_DES` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`MAIN_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mainmaster` */

insert  into `mainmaster`(`MAIN_ID`,`MAIN_DES`) values ('AS','addadad'),('PO','po cone');

/*Table structure for table `mainstock` */

DROP TABLE IF EXISTS `mainstock`;

CREATE TABLE `mainstock` (
  `BIN_ITEM` varchar(255) NOT NULL,
  `LOCATION` varchar(255) DEFAULT NULL,
  `MAT_COST` double NOT NULL,
  `MAT_DES` varchar(255) DEFAULT NULL,
  `MAT_ID` varchar(255) DEFAULT NULL,
  `MAT_QTY` double NOT NULL,
  `MAT_UNIT` varchar(255) DEFAULT NULL,
  `TTL_AMOUNT` double NOT NULL,
  PRIMARY KEY (`BIN_ITEM`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mainstock` */

/*Table structure for table `mainstock_grn` */

DROP TABLE IF EXISTS `mainstock_grn`;

CREATE TABLE `mainstock_grn` (
  `mainStocks_BIN_ITEM` varchar(255) NOT NULL,
  `grns_GRN_ID` varchar(255) NOT NULL,
  KEY `FKgjivnyaj5qcokcfmntgaoqsjg` (`grns_GRN_ID`),
  KEY `FKf8gap8s85tqehvxut9al8swe8` (`mainStocks_BIN_ITEM`),
  CONSTRAINT `FKf8gap8s85tqehvxut9al8swe8` FOREIGN KEY (`mainStocks_BIN_ITEM`) REFERENCES `mainstock` (`BIN_ITEM`),
  CONSTRAINT `FKgjivnyaj5qcokcfmntgaoqsjg` FOREIGN KEY (`grns_GRN_ID`) REFERENCES `grn` (`GRN_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `mainstock_grn` */

/*Table structure for table `materialmaster` */

DROP TABLE IF EXISTS `materialmaster`;

CREATE TABLE `materialmaster` (
  `MATERIAL_ID` varchar(255) NOT NULL,
  `MATERIAL_CODE` varchar(255) DEFAULT NULL,
  `MATERIAL_NAME` varchar(255) DEFAULT NULL,
  `MATERIAL_TYPE` varchar(255) DEFAULT NULL,
  `MATERIAL_UNIT` varchar(255) DEFAULT NULL,
  `MAT_DATE` varchar(255) DEFAULT NULL,
  `UNIT_PRICE` double NOT NULL,
  `unit_UNIT_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`MATERIAL_ID`),
  KEY `FKifskch8gw7rtuan18ykrmtkis` (`unit_UNIT_ID`),
  CONSTRAINT `FKifskch8gw7rtuan18ykrmtkis` FOREIGN KEY (`unit_UNIT_ID`) REFERENCES `unit` (`UNIT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `materialmaster` */

/*Table structure for table `model` */

DROP TABLE IF EXISTS `model`;

CREATE TABLE `model` (
  `MODEL_ID` varchar(255) NOT NULL,
  `MODEL_CRE_DATE` varchar(255) DEFAULT NULL,
  `MODEL_NAME` varchar(255) DEFAULT NULL,
  `MODEL_TYPE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`MODEL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `model` */

insert  into `model`(`MODEL_ID`,`MODEL_CRE_DATE`,`MODEL_NAME`,`MODEL_TYPE`) values ('MD124','15/08/2019','Model Building 1','2 Floors'),('MD458','','adadada','3 Floors');

/*Table structure for table `prodoutput` */

DROP TABLE IF EXISTS `prodoutput`;

CREATE TABLE `prodoutput` (
  `PRD_DATE` varchar(255) NOT NULL,
  `BOM_ID` varchar(255) DEFAULT NULL,
  `BOM_USAGE` varchar(255) DEFAULT NULL,
  `COV_AREA` double NOT NULL,
  `COV_VOLUME` double NOT NULL,
  `MODEL_ID` varchar(255) DEFAULT NULL,
  `contractordata_CONT_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`PRD_DATE`),
  KEY `FKcr8gf33pfswvrv59dawfmocq` (`contractordata_CONT_ID`),
  CONSTRAINT `FKcr8gf33pfswvrv59dawfmocq` FOREIGN KEY (`contractordata_CONT_ID`) REFERENCES `contractor` (`CONT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `prodoutput` */

/*Table structure for table `reqnote` */

DROP TABLE IF EXISTS `reqnote`;

CREATE TABLE `reqnote` (
  `REQ_NO` varchar(255) NOT NULL,
  `MAT_DES` varchar(255) DEFAULT NULL,
  `MAT_ID` varchar(255) DEFAULT NULL,
  `MAT_QTY` double NOT NULL,
  `MAT_UNIT` varchar(255) DEFAULT NULL,
  `MODEL_ID` varchar(255) DEFAULT NULL,
  `REQ_BY` varchar(255) DEFAULT NULL,
  `REQ_DATE` varchar(255) DEFAULT NULL,
  `contractor_CONT_ID` int(11) DEFAULT NULL,
  `mainStock_BIN_ITEM` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`REQ_NO`),
  KEY `FK7eg7k10spmhb89wjw1x7iufkk` (`contractor_CONT_ID`),
  KEY `FKan7nsy0ynodd25x40dr3wcb64` (`mainStock_BIN_ITEM`),
  CONSTRAINT `FKan7nsy0ynodd25x40dr3wcb64` FOREIGN KEY (`mainStock_BIN_ITEM`) REFERENCES `mainstock` (`BIN_ITEM`),
  CONSTRAINT `FK7eg7k10spmhb89wjw1x7iufkk` FOREIGN KEY (`contractor_CONT_ID`) REFERENCES `contractor` (`CONT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `reqnote` */

/*Table structure for table `submaster` */

DROP TABLE IF EXISTS `submaster`;

CREATE TABLE `submaster` (
  `SUB_ID` varchar(255) NOT NULL,
  `SUB_DES` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`SUB_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `submaster` */

insert  into `submaster`(`SUB_ID`,`SUB_DES`) values ('ADD','afafafa');

/*Table structure for table `supplier` */

DROP TABLE IF EXISTS `supplier`;

CREATE TABLE `supplier` (
  `SUP_ID` int(11) NOT NULL,
  `ADDRESS1` varchar(255) DEFAULT NULL,
  `ADDRESS2` varchar(255) DEFAULT NULL,
  `ADDRESS3` varchar(255) DEFAULT NULL,
  `SUP_CONTACT` varchar(255) DEFAULT NULL,
  `SUP_JOIN_DATE` varchar(255) DEFAULT NULL,
  `SUP_NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`SUP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `supplier` */

insert  into `supplier`(`SUP_ID`,`ADDRESS1`,`ADDRESS2`,`ADDRESS3`,`SUP_CONTACT`,`SUP_JOIN_DATE`,`SUP_NAME`) values (2,'','','','','',''),(5,'No: 55','Kalavana','Negombo','0371154879','','Gamage Motors (Pvt) Ltd'),(7,'afdafa','afafa','rerer','a324242','','xxx'),(8,'gsdgs','ddh','dhdh','0124778552','18/05/2019','yyy');

/*Table structure for table `supplier_materialmaster` */

DROP TABLE IF EXISTS `supplier_materialmaster`;

CREATE TABLE `supplier_materialmaster` (
  `suppliers_SUP_ID` int(11) NOT NULL,
  `materials_MATERIAL_ID` varchar(255) NOT NULL,
  KEY `FKn3lndasaa9e2xwdweuf335lct` (`materials_MATERIAL_ID`),
  KEY `FK8dw915x1m2o21w5804qr2ckb6` (`suppliers_SUP_ID`),
  CONSTRAINT `FK8dw915x1m2o21w5804qr2ckb6` FOREIGN KEY (`suppliers_SUP_ID`) REFERENCES `supplier` (`SUP_ID`),
  CONSTRAINT `FKn3lndasaa9e2xwdweuf335lct` FOREIGN KEY (`materials_MATERIAL_ID`) REFERENCES `materialmaster` (`MATERIAL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `supplier_materialmaster` */

/*Table structure for table `test` */

DROP TABLE IF EXISTS `test`;

CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `test` */

/*Table structure for table `unit` */

DROP TABLE IF EXISTS `unit`;

CREATE TABLE `unit` (
  `UNIT_ID` varchar(255) NOT NULL,
  `UNIT_DES` varchar(255) DEFAULT NULL,
  `UNIT_SYMBOL` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`UNIT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `unit` */

insert  into `unit`(`UNIT_ID`,`UNIT_DES`,`UNIT_SYMBOL`) values ('GR','Grames','g'),('KG','Killo Grams','Kg');

/*Table structure for table `unitrelation` */

DROP TABLE IF EXISTS `unitrelation`;

CREATE TABLE `unitrelation` (
  `BASE_UNIT` varchar(255) NOT NULL,
  `REL_UNIT` varchar(255) DEFAULT NULL,
  `UNIT_RATE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`BASE_UNIT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `unitrelation` */

insert  into `unitrelation`(`BASE_UNIT`,`REL_UNIT`,`UNIT_RATE`) values ('Kg','g','1000.0');

/*Table structure for table `unitrelation_unit` */

DROP TABLE IF EXISTS `unitrelation_unit`;

CREATE TABLE `unitrelation_unit` (
  `relations_BASE_UNIT` varchar(255) NOT NULL,
  `units_UNIT_ID` varchar(255) NOT NULL,
  KEY `FK9wqo2ui1uowwbwuapa38bb9jq` (`units_UNIT_ID`),
  KEY `FKqkujkd6w9dfpu5qdd5786rewa` (`relations_BASE_UNIT`),
  CONSTRAINT `FKqkujkd6w9dfpu5qdd5786rewa` FOREIGN KEY (`relations_BASE_UNIT`) REFERENCES `unitrelation` (`BASE_UNIT`),
  CONSTRAINT `FK9wqo2ui1uowwbwuapa38bb9jq` FOREIGN KEY (`units_UNIT_ID`) REFERENCES `unit` (`UNIT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `unitrelation_unit` */

/*Table structure for table `xbom` */

DROP TABLE IF EXISTS `xbom`;

CREATE TABLE `xbom` (
  `XBOM_ID` varchar(255) NOT NULL,
  `BOM_COST` double NOT NULL,
  `BOM_ID` varchar(255) DEFAULT NULL,
  `BOM_TYPE` varchar(255) DEFAULT NULL,
  `MODEL_ID` varchar(255) DEFAULT NULL,
  `XBOM_GUR_PER` varchar(255) DEFAULT NULL,
  `model_MODEL_ID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`XBOM_ID`),
  KEY `FKjvxmsi8ymiy2sa52fcmcnbijj` (`model_MODEL_ID`),
  CONSTRAINT `FKjvxmsi8ymiy2sa52fcmcnbijj` FOREIGN KEY (`model_MODEL_ID`) REFERENCES `model` (`MODEL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `xbom` */

/*Table structure for table `xbom_bom` */

DROP TABLE IF EXISTS `xbom_bom`;

CREATE TABLE `xbom_bom` (
  `xboms_XBOM_ID` varchar(255) NOT NULL,
  `boms_BOM_ID` varchar(255) NOT NULL,
  KEY `FKdlyc2q08cg0ogag7nr2akttyq` (`boms_BOM_ID`),
  KEY `FK6howfkmx061k8euolb7k75lem` (`xboms_XBOM_ID`),
  CONSTRAINT `FK6howfkmx061k8euolb7k75lem` FOREIGN KEY (`xboms_XBOM_ID`) REFERENCES `xbom` (`XBOM_ID`),
  CONSTRAINT `FKdlyc2q08cg0ogag7nr2akttyq` FOREIGN KEY (`boms_BOM_ID`) REFERENCES `bom` (`BOM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `xbom_bom` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
