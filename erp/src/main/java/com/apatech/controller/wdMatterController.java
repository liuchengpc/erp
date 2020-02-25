package com.apatech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Customer;
import com.apatech.domain.Matter;
import com.apatech.domain.wdMatter;
import com.apatech.service.MatterService;

@Controller
@RequestMapping("wdMatterController")
public class wdMatterController {
	@Autowired
	private MatterService dao;
	
	//查询所有物料
		@RequestMapping("selectAll")
		@ResponseBody
		public List<wdMatter> selectAll(){
			return dao.selectAll();
		}
		
		
}
