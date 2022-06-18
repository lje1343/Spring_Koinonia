//package com.example.teamproject.controller.user;
//
//import com.example.teamproject.service.user.UserServiceImpl;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Slf4j
//@RequestMapping("/user_rest/*")
//@RequiredArgsConstructor
//public class UserRestController {
//    private final UserServiceImpl userService;
//
//    // 이메일 중복확인-rest
//    @PostMapping("/checkEmail")
//    public boolean checkEmail(String email){
//        return false;
//    }
//
//    // 이름 중복확인-rest
//    @PostMapping("/checkId")
//    public boolean checkId(String id){
//        return false;
//    }
//
//}
