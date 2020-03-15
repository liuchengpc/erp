package com.apatech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apatech.domain.Staff;
import com.apatech.domain.wdStaff;
import com.apatech.service.StaffService;
@Controller
@RequestMapping("wdStaffController")
public class wdStaffController {
	@Autowired
	private StaffService dao;
	
	@RequestMapping("/selectAll")
	@ResponseBody
	public List<wdStaff> selectAll(){
		return dao.selectAlls();
	}
}
