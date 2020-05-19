package com.li.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import com.li.entity.User;


@Repository
public interface UserMapper {
	
	
	/**
	 * 查询所有用户信息
	 * @return
	 */
	@Select("select * from user")
	@Results(value={
			@Result(property="id",column="id",jdbcType=JdbcType.INTEGER),
			@Result(property="userName",column="user_name"),
			@Result(property="passWord",column="pass_word")
			})
	List<User> userList();

}
