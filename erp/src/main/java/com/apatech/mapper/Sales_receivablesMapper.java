package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Sales_receivables;
import com.apatech.domain.Sales_receivables_customerLC;

public interface Sales_receivablesMapper {
	List<Sales_receivables> selectAll();
	 
	 @Select("SELECT \r\n" + 
	 		"CASE\r\n" + 
	 		"WHEN COUNT(*)>98 THEN COUNT(*)+1\r\n" + 
	 		"WHEN COUNT(*)>8 THEN CONCAT('0',COUNT(*)+1)\r\n" + 
	 		"ELSE CONCAT('00',COUNT(*)+1)\r\n" + 
	 		"END \r\n" + 
	 		"FROM\r\n" + 
	 		"Sales_receivables WHERE sr_custom1=#{billdate}")
   String getno(@Param("billdate")String billdate);
	 
	 List<Sales_receivables> selectAllpagebyidlc(@Param("srPcId")String srPcId);//查商品记录
	 
	 List<Sales_receivables> selectAllpagebyidlc2(@Param("srCustom10")String srCustom10);//查详表

	 
	 @Select("SELECT\r\n" + 
	 		"a.customer_id customerId ,a.customer_name customerName,a.customer_easyname customerEasyname,a.customer_english_name customerEnglishName,\r\n" + 
	 		"a.customer_charge_person customerChargePerson,a.customer_account_ownership customerAccountOwnership,a.customer_type customerType,a.currency_id currencyId,\r\n" + 
	 		"a.customer_principalman customerPrincipalman,a.customer_linkman customerLinkman,a.customer_linktela customerLinktela,a.customer_linktelb customerLinktelb,\r\n" + 
	 		"a.customer_linktelc customerLinktelc,a.customer_mobilephone customerMobilephone,a.ada_id adaId,a.customer_taxcheckno customerTaxcheckno,a.customer_capitalmoney customerCapitalmoney,\r\n" + 
	 		"a.customer_job customerJob,a.customer_email customerEmail,a.customer_webadd customerWebadd,a.customer_faxno customerFaxno,a.customer_cufirstsaleout customerCufirstsaleout,\r\n" + 
	 		"a.customer_cufirstsalereturn customerCufirstsalereturn,a.customer_curecentsaleout customerCurecentsaleout,a.customer_curecentsalereturn customerCurecentsalereturn,a.customer_curecentvisit customerCurecentvisit,\r\n" + 
	 		"a.customer_cuordervisit customerCuordervisit,a.customer_discountpoint customerDiscountpoint,a.customer_salelv customerSalelv,a.customer_cuiftax customerCuiftax,a.customer_latentcusno customerLatentcusno,\r\n" + 
	 		"a.customer_tanddate customerTanddate,a.endbusinessday endbusinessday,a.customer_creditmoney customerCreditmoney,a.customer_residuemonet customerResiduemonet,a.customer_cuendorderday customerCuendorderday,\r\n" + 
	 		"a.customer_honestlv customerHonestlv,a.customer_cufirstcollect customerCufirstcollect,a.customer_houldcollect customerHouldcollect,a.customer_cuendcollect customerCuendcollect,a.cuendshouldcollect cuendshouldcollect,\r\n" + 
	 		"a.customer_cudecoration customerCudecoration,a.Receivable_id receivableId,a.it_id itId,a.It_Accounts_eceivable_subject itAccountsEceivableSubject,a.It_deposit_received_subject itDepositReceivedSubject,a.bank_id bankId,\r\n" + 
	 		"a.customer_Auditing customerAuditing,a.customer_yn customerYn,a.customer_custom1 customerCustom1,a.customer_custom2 customerCustom2,\r\n" + 
	 		"a.customer_custom3 customerCustom3,a.customer_custom4 customerCustom4,a.customer_custom5 customerCustom5,a.customer_custom6 customerCustom6,\r\n" + 
	 		"b.sr_id SRID,b.sr_type srType,b.sr_number srNumber,b.sr_date srDate,b.sr_pc_id srPcId,\r\n" + 
	 		"b.sr_pc_name srPcName,b.sr_team_id srTeamId,b.sr_team_name srTeamName,b.sr_buyer srBuyer,\r\n" + 
	 		"b.sr_project_name srProjectName,b.sr_currency srCurrency,b.sr_exchange_rate srExchangeRate,\r\n" + 
	 		"b.sr_payablesmain_price  srPayablesmainPrice,b.sr_currentbalance srCurrentbalance,b.sr_discountamount srDiscountamount,\r\n" + 
	 		"b.sr_amountcharged srAmountcharged,b.sr_offsetamount srOffsetamount,b.sr_auditing srAuditing,b.sr_yn srYn,b.sr_custom1 srCustom1,b.sr_custom2 srCustom2,b.sr_custom3 srCustom3,b.sr_custom4 srCustom4,\r\n" + 
	 		"b.sr_custom5 srCustom5,b.sr_custom6 srCustom6,b.sr_custom7 srCustom7,b.sr_custom8 srCustom8, b.sr_custom9 srCustom9,b.sr_custom10 srCustom10\r\n" + 
	 		"FROM customer a\r\n" + 
	 		"INNER JOIN sales_receivables b ON a.customer_id=b.sr_pc_id \r\n" + 
	 		"WHERE b.sr_custom7=0 AND b.sr_currentbalance>0 "
	 		+ "GROUP BY a.customer_id")
    List<Sales_receivables_customerLC> selectAlllc();

    
    @Select("SELECT\r\n" + 
    		"a.customer_id customerId ,a.customer_name customerName,a.customer_easyname customerEasyname,a.customer_english_name customerEnglishName,\r\n" + 
    		"a.customer_charge_person customerChargePerson,a.customer_account_ownership customerAccountOwnership,a.customer_type customerType,a.currency_id currencyId,\r\n" + 
    		"a.customer_principalman customerPrincipalman,a.customer_linkman customerLinkman,a.customer_linktela customerLinktela,a.customer_linktelb customerLinktelb,\r\n" + 
    		"a.customer_linktelc customerLinktelc,a.customer_mobilephone customerMobilephone,a.ada_id adaId,a.customer_taxcheckno customerTaxcheckno,a.customer_capitalmoney customerCapitalmoney,\r\n" + 
    		"a.customer_job customerJob,a.customer_email customerEmail,a.customer_webadd customerWebadd,a.customer_faxno customerFaxno,a.customer_cufirstsaleout customerCufirstsaleout,\r\n" + 
    		"a.customer_cufirstsalereturn customerCufirstsalereturn,a.customer_curecentsaleout customerCurecentsaleout,a.customer_curecentsalereturn customerCurecentsalereturn,a.customer_curecentvisit customerCurecentvisit,\r\n" + 
    		"a.customer_cuordervisit customerCuordervisit,a.customer_discountpoint customerDiscountpoint,a.customer_salelv customerSalelv,a.customer_cuiftax customerCuiftax,a.customer_latentcusno customerLatentcusno,\r\n" + 
    		"a.customer_tanddate customerTanddate,a.endbusinessday endbusinessday,a.customer_creditmoney customerCreditmoney,a.customer_residuemonet customerResiduemonet,a.customer_cuendorderday customerCuendorderday,\r\n" + 
    		"a.customer_honestlv customerHonestlv,a.customer_cufirstcollect customerCufirstcollect,a.customer_houldcollect customerHouldcollect,a.customer_cuendcollect customerCuendcollect,a.cuendshouldcollect cuendshouldcollect,\r\n" + 
    		"a.customer_cudecoration customerCudecoration,a.Receivable_id receivableId,a.it_id itId,a.It_Accounts_eceivable_subject itAccountsEceivableSubject,a.It_deposit_received_subject itDepositReceivedSubject,a.bank_id bankId,\r\n" + 
    		"a.customer_Auditing customerAuditing,a.customer_yn customerYn,a.customer_custom1 customerCustom1,a.customer_custom2 customerCustom2,\r\n" + 
    		"a.customer_custom3 customerCustom3,a.customer_custom4 customerCustom4,a.customer_custom5 customerCustom5,a.customer_custom6 customerCustom6,\r\n" + 
    		"b.sr_id SRID,b.sr_type srType,b.sr_number srNumber,b.sr_date srDate,b.sr_pc_id srPcId,\r\n" + 
    		"b.sr_pc_name srPcName,b.sr_team_id srTeamId,b.sr_team_name srTeamName,b.sr_buyer srBuyer,\r\n" + 
    		"b.sr_project_name srProjectName,b.sr_currency srCurrency,b.sr_exchange_rate srExchangeRate,\r\n" + 
    		"b.sr_payablesmain_price  srPayablesmainPrice,b.sr_currentbalance srCurrentbalance,b.sr_discountamount srDiscountamount,\r\n" + 
    		"b.sr_amountcharged srAmountcharged,b.sr_offsetamount srOffsetamount,b.sr_auditing srAuditing,b.sr_yn srYn,b.sr_custom1 srCustom1,b.sr_custom2 srCustom2,b.sr_custom3 srCustom3,b.sr_custom4 srCustom4,\r\n" + 
    		"b.sr_custom5 srCustom5,b.sr_custom6 srCustom6,b.sr_custom7 srCustom7,b.sr_custom8 srCustom8, b.sr_custom9 srCustom9,b.sr_custom10 srCustom10\r\n" + 
    		"FROM customer a\r\n" + 
    		"INNER JOIN sales_receivables b ON a.customer_id=b.sr_pc_id \r\n" + 
    		"WHERE b.sr_custom7=0 AND b.sr_currentbalance>0 and a.customer_id=#{customerId}")
    List<Sales_receivables_customerLC> selectAlllc2(String customerId);

	 @Select("select sr_auditing from Sales_receivables where sr_number=#{bitten}")
	 String selectbysh(String bitten);
	
    int deleteByPrimaryKey(Integer srId);
    
    int deleteByzbidlc(String receivablesbillId);

    int insert(Sales_receivables record);

    int insertSelective(Sales_receivables record);

    Sales_receivables selectByPrimaryKey(Integer srId);

    int updateByPrimaryKeySelective(Sales_receivables record);

    int updateByPrimaryKey(Sales_receivables record);
}