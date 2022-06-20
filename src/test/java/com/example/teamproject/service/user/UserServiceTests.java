package com.example.teamproject.service.user;

import com.example.teamproject.domain.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserServiceTests {
    @Autowired
    private UserServiceImpl userService;

    @Test
    public void registerTest() {
        UserVO userVO = new UserVO();
        userVO.setEmail("test@test2.com");
        userVO.setPw("test00");
        userVO.setName("tester2");
        userVO.setCover("테스트입니다.");
        userService.register(userVO);
    }
}
