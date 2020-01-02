package com.apatech.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.apatech.domain.Role;
import com.apatech.domain.Shop;
import com.apatech.domain.Users;
import com.apatech.service.ShopService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("ShopController")
public class ShopController {
	@Autowired
	private ShopService dao;	
	
	@RequestMapping(value="queryshopnameByshopid",method=RequestMethod.GET)
	@ResponseBody
	public Shop queryshopnameByshopid(String shopid) {
		
		return dao.queryshopnameByshopid(shopid);
	}
	
	
	@RequestMapping(value="queryByRoleName",method=RequestMethod.GET)
	@ResponseBody
	public List<Role> queryByRoleName() {
		
		return dao.queryByRoleName();
	}
	
	/**
	 * 查询所有
	 * 
	 * */
	@RequestMapping(value="queryByAll2",method=RequestMethod.GET)
	@ResponseBody
	public List<Shop> queryByAll(){
		
		
		return dao.queryByAll2();
	}
	
	/**
	 * 图片文件上传
	 * 
	 * */
	@RequestMapping(value="updateShopImg",method=RequestMethod.POST)
	@ResponseBody
	public String updateShopImg(MultipartFile [] files2,Shop shop){
		System.out.println("进来图片修改上传");
		File directory = new File("/E:/images/");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : files2) {
				System.out.println("图片上传成功");
				String url = "/E:/images/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
				System.out.println(l.getOriginalFilename());
				shop.setShopimg(l.getOriginalFilename());
			}
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		dao.updateByPrimaryKeySelective(shop);
		return "success";
	}
	
	/**
	 * 根据ID查询店铺信息
	 * 
	 * */
	@RequestMapping(value="queryByshopid",method=RequestMethod.GET)
	@ResponseBody
	public Shop queryByshopid(String shopid) {
		Shop shop = dao.selectByPrimaryKey(shopid);
		System.out.println("进来了");
		return shop;
	}
	
	/**
	 * 查询店铺的员工数量
	 * 
	 * */
	@RequestMapping(value="queryByCount",method=RequestMethod.GET)
	@ResponseBody
	public int queryByCount(String shopid) {
		
		return dao.queryByCount(shopid);
	}
	
	
	/**
	 * 也分多条件查询
	 * 
	 * 
	 * */
	@RequestMapping(value="queryByShopPage",method=RequestMethod.GET)
	@ResponseBody
	public PageInfo<Shop> queryByShopPage(Integer pageNum,Integer pageSize,Shop shop){
		System.out.println("进来了Shop分页");
		System.out.println(shop);
		System.out.println(dao.queryByShopPage(pageNum, pageSize, shop));
		return dao.queryByShopPage(pageNum, pageSize,shop);
	}
	
	
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/selectAll",method = RequestMethod.GET)
	@ResponseBody
	public List<Shop> selectAll(Model model) {
		System.out.println("进入ShopController查询全部");
		List<Shop> list = dao.selectAll();
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Shop selectByPrimaryKey(String shopid) {
		System.out.println("进入ShopController根据主键查询");
		System.out.println("shopid="+shopid);
    	return dao.selectByPrimaryKey(shopid);
    }
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Shop> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入ShopController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Shop> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Shop record) {
		System.out.println("进入ShopController新增");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String,String>();
    	int i=dao.insertSelective(record);
    	if (i>0) {
			map.put("code", "1");
			map.put("message", "新增成功！");
		}else {
			map.put("code", "2");
			map.put("message", "新增失败！");
		}
		return map;
    }

	/**
	 * 根据主键修改
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "updateByPrimaryKeySelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Shop record) {
		System.out.println("进入ShopController根据主键修改");
		System.out.println("实体："+record.toString());
		Map<String, String> map=new HashMap<String, String>();
    	int i=dao.updateByPrimaryKeySelective(record);
    	if (i>0) {
			map.put("code", "1");
			map.put("message", "修改成功！");
		}else {
			map.put("code", "2");
			map.put("message", "修改失败！");
		}
		return map;
    }
	/**
	 * 根据主键删除
	 * @param billid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "deleteByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Map<String, String> deleteByPrimaryKey(String shopid,Model model) {
		System.out.println("进入ShopController根据主键删除");
		System.out.println("shopid："+shopid);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(shopid);
		if (i>0) {
			map.put("code", "1");
			map.put("message", "删除成功！");
		}else {
			map.put("code", "2");
			map.put("message", "删除失败！");
		}
		return map;
    }

}