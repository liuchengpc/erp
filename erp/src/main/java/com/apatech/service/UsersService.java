package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Users;
import com.apatech.mapper.RoleMapper;
import com.apatech.mapper.ShopMapper;
import com.apatech.mapper.UsersMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class UsersService {
	@Autowired
	private UsersMapper dao;
	
	@Autowired
	private ShopMapper sp;

	@Autowired
	private RoleMapper rl;
	
	public List<Users> queryUsersByRoleID(Integer roleid){
		
		return dao.queryUsersByRoleID(roleid);
	}
	
	public int deleteUser(String userid) {
		
		return dao.deleteUser(userid);
	}
	
	public List<Users> login(){
		return  dao.login();
	};
	
	public int insertdeleteUser(Users user) {
		int i = 0;
		if(dao.deleteByPrimaryKey(user.getUserid())>0) {
			i = dao.insertUser(user);
		}
		return i;
	}
	
	public Users queryByUserIDBykey(String userid) {
		Users u = dao.queryByUserIDBykey(userid);
		u.setShop(sp.queryshopnameByshopid(u.getShopid()));
		u.setRole(rl.selectByPrimaryKey(u.getRoleid()));
		return u;
	}
	
	public int insertUser(Users user) {
		
		return dao.insertUser(user);
	}
	
	public int queryUserByCount(String userid) {
		
		return dao.queryUserByCount(userid);
	}
	
	public PageInfo<Users> queryByUserPage(Integer pageNum,Integer pageSize,Users user){
		PageHelper.startPage(pageNum, pageSize);
		List<Users> list = dao.queryByUserPage(user);
		for (Users users : list) {
			users.setShop(sp.queryshopnameByshopid(users.getShopid()));
			users.setRole(rl.selectByPrimaryKey(users.getRoleid()));
		}
		PageInfo<Users> page = new PageInfo<Users>(list);
		return page;
	}
	
    public int deleteByPrimaryKey(String userid) {
    	return dao.deleteByPrimaryKey(userid);
    }

    public int insert(Users record) {
    	return dao.insert(record);
    }


    public int insertSelective(Users record) {
    	return dao.insertSelective(record);
    }


    public Users selectByPrimaryKey(String userid) {
    	return dao.selectByPrimaryKey(userid);
    }
    
    public List<Users> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Users> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Users> list=dao.selectAll();
    	PageInfo<Users> page=new PageInfo<Users>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Users record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Users record) {
    	return dao.updateByPrimaryKey(record);
    }

}