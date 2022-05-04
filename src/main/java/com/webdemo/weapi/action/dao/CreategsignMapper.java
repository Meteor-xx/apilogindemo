package com.webdemo.weapi.action.dao;


import java.util.List;

import com.webdemo.weapi.action.pojo.Creategsign;
import com.webdemo.weapi.action.pojo.CreategsignExample;
import org.apache.ibatis.annotations.Param;

public interface CreategsignMapper {
    long countByExample(CreategsignExample example);

    int deleteByExample(CreategsignExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Creategsign record);

    int insertSelective(Creategsign record);

    List<Creategsign> selectByExample(CreategsignExample example);

    Creategsign selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Creategsign record, @Param("example") CreategsignExample example);

    int updateByExample(@Param("record") Creategsign record, @Param("example") CreategsignExample example);

    int updateByPrimaryKeySelective(Creategsign record);

    int updateByPrimaryKey(Creategsign record);
}