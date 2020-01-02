package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Roleprivilege;
import com.apatech.mapper.RoleprivilegeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class RoleprivilegeService {
	@Autowired
	private RoleprivilegeMapper dao;

	public int deleteRoleAndPrivilege(Integer roleid) {
		
		return dao.deleteRoleAndPrivilege(roleid);
	}
	
	public List<Roleprivilege> queryPrivilegeByRoleID(Integer roleid){
		
		return dao.queryPrivilegeByRoleID(roleid);
	}
	
	public int insertRoleprivilege(Roleprivilege r) {
		
		return dao.insertRoleprivilege(r);
	}
	
    public int deleteByPrimaryKey(Integer roleprivilegeid) {
    	return dao.deleteByPrimaryKey(roleprivilegeid);
    }

    public int insert(Roleprivilege record) {
    	return dao.insert(record);
    }


    public int insertSelective(Roleprivilege record) {
    	return dao.insertSelective(record);
    }


    public Roleprivilege selectByPrimaryKey(Integer roleprivilegeid) {
    	return dao.selectByPrimaryKey(roleprivilegeid);
    }
    
    public List<Roleprivilege> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Roleprivilege> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Roleprivilege> list=dao.selectAll();
    	PageInfo<Roleprivilege> page=new PageInfo<Roleprivilege>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Roleprivilege record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Roleprivilege record) {
    	return dao.updateByPrimaryKey(record);
    }

}