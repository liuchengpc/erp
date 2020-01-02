package com.apatech.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.apatech.domain.Users;
import com.apatech.service.UsersService;
import com.apatech.util.RandomValidateCode;
import com.apatech.util.RandomValidateCodeUtil;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("UsersController")
public class UsersController {
	@Autowired
	private UsersService dao;	
	
	private String sfile = "";//存放图片名称
	
	/**
	 * 删除
	 * @param student
	 * @return
	 */
	@RequestMapping(value="deleteUser",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,String> deleteUser(String userid) {
		Map<String,String> map = new HashMap<String,String>();
		int i = dao.deleteUser(userid);
		if (i>0) {
			map.put("code", "1");
			map.put("message", "删除成功！");
		}else {
			map.put("code", "2");
			map.put("message", "删除失败！");
		}
		
		return map;
	}
	
	/**
	 * 先删除，后新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertdeleteUser",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertdeleteUser( Users user) {
		System.out.println("进入UsersController新增");
		System.out.println("实体："+user.toString());
		Map<String, String> map=new HashMap<String,String>();
    	int i=dao.insertdeleteUser(user);
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
	 * 根据userID查询
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "queryByUserIDBykey",method = RequestMethod.GET)
	@ResponseBody
	public Users queryByUserIDBykey(String userid) {
		
		return dao.queryByUserIDBykey(userid);
	}
	
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertUser",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertUser( Users user) {
		System.out.println("进入UsersController新增");
		System.out.println("实体："+user.toString());
		Map<String, String> map=new HashMap<String,String>();
    	int i=dao.insertUser(user);
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
	 * 查询工号是否存在
	 * @param model
	 * @return
	 */
	@RequestMapping(value="queryUserByCount",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,String> queryUserByCount(String userid) {
		Map<String,String> map = new HashMap<String, String>();
		int i = dao.queryUserByCount(userid);
		if(i>0) {
			map.put("code", "1");
			map.put("message", "账号已存在！请重新输入!");
		}else {
			map.put("code", "2");
			map.put("message", "账号可用");
		}
		return map;
	}
		
	/**
	 * 分页查询员工
	 * @param model
	 * @return
	 */
	@RequestMapping(value="queryByUserPage",method=RequestMethod.GET)
	@ResponseBody
	public PageInfo<Users> queryByUserPage(Integer pageNum,Integer pageSize,Users user){
		System.out.println("职位ID："+user.getRoleid());
		System.out.println("店铺ID："+user.getShopid());
		
		return dao.queryByUserPage(pageNum, pageSize, user);
	}
		
	/**
	 * 查询全部
	 * @param model
	 * @return
	 */
	@RequestMapping("/selectAll")
	@ResponseBody
	public List<Users> selectAll(Model model) {
		System.out.println("进入UsersController查询全部");
		List<Users> list = dao.selectAll();
		return list;
	}
	/**
	 * 根据主键查询
	 * @param billid
	 * @return
	 */
	@RequestMapping(value = "selectByPrimaryKey",method = RequestMethod.GET)
	@ResponseBody
    public Users selectByPrimaryKey(String Users) {
		System.out.println("进入UsersController根据主键查询");
		System.out.println("Users="+Users);
    	return dao.selectByPrimaryKey(Users);
    }
	/**
	 * 分页
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "selectAllpage",method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Users> selectAllpage( Integer pageNum,Integer pageSize){
		System.out.println("进入UsersController分页");
		System.out.println(pageNum+"/"+pageSize);
    	PageInfo<Users> page=dao.selectAllpage(pageNum, pageSize);
    	return page;
    }
	/**
	 * 新增
	 * @param student
	 * @return
	 */
	@RequestMapping(value = "insertSelective",method = RequestMethod.POST)
	@ResponseBody
    public Map<String, String> insertSelective(@RequestBody Users record) {
		System.out.println("进入UsersController新增");
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
    public Map<String, String> updateByPrimaryKeySelective(@RequestBody Users record) {
		System.out.println("进入UsersController根据主键修改");
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
    public Map<String, String> deleteByPrimaryKey(String Users,Model model) {
		System.out.println("进入UsersController根据主键删除");
		System.out.println("Users："+Users);
		Map<String, String> map=new HashMap<String,String>();
    	int i =dao.deleteByPrimaryKey(Users);
		if (i>0) {
			map.put("code", "1");
			map.put("message", "删除成功！");
		}else {
			map.put("code", "2");
			map.put("message", "删除失败！");
		}
		return map;
    }

	@RequestMapping(value="updateUsers",method=RequestMethod.POST)
	@ResponseBody
	public String updateUsers(MultipartFile [] files,Users users){	
			
		File directory = new File("/E:/images");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : files) {
				String url = "/E:/images/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
				System.out.println(l.getOriginalFilename()+"hhh");
				users.setHeadportrait(l.getOriginalFilename());
			}
			System.out.println("to成功");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		  
		  dao.updateByPrimaryKeySelective(users);
		 
		
		return "success";
	}
	
	@RequestMapping(value="updateUsersImg",method=RequestMethod.POST)
	@ResponseBody
	public String updateUsersImg(MultipartFile [] files2,Users users){
		File directory = new File("/E:/images");
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
				users.setHeadportrait(l.getOriginalFilename());
			}
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		dao.updateByPrimaryKeySelective(users);
		return "success";
	}
	
	
	
	
	
	
//	--------------------用户登录-----------------------
	
	/**
	 * 登录
	 * @param name
	 * @param pwd
	 * @param session
	 * @return
	 */
	@RequestMapping(value=("/login"),method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> login(String userName,String userPassword,String yzm,HttpServletRequest request) {
		System.out.println("进入login");
		//返回码返回值的集合
		//返回码应该存在数据库中
		Map<String,String> map = new HashMap<String,String>();	
		System.out.println(userName+"/"+userPassword);
		List<Users> list=dao.login();
		System.out.println(list.toString());
		Users u2=null;
		for (Users el : list) {
			System.out.println(el.getUserid()+"/"+userName);
			if (el.getUserid().equals(userName)) {
				System.out.println("找到");
				u2=el;
				System.out.println(u2.toString());
				break;
			}
		}
		if (u2==null) {
			map.put("code", "1");
			map.put("message", "登陆失败！您输入的用户名不存在！");
			return map;
		}
		
		Users u = null;
		for (Users el : list) {
			if (el.getUserid().equals(userName)&&el.getPassword().equals(userPassword)) {
				System.out.println("找到2");
				u=el;
				System.out.println(u.toString());
				break;
			}
		}
		if(u == null) {
			System.out.println("未找到");
			map.put("code", "2");
			map.put("message", "密码错误，请重试！");
			return map;
		}
		HttpSession session = request.getSession();
		if (u!=null) {
			System.out.println("登录信息:"+u.toString());
			session.setAttribute("user",u);//把对象存放到session中
			map.put("code", "3");
			map.put("message", "登录成功！！");
			return map;
		}
	
		
		return map;
	}
	


	/**
	 * 获取用户
	 * @param userName
	 * @param request
	 * @return
	 */
	@RequestMapping(value=("/loginuser"),method=RequestMethod.POST)
	@ResponseBody
	public Users loginuser(String userName,HttpServletRequest request) {
		//返回码返回值的集合
		//返回码应该存在数据库中
		Map<String,String> map = new HashMap<String,String>();
		System.out.println("进入获取用户");
		HttpSession session = request.getSession();
		Users u = (Users) session.getAttribute("user");//把对象存放到session中
		u=dao.selectByPrimaryKey(u.getUserid());
		session.setAttribute("user",u);//把对象存放到session中
		
		
		Users user = (Users) session.getAttribute("user");//把对象从session中取出来
		
		System.out.println("用户信息");
		System.out.println(user.toString());
		
		
		return u;
	}
	
	
	/**
	 * 退出登录
	 * @param userName
	 * @param userPassword
	 * @param session
	 * @return
	 */
	@RequestMapping(value=("/logout"),method=RequestMethod.POST)
	@ResponseBody
	public Map<String, String> logout(HttpSession session,HttpServletRequest request) {
		System.out.println("进入退出登录！");
		Map<String,String> map = new HashMap<String,String>();
		session.removeAttribute("user");
		session.invalidate();// 会话销毁
		map.put("code", "1");
		map.put("message", "登出！");
		return map;
	}
	
	
	
	@RequestMapping(value=("/getOnlineCount"),method=RequestMethod.GET)
	@ResponseBody
	public Map<String, String> getOnlineCount(HttpSession session,HttpServletRequest response,HttpServletRequest request) {
		System.out.println("计算在线人数");
		Map<String,String> map = new HashMap<String,String>();
		ServletContext application = session.getServletContext();
		Integer count = (Integer) application.getAttribute("count");
		System.out.println("在线人数："+count);
        map.put("count",count==null?"0":count.toString());//在线人数
		return map;
	}

	
	 /**
     * 登录页面校验验证码
     */
    @RequestMapping("/checkVerify")
    @ResponseBody
    public Map<String, String> checkVerify(String yzm, HttpSession session){
    	System.out.println("进入校验验证码");
    
    	Map<String,String> map = new HashMap<String,String>();
		//从session中获取随机数
        String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
        System.out.println(random+"/"+yzm);
        random = random.toLowerCase();
        yzm = yzm.toLowerCase();
        System.out.println(random+"/"+yzm);
        if(!random.equals(yzm)){
        	map.put("code", "1");
			map.put("message", "验证码错误！");
			return map;//验证码错误
        }
        return map;
    }
	
	
	
	/**
	 * 获取生成验证码显示到 UI 界面
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	@RequestMapping(value="/checkCode")
	public void checkCode(HttpServletRequest request, HttpServletResponse response,HttpSession session){
		System.out.println("进入生成验证码");
		//设置相应类型,告诉浏览器输出的内容为图片
        response.setContentType("image/jpeg");
        
        //设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        
        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {	
            randomValidateCode.getRandcode(request, response);//输出图片方法
            //code为session中保存的验证码
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	
	/**
	 * 生成验证码
	 */
	@RequestMapping(value = "/getVerify")
	public void getVerify(HttpServletRequest request, HttpServletResponse response) {
	    try {
	        response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
	        response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
	        response.setHeader("Cache-Control", "no-cache");
	        response.setDateHeader("Expire", 0);
	        RandomValidateCodeUtil randomValidateCode = new RandomValidateCodeUtil();
	        randomValidateCode.getRandcode(request, response);//输出验证码图片方法
	    } catch (Exception e) {
	        System.out.println("获取验证码失败>>>>   ");
	    }
	}

//	--------------------用户登录-----------------------
	
	
}