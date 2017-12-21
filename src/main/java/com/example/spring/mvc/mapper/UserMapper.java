package com.example.spring.mvc.mapper;

import com.example.spring.mvc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
public interface UserMapper {

    User getById(@Param("id") int id);
}
