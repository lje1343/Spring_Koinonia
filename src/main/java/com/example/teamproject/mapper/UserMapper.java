package com.example.teamproject.mapper;

import com.example.teamproject.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public void insert(UserVO userVO);

}