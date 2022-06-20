package com.example.teamproject.domain.dao.user;

import com.example.teamproject.domain.dao.user.UserDAO;
import com.example.teamproject.domain.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserDAOTests {
    @Autowired
    private UserDAO userDAO;

    // 회원등록
//    @Test
//    public void registerTest(){
//        UserVO userVO = new UserVO();
//        userVO.setEmail("test@test.com");
//        userVO.setPw("test00");
//        userVO.setName("tester");
//        userVO.setCover("테스트입니다.");
//        userDAO.register(userVO);
//    };

    // 회원 1명 조회
    @Test
    public void readTest(){
        String email = "test@test.com";
        userDAO.read(email);
    };

    // 회원 수정
    @Test
    public void modifyTest(){
        UserVO userVO = new UserVO();
        userVO.setEmail("test@test.com");
        userVO.setPw("test00");
        userVO.setName("tester");
        userVO.setCover("테스트입니다. 수정");
        userDAO.modify(userVO);
    };
}
