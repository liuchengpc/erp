package com.apatech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.Member;

public interface MemberMapper {
	Member queryMemberByPhoneTwo(String phone,String password);
	
	Member queryMemberByPhone(String phone,String password);
	
    int deleteByPrimaryKey(Integer memberid);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Integer memberid);
    
    
    Member selectByMemberLvid(Integer memberLvID);
    
    @Select("select * from Member")
    List<Member> selectAll();
    
    @Select("SELECT d.*,(SELECT name FROM memberlv l WHERE l.memberLvID=d.memberLvID) memberlvname, (SELECT COUNT(*) FROM cashregister e WHERE e.memberID = d.memberID  ) hycount, IFNULL( ( SELECT SUM(moneyamt) FROM cashregister f WHERE f.memberID = d.memberID ) ,0)  hysumprice, (SELECT time FROM cashregister g WHERE g.memberID = d.memberID GROUP BY g.time LIMIT 1,1) hytime FROM member d")
    List<Member> queryAll();

    List<Member> queryAllBy(@Param("lvid") Integer lvid,@Param("phoneorname") String PhoneOrName);
    
    Member queryAllByPhone(@Param("phone") String Phone);
    
    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
    
}