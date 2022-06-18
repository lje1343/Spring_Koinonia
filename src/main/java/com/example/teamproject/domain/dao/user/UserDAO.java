package com.example.teamproject.domain.dao.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;

    // 회원 등록
    public void register(UserVO userVO){

    };

    // 회원 1명 조회
    public UserVO read(String name){

    };

    // 회원 수정
    public boolean modify(UserVO userVO){

    };

    // 회원 삭제
    public boolean remove(String name){

    };

//    // 회원 리스트
//    public List<UserVO> getList(){
//
//    };
}
