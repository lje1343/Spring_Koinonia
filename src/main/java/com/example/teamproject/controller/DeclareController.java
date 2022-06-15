package com.example.teamproject.controller;

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
@RequestMapping("/declare/*")
@RequiredArgsConstructor
public class DeclareController {
    private final DeclareService declareService;
    // 신고

    @GetMapping("/")
    public String goToDeclare(){
        log.info("*************");
        log.info("신고");
        log.info("*************");
        return "/declare/declare";
    }

    @GetMapping("/declare/register")
    public String register(){
        log.info("*************");
        log.info("신고 작성");
        log.info("*************");
        return "/declare/register";
    }
    @PostMapping("/declare/register")
    public String register(DeclareVo declareVo, RedirectAttributes rttr){
        log.info("*************");
        log.info("신고 등록");
        log.info("*************");
        // 신고 등록
        return new RedirectView("/declare/list");
    }

    // 이메일로 사용자 신고당한 이력 조회

//    @GetMapping("/declare/list")
//    public String getList(Model model){
//        log.info("*************");
//        log.info("신고 리스트");
//        log.info("*************");
//        // 신고 리스트
//        return "/declare/list";
//    }

//    @GetMapping("/declare/detail")
//    public String read(Long dno, Model model){
//        log.info("*************");
//        log.info("신고 상세");
//        log.info("*************");
//        // 신고 상세
//        return "/declare/detail";
//    }

//    @GetMapping("/declare/modify")
//    public String modify(Long dno){
//        log.info("*************");
//        log.info("신고 수정");
//        log.info("*************");
//        // 신고 수정
//        return "/declare/modify";
//    }
//    @PostMapping("/declare/modify")
//    public String modify(Long dno, RedirectAttributes rttr){
//        log.info("*************");
//        log.info("신고 수정 완료");
//        log.info("*************");
//        // 신고 수정 완료
//        return new RedirectView("/declare/list");
//    }
}
