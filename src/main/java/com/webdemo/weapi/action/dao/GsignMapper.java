package com.webdemo.weapi.action.dao;

import com.webdemo.weapi.action.pojo.*;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GsignMapper {
    long countByExample(GsignExample example);

    int deleteByExample(GsignExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gsign record);

    int insertSelective(Gsign record);

    List<Gsign> selectByExample(GsignExample example);

    Gsign selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gsign record, @Param("example") GsignExample example);

    int updateByExample(@Param("record") Gsign record, @Param("example") GsignExample example);

    int updateByPrimaryKeySelective(Gsign record);

    int updateByPrimaryKey(Gsign record);
}