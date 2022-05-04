package com.webdemo.weapi.action.dao;


import java.util.List;

import com.webdemo.weapi.action.pojo.ClassesUsers;
import com.webdemo.weapi.action.pojo.ClassesUsersExample;
import org.apache.ibatis.annotations.Param;

public interface ClassesUsersMapper {
    long countByExample(ClassesUsersExample example);

    int deleteByExample(ClassesUsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassesUsers record);

    int insertSelective(ClassesUsers record);

    List<ClassesUsers> selectByExample(ClassesUsersExample example);

    ClassesUsers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassesUsers record, @Param("example") ClassesUsersExample example);

    int updateByExample(@Param("record") ClassesUsers record, @Param("example") ClassesUsersExample example);

    int updateByPrimaryKeySelective(ClassesUsers record);

    int updateByPrimaryKey(ClassesUsers record);
}