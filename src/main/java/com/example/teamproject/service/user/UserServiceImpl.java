package com.example.teamproject.service.user;

import com.example.teamproject.domain.dao.user.UserDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {
    private final UserDAO userDAO;

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

    // 회원 이름 수정
    public boolean modifyName(){
        // user table의 이름 수정
        // 그 외 table의 이름 수정 ...
        return false;
    }
}
