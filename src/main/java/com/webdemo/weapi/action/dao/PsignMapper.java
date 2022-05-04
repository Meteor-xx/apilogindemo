package com.webdemo.weapi.action.dao;

import com.webdemo.weapi.action.pojo.*;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PsignMapper {
    long countByExample(PsignExample example);

    int deleteByExample(PsignExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Psign record);

    int insertSelective(Psign record);

    List<Psign> selectByExample(PsignExample example);

    Psign selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Psign record, @Param("example") PsignExample example);

    int updateByExample(@Param("record") Psign record, @Param("example") PsignExample example);

    int updateByPrimaryKeySelective(Psign record);

    int updateByPrimaryKey(Psign record);
}