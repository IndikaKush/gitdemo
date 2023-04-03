package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.model.UserModel;
@Repository
@Mapper
public interface UserMapper {

	int insert(UserModel userModel);

}
