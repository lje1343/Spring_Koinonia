<<<<<<< HEAD
//package com.example.teamproject.controller.user;
//
//import com.example.teamproject.service.user.UserServiceImpl;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//import org.springframework.web.servlet.view.RedirectView;
//
//@Controller
//@Slf4j
//@RequestMapping("/user/*")
//@RequiredArgsConstructor
//public class UserController {
//    private final UserServiceImpl userService;
//    // 회원가입/로그인/비밀번호찾기/마이페이지
//
//    @GetMapping("/join")
//    public String goToJoin(){
//        log.info("*************");
//        log.info("회원가입");
//        log.info("*************");
//        return "/user/join";
//    }
//    @PostMapping("/join")
//    public String join(UserVO userVO){
//        log.info("*************");
//        log.info("회원등록");
//        log.info("*************");
//        // 회원등록
//        return "/user/login";
//    }
//
//    @GetMapping("/login")
//    public String goToLogin(){
//        log.info("*************");
//        log.info("로그인");
//        log.info("*************");
//        return "/user/login";
//    }
//
//    @GetMapping("/find_pw")
//    public String goToFindPw(){
//        log.info("*************");
//        log.info("비밀번호찾기");
//        log.info("*************");
//        return "/user/find_pw";
//    }
//
//    @GetMapping("/modify")
//    public String modify(Model model){
//        log.info("*************");
//        log.info("회원정보수정");
//        log.info("*************");
//        return "/user/update";
//    }
//    @PostMapping("/modify")
//    public String modify(RedirectAttributes rttr){
//        log.info("*************");
//        log.info("회원정보수정");
//        log.info("*************");
//        return new RedirectView("/user/mypage");
//    }
//
//    // 마이페이지
//
//    @GetMapping("/mypage")
//    public String goToMypage(Model model){
//        log.info("*************");
//        log.info("마이페이지");
//        log.info("*************");
//        // 개인정보
//        // 좋아요한 다이어리 목록
//        // 내가 쓴 다이어리 목록
//        // 내가 올린 상품 목록
//        return "/user/mypage";
//    }
//}
=======
package com.example.teamproject.controller.user;

import com.example.teamproject.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@Slf4j
@RequestMapping("/user/*")
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userService;
    // 회원가입/로그인/비밀번호찾기/마이페이지

    @GetMapping("/join")
    public String goToJoin(){
        log.info("*************");
        log.info("회원가입");
        log.info("*************");
        return "/user/join";
    }
    @PostMapping("/join")
    public String join(UserVO userVO){
        log.info("*************");
        log.info("회원등록");
        log.info("*************");
        // 회원등록
        return "/user/login";
    }

    @GetMapping("/login")
    public String goToLogin(){
        log.info("*************");
        log.info("로그인");
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

    @GetMapping("/modify")
    public String modify(Model model){
        log.info("*************");
        log.info("회원정보수정");
        log.info("*************");
        return "/user/update";
    }
    @PostMapping("/modify")
    public String modify(RedirectAttributes rttr){
        log.info("*************");
        log.info("회원정보수정");
        log.info("*************");
        return new RedirectView("/user/mypage");
    }

    // 마이페이지

    @GetMapping("/mypage")
    public String goToMypage(Model model){
        log.info("*************");
        log.info("마이페이지");
        log.info("*************");
        // 개인정보
        // 좋아요한 다이어리 목록
        // 내가 쓴 다이어리 목록
        // 내가 올린 상품 목록
        return "/user/mypage";
    }

    ///////////////////////////////////////////////////
    // ResponsBody

    // 이메일 중복확인
    @PostMapping("/checkEmail")
    public boolean checkEmail(String email){
        return false;
    }

    // 이름 중복확인
    @PostMapping("/checkId")
    public boolean checkId(String id){
        return false;
    }

    // 이름 수정
}
>>>>>>> d8861bedc3b6c0c410020b48a8b1c936d06867d5
