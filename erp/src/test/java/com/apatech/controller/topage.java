package com.apatech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.util.uuid;

import com.apatech.domain.Shop;

@Controller
@RequestMapping("topage")
public class topage {	
	@RequestMapping("/tzs")
	public String selectAll(String tz) {
		System.out.println("进入跳转");
		System.out.println(tz);
		return tz;
	}
	@RequestMapping("/login")
	public String login() {
		System.out.println("进入login");
		return "login";
	}
	@RequestMapping("/login2")
	public String login2() {
		System.out.println("进入login2");
		return "login2";
	}
	@RequestMapping("/accountindex")
	public String accountindex() {
		System.out.println("进入accountindex");
		return "accountindex";
	}
	@RequestMapping("/AddForm")
	public String AddForm() {
		System.out.println("进入AddForm");
		return "AddForm";
	}
	
	
	/**
	 * 生成编号
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "uuid",method = RequestMethod.GET)
	@ResponseBody
	public String uuid() {
		System.out.println("进入page/claim/addpurchase_list");
		uuid s=new uuid();		
		System.out.println(s.getCode());
		return s.getCode();
	}	
	@RequestMapping("page/claim/staff_Update")
	public String staff_Update() {
		System.out.println("进入staff_Update");
		return "page/claim/staff_Update";
	}
	@RequestMapping("page/claim/showpurchase_list")
	public String showpurchase_list() {
		System.out.println("进入page/claim/showpurchase_list");
		return "page/claim/showpurchase_list";
	}
	@RequestMapping("page/claim/addpurchase_list")
	public String addpurchase_list() {
		System.out.println("进入page/claim/addpurchase_list");
		return "page/claim/addpurchase_list";
	}
	@RequestMapping("page/claim/updatepurchase_list")
	public String updatepurchase_list() {
		System.out.println("进入page/claim/updatepurchase_list");
		return "page/claim/updatepurchase_list";
	}
	@RequestMapping("page/claim/users_img")
	public String users_img() {
		System.out.println("进入page/claim/users_img");
		return "page/claim/users_img";
	}
	@RequestMapping("page/claim/staff_Insert")
	public String staff_Insert() {
		System.out.println("进入page/claim/staff_Insert");
		return "page/claim/staff_Insert";
	}
	@RequestMapping("page/common/body_menu6")
	public String body_menu6() {
		System.out.println("进入page/common/body_menu6");
		return "page/common/body_menu6";
	}
	@RequestMapping("page/common/body_menu7")
	public String body_menu7() {
		System.out.println("进入page/common/body_menu7");
		return "page/common/body_menu7";
	}
	@RequestMapping("page/claim/users_home")
	public String accountinfo() {
		System.out.println("进入page/claim/users_home");
		return "page/claim/users_home";
	}
	
	@RequestMapping("page/claim/shop_Insert")
	public String shop_Insert() {
		System.out.println("进入page/claim/shop_Insert");
		return "page/claim/shop_Insert";
	}
	@RequestMapping("page/claim/shop_Query")
	public String shop_Query() {
		System.out.println("进入page/claim/shop_Query");
		return "page/claim/shop_Query";
	}
	@RequestMapping("page/claim/shop_Update")
	public String shop_Update() {
		System.out.println("进入page/claim/shop_Update");
		return "page/claim/shop_Update";
	}
	@RequestMapping("page/common/body_menu")
	public String body_menu() {
		System.out.println("进入page/common/body_menu");
		return "page/common/body_menu";
	}
	@RequestMapping("page/claim/store_management")
	public String store_management() {
		System.out.println("进入page/claim/store_management");
		return "page/claim/store_management";
	}
	@RequestMapping("page/claim/position")
	public String position() {
		System.out.println("进入page/claim/position");
		return "page/claim/position";
	}
	@RequestMapping("page/claim/employee_management")
	public String employee_management() {
		System.out.println("进入page/claim/employee_management");
		return "page/claim/employee_management";
	}
	@RequestMapping("page/common/body_menu2")
	public String body_menu2() {
		System.out.println("进入page/common/body_menu2");
		return "page/common/body_menu2";
	}
	@RequestMapping("page/claim/shop_type")
	public String shop_type() {
		System.out.println("进入page/claim/shop_type");
		return "page/claim/shop_type";
	}
	@RequestMapping("page/claim/shop_managerment")
	public String shop_managerment() {
		System.out.println("进入page/claim/shop_managerment");
		return "page/claim/shop_managerment";
	}
	@RequestMapping("shop_upload")
	public String shop_upload() {
		System.out.println("进入shop_upload");
		return "shop_upload";
	}
	@RequestMapping("wqx")
	public String wqx() {
		System.out.println("进入wqx");
		return "wqx";
	}
	@RequestMapping("shop_upload2")
	public String shop_upload2() {
		System.out.println("进入shop_upload2");
		return "shop_upload2";
	}
	@RequestMapping("page/claim/supplier")
	public String supplier() {
		System.out.println("进入page/claim/supplier");
		return "page/claim/supplier";
	}
	@RequestMapping("page/claim/purchase_list")
	public String purchase_list() {
		System.out.println("进入page/claim/purchase_list");
		return "page/claim/purchase_list";
	}
	@RequestMapping("page/claim/cashRegister_Home")
	public String cashRegister_Home() {
		System.out.println("进入page/claim/cashRegister_Home");
		return "page/claim/cashRegister_Home";
	}
	@RequestMapping("page/claim/privilege_Update")
	public String privilege_Update() {
		System.out.println("进入page/claim/privilege_Update");
		return "page/claim/privilege_Update";
	}
	@RequestMapping("page/claim/privilege_Insert")
	public String privilege_Insert() {
		System.out.println("进入page/claim/privilege_Insert");
		return "page/claim/privilege_Insert";
	}
	@RequestMapping("page/common/body_menu4")
	public String body_menu4() {
		System.out.println("进入page/common/body_menu4");
		return "page/common/body_menu4";
	}
	@RequestMapping("page/claim/salesStatistics")
	public String salesStatistics() {
		System.out.println("进入page/claim/salesStatistics");
		return "page/claim/salesStatistics";
	}
	@RequestMapping("page/claim/RevenueProfile")
	public String RevenueProfile() {
		System.out.println("进入page/claim/RevenueProfile");
		return "page/claim/RevenueProfile";
	}
	@RequestMapping("page/claim/PopularGoods")
	public String PopularGoods() {
		System.out.println("进入page/claim/PopularGoods");
		return "page/claim/PopularGoods";
	}
	@RequestMapping("page/claim/PerformanceRanking")
	public String PerformanceRanking() {
		System.out.println("进入page/claim/PerformanceRanking");
		return "page/claim/PerformanceRanking";
	}
	@RequestMapping("page/claim/CashierHandover")
	public String CashierHandover() {
		System.out.println("进入page/claim/CashierHandover");
		return "page/claim/CashierHandover";
	}
	@RequestMapping("page/common/body_menu5")
	public String body_menu5() {
		System.out.println("进入page/common/body_menu5");
		return "page/common/body_menu5";
	}
	@RequestMapping("page/claim/member_info")
	public String member_info() {
		System.out.println("进入page/claim/member_info");
		return "page/claim/member_info";
	}
	@RequestMapping("page/claim/level_set")
	public String level_set() {
		System.out.println("进入page/claim/level_set");
		return "page/claim/level_set";
	}
	@RequestMapping("page/claim/integer_set")
	public String integer_set() {
		System.out.println("进入page/claim/integer_set");
		return "page/claim/integer_set";
	}
	@RequestMapping("page/claim/recharge_deduction")
	public String recharge_deduction() {
		System.out.println("进入page/claim/recharge_deduction");
		return "page/claim/recharge_deduction";
	}
	@RequestMapping("page/claim/transaction_record")
	public String transaction_record() {
		System.out.println("进入page/claim/transaction_record");
		return "page/claim/transaction_record";
	}
	@RequestMapping("page/common/footer")
	public String footer() {
		System.out.println("进入page/common/footer");
		return "page/common/footer";
	}
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/NewFile")
	public String NewFile() {
		return "NewFile";
	}
	@RequestMapping("/add")
	public String add() {
		return "add";
	}
	@RequestMapping("/update")
	public String update() {
		return "update";
	}
	
	@RequestMapping("/toupload")
	public String toupload() {
		return "upload";
	}
}
























//收银开单		/sykd	
//编辑开单		/bjkd	
//删除开单		/sckd	
//操作发货		/czfh	
//查看定单		/ckdd	
//营收概况		/ysgk	
//热销商品		/rxsp	
//业绩排名		/yjpm	
//月损益表		/ysyb	
//增加会员		/zjhy	
//编辑会员		/bjhy	
//删除会员		/schy	
//会员充值		/hycz	
//增加商品		/zjsp	
//编辑商品		/bjsp	
//删除商品		/scsp	
//入仓单			/rcd	
//出货单			/ccd	
//调拨单			/dbd	
//退货单			/thd	
//报损单			/psd	
//盘点单			/pdd	
//供应商			/gys	
//订货单			/dhd	
//采购单			/cgd	
//合同审核		/htsh	
//店铺信息		/dpxx	
//职位权限		/zwqx	
//员工管理		/yggl	


///topage/login
///topage/accountindex
///topage/AddForm
///topage/uuid
///topagepage/claim/staff_Update
///topagepage/claim/showpurchase_list
///topagepage/claim/addpurchase_list
///topagepage/claim/updatepurchase_list
///topagepage/claim/users_img
///topagepage/claim/staff_Insert
///topagepage/common/body_menu6
///topagepage/claim/users_home
///topagepage/claim/shop_Insert
///topagepage/claim/shop_Query
///topagepage/claim/shop_Update
///topagepage/common/body_menu
///topagepage/claim/store_management
///topagepage/claim/position
///topagepage/claim/employee_management
///topagepage/common/body_menu2
///topagepage/claim/shop_type
///topagepage/claim/shop_managerment
///topageshop_upload
///topageshop_upload2
///topagepage/claim/supplier
///topagepage/claim/purchase_list
///topagepage/claim/cashRegister_Home
///topagepage/claim/privilege_Update
///topagepage/claim/privilege_Insert
///topagepage/common/body_menu4
///topagepage/claim/salesStatistics
///topagepage/claim/RevenueProfile
///topagepage/claim/PopularGoods
///topagepage/claim/PerformanceRanking
///topagepage/claim/CashierHandover
///topagepage/common/body_menu5
///topagepage/claim/member_info
///topagepage/claim/level_set
///topagepage/claim/integer_set
///topagepage/claim/recharge_deduction
///topagepage/claim/transaction_record
///topagepage/common/footer
///topage/index
///topage/NewFile
///topage/add
///topage/update
///topage/toupload