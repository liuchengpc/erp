package com.apatech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apatech.domain.Memberlv;
import com.apatech.mapper.MemberlvMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class MemberlvService {
	@Autowired
	private MemberlvMapper dao;

	public Memberlv queryByMemberlvMoney(Memberlv record) {
		
		return dao.queryByMemberlvMoney(record);
	}
	
	public Memberlv queryMemberLvByMemberLvID(Integer memberid) {
		
		return dao.queryMemberLvByMemberLvID(memberid);
	}
	
    public int deleteByPrimaryKey(Integer memberlvid) {
    	return dao.deleteByPrimaryKey(memberlvid);
    }

    public int insert(Memberlv record) {
    	return dao.insert(record);
    }


    public int insertSelective(Memberlv record) {
    	return dao.insertSelective(record);
    }


    public Memberlv selectByPrimaryKey(Integer memberlvid) {
    	return dao.selectByPrimaryKey(memberlvid);
    }
    
    public List<Memberlv> selectAll() {
    	return dao.selectAll();
    }
    
    public PageInfo<Memberlv> selectAllpage(Integer pageNum,Integer pageSize){
    	PageHelper.startPage(pageNum, pageSize);
    	List<Memberlv> list=dao.selectAll();
    	PageInfo<Memberlv> page=new PageInfo<Memberlv>(list);
    	return page;
    }


    public int updateByPrimaryKeySelective(Memberlv record) {
    	return dao.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Memberlv record) {
    	return dao.updateByPrimaryKey(record);
    }
    
    /**
     * 按名称查询等级
     */
    public Memberlv queryAllByMemberlvName(String memberlvname) {
    	return dao.queryAllByMemberlvName(memberlvname);
    }

}