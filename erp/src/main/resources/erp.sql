/*
SQLyog Ultimate v12.4.1 (64 bit)
MySQL - 5.7.18-log : Database - erp
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`erp` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `erp`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `account_id` varchar(50) NOT NULL COMMENT '科目id（主键 唯一）',
  `account_invoicetypename` varchar(50) DEFAULT NULL COMMENT '发票类型名称',
  `account_engname` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `account_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `account_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `account_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `account_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `account_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `account_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `account_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `account_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `account_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `account` */

/*Table structure for table `adjust_detail` */

DROP TABLE IF EXISTS `adjust_detail`;

CREATE TABLE `adjust_detail` (
  `d_matterid` varchar(50) DEFAULT NULL COMMENT '物料id，关联物料主文件表',
  `d_adjustprice` float DEFAULT NULL COMMENT '调价金额',
  `d_decoration` varchar(200) DEFAULT NULL COMMENT '分录备注',
  `d_apid` varchar(50) DEFAULT NULL COMMENT '调价单id，关联调价单',
  `adde_id` int(11) NOT NULL AUTO_INCREMENT,
  `adde_custom1` varchar(50) DEFAULT NULL,
  `adde_custom2` varchar(50) DEFAULT NULL,
  `adde_custom3` varchar(50) DEFAULT NULL,
  `adde_custom4` varchar(50) DEFAULT NULL,
  `adde_custom5` varchar(50) DEFAULT NULL,
  `adde_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`adde_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `adjust_detail` */

insert  into `adjust_detail`(`d_matterid`,`d_adjustprice`,`d_decoration`,`d_apid`,`adde_id`,`adde_custom1`,`adde_custom2`,`adde_custom3`,`adde_custom4`,`adde_custom5`,`adde_custom6`) values 
('1',200,'1asd','1',1,NULL,NULL,NULL,NULL,NULL,NULL),
('2',300,'adsad','1',2,NULL,NULL,NULL,NULL,NULL,NULL),
('1',123,'ecs','2',3,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `adjust_price` */

DROP TABLE IF EXISTS `adjust_price`;

CREATE TABLE `adjust_price` (
  `ap_id` varchar(50) NOT NULL,
  `ap_dateid` varchar(50) DEFAULT NULL,
  `materialid` varchar(50) DEFAULT NULL,
  `updowmid` varchar(50) DEFAULT NULL,
  `ap_price` float DEFAULT NULL,
  `ap_decoration` varchar(50) DEFAULT NULL,
  `ap_doworkman` varchar(50) DEFAULT NULL,
  `ap_recheckman` varchar(50) DEFAULT NULL,
  `ap_auditing` varchar(50) DEFAULT NULL,
  `ap_yn` varchar(50) DEFAULT '0',
  `ap_custom1` varchar(50) DEFAULT NULL,
  `ap_custom2` varchar(50) DEFAULT NULL,
  `ap_custom3` varchar(50) DEFAULT NULL,
  `ap_custom4` varchar(50) DEFAULT NULL,
  `ap_custom5` varchar(50) DEFAULT NULL,
  `ap_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ap_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `adjust_price` */

/*Table structure for table `assessment_procurement` */

DROP TABLE IF EXISTS `assessment_procurement`;

CREATE TABLE `assessment_procurement` (
  `ap_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `ap_date_document` date DEFAULT NULL COMMENT '单据日期',
  `ap_method_assessment` varchar(50) DEFAULT NULL COMMENT '分摊方式（0按金额，1按数量，2按材积，3按重量）',
  `ap_principal_currency_amortized` float DEFAULT NULL COMMENT '待摊金额本位币',
  `ap_single_status` varchar(50) DEFAULT NULL COMMENT '凭证编号',
  `ap_belongs_project` varchar(50) DEFAULT NULL COMMENT '所属项目',
  `ap_executor` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `ap_checkagain_staff` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `ap_header_provision` varchar(50) DEFAULT NULL COMMENT '表头条文',
  `ap_end_clause` varchar(50) DEFAULT NULL COMMENT '表尾条文',
  `ap_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `ap_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `ap_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `ap_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `ap_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `ap_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `ap_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `ap_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `ap_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`ap_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购分摊作业表';

/*Data for the table `assessment_procurement` */

/*Table structure for table `assessment_procurement_detailed` */

DROP TABLE IF EXISTS `assessment_procurement_detailed`;

CREATE TABLE `assessment_procurement_detailed` (
  `apd_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `ap_id` varchar(50) DEFAULT NULL COMMENT '采购分摊单号(采购分摊作业表id 外键)',
  `apd_ict_id` varchar(50) DEFAULT NULL COMMENT '费用编号（收入费用类别 外键）',
  `apd_ict_name` varchar(50) DEFAULT NULL COMMENT '费用名称',
  `apd_currency_id` varchar(50) DEFAULT NULL COMMENT '币别',
  `apd_exchange_rate` float DEFAULT NULL COMMENT '汇率',
  `apd_money` int(11) DEFAULT NULL COMMENT '金额',
  `apd_amount_standard_currency` float DEFAULT NULL COMMENT '金额本位币',
  `apd_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `apd_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `apd_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `apd_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `apd_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `apd_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `apd_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `apd_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`apd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购折让费用明细表';

/*Data for the table `assessment_procurement_detailed` */

/*Table structure for table `assessment_procurement_fruit` */

DROP TABLE IF EXISTS `assessment_procurement_fruit`;

CREATE TABLE `assessment_procurement_fruit` (
  `apf_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `ap_id` varchar(50) DEFAULT NULL COMMENT '采购分摊单号(assessment_procurement外键)',
  `ps_id` varchar(50) DEFAULT NULL COMMENT '采购入库单号(assessment_procurement外键)',
  `apf_matter_id` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `apf_matter_name` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `apf_specifications` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `apf_company_name` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `apf_amount` int(11) DEFAULT NULL COMMENT '数量',
  `apf_money` float DEFAULT NULL COMMENT '采购金额',
  `apf_weight` float DEFAULT NULL COMMENT '重量',
  `apf_volume_wood` float DEFAULT NULL COMMENT '材积',
  `apf_contribution` float DEFAULT NULL COMMENT '分摊金额',
  `prt_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `prt_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `prt_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `prt_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `prt_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `prt_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `prt_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `prt_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`apf_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购折让分摊结果表';

/*Data for the table `assessment_procurement_fruit` */

/*Table structure for table `bank` */

DROP TABLE IF EXISTS `bank`;

CREATE TABLE `bank` (
  `bank_id` varchar(50) NOT NULL COMMENT '银行编号（主键 唯一）',
  `bank_name` varchar(50) DEFAULT NULL COMMENT '银行名称',
  `bank_english_name` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `bank_telephone` varchar(50) DEFAULT NULL COMMENT '电话',
  `bank_zipcode` varchar(50) DEFAULT NULL COMMENT '邮编',
  `bank_address` varchar(50) DEFAULT NULL COMMENT '地址',
  `bank_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `bank_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `bank_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `bank_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `bank_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `bank_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `bank_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `bank_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`bank_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bank` */

/*Table structure for table `bank_deposit_account` */

DROP TABLE IF EXISTS `bank_deposit_account`;

CREATE TABLE `bank_deposit_account` (
  `ada_id` varchar(50) NOT NULL COMMENT '编号（主键 唯一）',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别id',
  `bank_id` varchar(50) DEFAULT NULL COMMENT '开户银行id',
  `ada_bankaddress` varchar(50) DEFAULT NULL COMMENT '银行地址',
  `ada_phone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `ada_initialbalance` float DEFAULT NULL COMMENT '初始余额',
  `ada_name` varchar(50) DEFAULT NULL COMMENT '账户名称',
  `ada_subject` varchar(50) DEFAULT NULL COMMENT '银行存款科目',
  `ada_cyber bankaddress` varchar(50) DEFAULT NULL COMMENT '网银地址',
  `ada_linkman` varchar(50) DEFAULT NULL COMMENT '联系人',
  `ada_currentbalance` float DEFAULT NULL COMMENT '当前余额',
  `ada_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `ada_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `ada_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `ada_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ada_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ada_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ada_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ada_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ada_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`ada_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bank_deposit_account` */

/*Table structure for table `bank_type` */

DROP TABLE IF EXISTS `bank_type`;

CREATE TABLE `bank_type` (
  `bt_id` varchar(50) NOT NULL COMMENT '编号（主键 唯一）',
  `bt_name` varchar(50) DEFAULT NULL COMMENT '名称',
  `bt_english_name` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `bt_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `bt_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `bt_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `bt_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `bt_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `bt_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `bt_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `bt_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `bt_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`bt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bank_type` */

/*Table structure for table `casha_ccount` */

DROP TABLE IF EXISTS `casha_ccount`;

CREATE TABLE `casha_ccount` (
  `cc_id` varchar(50) NOT NULL COMMENT '编号（主键 唯一）',
  `cc_name` varchar(50) DEFAULT NULL COMMENT '名称',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别id',
  `cc_subject` varchar(50) DEFAULT NULL COMMENT '现金科目',
  `cc_initialbalance` float DEFAULT NULL COMMENT '初始余额',
  `cc_currentbalance` float DEFAULT NULL COMMENT '当前余额',
  `cc_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `cc_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `cc_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `cc_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `cc_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `cc_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `cc_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `cc_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `cc_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `casha_ccount` */

/*Table structure for table `check` */

DROP TABLE IF EXISTS `check`;

CREATE TABLE `check` (
  `check_id` varchar(20) NOT NULL,
  `warehouse_id` varchar(50) DEFAULT NULL,
  `sc_appreciation_subjects` varchar(50) DEFAULT NULL,
  `sc_impairment_subjects` varchar(50) DEFAULT NULL,
  `check_documentation_date` datetime DEFAULT NULL,
  `check_documentation_no` varchar(32) DEFAULT NULL,
  `check_buyer` varchar(50) DEFAULT NULL,
  `check_belongs_section` varchar(50) DEFAULT NULL,
  `check_form` varchar(50) DEFAULT NULL,
  `check_checkagain_staff` varchar(50) DEFAULT NULL,
  `check_remark` varchar(50) DEFAULT NULL,
  `check_auditing` varchar(50) DEFAULT NULL,
  `check_yn` varchar(50) DEFAULT '0',
  `check_custom1` varchar(50) DEFAULT NULL,
  `check_custom2` varchar(50) DEFAULT NULL,
  `check_custom3` varchar(50) DEFAULT NULL,
  `check_custom4` varchar(50) DEFAULT NULL,
  `check_custom5` varchar(50) DEFAULT NULL,
  `check_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`check_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `check` */

/*Table structure for table `check_detailed` */

DROP TABLE IF EXISTS `check_detailed`;

CREATE TABLE `check_detailed` (
  `cd_id` varchar(50) NOT NULL,
  `proof_number` varchar(20) DEFAULT NULL,
  `check_id` varchar(20) DEFAULT NULL,
  `cd_name` varchar(32) DEFAULT NULL,
  `cd_format` varchar(50) DEFAULT NULL,
  `cd_include_tax` varchar(50) DEFAULT NULL,
  `cd_volume` int(11) DEFAULT NULL,
  `cd_inventories_number` int(11) DEFAULT NULL,
  `cd_profits_losses_number` int(11) DEFAULT NULL,
  `cd_unit_price` float DEFAULT NULL,
  `cd_loss_amount_profit` float DEFAULT NULL,
  `cd_batch_number` varchar(50) DEFAULT NULL,
  `cd_cause` varchar(50) DEFAULT NULL,
  `cd_auditing` varchar(50) DEFAULT NULL,
  `cd_yn` varchar(50) DEFAULT '0',
  `cd_custom1` varchar(50) DEFAULT NULL,
  `cd_custom2` varchar(50) DEFAULT NULL,
  `cd_custom3` varchar(50) DEFAULT NULL,
  `cd_custom4` varchar(50) DEFAULT NULL,
  `cd_custom5` varchar(50) DEFAULT NULL,
  `cd_custom6` varchar(50) DEFAULT NULL,
  `matter_id` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`cd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `check_detailed` */

/*Table structure for table `collection_term` */

DROP TABLE IF EXISTS `collection_term`;

CREATE TABLE `collection_term` (
  `cote_id` varchar(50) NOT NULL COMMENT '条件id（主键 唯一）',
  `cote_name` varchar(50) DEFAULT NULL COMMENT '条件名称',
  `cote_days` int(11) DEFAULT NULL COMMENT '天数',
  `cote_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `cote_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `cote_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `cote_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `cote_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `cote_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `cote_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `cote_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`cote_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `collection_term` */

/*Table structure for table `currency` */

DROP TABLE IF EXISTS `currency`;

CREATE TABLE `currency` (
  `currency_id` varchar(50) NOT NULL COMMENT '币别id（主键 唯一）',
  `currency_name` varchar(50) DEFAULT NULL COMMENT '币别名称',
  `currency_easyname` varchar(50) DEFAULT NULL COMMENT '币别简称',
  `currency_engname` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `currency_transactionday` date DEFAULT NULL COMMENT '异动日期',
  `currency_standardexchange` float DEFAULT NULL COMMENT '固定汇率',
  `currency_inexchange` float DEFAULT NULL COMMENT '买进汇率',
  `currency_outexchange` float DEFAULT NULL COMMENT '卖出汇率',
  `currency_ifthousand` int(11) DEFAULT NULL COMMENT '千位逗号，每三位数用逗号隔开（0,1表示）',
  `currency_mpointset` int(11) DEFAULT NULL COMMENT '小数点设置，保留小数点后几位（默认值，2）',
  `currency_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `urrency_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `currency_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `currency_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `currency_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `currency_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `currency_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `currency_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`currency_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `currency` */

insert  into `currency`(`currency_id`,`currency_name`,`currency_easyname`,`currency_engname`,`currency_transactionday`,`currency_standardexchange`,`currency_inexchange`,`currency_outexchange`,`currency_ifthousand`,`currency_mpointset`,`currency_Auditing`,`urrency_yn`,`currency_custom1`,`currency_custom2`,`currency_custom3`,`currency_custom4`,`currency_custom5`,`currency_custom6`) values 
('20200202001','人民币','人民币','CNY','2020-02-14',1,1,1,1,1,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),
('20200202002','日元','日元','EUR','2020-02-14',0.0649,0.0649,0.0649,1,3,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),
('20200202003','欧元','欧元','EUR','2020-02-20',7.618,7.618,7.618,1,4,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),
('20200207001','韩元','hy','hy','2020-02-27',7.618,7.618,7.618,1,4,'','1','20200207','','','','',''),
('20200207002','韩元','fds','sdf',NULL,7.618,7.618,7.618,1,6,'','1','20200207','','','','','');

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `customer_id` varchar(50) NOT NULL COMMENT '客户id（主键 唯一）',
  `customer_name` varchar(50) DEFAULT NULL COMMENT '客户全称',
  `customer_easyname` varchar(50) DEFAULT NULL COMMENT '客户简称',
  `customer_english_name` varchar(50) DEFAULT NULL COMMENT '英文全称',
  `customer_charge_person` varchar(50) DEFAULT NULL COMMENT '英文简称',
  `customer_account_ownership` varchar(50) DEFAULT NULL COMMENT '账款归属',
  `customer_type` varchar(50) DEFAULT NULL COMMENT '类别',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别id',
  `customer_principalman` varchar(50) DEFAULT NULL COMMENT '负责人',
  `customer_linkman` varchar(50) DEFAULT NULL COMMENT '联系人',
  `customer_linktela` varchar(50) DEFAULT NULL COMMENT '联系电话一',
  `customer_linktelb` varchar(50) DEFAULT NULL COMMENT '联系电话二',
  `customer_linktelc` varchar(50) DEFAULT NULL COMMENT '联系电话三',
  `customer_mobilephone` varchar(50) DEFAULT NULL COMMENT '移动电话',
  `ada_id` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `customer_taxcheckno` varchar(50) DEFAULT NULL COMMENT '税务登记号',
  `customer_capitalmoney` float DEFAULT NULL COMMENT '资本额',
  `customer_job` varchar(50) DEFAULT NULL COMMENT '行业别',
  `customer_email` varchar(50) DEFAULT NULL COMMENT '电子邮件',
  `customer_webadd` varchar(100) DEFAULT NULL COMMENT '网址',
  `customer_faxno` varchar(50) DEFAULT NULL COMMENT '传真号码',
  `customer_cufirstsaleout` date DEFAULT NULL COMMENT '最初销售出库日',
  `customer_cufirstsalereturn` date DEFAULT NULL COMMENT '最初销售退货日',
  `customer_curecentsaleout` date DEFAULT NULL COMMENT '最近销售出库日',
  `customer_curecentsalereturn` date DEFAULT NULL COMMENT '最近销售退货日',
  `customer_curecentvisit` date DEFAULT NULL COMMENT '最近拜访日',
  `customer_cuordervisit` date DEFAULT NULL COMMENT '预约拜访日',
  `customer_discountpoint` float DEFAULT NULL COMMENT '折数',
  `customer_salelv` varchar(50) DEFAULT NULL COMMENT '售价等级',
  `customer_cuiftax` int(11) DEFAULT NULL COMMENT '是否含税（0，1）',
  `customer_latentcusno` varchar(50) DEFAULT NULL COMMENT '潜在客户编号',
  `customer_tanddate` date DEFAULT NULL COMMENT '客户建立日期',
  `endbusinessday` date DEFAULT NULL COMMENT '终止交易日',
  `customer_creditmoney` float DEFAULT NULL COMMENT '账款额度',
  `customer_residuemonet` float DEFAULT NULL COMMENT '剩余额度',
  `customer_cuendorderday` date DEFAULT NULL COMMENT '每月结账日',
  `customer_honestlv` varchar(5) DEFAULT NULL COMMENT '信用等级',
  `customer_cufirstcollect` float DEFAULT NULL COMMENT '期初预收款',
  `customer_houldcollect` float DEFAULT NULL COMMENT '期初应收款',
  `customer_cuendcollect` float DEFAULT NULL COMMENT '期末预收款',
  `cuendshouldcollect` float DEFAULT NULL COMMENT '期末应收款',
  `customer_cudecoration` varchar(50) DEFAULT NULL COMMENT '其他备注',
  `Receivable_id` varchar(50) DEFAULT NULL COMMENT '收款条件id(关联应收冲款单表)',
  `it_id` varchar(50) DEFAULT NULL COMMENT '发票类型id(关联发票类型表)',
  `It_Accounts_eceivable_subject` varchar(50) DEFAULT NULL COMMENT '应收账款科目(关联会计科目表account_id)',
  `It_deposit_received_subject` varchar(50) DEFAULT NULL COMMENT '预收账款科目id(关联会计科目表account_id)',
  `bank_id` varchar(50) DEFAULT NULL COMMENT '开户银行id(关联cus_bank开户银行表)',
  `customer_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `customer_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `customer_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `customer_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `customer_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `customer_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `customer_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `customer_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

insert  into `customer`(`customer_id`,`customer_name`,`customer_easyname`,`customer_english_name`,`customer_charge_person`,`customer_account_ownership`,`customer_type`,`currency_id`,`customer_principalman`,`customer_linkman`,`customer_linktela`,`customer_linktelb`,`customer_linktelc`,`customer_mobilephone`,`ada_id`,`customer_taxcheckno`,`customer_capitalmoney`,`customer_job`,`customer_email`,`customer_webadd`,`customer_faxno`,`customer_cufirstsaleout`,`customer_cufirstsalereturn`,`customer_curecentsaleout`,`customer_curecentsalereturn`,`customer_curecentvisit`,`customer_cuordervisit`,`customer_discountpoint`,`customer_salelv`,`customer_cuiftax`,`customer_latentcusno`,`customer_tanddate`,`endbusinessday`,`customer_creditmoney`,`customer_residuemonet`,`customer_cuendorderday`,`customer_honestlv`,`customer_cufirstcollect`,`customer_houldcollect`,`customer_cuendcollect`,`cuendshouldcollect`,`customer_cudecoration`,`Receivable_id`,`it_id`,`It_Accounts_eceivable_subject`,`It_deposit_received_subject`,`bank_id`,`customer_Auditing`,`customer_yn`,`customer_custom1`,`customer_custom2`,`customer_custom3`,`customer_custom4`,`customer_custom5`,`customer_custom6`) values 
('1','株洲伟大',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),
('2','株洲伟大2',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `customer_address` */

DROP TABLE IF EXISTS `customer_address`;

CREATE TABLE `customer_address` (
  `ca_addressid` varchar(50) NOT NULL COMMENT '地址id（主键 唯一）',
  `ca_address` varchar(50) DEFAULT NULL COMMENT '地址',
  `ca_postcode` varchar(6) DEFAULT NULL COMMENT '邮编',
  `ca_alinkman` varchar(50) DEFAULT NULL COMMENT '联系人',
  `ca_linkmaneasyname` varchar(50) DEFAULT NULL COMMENT '联系人职称',
  `ca_afaxno` varchar(50) DEFAULT NULL COMMENT '传真号码',
  `ca_way` varchar(50) DEFAULT NULL COMMENT '行走路线',
  `ca_adecoration` varchar(50) DEFAULT NULL COMMENT '备注',
  `customer_id` varchar(50) DEFAULT NULL COMMENT '客户id|潜在客户id',
  `ca_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `ca_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `ca_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `ca_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `ca_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `ca_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `ca_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `ca_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`ca_addressid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer_address` */

/*Table structure for table `customer_demand_products` */

DROP TABLE IF EXISTS `customer_demand_products`;

CREATE TABLE `customer_demand_products` (
  `cdp_id` varchar(50) NOT NULL COMMENT '物料编号（主键 唯一）',
  `pc_id` varchar(50) DEFAULT NULL COMMENT '潜在客户id',
  `cdp_name` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `cdp_size` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `cdp_unit` varchar(50) DEFAULT NULL COMMENT '单位',
  `cdp_num` int(11) DEFAULT NULL COMMENT '需求数量',
  `cdp_Affordable_Price` float DEFAULT NULL COMMENT '可承受价',
  `cdp_Scheduled_quotation` float DEFAULT NULL COMMENT '预定报价',
  `cdp_Counterpart_Offer` float DEFAULT NULL COMMENT '对手报价',
  `cdp_advance_date` date DEFAULT NULL COMMENT '预交日期',
  `cdp_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `cdp_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `cdp_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `cdp_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `cdp_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `cdp_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `cdp_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `cdp_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `cdp_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`cdp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer_demand_products` */

/*Table structure for table `customer_grade` */

DROP TABLE IF EXISTS `customer_grade`;

CREATE TABLE `customer_grade` (
  `cg_id` varchar(50) NOT NULL COMMENT 'id（主键 唯一）',
  `cg_name` varchar(50) DEFAULT NULL COMMENT '等级名称',
  `cg_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `cg_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `cg_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `cg_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `cg_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `cg_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `cg_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `cg_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `cg_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`cg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer_grade` */

/*Table structure for table `customer_type` */

DROP TABLE IF EXISTS `customer_type`;

CREATE TABLE `customer_type` (
  `cuty_id` varchar(50) NOT NULL COMMENT 'id（主键 唯一）',
  `cuty_name` varchar(50) DEFAULT NULL COMMENT '类别名称',
  `cuty_engname` varchar(32) DEFAULT NULL COMMENT '英文名称',
  `cuty_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `cuty_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `cuty_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `cuty_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `cuty_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `cuty_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `cuty_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `cuty_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `cuty_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`cuty_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer_type` */

/*Table structure for table `dull_section` */

DROP TABLE IF EXISTS `dull_section`;

CREATE TABLE `dull_section` (
  `ds_id` varchar(50) NOT NULL,
  `ds_startday` int(11) DEFAULT NULL,
  `ds_enddate` int(11) DEFAULT NULL,
  `ds_decoration` varchar(50) DEFAULT NULL,
  `ds_auditing` varchar(50) DEFAULT NULL,
  `ds_yn` varchar(50) DEFAULT '0',
  `ds_custom1` varchar(50) DEFAULT NULL,
  `ds_custom2` varchar(50) DEFAULT NULL,
  `ds_custom3` varchar(50) DEFAULT NULL,
  `ds_custom4` varchar(50) DEFAULT NULL,
  `ds_custom5` varchar(50) DEFAULT NULL,
  `ds_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ds_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dull_section` */

/*Table structure for table `educational_background` */

DROP TABLE IF EXISTS `educational_background`;

CREATE TABLE `educational_background` (
  `eb_id` varchar(50) NOT NULL COMMENT '学历编号（主键 唯一）',
  `eb_name` varchar(50) DEFAULT NULL COMMENT '学历名称',
  `eb_english_name` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `eb_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `eb_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `eb_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `eb_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `eb_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `eb_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `eb_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `eb_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `eb_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`eb_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `educational_background` */

/*Table structure for table `income_costs_type` */

DROP TABLE IF EXISTS `income_costs_type`;

CREATE TABLE `income_costs_type` (
  `ict_id` varchar(50) NOT NULL COMMENT '编号（主键 唯一）',
  `ict_name` varchar(50) DEFAULT NULL COMMENT '名称',
  `ict_english_name` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `ict_subject` varchar(50) DEFAULT NULL COMMENT '科目',
  `ict_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `ict_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `ict_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `ict_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ict_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ict_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ict_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ict_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ict_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`ict_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `income_costs_type` */

/*Table structure for table `input_storage_type` */

DROP TABLE IF EXISTS `input_storage_type`;

CREATE TABLE `input_storage_type` (
  `ist_id` varchar(50) NOT NULL,
  `ist_name` varchar(50) DEFAULT NULL,
  `ist_engname` varchar(32) DEFAULT NULL,
  `ist_remark` varchar(50) DEFAULT NULL,
  `ist_auditing` varchar(50) DEFAULT NULL,
  `ist_yn` varchar(50) DEFAULT '0',
  `ist_custom1` varchar(50) DEFAULT NULL,
  `ist_custom2` varchar(50) DEFAULT NULL,
  `ist_custom3` varchar(50) DEFAULT NULL,
  `ist_custom4` varchar(50) DEFAULT NULL,
  `ist_custom5` varchar(50) DEFAULT NULL,
  `ist_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ist_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `input_storage_type` */

/*Table structure for table `invoice_type` */

DROP TABLE IF EXISTS `invoice_type`;

CREATE TABLE `invoice_type` (
  `it_id` varchar(50) NOT NULL COMMENT '编号（主键 唯一）',
  `it_name` varchar(50) DEFAULT NULL COMMENT '名称',
  `it_english_name` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `it_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `it_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `it_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `it_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `it_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `it_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `it_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `it_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `it_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`it_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `invoice_type` */

/*Table structure for table `material_type` */

DROP TABLE IF EXISTS `material_type`;

CREATE TABLE `material_type` (
  `mt_id` varchar(50) NOT NULL COMMENT '物料类型id（主键 唯一）',
  `mt_name` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `mt_english_name` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `mt_save_subject` varchar(50) DEFAULT NULL COMMENT '存货科目',
  `mt_subject_a` varchar(50) DEFAULT NULL COMMENT '科目a',
  `mt_subject_b` varchar(50) DEFAULT NULL COMMENT '科目b',
  `mt_subject_c` varchar(50) DEFAULT NULL COMMENT '科目c',
  `mt_salein_subject` varchar(50) DEFAULT NULL COMMENT '销售收入科目',
  `mt_salecost_subject` varchar(50) DEFAULT NULL COMMENT '销售成本科目',
  `mt_otherin_subject` varchar(50) DEFAULT NULL COMMENT '其他收入科目',
  `mt_othercost_subject` varchar(50) DEFAULT NULL COMMENT '其他成本科目',
  `mt_othersell_subject` varchar(50) DEFAULT NULL COMMENT '其他费用科目',
  `mt_othersend_subject` varchar(50) DEFAULT NULL COMMENT '赠品费用科目',
  `mt_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `mt_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `mt_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `mt_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `mt_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `mt_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `mt_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `mt_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `mt_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`mt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `material_type` */

/*Table structure for table `matter` */

DROP TABLE IF EXISTS `matter`;

CREATE TABLE `matter` (
  `matter_id` varchar(50) NOT NULL COMMENT '物料编号（主键 唯一）',
  `matter_name` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `matter_size` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `matter_english_name` varchar(32) DEFAULT NULL COMMENT '英文名称',
  `matter_barno` varchar(50) DEFAULT NULL COMMENT '条形码编号',
  `matter_msale_a` float DEFAULT NULL COMMENT '建议售价a',
  `matter_msale_b` float DEFAULT NULL COMMENT '建议售价b',
  `matter_msale_c` float DEFAULT NULL COMMENT '建议售价c',
  `matter_msale_d` float DEFAULT NULL COMMENT '建议售价d',
  `matter_msale_e` float DEFAULT NULL COMMENT '建议售价e',
  `matter_standard_price` float DEFAULT NULL COMMENT '标准进价',
  `matter_taxno` float DEFAULT NULL COMMENT '税目',
  `matter_iftax` int(11) DEFAULT NULL COMMENT '0,1（状态）表示是否含税',
  `matter_taxpoint` float DEFAULT NULL COMMENT '税率',
  `matter_safestock` int(11) DEFAULT NULL COMMENT '安全存量',
  `matter_lowsafestock` int(11) DEFAULT NULL COMMENT '低于安全存量',
  `matter_daystartcount` int(11) DEFAULT NULL COMMENT '期初总数',
  `matter_nowcount` int(11) DEFAULT NULL COMMENT '现行总数',
  `matter_avgcost` float DEFAULT NULL COMMENT '平均成本',
  `matter_nowavgcost` float DEFAULT NULL COMMENT '现行平均成本',
  `matter_standardcost` float DEFAULT NULL COMMENT '标准成本',
  `matter_standardallcost` float DEFAULT NULL COMMENT '标准总成本',
  `matter_daystartallcost` float DEFAULT NULL COMMENT '期初总成本',
  `matter_nowallcost` float DEFAULT NULL COMMENT '现行总成本',
  `matter_firstin` date DEFAULT NULL COMMENT '最初出库日',
  `matter_recentout` date DEFAULT NULL COMMENT '最近出库日',
  `matter_recentin` date DEFAULT NULL COMMENT '最近入库',
  `matter_firstout` date DEFAULT NULL COMMENT '最初入库日',
  `matter_appearstartday` int(11) DEFAULT NULL COMMENT '呆滞起记天数',
  `matter_stopdate` date DEFAULT NULL COMMENT '停用日期',
  `matter_mdecoration` varchar(100) DEFAULT NULL COMMENT '物料说明',
  `mt_id` varchar(50) DEFAULT NULL COMMENT '物料类型id，关联material_type物料类型表',
  `mu_id` varchar(50) DEFAULT NULL COMMENT '计量单位id，关联munit 计量单位表',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别id，关联currency币别表',
  `matter_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `matter_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `matter_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `matter_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `matter_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `matter_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `matter_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `matter_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`matter_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `matter` */

/*Table structure for table `measurement_unit` */

DROP TABLE IF EXISTS `measurement_unit`;

CREATE TABLE `measurement_unit` (
  `mu_id` varchar(50) NOT NULL COMMENT '计量单位id（主键 唯一）',
  `mu_name` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `mu_englist_name` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `mu_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `mu_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `mu_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `mu_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `mu_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `mu_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `mu_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `mu_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `mu_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`mu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `measurement_unit` */

/*Table structure for table `moneybelong` */

DROP TABLE IF EXISTS `moneybelong`;

CREATE TABLE `moneybelong` (
  `moneybelong_id` varchar(50) NOT NULL COMMENT '账款归属id（主键 唯一）',
  `moneybelong_name` varchar(50) DEFAULT NULL COMMENT '账款归属',
  `moneybelong_type` varchar(50) DEFAULT NULL COMMENT '类别',
  `moneybelong_remarks` varchar(50) DEFAULT NULL COMMENT '备注',
  `moneybelong_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `moneybelong_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `moneybelong_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `moneybelong_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `moneybelong_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `moneybelong_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `moneybelong_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `moneybelong_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`moneybelong_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `moneybelong` */

/*Table structure for table `negotiation_stage` */

DROP TABLE IF EXISTS `negotiation_stage`;

CREATE TABLE `negotiation_stage` (
  `ns_id` varchar(50) NOT NULL COMMENT 'id',
  `ns_name` varchar(50) DEFAULT NULL COMMENT '名称',
  `ns_engname` float DEFAULT NULL COMMENT '成功几率',
  `ns_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `ns_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `ns_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `ns_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `ns_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `ns_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `ns_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `ns_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `ns_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`ns_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `negotiation_stage` */

/*Table structure for table `other_input_storage` */

DROP TABLE IF EXISTS `other_input_storage`;

CREATE TABLE `other_input_storage` (
  `ois_id` varchar(20) NOT NULL,
  `ist_id` varchar(50) DEFAULT NULL,
  `warehouse_id` varchar(50) DEFAULT NULL,
  `ois_documentation_date` varchar(32) DEFAULT NULL,
  `ois_documentation_no` datetime DEFAULT NULL,
  `ois_certificate_number` char(1) DEFAULT NULL,
  `ois_warehousing_personnel` varchar(50) DEFAULT NULL,
  `ois_belongs_section` varchar(50) DEFAULT NULL,
  `ois_form` varchar(50) DEFAULT NULL,
  `ois_review_staff` varchar(50) DEFAULT NULL,
  `ois_remark` varchar(50) DEFAULT NULL,
  `ois_auditing` varchar(50) DEFAULT NULL,
  `ois_yn` varchar(50) DEFAULT '0',
  `ois_custom1` varchar(50) DEFAULT NULL,
  `ois_custom2` varchar(50) DEFAULT NULL,
  `ois_custom3` varchar(50) DEFAULT NULL,
  `ois_custom4` varchar(50) DEFAULT NULL,
  `ois_custom5` varchar(50) DEFAULT NULL,
  `ois_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ois_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `other_input_storage` */

/*Table structure for table `other_input_storage_detailed` */

DROP TABLE IF EXISTS `other_input_storage_detailed`;

CREATE TABLE `other_input_storage_detailed` (
  `oisd_id` varchar(50) NOT NULL,
  `ois_id` varchar(50) DEFAULT NULL,
  `matter_id` varchar(50) DEFAULT NULL,
  `oisd_engname` varchar(50) DEFAULT NULL,
  `oisd_remark` varchar(50) DEFAULT NULL,
  `oisd_price_include_tax` varchar(50) DEFAULT NULL,
  `oisd_single_status` int(11) DEFAULT NULL,
  `oisd_price` float DEFAULT NULL,
  `oisd_money` float DEFAULT NULL,
  `oisd_remarks` varchar(300) DEFAULT NULL,
  `oisd_source_order` varchar(50) DEFAULT NULL,
  `oisd_source_no` varchar(50) DEFAULT NULL,
  `oisd_auditing` varchar(50) DEFAULT NULL,
  `oisd_yn` varchar(50) DEFAULT '0',
  `oisd_custom1` varchar(50) DEFAULT NULL,
  `oisd_custom2` varchar(50) DEFAULT NULL,
  `oisd_custom3` varchar(50) DEFAULT NULL,
  `oisd_custom4` varchar(50) DEFAULT NULL,
  `oisd_custom5` varchar(50) DEFAULT NULL,
  `oisd_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`oisd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `other_input_storage_detailed` */

/*Table structure for table `other_out_storage` */

DROP TABLE IF EXISTS `other_out_storage`;

CREATE TABLE `other_out_storage` (
  `oos_id` varchar(50) NOT NULL,
  `ist_id` int(11) DEFAULT NULL,
  `warehouse_id` varchar(50) DEFAULT NULL,
  `oos_documentation_date` varchar(32) DEFAULT NULL,
  `oos_documentation_no` datetime DEFAULT NULL,
  `oos_certificate_number` char(1) DEFAULT NULL,
  `oos_warehousing_personnel` varchar(50) DEFAULT NULL,
  `oos_belongs_section` varchar(50) DEFAULT NULL,
  `oos_form` varchar(50) DEFAULT NULL,
  `oos_review_staff` varchar(50) DEFAULT NULL,
  `oos_remark` varchar(50) DEFAULT NULL,
  `oos_auditing` varchar(50) DEFAULT NULL,
  `oos_yn` varchar(50) DEFAULT '0',
  `oos_custom1` varchar(50) DEFAULT NULL,
  `oos_custom2` varchar(50) DEFAULT NULL,
  `oos_custom3` varchar(50) DEFAULT NULL,
  `oos_custom4` varchar(50) DEFAULT NULL,
  `oos_custom5` varchar(50) DEFAULT NULL,
  `oos_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`oos_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `other_out_storage` */

/*Table structure for table `other_out_storage_detailed` */

DROP TABLE IF EXISTS `other_out_storage_detailed`;

CREATE TABLE `other_out_storage_detailed` (
  `oosd_id` varchar(50) NOT NULL,
  `oos_id` varchar(20) DEFAULT NULL,
  `matter_id` varchar(50) DEFAULT NULL,
  `oosd_engname` varchar(32) DEFAULT NULL,
  `oosd_remark` varchar(50) DEFAULT NULL,
  `oosd_price_include_tax` varchar(50) DEFAULT NULL,
  `oosd_single_status` int(11) DEFAULT NULL,
  `oosd_price` float DEFAULT NULL,
  `oosd_money` float DEFAULT NULL,
  `oosd_remarks` varchar(300) DEFAULT NULL,
  `oosd_source_order` varchar(50) DEFAULT NULL,
  `oosd_source_no` varchar(50) DEFAULT NULL,
  `oosd_auditing` varchar(50) DEFAULT NULL,
  `oosd_yn` varchar(50) DEFAULT '0',
  `oosd_custom1` varchar(50) DEFAULT NULL,
  `oosd_custom2` varchar(50) DEFAULT NULL,
  `oosd_custom3` varchar(50) DEFAULT NULL,
  `oosd_custom4` varchar(50) DEFAULT NULL,
  `oosd_custom5` varchar(50) DEFAULT NULL,
  `oosd_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`oosd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `other_out_storage_detailed` */

/*Table structure for table `out_storage_type` */

DROP TABLE IF EXISTS `out_storage_type`;

CREATE TABLE `out_storage_type` (
  `ost_id` varchar(50) NOT NULL,
  `ost_name` varchar(50) DEFAULT NULL,
  `ost_engname` varchar(50) DEFAULT NULL,
  `ost_remark` varchar(50) DEFAULT NULL,
  `ost_auditing` varchar(50) DEFAULT NULL,
  `ost_yn` varchar(50) DEFAULT '0',
  `ost_custom1` varchar(50) DEFAULT NULL,
  `ost_custom2` varchar(50) DEFAULT NULL,
  `ost_custom3` varchar(50) DEFAULT NULL,
  `ost_custom4` varchar(50) DEFAULT NULL,
  `ost_custom5` varchar(50) DEFAULT NULL,
  `ost_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ost_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `out_storage_type` */

/*Table structure for table `payables` */

DROP TABLE IF EXISTS `payables`;

CREATE TABLE `payables` (
  `payables_id` varchar(50) NOT NULL COMMENT '应付冲款单id（主键 唯一）',
  `supplier_id` varchar(50) DEFAULT NULL COMMENT '供应商表id，外键',
  `scs_id` int(11) DEFAULT NULL COMMENT '结算方式id，外键',
  `staff_id` varchar(50) DEFAULT NULL COMMENT '部门员工表id，外键',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别类型表id，外键',
  `project_id` varchar(50) DEFAULT NULL COMMENT '项目表id，外键',
  `payables_supplier_name` varchar(20) DEFAULT NULL COMMENT '供应商表',
  `payables_sat_name1` varchar(500) DEFAULT NULL COMMENT '结算方式表默认值：转账',
  `payables_Price1` float DEFAULT NULL COMMENT '默认值：0.00',
  `payables_sat_name2` varchar(500) DEFAULT NULL COMMENT '结算方式表默认值：汇票',
  `payables_Price2` float DEFAULT NULL COMMENT '默认值：0.00',
  `payables_sat_name3` varchar(500) DEFAULT NULL COMMENT '结算方式表',
  `payables_Price3` float DEFAULT NULL COMMENT '默认值：0.00',
  `payables_zhekou` int(4) DEFAULT NULL COMMENT '折扣率默认值：0.00',
  `payables_endtime` date DEFAULT NULL COMMENT '终止账月默认值：当前年月',
  `payables_payablestime` datetime DEFAULT NULL COMMENT '单据日期默认值：当前日期',
  `payables_currency_name` varchar(20) DEFAULT NULL COMMENT '币别类型表快照',
  `payables_currency_inexchange` varchar(20) DEFAULT NULL COMMENT '币别类型表快照',
  `payables_type` varchar(20) DEFAULT NULL COMMENT '应付冲款类型默认值：付款冲款',
  `payables_voucherNo` varchar(20) DEFAULT NULL COMMENT '凭证编号',
  `payables_team_name` varchar(20) DEFAULT NULL COMMENT '部门表',
  `payables_project_name` varchar(20) DEFAULT NULL COMMENT '项目表',
  `payables_billpersonnel` varchar(20) DEFAULT NULL COMMENT '制单人员默认值：当前人员',
  `payables_reviewers` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `payables_remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  `payables_auditstatus` int(4) DEFAULT NULL COMMENT '审核状态0:未审核1:已结案',
  `payables_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `payables_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `payables_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `payables_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `payables_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `payables_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `payables_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `payables_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  `payables_custom7` varchar(50) DEFAULT NULL COMMENT '自定栏七',
  `payables_custom8` varchar(50) DEFAULT NULL COMMENT '自定栏九',
  `payables_custom10` varchar(50) DEFAULT NULL COMMENT '自定栏十',
  PRIMARY KEY (`payables_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `payables` */

insert  into `payables`(`payables_id`,`supplier_id`,`scs_id`,`staff_id`,`currency_id`,`project_id`,`payables_supplier_name`,`payables_sat_name1`,`payables_Price1`,`payables_sat_name2`,`payables_Price2`,`payables_sat_name3`,`payables_Price3`,`payables_zhekou`,`payables_endtime`,`payables_payablestime`,`payables_currency_name`,`payables_currency_inexchange`,`payables_type`,`payables_voucherNo`,`payables_team_name`,`payables_project_name`,`payables_billpersonnel`,`payables_reviewers`,`payables_remarks`,`payables_auditstatus`,`payables_Auditing`,`payables_yn`,`payables_custom1`,`payables_custom2`,`payables_custom3`,`payables_custom4`,`payables_custom5`,`payables_custom6`,`payables_custom7`,`payables_custom8`,`payables_custom10`) values 
('20200216001','1',1,'1','1','1','1','1',123,'2',321,'3',222,13,'2020-02-10','2020-02-21 11:30:56','123','qwe','付款冲款','qwe123123','qwe','qwe','qwe','qwe','qwe',0,'123123','0','20200216','p20200216001','132','124',NULL,NULL,NULL,NULL,NULL),
('20200216002','2',2,'2','2','2','2','1',123,'2',321,'3',222,15,'2020-02-10','2020-02-16 13:25:36','123','qq','付款冲款','qq123123','qq','qq','qq','qq','qq',0,'123123','0','20200216','p20200216002','4353','123123',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `payables_detail` */

DROP TABLE IF EXISTS `payables_detail`;

CREATE TABLE `payables_detail` (
  `paydetail_id` varchar(50) NOT NULL COMMENT '应付冲款单明细表ID,主键行号',
  `Payables_id` varchar(20) DEFAULT NULL COMMENT '应付冲款单主表ID, 外键',
  `supplier_id` varchar(50) DEFAULT NULL COMMENT '供应商表id，外键',
  `staff_id` varchar(50) DEFAULT NULL COMMENT '部门员工表id，外键',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别类型表id，外键',
  `project_id` varchar(50) DEFAULT NULL COMMENT '项目表id，外键',
  `pade_sourcelist` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `pade_sourcetime` date DEFAULT NULL COMMENT '来源日期',
  `pade_sourcenumber` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `pade_invoiceno` varchar(20) DEFAULT NULL COMMENT '发票号码',
  `pade_transaction` varchar(20) DEFAULT NULL COMMENT '交易对象供应商编号',
  `pade_transactionname` varchar(20) DEFAULT NULL COMMENT '交易对象名称',
  `pade_team_name` varchar(20) DEFAULT NULL COMMENT '部门名称',
  `pade_staff_name` varchar(20) DEFAULT NULL COMMENT '员工名称',
  `pade_project_name` varchar(20) DEFAULT NULL COMMENT '项目表',
  `pade_currency_name` varchar(20) DEFAULT NULL COMMENT '币别类型表',
  `pade_currency_inexchange` int(4) DEFAULT NULL COMMENT '币别类型表',
  `pade_price` float DEFAULT NULL COMMENT '采购入库，采购退货',
  `pade_Currentbalance` float DEFAULT NULL COMMENT '采购入库，采购退货现行余额',
  `pade_Discountamount` float DEFAULT NULL COMMENT '采购入库，采购退货折让金额',
  `pade_Amountcharged` float DEFAULT NULL COMMENT '采购入库，采购退货冲款金额',
  `pade_Offsetamount` float DEFAULT NULL COMMENT '采购入库，采购退货冲抵金额',
  `pade_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `pade_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `pade_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `pade_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `pade_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `pade_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `pade_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `pade_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  `pade_custom7` varchar(50) DEFAULT NULL COMMENT '自定栏七',
  `pade_custom8` varchar(50) DEFAULT NULL COMMENT '自定栏八',
  `pade_custom9` varchar(50) DEFAULT NULL COMMENT '自定栏九',
  `pade_custom10` varchar(50) DEFAULT NULL COMMENT '自定栏十',
  PRIMARY KEY (`paydetail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `payables_detail` */

/*Table structure for table `payablesmain` */

DROP TABLE IF EXISTS `payablesmain`;

CREATE TABLE `payablesmain` (
  `payablesmain_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `Payables_id` varchar(20) DEFAULT NULL COMMENT '应付冲款单主表ID, 外键',
  `supplier_id` varchar(50) DEFAULT NULL COMMENT '供应商编号',
  `staff_id` varchar(50) DEFAULT NULL COMMENT '部门员工编号',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别类型表id',
  `project_id` varchar(50) DEFAULT NULL COMMENT '项目表id',
  `pade_sourcelist` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `pade_sourcetime` date DEFAULT NULL COMMENT '来源日期',
  `pade_sourcenumber` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `pade_invoiceno` varchar(20) DEFAULT NULL COMMENT '发票号码',
  `pade_transaction` varchar(20) DEFAULT NULL COMMENT '交易对象',
  `pade_transactionname` varchar(20) DEFAULT NULL COMMENT '交易对象名称',
  `pade_team_name` varchar(20) DEFAULT NULL COMMENT '部门名称',
  `pade_staff_name` varchar(20) DEFAULT NULL COMMENT '员工名称',
  `pade_project_name` varchar(20) DEFAULT NULL COMMENT '项目表',
  `pade_currency_name` varchar(20) DEFAULT NULL COMMENT '币别类型表',
  `pade_currency_inexchange` int(11) DEFAULT NULL COMMENT '币别类型表',
  `pade_price` float DEFAULT NULL COMMENT '采购入库,采购退货',
  `pade_currentbalance` float DEFAULT NULL COMMENT '采购入库,采购退货',
  `pade_discountamount` float DEFAULT NULL COMMENT '采购入库,采购退货',
  `pade_amountcahrged` float DEFAULT NULL COMMENT '采购入库,采购退货',
  `pade_offsetamount` float DEFAULT NULL COMMENT '采购入库,采购退货',
  `pade_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `pade_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `pade_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `pade_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `pade_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `pade_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `pade_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `pade_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`payablesmain_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='应付款主表';

/*Data for the table `payablesmain` */

/*Table structure for table `potential_customer` */

DROP TABLE IF EXISTS `potential_customer`;

CREATE TABLE `potential_customer` (
  `pc_id` varchar(50) NOT NULL COMMENT '客户id（主键 唯一）',
  `pc_name` varchar(50) DEFAULT NULL COMMENT '客户全称',
  `pc_easyname` varchar(50) DEFAULT NULL COMMENT '客户简称',
  `pc_english_name` varchar(50) DEFAULT NULL COMMENT '英文全称',
  `pc_charge_person` varchar(50) DEFAULT NULL COMMENT '英文简称',
  `pc_type` varchar(50) DEFAULT NULL COMMENT '类别',
  `pc_area` varchar(50) DEFAULT NULL COMMENT '地区',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别id',
  `cg_id` varchar(50) DEFAULT NULL COMMENT '客户等级id',
  `ns_id` varchar(50) DEFAULT NULL COMMENT '洽谈阶段id',
  `Pc_probability_success` float DEFAULT NULL COMMENT '成功几率（%）',
  `Pc_decision maker` varchar(50) DEFAULT NULL COMMENT '决策者',
  `Pc_negotiation_date` date DEFAULT NULL COMMENT '洽谈日期',
  `Pc_Appointment_visit_date` date DEFAULT NULL COMMENT '预约拜访日',
  `Pc_Recent_visit_date` date DEFAULT NULL COMMENT '最近拜访日',
  `Pc_Estimated_turnover` float DEFAULT NULL COMMENT '预估成交额',
  `Pc_Customer_Profile` varchar(900) DEFAULT NULL COMMENT '客户简介',
  `pc_principalman` varchar(50) DEFAULT NULL COMMENT '负责人',
  `pc_linkman` varchar(50) DEFAULT NULL COMMENT '联系人',
  `pc_linktela` varchar(50) DEFAULT NULL COMMENT '联系电话一',
  `pc_linktelb` varchar(50) DEFAULT NULL COMMENT '联系电话二',
  `pc_linktelc` varchar(50) DEFAULT NULL COMMENT '联系电话三',
  `pc_mobilephone` varchar(50) DEFAULT NULL COMMENT '移动电话',
  `ada_id` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `bank_id` varchar(50) DEFAULT NULL COMMENT '开户银行id',
  `Pc_servicer` varchar(50) DEFAULT NULL COMMENT '业务人员（外键）',
  `pc_taxcheckno` varchar(50) DEFAULT NULL COMMENT '税务登记号',
  `pc_capitalmoney` float DEFAULT NULL COMMENT '资本额',
  `pc_job` varchar(50) DEFAULT NULL COMMENT '行业别',
  `pc_email` varchar(50) DEFAULT NULL COMMENT '电子邮件',
  `pc_webadd` varchar(100) DEFAULT NULL COMMENT '网址',
  `pc_faxno` varchar(50) DEFAULT NULL COMMENT '传真号码',
  `Pc_Expiry_date` date DEFAULT NULL COMMENT '失效日期',
  `pc_salelv` varchar(50) DEFAULT NULL COMMENT '售价等级',
  `Receivable_id` varchar(50) DEFAULT NULL COMMENT '收款条件id(关联应收冲款单表)',
  `pc_cuendorderday` date DEFAULT NULL COMMENT '每月结账日',
  `It_Accounts_eceivable_subject` varchar(50) DEFAULT NULL COMMENT '应收账款科目(关联会计科目表account_id)',
  `pc_discountpoint` float DEFAULT NULL COMMENT '折数',
  `pc_honestlv` varchar(5) DEFAULT NULL COMMENT '信用等级',
  `pc_cuiftax` int(11) DEFAULT NULL COMMENT '是否含税（0，1）',
  `It_deposit_received_subject` varchar(50) DEFAULT NULL COMMENT '预收账款科目id(关联会计科目表account_id)',
  `pc_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `pc_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `pc_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `pc_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `pc_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `pc_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `pc_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `pc_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `pc_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`pc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `potential_customer` */

/*Table structure for table `priabill` */

DROP TABLE IF EXISTS `priabill`;

CREATE TABLE `priabill` (
  `priabill_id` varchar(50) NOT NULL COMMENT '预付款单主表ID，主键',
  `supplier_id` varchar(50) DEFAULT NULL COMMENT '供应商表id，外键',
  `scs_id` int(11) DEFAULT NULL COMMENT '结算方式id，外键',
  `staff_id` varchar(50) DEFAULT NULL COMMENT '部门员工表id，外键',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别类型表id，外键',
  `project_id` varchar(50) DEFAULT NULL COMMENT '项目表id，外键',
  `priabill_supplier_name` varchar(20) DEFAULT NULL COMMENT '供应商名称',
  `priabill_sat_name1` int(4) DEFAULT NULL COMMENT '结算方式表默认值：转账',
  `priabill_Price1` float DEFAULT NULL COMMENT '默认值：0.00',
  `priabill_sat_name2` int(4) DEFAULT NULL COMMENT '结算方式表默认值：汇票',
  `priabill_Price2` float DEFAULT NULL COMMENT '默认值：0.00',
  `priabill_sat_name3` int(4) DEFAULT NULL COMMENT '结算方式表',
  `priabill_Price3` float DEFAULT NULL COMMENT '默认值：0.00',
  `priabill_zhekou` int(4) DEFAULT NULL COMMENT '折扣率默认值：0.00',
  `priabill_endtime` date DEFAULT NULL COMMENT '终止账月默认值：当前年月',
  `priabill_payablestime` datetime DEFAULT NULL COMMENT '单据日期默认值：当前日期',
  `priabill_currency_name` varchar(20) DEFAULT NULL COMMENT '币别类型表快照',
  `priabill_currency_inexchange` varchar(20) DEFAULT NULL COMMENT '币别类型表快照',
  `priabill_type` varchar(20) DEFAULT NULL COMMENT '应付冲款类型默认值：付款冲款',
  `priabill_voucherNo` varchar(20) DEFAULT NULL COMMENT '凭证编号',
  `priabill_team_name` varchar(20) DEFAULT NULL COMMENT '部门表',
  `priabill_project_name` varchar(20) DEFAULT NULL COMMENT '项目表',
  `priabill_billpersonnel` varchar(20) DEFAULT NULL COMMENT '制单人员默认值：当前人员',
  `priabill_reviewers` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `priabill_remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  `priabill_auditstatus` int(4) DEFAULT NULL COMMENT '审核状态0:未审核1:已结案',
  `priabill_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `priabill_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `tpriabill_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `priabill_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `priabill_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `priabill_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `priabill_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `priabill_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  `priabill_custom7` varchar(50) DEFAULT NULL COMMENT '自定栏七',
  `priabill_custom8` varchar(50) DEFAULT NULL COMMENT '自定栏八',
  `priabill_custom9` varchar(50) DEFAULT NULL COMMENT '自定栏九',
  `priabill_custom10` varchar(50) DEFAULT NULL COMMENT '自定栏十',
  PRIMARY KEY (`priabill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `priabill` */

insert  into `priabill`(`priabill_id`,`supplier_id`,`scs_id`,`staff_id`,`currency_id`,`project_id`,`priabill_supplier_name`,`priabill_sat_name1`,`priabill_Price1`,`priabill_sat_name2`,`priabill_Price2`,`priabill_sat_name3`,`priabill_Price3`,`priabill_zhekou`,`priabill_endtime`,`priabill_payablestime`,`priabill_currency_name`,`priabill_currency_inexchange`,`priabill_type`,`priabill_voucherNo`,`priabill_team_name`,`priabill_project_name`,`priabill_billpersonnel`,`priabill_reviewers`,`priabill_remarks`,`priabill_auditstatus`,`priabill_Auditing`,`priabill_yn`,`tpriabill_custom1`,`priabill_custom2`,`priabill_custom3`,`priabill_custom4`,`priabill_custom5`,`priabill_custom6`,`priabill_custom7`,`priabill_custom8`,`priabill_custom9`,`priabill_custom10`) values 
('20200216001','1',1,'1','1','1','数码123',1,111,2,222,3,333,12,'2020-02-20','2020-02-16 22:39:42','人民币','1','预付款','123456789','财务部','大项目','当前人员',NULL,'数码数码',0,NULL,'0','20200216','y20200216001','哈哈','呵呵',NULL,NULL,NULL,NULL,NULL,NULL),
('20200216002','1',2,'2','2','2','数码123',1,111,2,222,3,333,13,'2020-02-20','2020-02-16 00:00:00','美元','2','预付款','123123','生产部','小项目','当前人员',NULL,'电器电器',0,'0','0','20200216','y20200216002','嘿嘿','哈哈',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `priadetails` */

DROP TABLE IF EXISTS `priadetails`;

CREATE TABLE `priadetails` (
  `Priadetails_id` varchar(50) NOT NULL COMMENT '预付款单明细表ID, 主键行号',
  `Priabill_id` varchar(20) DEFAULT NULL COMMENT '预付款单主表ID,   外键',
  `Priabill_price` float DEFAULT NULL COMMENT '预付金额',
  `Priabill_type` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `Priabill_number` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `Priabill_remarks` varchar(100) DEFAULT NULL COMMENT '摘要',
  `Priabill_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `Priabill_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `Priabill_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `Priabill_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `Priabill_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `Priabill_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `Priabill_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `Priabill_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  `Priabill_custom7` varchar(50) DEFAULT NULL COMMENT '自定栏七',
  `Priabill_custom8` varchar(50) DEFAULT NULL COMMENT '自定栏八',
  `Priabill_custom9` varchar(50) DEFAULT NULL COMMENT '自定栏九',
  `Priabill_custom10` varchar(50) DEFAULT NULL COMMENT '自定栏十',
  PRIMARY KEY (`Priadetails_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `priadetails` */

insert  into `priadetails`(`Priadetails_id`,`Priabill_id`,`Priabill_price`,`Priabill_type`,`Priabill_number`,`Priabill_remarks`,`Priabill_Auditing`,`Priabill_yn`,`Priabill_custom1`,`Priabill_custom2`,`Priabill_custom3`,`Priabill_custom4`,`Priabill_custom5`,`Priabill_custom6`,`Priabill_custom7`,`Priabill_custom8`,`Priabill_custom9`,`Priabill_custom10`) values 
('1','1',1,'采购订单','1','1','1','0','1','123',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `project` */

DROP TABLE IF EXISTS `project`;

CREATE TABLE `project` (
  `project_id` varchar(50) NOT NULL COMMENT '项目编号（主键 唯一）',
  `project_name` varchar(32) DEFAULT NULL COMMENT '项目名称',
  `project_english_name` varchar(32) DEFAULT NULL COMMENT '项目英文名称',
  `project_abate` date DEFAULT NULL COMMENT '失效日期',
  `project_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `project_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `project_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `project_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `project_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `project_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `project_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `project_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `project_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `project` */

insert  into `project`(`project_id`,`project_name`,`project_english_name`,`project_abate`,`project_remark`,`project_Auditing`,`project_yn`,`project_custom1`,`project_custom2`,`project_custom3`,`project_custom4`,`project_custom5`,`project_custom6`) values 
('20200202001','日进斗金','rjdj','2020-04-25','fsf',NULL,'0','20200202',NULL,NULL,NULL,NULL,NULL),
('20200202002','日进斗金2','rjdj2','2020-04-18','fasf',NULL,'0','20200202',NULL,NULL,NULL,NULL,NULL),
('20200202003','日进斗金3','rjdj3','2020-04-15','fsdafsadf',NULL,'0','20200202',NULL,NULL,NULL,NULL,NULL),
('20200203001','dfasdf','fdasfasf','2020-02-13','fdsafsa','','1','20200203','','','','',NULL),
('20200204001','个人分','fas','2020-02-20','fsdafasf','','0','20200204','','','','',NULL);

/*Table structure for table `purchase_discount` */

DROP TABLE IF EXISTS `purchase_discount`;

CREATE TABLE `purchase_discount` (
  `pd_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `supplier_id` varchar(50) DEFAULT NULL COMMENT '供应商编号',
  `pd_attribution_of_account` varchar(50) DEFAULT NULL COMMENT '账款归属',
  `pd_accounts_month` date DEFAULT NULL COMMENT '账款月份',
  `pd_supplier_address` varchar(32) DEFAULT NULL COMMENT '供应商地址',
  `ps_id` varchar(50) DEFAULT NULL COMMENT '采购入库单号',
  `warehouse_id` varchar(50) DEFAULT NULL COMMENT '仓库id',
  `pd_document_date` date DEFAULT NULL COMMENT '单据日期',
  `pd_document_number` varchar(50) DEFAULT NULL COMMENT '单据号码',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别id',
  `pd_exchange_rate` float DEFAULT NULL COMMENT '汇率',
  `pd_single_status` varchar(50) DEFAULT NULL COMMENT '凭证编号',
  `pd_sunnum` int(11) DEFAULT NULL COMMENT '总数量',
  `pd_sunmoney` float DEFAULT NULL COMMENT '总金额',
  `pd_tax` float DEFAULT NULL COMMENT '总税额',
  `pd_include_tax_amount` float DEFAULT NULL COMMENT '含税总金额',
  `pd_delivery_address` varchar(50) DEFAULT NULL COMMENT '送货地址',
  `pd_buyer` varchar(50) DEFAULT NULL COMMENT '采购人员',
  `pd_belongs_section` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `pd_belongs_project` varchar(50) DEFAULT NULL COMMENT '所属项目',
  `pd_executor` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `pd_checkagain_staff` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `pd_header_provision` varchar(50) DEFAULT NULL COMMENT '表头条文',
  `pd_end_clause` varchar(50) DEFAULT NULL COMMENT '表尾条文',
  `pd_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `pd_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `pd_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `pd_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `pd_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `pd_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `pd_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `pd_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `pd_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`pd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购折让确认主表';

/*Data for the table `purchase_discount` */

/*Table structure for table `purchase_discount_detailed` */

DROP TABLE IF EXISTS `purchase_discount_detailed`;

CREATE TABLE `purchase_discount_detailed` (
  `pdd_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `pd_id` varchar(50) DEFAULT NULL COMMENT '采购订单主表id not null',
  `pdd_matter_id` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `pdd_matter_name` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `pdd_specifications` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `pdd_company_name` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `pdd_amount` int(11) DEFAULT NULL COMMENT '数量',
  `pdd_price` float DEFAULT NULL COMMENT '单价',
  `pdd_money` float DEFAULT NULL COMMENT '金额',
  `pdd_tax_rate` float DEFAULT NULL COMMENT '税率',
  `pdd_tax_amount` float DEFAULT NULL COMMENT '税额',
  `pdd_discount_amount` float DEFAULT NULL COMMENT '折让金额',
  `pdd_discount_tax` varchar(50) DEFAULT NULL COMMENT '折让税额',
  `pdd_total_discount` int(11) DEFAULT NULL COMMENT '折让总额',
  `pdd_deferred_balance` varchar(50) DEFAULT NULL COMMENT '折后余额',
  `psd_invoice_details` varchar(50) DEFAULT NULL COMMENT '发票明细',
  `pdd_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `pdd_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `pdd_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `pdd_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `pdd_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `pdd_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `pdd_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `pdd_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`pdd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购折让确认详表';

/*Data for the table `purchase_discount_detailed` */

/*Table structure for table `purchase_inquiry` */

DROP TABLE IF EXISTS `purchase_inquiry`;

CREATE TABLE `purchase_inquiry` (
  `pi_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `supplier_id` varchar(50) DEFAULT NULL COMMENT '供应商编号',
  `pi_supplier_address` varchar(32) DEFAULT NULL COMMENT '供应商地址',
  `pit_id` varchar(50) DEFAULT NULL COMMENT '采购订单类型id',
  `pi_price_include_tax` varchar(50) DEFAULT NULL COMMENT '单价是否含税',
  `pi_single_status` varchar(50) DEFAULT NULL COMMENT '单况',
  `pi_document_date` date DEFAULT NULL COMMENT '单据日期',
  `pi_document_number` varchar(50) DEFAULT NULL COMMENT '单据号码',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别id',
  `pi_exchange_rate` float DEFAULT NULL COMMENT '汇率',
  `pi_sunnum` int(11) DEFAULT NULL COMMENT '总数量',
  `pi_sunmoney` float DEFAULT NULL COMMENT '总金额',
  `pi_tax` float DEFAULT NULL COMMENT '总税额',
  `pi_include_tax_amount` float DEFAULT NULL COMMENT '含税总金额',
  `pi_delivery_address` varchar(50) DEFAULT NULL COMMENT '送货地址',
  `pi_buyer` varchar(50) DEFAULT NULL COMMENT '采购人员',
  `pi_belongs_section` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `pi_belongs_project` varchar(50) DEFAULT NULL COMMENT '所属项目',
  `pi_executor` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `pi_checkagain_staff` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `pi_header_provision` varchar(50) DEFAULT NULL COMMENT '表头条文',
  `pi_end_clause` varchar(50) DEFAULT NULL COMMENT '表尾条文',
  `pi_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `pi_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `pi_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `pi_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `pi_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `pi_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `pi_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `pi_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `pi_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`pi_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购询价主表';

/*Data for the table `purchase_inquiry` */

/*Table structure for table `purchase_inquiry_detailed` */

DROP TABLE IF EXISTS `purchase_inquiry_detailed`;

CREATE TABLE `purchase_inquiry_detailed` (
  `did_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `pi_id` varchar(50) DEFAULT NULL COMMENT '采购询价主表id not null',
  `did_matter_id` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `did_matter_name` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `did_specifications` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `did_company_name` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `did_amount` int(11) DEFAULT NULL COMMENT '数量',
  `did_money_discount_before` float DEFAULT NULL COMMENT '折扣前单价',
  `did_discount_number` varchar(50) DEFAULT NULL COMMENT '折数',
  `did_price` float DEFAULT NULL COMMENT '单价',
  `did_money` float DEFAULT NULL COMMENT '金额',
  `did_tax_rate` float DEFAULT NULL COMMENT '税率',
  `did_tax_amount` float DEFAULT NULL COMMENT '税额',
  `did_include_tax_amount` float DEFAULT NULL COMMENT '含税金额',
  `did_ifgift` varchar(50) DEFAULT NULL COMMENT '是否是赠品 (0 否 1 是)',
  `did_remarks` varchar(300) DEFAULT NULL COMMENT '分录备注',
  `did_source_order` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `did_source_no` varchar(50) DEFAULT NULL COMMENT '来源单号',
  `did_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `did_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `did_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `did_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `did_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `did_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `did_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `did_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`did_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购询价详表';

/*Data for the table `purchase_inquiry_detailed` */

/*Table structure for table `purchase_payables` */

DROP TABLE IF EXISTS `purchase_payables`;

CREATE TABLE `purchase_payables` (
  `pp_id` int(11) NOT NULL AUTO_INCREMENT,
  `pp_type` varchar(100) DEFAULT NULL COMMENT '单别',
  `pp_number` varchar(100) DEFAULT NULL COMMENT '原单单号',
  `pp_date` datetime DEFAULT NULL COMMENT '原单日期',
  `pp_pc_id` varchar(100) DEFAULT NULL COMMENT '交易对象',
  `pp_pc_name` varchar(100) DEFAULT NULL COMMENT '交易对象名称',
  `pp_team_id` varchar(100) DEFAULT NULL COMMENT '部门编号',
  `pp_team_name` varchar(100) DEFAULT NULL COMMENT '部门名称',
  `pp_buyer` varchar(100) DEFAULT NULL COMMENT '业务人员',
  `pp_project_name` varchar(100) DEFAULT NULL COMMENT '项目名称',
  `pp_currency` varchar(100) DEFAULT NULL COMMENT '币别',
  `pp_exchange_rate` float DEFAULT NULL COMMENT '汇率',
  `pp_payablesmain_price` double DEFAULT NULL COMMENT '原单金额',
  `pp_currentbalance` float DEFAULT NULL COMMENT '现行余额',
  `pp_discountamount` float DEFAULT NULL COMMENT '折让金额',
  `pp_amountcharged` float DEFAULT NULL COMMENT '冲款金额',
  `pp_offsetamount` float DEFAULT NULL COMMENT '冲抵金额',
  `pp_auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `pp_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0否 1是，默认0）',
  `pp_custom1` varchar(50) DEFAULT NULL COMMENT '自定义栏一',
  `pp_custom2` varchar(50) DEFAULT NULL COMMENT '自定义栏二',
  `pp_custom3` varchar(50) DEFAULT NULL COMMENT '自定义栏三',
  `pp_custom4` varchar(50) DEFAULT NULL COMMENT '自定义栏四',
  `pp_custom5` varchar(50) DEFAULT NULL COMMENT '自定义栏五',
  `pp_custom6` varchar(50) DEFAULT NULL COMMENT '自定义栏六',
  `pp_custom7` varchar(50) DEFAULT NULL COMMENT '自定义栏七',
  `pp_custom8` varchar(50) DEFAULT NULL COMMENT '自定义栏八',
  `pp_custom9` varchar(50) DEFAULT NULL COMMENT '自定义栏九',
  `pp_custom10` varchar(50) DEFAULT NULL COMMENT '自定义栏十',
  PRIMARY KEY (`pp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `purchase_payables` */

/*Table structure for table `purchase_requisition` */

DROP TABLE IF EXISTS `purchase_requisition`;

CREATE TABLE `purchase_requisition` (
  `pr_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `prt_id` varchar(50) DEFAULT NULL COMMENT '采购请购编号',
  `pr_single_status` varchar(50) DEFAULT NULL COMMENT '单况',
  `pr_document_date` date DEFAULT NULL COMMENT '单据日期',
  `pr_document_number` varchar(50) DEFAULT NULL COMMENT '单据号码',
  `pr_buyer` varchar(50) DEFAULT NULL COMMENT '采购人员',
  `pr_belongs_section` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `pr_executor` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `pr_checkagain_staff` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `pr_sumnum` int(11) DEFAULT NULL COMMENT '总数量',
  `pr_nopurchase_num` int(11) DEFAULT NULL COMMENT '未采购量',
  `pr_header_provision` varchar(50) DEFAULT NULL COMMENT '表头条文',
  `pr_end_clause` varchar(50) DEFAULT NULL COMMENT '表尾条文',
  `pr_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `pr_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `pr_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `pr_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `pr_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `pr_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `pr_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `pr_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `pr_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`pr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购请购主表';

/*Data for the table `purchase_requisition` */

/*Table structure for table `purchase_requisition_detailed` */

DROP TABLE IF EXISTS `purchase_requisition_detailed`;

CREATE TABLE `purchase_requisition_detailed` (
  `prd_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `pr_id` varchar(50) DEFAULT NULL COMMENT '采购请购id',
  `pr_matter_id` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `prd_matter_name` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `prd_specifications` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `prd_company_name` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `prd_amount` int(11) DEFAULT NULL COMMENT '数量',
  `prd_currency_id` varchar(50) DEFAULT NULL COMMENT '币别id',
  `prd_standard_price` float DEFAULT NULL COMMENT '标准进价',
  `prd_standard_purchase_amount` float DEFAULT NULL COMMENT '标准进价金额',
  `prd_unit_price` float DEFAULT NULL COMMENT '单价',
  `prd_incoming_amount` float DEFAULT NULL COMMENT '进价金额',
  `prd_demand_date` date DEFAULT NULL COMMENT '需求日期',
  `prd_recommended_procurement_date` date DEFAULT NULL COMMENT '建议采购日期',
  `prd_unpurchased_quantity` int(11) DEFAULT NULL COMMENT '未采购量',
  `prd_remarks` varchar(300) DEFAULT NULL COMMENT '分录备注',
  `prd_source_order` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `prd_source_no` varchar(50) DEFAULT NULL COMMENT '来源单号',
  `prd_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `prd_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `prd_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `prd_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `prd_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `prd_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `prd_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `prd_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`prd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购请购详表';

/*Data for the table `purchase_requisition_detailed` */

/*Table structure for table `purchase_requisition_type` */

DROP TABLE IF EXISTS `purchase_requisition_type`;

CREATE TABLE `purchase_requisition_type` (
  `prt_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `prt_name` varchar(50) DEFAULT NULL COMMENT '类别名称',
  `prt_engname` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `prt_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `prt_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `prt_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `prt_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `prt_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `prt_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `prt_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `prt_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `prt_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`prt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购请购类型';

/*Data for the table `purchase_requisition_type` */

/*Table structure for table `purchase_returns` */

DROP TABLE IF EXISTS `purchase_returns`;

CREATE TABLE `purchase_returns` (
  `pure_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `supplier_id` varchar(50) DEFAULT NULL COMMENT '供应商id',
  `pure_engname` varchar(32) DEFAULT NULL COMMENT '供应商地址',
  `puret_id` varchar(50) DEFAULT NULL COMMENT '采购退货类型id',
  `pure_price_include_tax` varchar(50) DEFAULT NULL COMMENT '单价是否含税',
  `warehouse_id` int(11) DEFAULT NULL COMMENT '仓库id',
  `pure_single_status` varchar(50) DEFAULT NULL COMMENT '凭证编号',
  `pure_document_date` date DEFAULT NULL COMMENT '单据日期',
  `pure_document_number` varchar(50) DEFAULT NULL COMMENT '单据号码',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别id',
  `pure_exchange_rate` float DEFAULT NULL COMMENT '汇率',
  `pure_foreign_trade` int(11) DEFAULT NULL COMMENT '国外贸易 默认否',
  `pure_sunnum` int(11) DEFAULT NULL COMMENT '总数量',
  `pure_sunmoney` float DEFAULT NULL COMMENT '总金额',
  `pure_tax` float DEFAULT NULL COMMENT '总税额',
  `pure_include_tax_amount` float DEFAULT NULL COMMENT '含税总金额',
  `pure_delivery_address` varchar(50) DEFAULT NULL COMMENT '送货地址',
  `pure_buyer` varchar(50) DEFAULT NULL COMMENT '采购人员',
  `pure_belongs_section` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `pure_belongs_project` varchar(50) DEFAULT NULL COMMENT '所属项目',
  `pure_executor` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `pure_checkagain_staff` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `pure_header_provision` varchar(50) DEFAULT NULL COMMENT '表头条文',
  `pure_end_clause` varchar(50) DEFAULT NULL COMMENT '表尾条文',
  `pure_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `pure_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `pure_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `pure_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `pure_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `pure_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `pure_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `pure_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `pure_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  `createDate` date DEFAULT NULL COMMENT '修改时间',
  `lineId` int(11) NOT NULL AUTO_INCREMENT COMMENT '行编号',
  PRIMARY KEY (`pure_id`),
  UNIQUE KEY `lineId` (`lineId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购退货主表';

/*Data for the table `purchase_returns` */

/*Table structure for table `purchase_returns_detailed` */

DROP TABLE IF EXISTS `purchase_returns_detailed`;

CREATE TABLE `purchase_returns_detailed` (
  `pured_id` varchar(50) NOT NULL,
  `pure_id` varchar(50) DEFAULT NULL,
  `matter_id` varchar(50) DEFAULT NULL,
  `pured_engname` varchar(32) DEFAULT NULL,
  `pured_remark` varchar(50) DEFAULT NULL,
  `pured_price_include_tax` varchar(50) DEFAULT NULL,
  `pured_single_status` int(11) DEFAULT NULL,
  `pured_document_date` float DEFAULT NULL COMMENT '折扣前单价',
  `pured_document_number` varchar(50) DEFAULT NULL,
  `pured_price` float DEFAULT NULL,
  `pured_money` float DEFAULT NULL,
  `pured_tax_rate` float DEFAULT NULL,
  `pured_tax_amount` float DEFAULT NULL,
  `pured_including_tax_amount` float DEFAULT NULL,
  `pured_batch_number` varchar(50) DEFAULT NULL,
  `pured_ifgift` varchar(50) DEFAULT NULL,
  `pured_invoice_details` varchar(50) DEFAULT NULL,
  `pured_remarks` varchar(300) DEFAULT NULL,
  `pured_source_order` varchar(50) DEFAULT NULL,
  `pured_source_no` varchar(50) DEFAULT NULL,
  `pured_auditing` varchar(50) DEFAULT NULL,
  `pured_yn` varchar(50) DEFAULT '0',
  `pured_custom1` varchar(50) DEFAULT NULL,
  `pured_custom2` varchar(50) DEFAULT NULL,
  `pured_custom3` varchar(50) DEFAULT NULL,
  `pured_custom4` varchar(50) DEFAULT NULL,
  `pured_custom5` varchar(50) DEFAULT NULL,
  `pured_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pured_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `purchase_returns_detailed` */

/*Table structure for table `purchase_storage` */

DROP TABLE IF EXISTS `purchase_storage`;

CREATE TABLE `purchase_storage` (
  `ps_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `supplier_id` varchar(50) DEFAULT NULL COMMENT '供应商id',
  `ps_engname` varchar(32) DEFAULT NULL COMMENT '供应商地址',
  `pst_id` varchar(50) DEFAULT NULL COMMENT '采购入库类型id',
  `ps_price_include_tax` varchar(50) DEFAULT NULL COMMENT '单价是否含税',
  `warehouse_id` int(11) DEFAULT NULL COMMENT '仓库id',
  `ps_single_status` varchar(50) DEFAULT NULL COMMENT '凭证编号',
  `ps_document_date` date DEFAULT NULL COMMENT '单据日期',
  `ps_document_number` varchar(50) DEFAULT NULL COMMENT '单据号码',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别id',
  `ps_exchange_rate` float DEFAULT NULL COMMENT '汇率',
  `ps_foreign_trade` int(11) DEFAULT NULL COMMENT '国外贸易 默认否',
  `ps_sunnum` int(11) DEFAULT NULL COMMENT '总数量',
  `ps_sunmoney` float DEFAULT NULL COMMENT '总金额',
  `ps_tax` float DEFAULT NULL COMMENT '总税额',
  `ps_include_tax_amount` float DEFAULT NULL COMMENT '含税总金额',
  `ps_delivery_address` varchar(50) DEFAULT NULL COMMENT '送货地址',
  `ps_buyer` varchar(50) DEFAULT NULL COMMENT '采购人员',
  `ps_belongs_section` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `ps_belongs_project` varchar(50) DEFAULT NULL COMMENT '所属项目',
  `ps_executor` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `ps_checkagain_staff` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `ps_header_provision` varchar(50) DEFAULT NULL COMMENT '表头条文',
  `ps_end_clause` varchar(50) DEFAULT NULL COMMENT '表尾条文',
  `ps_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `ps_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `ps_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `ps_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `ps_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `ps_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `ps_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `ps_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `ps_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  `createDate` date DEFAULT NULL COMMENT '创建时间',
  `editDate` date DEFAULT NULL COMMENT '修改时间',
  `lineId` int(11) NOT NULL AUTO_INCREMENT COMMENT '行编号',
  PRIMARY KEY (`ps_id`),
  UNIQUE KEY `lineId` (`lineId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购入库主表';

/*Data for the table `purchase_storage` */

/*Table structure for table `purchase_storage_detailed` */

DROP TABLE IF EXISTS `purchase_storage_detailed`;

CREATE TABLE `purchase_storage_detailed` (
  `psd_id` varchar(50) NOT NULL,
  `ps_id` varchar(50) DEFAULT NULL,
  `matter_id` varchar(50) DEFAULT NULL,
  `psd_engname` varchar(50) DEFAULT NULL,
  `psd_remark` varchar(50) DEFAULT NULL,
  `psd_price_include_tax` varchar(50) DEFAULT NULL,
  `psd_single_status` int(50) DEFAULT NULL,
  `psd_document_date` date DEFAULT NULL,
  `psd_document_number` varchar(50) DEFAULT NULL,
  `psd_price` float DEFAULT NULL,
  `psd_money` float DEFAULT NULL,
  `psd_tax_rate` float DEFAULT NULL,
  `psd_tax_amount` float DEFAULT NULL,
  `psd_including_tax_amount` float DEFAULT NULL,
  `psd_batch_number` varchar(50) DEFAULT NULL,
  `psd_ifgift` varchar(50) DEFAULT NULL,
  `psd_invoice_details` varchar(50) DEFAULT NULL,
  `psd_remarks` varchar(300) DEFAULT NULL,
  `psd_source_order` varchar(50) DEFAULT NULL,
  `psd_source_no` varchar(50) DEFAULT NULL,
  `psd_auditing` varchar(50) DEFAULT NULL,
  `psd_yn` varchar(50) DEFAULT '0',
  `psd_custom1` varchar(50) DEFAULT NULL,
  `psd_custom2` varchar(50) DEFAULT NULL,
  `psd_custom3` varchar(50) DEFAULT NULL,
  `psd_custom4` varchar(50) DEFAULT NULL,
  `psd_custom5` varchar(50) DEFAULT NULL,
  `psd_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`psd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `purchase_storage_detailed` */

/*Table structure for table `purchase_storage_type` */

DROP TABLE IF EXISTS `purchase_storage_type`;

CREATE TABLE `purchase_storage_type` (
  `pst_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `pst_name` varchar(50) DEFAULT NULL COMMENT '类别名称',
  `pst_engname` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `pst_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `pst_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `pst_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `pst_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `pst_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `pst_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `pst_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `pst_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `pst_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`pst_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购入库类型表';

/*Data for the table `purchase_storage_type` */

/*Table structure for table `purchasing_order` */

DROP TABLE IF EXISTS `purchasing_order`;

CREATE TABLE `purchasing_order` (
  `po_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `supplier_id` varchar(50) DEFAULT NULL COMMENT '供应商id',
  `po_engname` varchar(32) DEFAULT NULL COMMENT '供应商地址',
  `pot_id` varchar(50) DEFAULT NULL COMMENT '采购订单类型id',
  `po_price_include_tax` varchar(50) DEFAULT NULL COMMENT '单价是否含税',
  `po_single_status` varchar(50) DEFAULT NULL COMMENT '单况',
  `po_document_date` date DEFAULT NULL COMMENT '单据日期',
  `po_document_number` varchar(50) DEFAULT NULL COMMENT '单据号码',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别id',
  `po_exchange_rate` float DEFAULT NULL COMMENT '汇率',
  `po_delivery_address` varchar(50) DEFAULT NULL COMMENT '送货地址',
  `po_buyer` varchar(50) DEFAULT NULL COMMENT '采购人员',
  `po_belongs_section` varchar(50) DEFAULT NULL COMMENT '所属部门',
  `po_belongs_project` varchar(50) DEFAULT NULL COMMENT '所属项目',
  `po_header_provision` varchar(50) DEFAULT NULL COMMENT '表头条文',
  `po_end_clause` varchar(50) DEFAULT NULL COMMENT '表尾条文',
  `po_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `po_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `po_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `po_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `po_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `po_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `po_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `po_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `po_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`po_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购订单主表';

/*Data for the table `purchasing_order` */

/*Table structure for table `purchasing_order_detailed` */

DROP TABLE IF EXISTS `purchasing_order_detailed`;

CREATE TABLE `purchasing_order_detailed` (
  `pod_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `po_id` varchar(50) DEFAULT NULL COMMENT '采购订单主表id not null',
  `po_matter_id` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `pod_matter_name` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `pod_specifications` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `pod_company_name` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `pod_amount` int(11) DEFAULT NULL COMMENT '数量',
  `pod_money_discount_before` float DEFAULT NULL COMMENT '折扣前单价',
  `pod_discount_number` varchar(50) DEFAULT NULL COMMENT '折数',
  `pod_price` float DEFAULT NULL COMMENT '单价',
  `pod_money` float DEFAULT NULL COMMENT '金额',
  `pod_tax_rate` float DEFAULT NULL COMMENT '税率',
  `pod_tax_amount` float DEFAULT NULL COMMENT '税额',
  `pod_include_tax_amount` float DEFAULT NULL COMMENT '含税金额',
  `pod_beforehand_laidup_date` varchar(50) DEFAULT NULL COMMENT '预计入库日',
  `pod_not_laiup_num` int(11) DEFAULT NULL COMMENT '未入库量',
  `pod_ifgift` varchar(50) DEFAULT NULL COMMENT '是否赠品 0 否 1 是',
  `pod_remarks` varchar(300) DEFAULT NULL COMMENT '分录备注',
  `pod_source_order` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `pod_source_no` varchar(50) DEFAULT NULL COMMENT '来源单号',
  `pod_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `pod_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `pod_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `pod_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `pod_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `pod_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `pod_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `pod_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`pod_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购订单详表';

/*Data for the table `purchasing_order_detailed` */

/*Table structure for table `purchasing_order_type` */

DROP TABLE IF EXISTS `purchasing_order_type`;

CREATE TABLE `purchasing_order_type` (
  `pot_id` varchar(50) NOT NULL COMMENT '主键 编号',
  `pot_name` varchar(50) DEFAULT NULL COMMENT '类别名称',
  `pot_engname` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `pot_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `pot_audition` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `pot_yn` varchar(50) DEFAULT '0' COMMENT '是否删除 0 否 1 是,默认0',
  `pot_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `pot_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `pot_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `pot_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `pot_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `pot_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`pot_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购订单类型表';

/*Data for the table `purchasing_order_type` */

/*Table structure for table `receivable` */

DROP TABLE IF EXISTS `receivable`;

CREATE TABLE `receivable` (
  `receivable_id` varchar(50) NOT NULL COMMENT '应付冲款单id（主键 唯一）',
  `customer_id` varchar(50) DEFAULT NULL COMMENT '客户表id，外键',
  `scs_id` int(11) DEFAULT NULL COMMENT '结算方式id，外键',
  `staff_id` varchar(50) DEFAULT NULL COMMENT '部门员工表id，外键',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别类型表id，外键',
  `project_id` varchar(50) DEFAULT NULL COMMENT '项目表id，外键',
  `customer_name` varchar(20) DEFAULT NULL COMMENT '客户名称',
  `payables_sat_name1` int(4) DEFAULT NULL COMMENT '结算方式表默认值：转账',
  `payables_Price1` float DEFAULT NULL COMMENT '默认值：0.00',
  `payables_sat_name2` int(4) DEFAULT NULL COMMENT '结算方式表默认值：汇票',
  `payables_Price2` float DEFAULT NULL COMMENT '默认值：0.00',
  `payables_sat_name3` int(4) DEFAULT NULL COMMENT '结算方式表',
  `payables_Price3` float DEFAULT NULL COMMENT '默认值：0.00',
  `payables_zhekou` int(4) DEFAULT NULL COMMENT '折扣率默认值：0.00',
  `payables_endtime` date DEFAULT NULL COMMENT '终止账月默认值：当前年月',
  `payables_payablestime` datetime DEFAULT NULL COMMENT '单据日期默认值：当前日期',
  `payables_currency_name` varchar(20) DEFAULT NULL COMMENT '币别类型表快照',
  `payables_currency_inexchange` varchar(20) DEFAULT NULL COMMENT '币别类型表快照',
  `payables_type` varchar(20) DEFAULT NULL COMMENT '应付冲款类型默认值：付款冲款',
  `payables_voucherNo` varchar(20) DEFAULT NULL COMMENT '凭证编号',
  `payables_team_name` varchar(20) DEFAULT NULL COMMENT '部门表',
  `payables_project_name` varchar(20) DEFAULT NULL COMMENT '项目表',
  `payables_billpersonnel` varchar(20) DEFAULT NULL COMMENT '制单人员默认值：当前人员',
  `payables_reviewers` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `payables_remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  `payables_auditstatus` int(4) DEFAULT NULL COMMENT '审核状态0:未审核1:已结案',
  `payables_auditstatus_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `payables_auditstatus_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `payables_custom1` varchar(50) DEFAULT '0' COMMENT '自定栏',
  `payables_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `payables_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `payables_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `payables_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `payables_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `payables_custom7` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `payables_custom8` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `payables_custom9` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `payables_custom10` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`receivable_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `receivable` */

insert  into `receivable`(`receivable_id`,`customer_id`,`scs_id`,`staff_id`,`currency_id`,`project_id`,`customer_name`,`payables_sat_name1`,`payables_Price1`,`payables_sat_name2`,`payables_Price2`,`payables_sat_name3`,`payables_Price3`,`payables_zhekou`,`payables_endtime`,`payables_payablestime`,`payables_currency_name`,`payables_currency_inexchange`,`payables_type`,`payables_voucherNo`,`payables_team_name`,`payables_project_name`,`payables_billpersonnel`,`payables_reviewers`,`payables_remarks`,`payables_auditstatus`,`payables_auditstatus_Auditing`,`payables_auditstatus_yn`,`payables_custom1`,`payables_custom2`,`payables_custom3`,`payables_custom4`,`payables_custom5`,`payables_custom6`,`payables_custom7`,`payables_custom8`,`payables_custom9`,`payables_custom10`) values 
('20200202001','1',1,'1','1','20200202003','株洲伟大',1,100,1,0,2,0,NULL,'2020-02-11','2020-02-02 00:00:00','1','1','0','1','直销部','日进斗金3','admin','admin',NULL,NULL,NULL,'0','20200202','0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('20200202002','2',1,'1','20200202003','20200204001','株洲伟大2',1,49,1,0,2,0,NULL,'2020-02-04','2020-02-20 00:00:00','欧元','1','0','1','渠道部','个人分','admin','admin',NULL,NULL,NULL,'0','0','0',NULL,NULL,NULL,NULL,NULL,NULL,'20200131003',NULL),
('20200202003','1',1,'1','1','1','株洲伟大2',2,85,3,0,2,1,NULL,'2020-02-13','2020-02-27 00:00:00','1','1','0','1','1','1','1','1',NULL,NULL,NULL,'0','0','1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('20200202004','1',1,'1','1','1','株洲伟大2',2,53,2,0,2,2,NULL,'2020-02-08','2020-02-29 00:00:00','1','1','0','1','1','1','1','1',NULL,NULL,NULL,'0','0','1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `receivable_detail` */

DROP TABLE IF EXISTS `receivable_detail`;

CREATE TABLE `receivable_detail` (
  `reedetail_id` varchar(50) DEFAULT NULL COMMENT '应付冲款单明细表ID,主键行号',
  `Payables_id` varchar(20) DEFAULT NULL COMMENT '应付冲款单主表ID, 外键',
  `customer_id` varchar(50) DEFAULT NULL COMMENT '客户表id，外键',
  `staff_id` varchar(50) DEFAULT NULL COMMENT '部门员工表id，外键',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别类型表id，外键',
  `project_id` varchar(50) DEFAULT NULL COMMENT '项目表id，外键',
  `pade_sourcelist` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `pade_sourcetime` date DEFAULT NULL COMMENT '来源日期',
  `pade_sourcenumber` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `pade_invoiceno` varchar(20) DEFAULT NULL COMMENT '发票号码',
  `pade_transaction` varchar(20) DEFAULT NULL COMMENT '交易对象供应商编号',
  `pade_transactionname` varchar(20) DEFAULT NULL COMMENT '交易对象名称',
  `pade_team_name` varchar(20) DEFAULT NULL COMMENT '部门名称',
  `pade_staff_name` varchar(20) DEFAULT NULL COMMENT '员工名称',
  `pade_project_name` varchar(20) DEFAULT NULL COMMENT '项目表',
  `pade_currency_name` varchar(20) DEFAULT NULL COMMENT '币别类型表',
  `pade_currency_inexchange` int(4) DEFAULT NULL COMMENT '币别类型表',
  `pade_price` float DEFAULT NULL COMMENT '采购入库，采购退货',
  `pade_Currentbalance` float DEFAULT NULL COMMENT '采购入库，采购退货现行余额',
  `pade_Discountamount` float DEFAULT NULL COMMENT '采购入库，采购退货折让金额',
  `pade_Amountcharged` float DEFAULT NULL COMMENT '采购入库，采购退货冲款金额',
  `pade_Offsetamount` float DEFAULT NULL COMMENT '采购入库，采购退货冲抵金额',
  `pade_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `pade_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `pade_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `pade_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `pade_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `pade_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `pade_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `pade_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  `pade_custom7` varchar(50) DEFAULT NULL COMMENT '自定栏七',
  `pade_custom8` varchar(50) DEFAULT NULL COMMENT '自定栏八',
  `pade_custom9` varchar(50) DEFAULT NULL COMMENT '自定栏九',
  `pade_custom10` varchar(50) DEFAULT NULL COMMENT '自定栏十'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `receivable_detail` */

/*Table structure for table `receivablesdetails` */

DROP TABLE IF EXISTS `receivablesdetails`;

CREATE TABLE `receivablesdetails` (
  `recedetail_id` varchar(50) NOT NULL COMMENT '预收款单明细表ID, 主键',
  `receivablesbill_id` varchar(20) DEFAULT NULL COMMENT '预收款单主表ID,   外键',
  `recedetail_price` float DEFAULT NULL COMMENT '预收金额',
  `recedetail_type` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `recedetail_number` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `recedetail_remarks` varchar(100) DEFAULT NULL COMMENT '摘要',
  `recedetail_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `recedetail_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `recedetail_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `recedetail_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `recedetail_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `recedetail_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `recedetail_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `recedetail_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  `recedetail_custom7` varchar(50) DEFAULT NULL COMMENT '自定栏七',
  `recedetail_custom8` varchar(50) DEFAULT NULL COMMENT '自定栏八',
  `recedetail_custom9` varchar(50) DEFAULT NULL COMMENT '自定栏九',
  `recedetail_custom10` varchar(50) DEFAULT NULL COMMENT '自定栏十',
  PRIMARY KEY (`recedetail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `receivablesdetails` */

insert  into `receivablesdetails`(`recedetail_id`,`receivablesbill_id`,`recedetail_price`,`recedetail_type`,`recedetail_number`,`recedetail_remarks`,`recedetail_Auditing`,`recedetail_yn`,`recedetail_custom1`,`recedetail_custom2`,`recedetail_custom3`,`recedetail_custom4`,`recedetail_custom5`,`recedetail_custom6`,`recedetail_custom7`,`recedetail_custom8`,`recedetail_custom9`,`recedetail_custom10`) values 
('20200202001','20200202001',55,'销售订单','20200202001','FSAFAF',NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
('20200227001','20200202002',2527,'销售订单','20200202001','FASFSA','','','','','','','','','','','','');

/*Table structure for table `referpria` */

DROP TABLE IF EXISTS `referpria`;

CREATE TABLE `referpria` (
  `Referpria_id` varchar(50) NOT NULL COMMENT '取用预付明细表ID, 主键行号',
  `Priadetails_id` varchar(50) DEFAULT NULL COMMENT '预付款单明细表ID,  外键',
  `Priabill_id` varchar(50) DEFAULT NULL COMMENT '预付款单主表ID，外键',
  `Priabill _number` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `Priabill _type` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `Priabill_advance` float DEFAULT NULL COMMENT '预付余额',
  `Priabill_qyadvance` float DEFAULT NULL COMMENT '取用预付金额',
  `Referpria_remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  `Referpria_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `Referpria_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `Referpria_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `Referpria_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `Referpria_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `Referpria_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `Referpria_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `Referpria_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  `Referpria_custom7` varchar(50) DEFAULT NULL COMMENT '自定栏七',
  `Referpria_custom8` varchar(50) DEFAULT NULL COMMENT '自定栏八',
  `Referpria_custom9` varchar(50) DEFAULT NULL COMMENT '自定栏九',
  `Referpria_custom10` varchar(50) DEFAULT NULL COMMENT '自定栏十',
  PRIMARY KEY (`Referpria_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `referpria` */

/*Table structure for table `referrece` */

DROP TABLE IF EXISTS `referrece`;

CREATE TABLE `referrece` (
  `referrece_id` varchar(50) NOT NULL COMMENT '取用预付明细表ID, 主键行号',
  `recedetail_id` varchar(50) DEFAULT NULL COMMENT '预付款单明细表ID,     外键',
  `receivablesbill_id` varchar(50) DEFAULT NULL COMMENT '预付款单主表ID，外键',
  `receivablesbill_number` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `receivablesbill_type` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `receivablesbill_advance` float DEFAULT NULL COMMENT '预收余额',
  `receivablesbill_qyadvance` float DEFAULT NULL COMMENT '取用预收金额',
  `referrece_remarks` varchar(200) DEFAULT NULL COMMENT '备注',
  `referrece_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `referrece_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `referrece_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `referrece_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `referrece_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `referrece_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `referrece_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `referrece_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  `referrece_custom7` varchar(50) DEFAULT NULL COMMENT '自定栏七',
  `referrece_custom8` varchar(50) DEFAULT NULL COMMENT '自定栏八',
  `referrece_custom9` varchar(50) DEFAULT NULL COMMENT '自定栏九',
  `referrece_custom10` varchar(50) DEFAULT NULL COMMENT '自定栏十',
  PRIMARY KEY (`referrece_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `referrece` */

/*Table structure for table `requisition` */

DROP TABLE IF EXISTS `requisition`;

CREATE TABLE `requisition` (
  `requisition_id` varchar(50) NOT NULL,
  `requisition_out_warehouse` varchar(50) DEFAULT NULL,
  `requisition_input_warehouse` varchar(50) DEFAULT NULL,
  `requisition_documentation_date` datetime DEFAULT NULL,
  `requisition_documentation_no` varchar(32) DEFAULT NULL,
  `requisition_form` varchar(50) DEFAULT NULL,
  `is_review_staff` varchar(50) DEFAULT NULL,
  `requisition_remark` varchar(50) DEFAULT NULL,
  `requisition_auditing` varchar(50) DEFAULT NULL,
  `requisition_yn` varchar(50) DEFAULT '0',
  `requisition_custom1` varchar(50) DEFAULT NULL,
  `requisition_custom2` varchar(50) DEFAULT NULL,
  `requisition_custom3` varchar(50) DEFAULT NULL,
  `requisition_custom4` varchar(50) DEFAULT NULL,
  `requisition_custom5` varchar(50) DEFAULT NULL,
  `requisition_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`requisition_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `requisition` */

/*Table structure for table `requisition_detailed` */

DROP TABLE IF EXISTS `requisition_detailed`;

CREATE TABLE `requisition_detailed` (
  `rd_id` varchar(50) NOT NULL,
  `requisition_id` varchar(50) DEFAULT NULL,
  `matter_id` varchar(50) DEFAULT NULL,
  `rd_engname` varchar(32) DEFAULT NULL,
  `rd_remark` varchar(50) DEFAULT NULL,
  `rd_price_include_tax` varchar(50) DEFAULT NULL,
  `rd_single_num` int(11) DEFAULT NULL,
  `rd_batch _number` varchar(50) DEFAULT NULL,
  `rd_remarks` varchar(300) DEFAULT NULL,
  `rd_auditing` varchar(50) DEFAULT NULL,
  `rd_yn` varchar(50) DEFAULT '0',
  `rd_custom1` varchar(50) DEFAULT NULL,
  `rd_custom2` varchar(50) DEFAULT NULL,
  `rd_custom3` varchar(50) DEFAULT NULL,
  `rd_custom4` varchar(50) DEFAULT NULL,
  `rd_custom5` varchar(50) DEFAULT NULL,
  `rd_custom6` varbinary(50) DEFAULT NULL,
  PRIMARY KEY (`rd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `requisition_detailed` */

/*Table structure for table `sales_discount` */

DROP TABLE IF EXISTS `sales_discount`;

CREATE TABLE `sales_discount` (
  `sd_id` varchar(50) NOT NULL,
  `customer_id` varchar(50) DEFAULT NULL,
  `pd_attribution_of_account` varchar(50) DEFAULT NULL,
  `pd_accounts_month` date DEFAULT NULL,
  `ps_id` varchar(50) DEFAULT NULL,
  `warehouse_id` varchar(50) DEFAULT NULL,
  `sd_document_date` date DEFAULT NULL,
  `sd_document_number` varchar(50) DEFAULT NULL,
  `currency_id` varchar(50) DEFAULT NULL,
  `sd_exchange_rate` float DEFAULT NULL,
  `sd_certificate_number` varchar(50) DEFAULT NULL,
  `sd_sunnum` int(11) DEFAULT NULL,
  `sd_sunmoney` float DEFAULT NULL,
  `sd_tax` float DEFAULT NULL,
  `sd_including_tax_amount` float DEFAULT NULL,
  `sd_delivery_address` varchar(50) DEFAULT NULL,
  `sd_buyer` varchar(50) DEFAULT NULL,
  `sd_belongs_section` varchar(50) DEFAULT NULL,
  `sd_belongs_project` varchar(50) DEFAULT NULL,
  `sd_form` varchar(50) DEFAULT NULL,
  `sd_checkagain_staff` varchar(50) DEFAULT NULL,
  `sd_project` varchar(50) DEFAULT NULL,
  `sd_header_provision` varchar(50) DEFAULT NULL,
  `sd_end_clause` varchar(50) DEFAULT NULL,
  `sd_remark` varchar(50) DEFAULT NULL,
  `sd_auditing` varchar(50) DEFAULT NULL,
  `sd_yn` varchar(50) DEFAULT '0',
  `sd_custom1` varchar(50) DEFAULT NULL,
  `sd_custom2` varchar(50) DEFAULT NULL,
  `sd_custom3` varchar(50) DEFAULT NULL,
  `sd_custom4` varchar(50) DEFAULT NULL,
  `sd_custom5` varchar(50) DEFAULT NULL,
  `sd_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sales_discount` */

/*Table structure for table `sales_order_type` */

DROP TABLE IF EXISTS `sales_order_type`;

CREATE TABLE `sales_order_type` (
  `sot_id` varchar(50) NOT NULL,
  `sot_name` varchar(50) DEFAULT NULL,
  `sot_engname` varchar(32) DEFAULT NULL,
  `sot_remark` varchar(50) DEFAULT NULL,
  `sot_auditing` varchar(50) DEFAULT NULL,
  `sot_yn` varchar(50) DEFAULT '0',
  `sot_custom1` varchar(50) DEFAULT NULL,
  `sot_custom2` varchar(50) DEFAULT NULL,
  `sot_custom3` varchar(50) DEFAULT NULL,
  `sot_custom4` varchar(50) DEFAULT NULL,
  `sot_custom5` varchar(50) DEFAULT NULL,
  `sot_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sot_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sales_order_type` */

/*Table structure for table `sales_out_warehouse` */

DROP TABLE IF EXISTS `sales_out_warehouse`;

CREATE TABLE `sales_out_warehouse` (
  `sow_id` varchar(50) NOT NULL,
  `customer_id` varchar(50) DEFAULT NULL,
  `sow_address` varchar(32) DEFAULT NULL,
  `sowt_id` varchar(50) DEFAULT NULL,
  `sow_price_include_tax` varchar(50) DEFAULT NULL,
  `warehouse_id` varchar(50) DEFAULT NULL,
  `sow_certificate_number` varchar(50) DEFAULT NULL,
  `sow_document_date` date DEFAULT NULL,
  `sow_document_number` varchar(50) DEFAULT NULL,
  `currency_id` varchar(50) DEFAULT NULL,
  `sow_exchange_rate` float DEFAULT NULL,
  `sow_foreign_trade` varchar(50) DEFAULT NULL,
  `sow_sunnum` int(11) DEFAULT NULL,
  `sow_sunmoney` float DEFAULT NULL,
  `sow_tax` float DEFAULT NULL,
  `sow_including_tax_amount` float DEFAULT NULL,
  `sow_saleszkgs` varchar(20) DEFAULT NULL,
  `sow_salesdate` date DEFAULT NULL,
  `sow_salessktj` varchar(20) DEFAULT NULL,
  `sow_salesday` int(11) DEFAULT NULL,
  `sow_salesyue` date DEFAULT NULL,
  `sow_buyer` varchar(50) DEFAULT NULL,
  `sow_belongs_section` varchar(50) DEFAULT NULL,
  `sow_belongs_project` varchar(50) DEFAULT NULL,
  `sow_form` varchar(50) DEFAULT NULL,
  `sow_checkagain_staff` varchar(50) DEFAULT NULL,
  `sow_project` varchar(50) DEFAULT NULL,
  `sow_header_provision` varchar(50) DEFAULT NULL,
  `sow_end_clause` varchar(50) DEFAULT NULL,
  `sow_remark` varchar(50) DEFAULT NULL,
  `sow_auditing` varchar(50) DEFAULT NULL,
  `sow_yn` varchar(50) DEFAULT '0',
  `sow_custom1` varchar(50) DEFAULT NULL,
  `sow_custom2` varchar(50) DEFAULT NULL,
  `sow_custom3` varchar(50) DEFAULT NULL,
  `sow_custom4` varchar(50) DEFAULT NULL,
  `sow_custom5` varchar(50) DEFAULT NULL,
  `sow_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sow_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sales_out_warehouse` */

/*Table structure for table `sales_out_warehouse_detailed` */

DROP TABLE IF EXISTS `sales_out_warehouse_detailed`;

CREATE TABLE `sales_out_warehouse_detailed` (
  `sowd_id` varchar(50) NOT NULL,
  `sow_id` varchar(50) DEFAULT NULL,
  `matter_id` varchar(50) DEFAULT NULL,
  `sowd_engname` varchar(32) DEFAULT NULL,
  `sowd_remark` varchar(50) DEFAULT NULL,
  `sowd_price_include_tax` varchar(50) DEFAULT NULL,
  `sowd_single_status` int(11) DEFAULT NULL,
  `sowd_document_date` float DEFAULT NULL,
  `sowd_document_number` float DEFAULT NULL,
  `sowd_price` float DEFAULT NULL,
  `sowd_money` float DEFAULT NULL,
  `sowd_tax_rate` float DEFAULT NULL,
  `sowd_tax_amount` float DEFAULT NULL,
  `sowd_including_tax_amount` float DEFAULT NULL,
  `sowd_batch_number` varchar(50) DEFAULT NULL,
  `sowd_material_combination` varchar(50) DEFAULT NULL,
  `sowd_ifgift` varchar(50) DEFAULT NULL,
  `sowd_invoice_details` varchar(50) DEFAULT NULL,
  `sowd_nomake_invoice_num` int(11) DEFAULT NULL,
  `sowd_remarks` varchar(300) DEFAULT NULL,
  `sowd_source_order` varchar(50) DEFAULT NULL,
  `sowd_source_no` varchar(50) DEFAULT NULL,
  `sowd_auditing` varchar(50) DEFAULT NULL,
  `sowd_yn` varchar(50) DEFAULT '0',
  `sowd_custom1` varchar(50) DEFAULT NULL,
  `sowd_custom2` varchar(50) DEFAULT NULL,
  `sowd_custom3` varchar(50) DEFAULT NULL,
  `sowd_custom4` varchar(50) DEFAULT NULL,
  `sowd_custom5` varchar(50) DEFAULT NULL,
  `sowd_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sowd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sales_out_warehouse_detailed` */

/*Table structure for table `sales_out_warehouse_type` */

DROP TABLE IF EXISTS `sales_out_warehouse_type`;

CREATE TABLE `sales_out_warehouse_type` (
  `sowt_id` varchar(50) NOT NULL,
  `sowt_name` varchar(50) DEFAULT NULL,
  `sowt_engname` varchar(32) DEFAULT NULL,
  `sowt_remark` varchar(50) DEFAULT NULL,
  `sowt_auditing` varchar(50) DEFAULT NULL,
  `sowt_yn` varchar(50) DEFAULT NULL,
  `sowt_custom1` varchar(50) DEFAULT NULL,
  `sowt_custom2` varchar(50) DEFAULT NULL,
  `sowt_custom3` varchar(50) DEFAULT NULL,
  `sowt_custom4` varchar(50) DEFAULT NULL,
  `sowt_custom5` varchar(50) DEFAULT NULL,
  `sowt_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sowt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sales_out_warehouse_type` */

/*Table structure for table `sales_quotation` */

DROP TABLE IF EXISTS `sales_quotation`;

CREATE TABLE `sales_quotation` (
  `sq_id` varchar(50) NOT NULL,
  `sq_document_time` date DEFAULT NULL,
  `currency_id` varchar(50) DEFAULT NULL,
  `sq_exchange_rate` float DEFAULT NULL,
  `sq_effective_time` date DEFAULT NULL,
  `sq_tax` int(11) DEFAULT NULL,
  `customer_id` varchar(50) DEFAULT NULL,
  `sq_delivery_address` varchar(20) DEFAULT NULL,
  `staff_id` int(11) DEFAULT NULL,
  `team_id` varchar(50) DEFAULT NULL,
  `sq_monograph` varchar(50) DEFAULT NULL,
  `sq_reviewer` varchar(50) DEFAULT NULL,
  `sq_watchword` varchar(20) DEFAULT NULL,
  `sq_tailclause` varchar(20) DEFAULT NULL,
  `sq_remark` varchar(200) DEFAULT NULL,
  `sq_auditing` varchar(50) DEFAULT NULL,
  `sq_yn` varchar(50) DEFAULT NULL,
  `sq_custom1` varchar(50) DEFAULT NULL,
  `sq_custom2` varchar(50) DEFAULT NULL,
  `sq_custom3` varchar(50) DEFAULT NULL,
  `sq_custom4` varchar(50) DEFAULT NULL,
  `sq_custom5` varchar(50) DEFAULT NULL,
  `sq_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sq_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sales_quotation` */

/*Table structure for table `sales_quotation_details` */

DROP TABLE IF EXISTS `sales_quotation_details`;

CREATE TABLE `sales_quotation_details` (
  `Sqd_ProdID` varchar(10) NOT NULL COMMENT '栏号',
  `Sqd_SerNO` varchar(20) DEFAULT NULL COMMENT '物料编号，来源物料主文件',
  `Sqd_ProdName` varchar(30) DEFAULT NULL COMMENT '物料名称，来源物料主文件',
  `Sqd_ProdSize` varchar(30) DEFAULT NULL COMMENT '规格型号，来源物料主文件',
  `Sqd_UnitName` varchar(20) DEFAULT NULL COMMENT '单位名称，来源物料主文件',
  `Sqd_sQuantity` int(11) DEFAULT '0' COMMENT '数量,要有小兰标签，但如果为0，不可保存',
  `Sqd_ZkqPrice` float DEFAULT NULL COMMENT '折扣前单价',
  `Sqd_Discount` float DEFAULT NULL COMMENT '折数',
  `Sqd_UnitPrice` float DEFAULT NULL COMMENT '单价',
  `Sqd_Price` float DEFAULT NULL COMMENT '金额',
  `Sqd_TaxRate` float DEFAULT NULL COMMENT '税率',
  `Sqd_Taxlimit` float DEFAULT NULL COMMENT '税额',
  `Sqd_TaxInclusivePrice` float DEFAULT NULL COMMENT '含税金额',
  `Sqd_Complimentart` int(11) DEFAULT NULL COMMENT '赠品（0，1）',
  `Sqd_ItemRemark` varchar(50) DEFAULT NULL COMMENT '分录备注',
  `sql_id` varchar(50) DEFAULT NULL COMMENT '详表主键 关联主表',
  `Sqd_auditing` varchar(50) DEFAULT NULL,
  `Sqd_yn` varchar(50) DEFAULT '0',
  `Sqd_custom1` varchar(50) DEFAULT NULL,
  `Sqd_custom2` varchar(50) DEFAULT NULL,
  `Sqd_custom3` varchar(50) DEFAULT NULL,
  `Sqd_custom4` varchar(50) DEFAULT NULL,
  `Sqd_custom5` varchar(50) DEFAULT NULL,
  `Sqd_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Sqd_ProdID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sales_quotation_details` */

/*Table structure for table `sales_receivables` */

DROP TABLE IF EXISTS `sales_receivables`;

CREATE TABLE `sales_receivables` (
  `sr_id` int(11) NOT NULL AUTO_INCREMENT,
  `sr_type` varchar(100) DEFAULT NULL COMMENT '单别',
  `sr_number` varchar(100) DEFAULT NULL COMMENT '原单单号',
  `sr_date` datetime DEFAULT NULL COMMENT '原单日期',
  `sr_pc_id` varchar(100) DEFAULT NULL COMMENT '交易对象',
  `sr_pc_name` varchar(100) DEFAULT NULL COMMENT '交易对象名称',
  `sr_team_id` varchar(100) DEFAULT NULL COMMENT '部门编号',
  `sr_team_name` varchar(100) DEFAULT NULL COMMENT '部门名称',
  `sr_buyer` varchar(100) DEFAULT NULL COMMENT '业务人员',
  `sr_project_name` varchar(100) DEFAULT NULL COMMENT '项目名称',
  `sr_currency` varchar(100) DEFAULT NULL COMMENT '币别',
  `sr_exchange_rate` float DEFAULT NULL COMMENT '汇率',
  `sr_payablesmain_price` double DEFAULT NULL COMMENT '原单金额',
  `sr_currentbalance` float DEFAULT NULL COMMENT '现行余额',
  `sr_discountamount` float DEFAULT NULL COMMENT '折让金额',
  `sr_amountcharged` float DEFAULT NULL COMMENT '冲款金额',
  `sr_offsetamount` float DEFAULT NULL COMMENT '冲抵金额',
  `sr_auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `sr_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0否 1是，默认0）',
  `sr_custom1` varchar(50) DEFAULT NULL COMMENT '自定义栏一',
  `sr_custom2` varchar(50) DEFAULT NULL COMMENT '自定义栏二',
  `sr_custom3` varchar(50) DEFAULT NULL COMMENT '自定义栏三',
  `sr_custom4` varchar(50) DEFAULT NULL COMMENT '自定义栏四',
  `sr_custom5` varchar(50) DEFAULT NULL COMMENT '自定义栏五',
  `sr_custom6` varchar(50) DEFAULT NULL COMMENT '自定义栏六',
  `sr_custom7` varchar(50) DEFAULT NULL COMMENT '自定义栏七',
  `sr_custom8` varchar(50) DEFAULT NULL COMMENT '自定义栏八',
  `sr_custom9` varchar(50) DEFAULT NULL COMMENT '自定义栏九',
  `sr_custom10` varchar(50) DEFAULT NULL COMMENT '自定义栏十',
  PRIMARY KEY (`sr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sales_receivables` */

/*Table structure for table `sales_return_warehouse` */

DROP TABLE IF EXISTS `sales_return_warehouse`;

CREATE TABLE `sales_return_warehouse` (
  `srw_id` varchar(50) NOT NULL,
  `customer_id` varchar(50) DEFAULT NULL,
  `srw_address` varchar(32) DEFAULT NULL,
  `srwt_id` varchar(50) DEFAULT NULL,
  `srw_price_include_tax` varchar(50) DEFAULT NULL,
  `salescxrk` int(11) DEFAULT NULL,
  `warehouse_id` varchar(50) DEFAULT NULL,
  `srw_certificate_number` varchar(50) DEFAULT NULL,
  `srw_document_date` date DEFAULT NULL,
  `srw_document_number` varchar(50) DEFAULT NULL,
  `currency_id` varchar(50) DEFAULT NULL,
  `srw_exchange_rate` float DEFAULT NULL,
  `srw_foreign_trade` int(11) DEFAULT NULL,
  `srw_sunnum` float DEFAULT NULL,
  `srw_sunmoney` float DEFAULT NULL,
  `srw_tax` float DEFAULT NULL,
  `srw_including_tax_amount` varchar(20) DEFAULT NULL,
  `srw_saleszkgs` date DEFAULT NULL,
  `srw_salesdate` varchar(20) DEFAULT NULL,
  `srw_salessktj` int(11) DEFAULT NULL,
  `srw_salesday` date DEFAULT NULL,
  `srw_salesyue` varchar(50) DEFAULT NULL,
  `srw_buyer` varchar(50) DEFAULT NULL,
  `srw_belongs_section` varchar(50) DEFAULT NULL,
  `srw_belongs_project` varchar(50) DEFAULT NULL,
  `srw_form` varchar(50) DEFAULT NULL,
  `srw_checkagain_staff` varchar(50) DEFAULT NULL,
  `srw_header_provision` varchar(50) DEFAULT NULL,
  `srw_end_clause` varchar(50) DEFAULT NULL,
  `srw_remark` varchar(50) DEFAULT NULL,
  `srw_auditing` varchar(50) DEFAULT NULL,
  `srw_yn` varchar(50) DEFAULT NULL,
  `srw_custom1` varchar(50) DEFAULT NULL,
  `srw_custom2` varchar(50) DEFAULT NULL,
  `srw_custom3` varchar(50) DEFAULT NULL,
  `srw_custom4` varchar(50) DEFAULT NULL,
  `srw_custom5` varchar(50) DEFAULT NULL,
  `srw_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`srw_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sales_return_warehouse` */

/*Table structure for table `sales_return_warehouse_detailed` */

DROP TABLE IF EXISTS `sales_return_warehouse_detailed`;

CREATE TABLE `sales_return_warehouse_detailed` (
  `srwd_id` varchar(50) NOT NULL,
  `srw_id` varchar(50) DEFAULT NULL,
  `matter_id` varchar(50) DEFAULT NULL,
  `srwd_engname` varchar(32) DEFAULT NULL,
  `srwd_remark` varchar(50) DEFAULT NULL,
  `srwd_price_include_tax` varchar(50) DEFAULT NULL,
  `srwd_single_status` int(11) DEFAULT NULL,
  `srwd_document_date` float DEFAULT NULL,
  `srwd_document_number` float DEFAULT NULL,
  `srwd_price` float DEFAULT NULL,
  `srwd_money` float DEFAULT NULL,
  `srwd_tax_rate` float DEFAULT NULL,
  `srwd_tax_amount` float DEFAULT NULL,
  `srwd_including_tax_amount` float DEFAULT NULL,
  `srwd_batch_number` varchar(50) DEFAULT NULL,
  `srwd_ifgift` varchar(50) DEFAULT NULL,
  `srwd_invoice_details` varchar(50) DEFAULT NULL,
  `srwd_nomake_invoice_num` int(11) DEFAULT NULL,
  `srwd_remarks` varchar(300) DEFAULT NULL,
  `srwd_source_order` varchar(50) DEFAULT NULL,
  `srwd_source_no` varchar(50) DEFAULT NULL,
  `srwd_auditing` varchar(50) DEFAULT NULL,
  `srwd_yn` varchar(50) DEFAULT NULL,
  `srwd_custom1` varchar(50) DEFAULT NULL,
  `srwd_custom2` varchar(50) DEFAULT NULL,
  `srwd_custom3` varchar(50) DEFAULT NULL,
  `srwd_custom4` varchar(50) DEFAULT NULL,
  `srwd_custom5` varchar(50) DEFAULT NULL,
  `srwd_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`srwd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sales_return_warehouse_detailed` */

/*Table structure for table `salesorder` */

DROP TABLE IF EXISTS `salesorder`;

CREATE TABLE `salesorder` (
  `so_id` varchar(50) NOT NULL,
  `so_document_time` date DEFAULT NULL,
  `so_documentnumber` varchar(20) DEFAULT NULL,
  `so_delivery_address` double DEFAULT NULL,
  `sot_id` date DEFAULT NULL,
  `so_customerorder` int(50) DEFAULT NULL,
  `so_tax` varchar(50) DEFAULT NULL,
  `currency_id` varchar(20) DEFAULT NULL,
  `so_oder_static` varchar(50) DEFAULT NULL,
  `staff_id` varchar(50) DEFAULT NULL,
  `team_id` varchar(50) DEFAULT NULL,
  `so_monograph` varchar(50) DEFAULT NULL,
  `so_reviewer` varchar(50) DEFAULT NULL,
  `so_subordinate` varchar(50) DEFAULT NULL,
  `so_watchword` varchar(20) DEFAULT NULL,
  `so_tailclause` varchar(20) DEFAULT NULL,
  `so_remark` varchar(200) DEFAULT NULL,
  `so_account_ownership` varchar(50) DEFAULT NULL,
  `so_collection_time` varchar(50) DEFAULT NULL,
  `so_collection_month` varchar(50) DEFAULT NULL,
  `so_collection_terms` varchar(50) DEFAULT NULL,
  `so_collection_terms_day` varchar(50) DEFAULT NULL,
  `so_auditing` varchar(50) DEFAULT NULL,
  `so_yn` varchar(50) DEFAULT '0',
  `so_custom1` varchar(50) DEFAULT NULL,
  `so_custom2` varchar(50) DEFAULT NULL,
  `so_custom3` varchar(50) DEFAULT NULL,
  `so_custom4` varchar(50) DEFAULT NULL,
  `so_custom5` varchar(50) DEFAULT NULL,
  `so_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`so_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `salesorder` */

insert  into `salesorder`(`so_id`,`so_document_time`,`so_documentnumber`,`so_delivery_address`,`sot_id`,`so_customerorder`,`so_tax`,`currency_id`,`so_oder_static`,`staff_id`,`team_id`,`so_monograph`,`so_reviewer`,`so_subordinate`,`so_watchword`,`so_tailclause`,`so_remark`,`so_account_ownership`,`so_collection_time`,`so_collection_month`,`so_collection_terms`,`so_collection_terms_day`,`so_auditing`,`so_yn`,`so_custom1`,`so_custom2`,`so_custom3`,`so_custom4`,`so_custom5`,`so_custom6`) values 
('20200202001','2020-02-19',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `salesorderlist` */

DROP TABLE IF EXISTS `salesorderlist`;

CREATE TABLE `salesorderlist` (
  `sol_id` varchar(50) NOT NULL,
  `so_id` varchar(50) DEFAULT NULL,
  `matter_id` varchar(50) DEFAULT NULL,
  `sol_mat_name` varchar(50) DEFAULT NULL,
  `sol_mat_type` varchar(20) DEFAULT NULL,
  `sol_nominal` varchar(20) DEFAULT NULL,
  `sol_quantity` int(11) DEFAULT NULL,
  `sol_pre_price` float DEFAULT NULL,
  `sol_fold` int(11) DEFAULT NULL,
  `sol_price` float DEFAULT NULL,
  `sol_amount` float DEFAULT NULL,
  `sol_tax_rate` float DEFAULT NULL,
  `sol_tax` float DEFAULT NULL,
  `sol_tax_amount` float DEFAULT NULL,
  `sol_giveaway` int(11) DEFAULT NULL,
  `sol_journalizing` varchar(50) DEFAULT NULL,
  `sol_material_composition` int(11) DEFAULT NULL,
  `sol_single_source` varchar(50) DEFAULT NULL,
  `sol_single_oder` varchar(50) DEFAULT NULL,
  `sol_production` int(11) DEFAULT NULL,
  `sol_scheduling_single_number` varchar(50) DEFAULT NULL,
  `sol_produced_quantity` int(11) DEFAULT NULL,
  `sol_auditing` varchar(50) DEFAULT NULL,
  `sol_yn` varchar(50) DEFAULT '0',
  `sol_custom1` varchar(50) DEFAULT NULL,
  `sol_custom2` varchar(50) DEFAULT NULL,
  `sol_custom3` varchar(50) DEFAULT NULL,
  `sol_custom4` varchar(50) DEFAULT NULL,
  `sol_custom5` varchar(50) DEFAULT NULL,
  `sol_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sol_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `salesorderlist` */

/*Table structure for table `settle_accounts_type` */

DROP TABLE IF EXISTS `settle_accounts_type`;

CREATE TABLE `settle_accounts_type` (
  `sat_id` varchar(50) NOT NULL COMMENT '编号（主键 唯一）',
  `sat_name` varchar(50) DEFAULT NULL COMMENT '名称',
  `sat_english_name` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `sat_subject` varchar(50) DEFAULT NULL COMMENT '科目',
  `sat_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `sat_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `sat_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `sat_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sat_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sat_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sat_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sat_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sat_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`sat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `settle_accounts_type` */

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `staff_id` varchar(50) NOT NULL COMMENT '员工编号（主键 唯一）',
  `staff_name` varchar(50) DEFAULT NULL COMMENT '员工名称',
  `staff_english_name` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `team_id` varchar(50) DEFAULT NULL COMMENT '所属部门（部门id）',
  `staff_gender` char(1) DEFAULT NULL COMMENT '性别',
  `staff_idnumber` varchar(50) DEFAULT NULL COMMENT '身份证号',
  `staff_birthday` date DEFAULT NULL COMMENT '出生日期',
  `staff_maritalstatus` int(11) DEFAULT NULL COMMENT '婚姻状况(0 未婚|1 已婚|2离婚|3 丧偶)',
  `staff_native_place` int(11) DEFAULT NULL COMMENT '血型（0 a型|1 b型|2 ab型|3 o型|5 rh+型|6 rh-型）',
  `staff_nativeplace` varchar(50) DEFAULT NULL COMMENT '籍贯',
  `staff_nationality` varchar(50) DEFAULT NULL COMMENT '国籍',
  `staff_nation` varchar(50) DEFAULT NULL COMMENT '民族',
  `staff_chineseposition` varchar(50) DEFAULT NULL COMMENT '中文职务',
  `staff_zipcode` varchar(50) DEFAULT NULL COMMENT '联系邮编',
  `staff_Mobilephone` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `staff_politicalstatus` varchar(50) DEFAULT NULL COMMENT '政治面貌',
  `staff_entrydate` date DEFAULT NULL COMMENT '入职日期',
  `staff_becomea_regularworker` date DEFAULT NULL COMMENT '转正日期',
  `staff_probationperiod` varchar(50) DEFAULT NULL COMMENT '试用期长',
  `staff_dimissiondate` date DEFAULT NULL COMMENT '离职日期',
  `staff_technicaltitle` varchar(50) DEFAULT NULL COMMENT '技术职称',
  `staff_englishposition` varchar(50) DEFAULT NULL COMMENT '英文职务',
  `staff_address` varchar(50) DEFAULT NULL COMMENT '联系地址',
  `staff_phone` varchar(50) DEFAULT NULL COMMENT '移动电话',
  `staff_highesteducation` varchar(50) DEFAULT NULL COMMENT '最高学历',
  `staff_degree` varchar(50) DEFAULT NULL COMMENT '学位',
  `staff_graduateschool` varchar(50) DEFAULT NULL COMMENT '毕业学校',
  `staff_major` varchar(50) DEFAULT NULL COMMENT '所学专业',
  `staff_foreignlanguagelevel` varchar(50) DEFAULT NULL COMMENT '外语水平',
  `staff_physical_examinationdate` date DEFAULT NULL COMMENT '体检日期',
  `staff_atmaturitydate` date DEFAULT NULL COMMENT '到期日期',
  `staff_entercountry` date DEFAULT NULL COMMENT '入境日期',
  `staff_passport_number` varchar(50) DEFAULT NULL COMMENT '护照号码',
  `staff_contractstartdate` date DEFAULT NULL COMMENT '合同起始日期',
  `staff_contractenddate` date DEFAULT NULL COMMENT '合同终止日期',
  `staff_contractduration` varchar(50) DEFAULT NULL COMMENT '合同期长',
  `staff_email` varchar(50) DEFAULT NULL COMMENT '电子邮件',
  `staff_censusregisternumber` varchar(50) DEFAULT NULL COMMENT '户籍号码',
  `staff_censusregistezipcode` varchar(50) DEFAULT NULL COMMENT '户籍邮编',
  `staff_censusregisteraddress` varchar(50) DEFAULT NULL COMMENT '户籍地址',
  `staff_hometelephone` varchar(50) DEFAULT NULL COMMENT '家庭电话',
  `staff_homezipcode` varchar(50) DEFAULT NULL COMMENT '家庭邮编',
  `staff_homeaddress` varchar(50) DEFAULT NULL COMMENT '家庭地址',
  `staff_newphone` varchar(50) DEFAULT NULL COMMENT '现电话',
  `staff_newzipcode` varchar(50) DEFAULT NULL COMMENT '现邮编',
  `staff_newaddress` varchar(50) DEFAULT NULL COMMENT '现住址',
  `staff_emergencycontact` varchar(50) DEFAULT NULL COMMENT '紧急联系人',
  `staff_urgentcontactzipcode` varchar(50) DEFAULT NULL COMMENT '紧急联系邮编',
  `staff_emergencycontactnumber` varchar(50) DEFAULT NULL COMMENT '紧急联系电话',
  `staff_emergencycontactaddress` varchar(50) DEFAULT NULL COMMENT '紧急联系地址',
  `staff_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `staff_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `staff_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `staff_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `staff_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `staff_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `staff_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `staff_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `staff_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `staff` */

insert  into `staff`(`staff_id`,`staff_name`,`staff_english_name`,`team_id`,`staff_gender`,`staff_idnumber`,`staff_birthday`,`staff_maritalstatus`,`staff_native_place`,`staff_nativeplace`,`staff_nationality`,`staff_nation`,`staff_chineseposition`,`staff_zipcode`,`staff_Mobilephone`,`staff_politicalstatus`,`staff_entrydate`,`staff_becomea_regularworker`,`staff_probationperiod`,`staff_dimissiondate`,`staff_technicaltitle`,`staff_englishposition`,`staff_address`,`staff_phone`,`staff_highesteducation`,`staff_degree`,`staff_graduateschool`,`staff_major`,`staff_foreignlanguagelevel`,`staff_physical_examinationdate`,`staff_atmaturitydate`,`staff_entercountry`,`staff_passport_number`,`staff_contractstartdate`,`staff_contractenddate`,`staff_contractduration`,`staff_email`,`staff_censusregisternumber`,`staff_censusregistezipcode`,`staff_censusregisteraddress`,`staff_hometelephone`,`staff_homezipcode`,`staff_homeaddress`,`staff_newphone`,`staff_newzipcode`,`staff_newaddress`,`staff_emergencycontact`,`staff_urgentcontactzipcode`,`staff_emergencycontactnumber`,`staff_emergencycontactaddress`,`staff_remark`,`staff_Auditing`,`staff_yn`,`staff_custom1`,`staff_custom2`,`staff_custom3`,`staff_custom4`,`staff_custom5`,`staff_custom6`) values 
('1','肖四青',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),
('2','徐哲',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),
('3','曾浩哲',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `subject_blanket_category` */

DROP TABLE IF EXISTS `subject_blanket_category`;

CREATE TABLE `subject_blanket_category` (
  `sbc_id` varchar(50) NOT NULL COMMENT 'id（主键 唯一）',
  `sbc_name` varchar(50) DEFAULT NULL COMMENT '类别名称',
  `sbc_engname` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `sbc_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `sbc_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `sbc_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `sbc_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sbc_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sbc_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sbc_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sbc_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sbc_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`sbc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `subject_blanket_category` */

/*Table structure for table `subject_category` */

DROP TABLE IF EXISTS `subject_category`;

CREATE TABLE `subject_category` (
  `sc_id` varchar(50) NOT NULL COMMENT 'id（主键 唯一）',
  `sc_name` varchar(50) DEFAULT NULL COMMENT '类别名称',
  `sc_engname` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `sc_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `sc_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `sc_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `sc_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sc_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sc_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sc_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sc_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `sc_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`sc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `subject_category` */

/*Table structure for table `supplier` */

DROP TABLE IF EXISTS `supplier`;

CREATE TABLE `supplier` (
  `supplier_id` varchar(50) NOT NULL COMMENT '供应商编号（主键 唯一）',
  `supplier_name` varchar(50) DEFAULT NULL COMMENT '供应商全称',
  `supplier_easyname` varchar(50) DEFAULT NULL COMMENT '供应商简称',
  `supplier_engname` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `supplier_easyengname` varchar(50) DEFAULT NULL COMMENT '英文简称',
  `supplier_account_attribution` varchar(50) DEFAULT NULL COMMENT '账款归属',
  `supplier_type` varchar(50) DEFAULT NULL COMMENT '类别',
  `supplier_zone` varchar(50) DEFAULT NULL COMMENT '地区',
  `currency_id` varchar(50) DEFAULT NULL COMMENT '币别id',
  `supplier_principalman` varchar(50) DEFAULT NULL COMMENT '负责人',
  `supplier_linkman` varchar(50) DEFAULT NULL COMMENT '联系人',
  `supplier_linktela` varchar(50) DEFAULT NULL COMMENT '联系电话一',
  `supplier_linktelb` varchar(50) DEFAULT NULL COMMENT '联系电话二',
  `supplier_linktelc` varchar(50) DEFAULT NULL COMMENT '联系电话三',
  `supplier_mobilephone` varchar(50) DEFAULT NULL COMMENT '移动电话',
  `ada_id` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `bank_id` varchar(50) DEFAULT NULL COMMENT '开户银行id',
  `supplier_procurement _staff` varchar(50) DEFAULT NULL COMMENT '采购人员',
  `supplier_taxcheckno` varchar(50) DEFAULT NULL COMMENT '税务登记号',
  `supplier_capitalmoney` float DEFAULT NULL COMMENT '资本额',
  `supplier_job` varchar(50) DEFAULT NULL COMMENT '行业别',
  `supplier_email` varchar(50) DEFAULT NULL COMMENT '电子邮件',
  `supplier_webadd` varchar(100) DEFAULT NULL COMMENT '网址',
  `supplier_faxno` varchar(50) DEFAULT NULL COMMENT '传真号码',
  `supplier_cufirstsaleinput` date DEFAULT NULL COMMENT '最初销售入库日',
  `supplier_cufirstsalereturn` date DEFAULT NULL COMMENT '最初销售退货日',
  `supplier_curecentsaleinput` date DEFAULT NULL COMMENT '最近销售入库日',
  `supplier_curecentsalereturn` date DEFAULT NULL COMMENT '最近销售退货日',
  `supplier_tax_included` varchar(50) DEFAULT NULL COMMENT '单价是否含税',
  `supplier_terminationdate` date DEFAULT NULL COMMENT '终止交易日',
  `supplier_creditmoney` float DEFAULT NULL COMMENT '账款额度',
  `supplier_residuemonet` float DEFAULT NULL COMMENT '剩余额度',
  `supplier_condition` varchar(50) DEFAULT NULL COMMENT '付款条件',
  `supplier_cuendorderday` date DEFAULT NULL COMMENT '每月结账日',
  `supplier_honestlv` varchar(5) DEFAULT NULL COMMENT '信用等级',
  `supplier_invoice_type` varchar(50) DEFAULT NULL COMMENT '发票类型',
  `supplier_cufirstcollect` float DEFAULT NULL COMMENT '期初预收款',
  `supplier_houldcollect` float DEFAULT NULL COMMENT '期初应收款',
  `supplier_cuendcollect` float DEFAULT NULL COMMENT '期末预收款',
  `supplier_cuendshouldcollect` float DEFAULT NULL COMMENT '期末应收款',
  `supplier_cudecoration` varchar(50) DEFAULT NULL COMMENT '未开票金额',
  `supplier_collectiontermid` int(11) DEFAULT NULL COMMENT '预付账款科目',
  `supplier_invoicetypeid` int(11) DEFAULT NULL COMMENT '应付账款科目',
  `supplier_houldcollectmoney` int(11) DEFAULT NULL COMMENT '应付账款科目',
  `supplier_curecollectmoney` int(11) DEFAULT NULL COMMENT '应付暂估科目',
  `supplier_address_no` varchar(50) DEFAULT NULL COMMENT '地址编号',
  `supplier_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `supplier_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `supplier_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `supplier_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `supplier_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `supplier_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `supplier_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `supplier_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `supplier_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `supplier` */

insert  into `supplier`(`supplier_id`,`supplier_name`,`supplier_easyname`,`supplier_engname`,`supplier_easyengname`,`supplier_account_attribution`,`supplier_type`,`supplier_zone`,`currency_id`,`supplier_principalman`,`supplier_linkman`,`supplier_linktela`,`supplier_linktelb`,`supplier_linktelc`,`supplier_mobilephone`,`ada_id`,`bank_id`,`supplier_procurement _staff`,`supplier_taxcheckno`,`supplier_capitalmoney`,`supplier_job`,`supplier_email`,`supplier_webadd`,`supplier_faxno`,`supplier_cufirstsaleinput`,`supplier_cufirstsalereturn`,`supplier_curecentsaleinput`,`supplier_curecentsalereturn`,`supplier_tax_included`,`supplier_terminationdate`,`supplier_creditmoney`,`supplier_residuemonet`,`supplier_condition`,`supplier_cuendorderday`,`supplier_honestlv`,`supplier_invoice_type`,`supplier_cufirstcollect`,`supplier_houldcollect`,`supplier_cuendcollect`,`supplier_cuendshouldcollect`,`supplier_cudecoration`,`supplier_collectiontermid`,`supplier_invoicetypeid`,`supplier_houldcollectmoney`,`supplier_curecollectmoney`,`supplier_address_no`,`supplier_remark`,`supplier_Auditing`,`supplier_yn`,`supplier_custom1`,`supplier_custom2`,`supplier_custom3`,`supplier_custom4`,`supplier_custom5`,`supplier_custom6`) values 
('001','刘成小蛋糕','刘小蛋','Liu','L',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),
('002','华为','华为','HuaWei','HuaWei',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),
('003','阿里巴巴','阿里','Alibaba','Alibaba',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),
('004','阿迪达斯','阿迪达斯','Addias','Addias',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `supplier_type` */

DROP TABLE IF EXISTS `supplier_type`;

CREATE TABLE `supplier_type` (
  `st_id` varchar(50) NOT NULL COMMENT 'id（主键 唯一）',
  `st_name` varchar(50) DEFAULT NULL COMMENT '类别名称',
  `st_engname` varchar(32) DEFAULT NULL COMMENT '英文名称',
  `st_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `st_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `st_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `st_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `st_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `st_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `st_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `st_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `st_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`st_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `supplier_type` */

/*Table structure for table `tax_items` */

DROP TABLE IF EXISTS `tax_items`;

CREATE TABLE `tax_items` (
  `ti_id` varchar(50) NOT NULL COMMENT '编号（主键 唯一）',
  `ti_name` varchar(50) DEFAULT NULL COMMENT '名称',
  `ti_english_name` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `ti_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `ti_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `ti_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `ti_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ti_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ti_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ti_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ti_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `ti_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`ti_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tax_items` */

/*Table structure for table `team` */

DROP TABLE IF EXISTS `team`;

CREATE TABLE `team` (
  `team_id` varchar(50) NOT NULL COMMENT '部门编号（主键 唯一）',
  `team_name` varchar(32) DEFAULT NULL COMMENT '部门名称',
  `team_english_name` varchar(32) DEFAULT NULL COMMENT '部门英文名称',
  `team_abate` date DEFAULT NULL COMMENT '失效日期',
  `team_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `team_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `team_yn` varchar(50) DEFAULT NULL COMMENT '是否删除（0 否 1 是 ，默认0）',
  `team_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏一',
  `team_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏二',
  `team_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏三',
  `team_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏四',
  `team_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏五',
  `team_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏六',
  PRIMARY KEY (`team_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `team` */

insert  into `team`(`team_id`,`team_name`,`team_english_name`,`team_abate`,`team_remark`,`team_Auditing`,`team_yn`,`team_custom1`,`team_custom2`,`team_custom3`,`team_custom4`,`team_custom5`,`team_custom6`) values 
('20200131001','财务部','caiwubus',NULL,NULL,NULL,'0','20200131',NULL,NULL,NULL,NULL,NULL),
('20200131002','直销部','zhixiaobu',NULL,NULL,NULL,'0','20200131',NULL,NULL,NULL,NULL,NULL),
('20200131003','渠道部','qudaobu',NULL,NULL,NULL,'0','20200131',NULL,NULL,NULL,NULL,NULL),
('20200214001','daf','',NULL,'','','1','20200214','','','','','');

/*Table structure for table `updown_program` */

DROP TABLE IF EXISTS `updown_program`;

CREATE TABLE `updown_program` (
  `up_id` varchar(50) NOT NULL,
  `up_name` varchar(50) DEFAULT NULL,
  `up_auditing` varchar(50) DEFAULT NULL,
  `up_yn` varchar(50) DEFAULT '0',
  `up_custom1` varchar(50) DEFAULT NULL,
  `up_custom2` varchar(50) DEFAULT NULL,
  `up_custom3` varchar(50) DEFAULT NULL,
  `up_custom4` varchar(50) DEFAULT NULL,
  `up_custom5` varchar(50) DEFAULT NULL,
  `up_custom6` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`up_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `updown_program` */

insert  into `updown_program`(`up_id`,`up_name`,`up_auditing`,`up_yn`,`up_custom1`,`up_custom2`,`up_custom3`,`up_custom4`,`up_custom5`,`up_custom6`) values 
('1','现金','0','0',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `warehouse` */

DROP TABLE IF EXISTS `warehouse`;

CREATE TABLE `warehouse` (
  `warehouse_id` varchar(50) NOT NULL COMMENT '仓库id（主键 唯一）',
  `warehouse_name` varchar(50) DEFAULT NULL COMMENT '仓库名称',
  `warehouse_easy_name` varchar(50) DEFAULT NULL COMMENT '仓库简称',
  `warehouse_engname` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `warehouse_linkman` varchar(50) DEFAULT NULL COMMENT '联系人',
  `warehouse_linktel` varchar(50) DEFAULT NULL COMMENT '电话',
  `warehouse_address` varchar(50) DEFAULT NULL COMMENT '地址',
  `warehouse_decoration` varchar(50) DEFAULT NULL COMMENT '备注',
  `warehouse_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `warehouse_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `warehouse_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `warehouse_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `warehouse_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `warehouse_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `warehouse_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `warehouse_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`warehouse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `warehouse` */

/*Table structure for table `warehouse_detail` */

DROP TABLE IF EXISTS `warehouse_detail`;

CREATE TABLE `warehouse_detail` (
  `wd_id` varchar(50) NOT NULL COMMENT '仓库明细id（主键 唯一）',
  `warehouse_id` int(50) DEFAULT NULL COMMENT '仓库id',
  `mt_id` int(11) DEFAULT NULL COMMENT '物料id',
  `wd_unit_rice` float DEFAULT NULL COMMENT '单价（成本）',
  `wd_number` int(11) DEFAULT NULL COMMENT '数量',
  `wd_inorout` int(11) DEFAULT NULL COMMENT '进出库状态（0,1表示）',
  `wd_lastbalancenumber` int(11) DEFAULT NULL COMMENT '上期结存数（期初数量+入库数量-出库数量）',
  `wd_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `wd_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `wd_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `wd_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `wd_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `wd_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `wd_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `wd_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`wd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `warehouse_detail` */

/*Table structure for table `zone` */

DROP TABLE IF EXISTS `zone`;

CREATE TABLE `zone` (
  `zone_id` varchar(50) NOT NULL COMMENT '地区id（主键 唯一）',
  `zone_name` varchar(50) DEFAULT NULL COMMENT '地区名称',
  `zone_english_name` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `zone_remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `zone_Auditing` varchar(50) DEFAULT NULL COMMENT '是否审核',
  `zone_yn` varchar(50) DEFAULT '0' COMMENT '是否删除（0 否 1 是 ，默认0）',
  `zone_custom1` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `zone_custom2` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `zone_custom3` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `zone_custom4` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `zone_custom5` varchar(50) DEFAULT NULL COMMENT '自定栏',
  `zone_custom6` varchar(50) DEFAULT NULL COMMENT '自定栏',
  PRIMARY KEY (`zone_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zone` */

insert  into `zone`(`zone_id`,`zone_name`,`zone_english_name`,`zone_remark`,`zone_Auditing`,`zone_yn`,`zone_custom1`,`zone_custom2`,`zone_custom3`,`zone_custom4`,`zone_custom5`,`zone_custom6`) values 
('20200202001','东北区',NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL,NULL,NULL),
('20200210001','西北区','','','','0','20200210','','','','','');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
