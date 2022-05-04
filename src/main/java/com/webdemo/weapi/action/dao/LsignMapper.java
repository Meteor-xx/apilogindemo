package com.webdemo.weapi.action.dao;

import com.webdemo.weapi.action.pojo.*;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LsignMapper {
    long countByExample(LsignExample example);

    int deleteByExample(LsignExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Lsign record);

    int insertSelective(Lsign record);

    List<Lsign> selectByExample(LsignExample example);

    Lsign selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Lsign record, @Param("example") LsignExample example);

    int updateByExample(@Param("record") Lsign record, @Param("example") LsignExample example);

    int updateByPrimaryKeySelective(Lsign record);

    int updateByPrimaryKey(Lsign record);
}