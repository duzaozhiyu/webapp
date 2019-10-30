package com.example.mapper;


import com.example.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface SystemUserLoginMapper {
    public int isLogin(@Param("username") String username,@Param("password") String password);
    User Sel(int id);
}
