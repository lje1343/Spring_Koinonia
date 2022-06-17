package com.example.teamproject.mapper;

import com.example.teamproject.domain.vo.UserVO;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public Integer checkId(String email);
    public void insert(UserVO userVO);
    public UserVO find(String email);
    public String login(UserVO userVO);
    public int update(UserVO userVO);
    public int delete(String pw);

}