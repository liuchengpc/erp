package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Memberlv;

public interface MemberlvMapper {
	Memberlv queryByMemberlvMoney(Memberlv record);
	
	Memberlv queryMemberLvByMemberLvID(Integer memberid);
	
    int deleteByPrimaryKey(Integer memberlvid);

    int insert(Memberlv record);

    int insertSelective(Memberlv record);

    Memberlv selectByPrimaryKey(Integer memberlvid);
    
    @Select("select * from Memberlv")
    List<Memberlv> selectAll();

    int updateByPrimaryKeySelective(Memberlv record);

    int updateByPrimaryKey(Memberlv record);
    
    Memberlv queryAllByMemberlvName(String memberlvname);
}