package com.apatech.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Recharge;

public interface RechargeMapper {
    int deleteByPrimaryKey(Integer rechargeid);

    int insert(Recharge record);

    int insertSelective(Recharge record);

    Recharge selectByPrimaryKey(Integer rechargeid);
    
    @Select("SELECT r.rechargeID,r.rechargeDate,r.weChatNumber,m.name,m.phone,r.recharge,r.give,r.balance,r.remarks,r.memberid FROM recharge r,member m WHERE r.memberid=m.memberID")
    List<Recharge> selectAll();
    
    @Select("select * from Recharge where memberid=#{memberid}")
    List<Recharge> selectByid(Integer memberid);

    List<Recharge> selectByAll(@Param("startTime")Date startTime,@Param("endTime")Date endTime,@Param("PhoneOrName")String PhoneOrName);
    
    int updateByPrimaryKeySelective(Recharge record);

    int updateByPrimaryKey(Recharge record);
}