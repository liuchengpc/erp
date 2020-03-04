package com.apatech.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.apatech.domain.KucunDanjia;

public interface KucunDanjiaMapper {

	KucunDanjia queryBywlidAndckid(@Param("ckid")String ckid,@Param("wlid")String wlid);
}
