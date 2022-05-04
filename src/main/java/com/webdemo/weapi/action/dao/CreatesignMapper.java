package com.webdemo.weapi.action.dao;


import java.util.List;

import com.webdemo.weapi.action.pojo.*;
import org.apache.ibatis.annotations.Param;

public interface CreatesignMapper {
    long countByExample(CreatesignExample example);

    int deleteByExample(CreatesignExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Createsign record);

    int insertSelective(Createsign record);

    List<Createsign> selectByExample(CreatesignExample example);

    Createsign selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Createsign record, @Param("example") CreatesignExample example);

    int updateByExample(@Param("record") Createsign record, @Param("example") CreatesignExample example);

    int updateByPrimaryKeySelective(Createsign record);

    int updateByPrimaryKey(Createsign record);
}