package com.example.teamproject.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/user/*")
@RequiredArgsConstructor
public class UserController {
    @GetMapping("/join")
    public String goToJoin(){
        log.info("*************");
        log.info("비밀번호찾기");
        log.info("*************");
        return "/user/join";
    }

    @GetMapping("/login")
    public String goToLogin(){
        log.info("*************");
        log.info("비밀번호찾기");
        log.info("*************");
        return "/user/login";
    }

    @GetMapping("/find_pw")
    public String goToFindPw(){
        log.info("*************");
        log.info("비밀번호찾기");
        log.info("*************");
        return "/user/find_pw";
    }
}
