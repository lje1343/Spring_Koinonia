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
@RequestMapping("/request/*")
@RequiredArgsConstructor
public class RequestController {
    private final RequestService requestService;
    // 요청

    @GetMapping("/request/register")
    public String register(){
        log.info("*************");
        log.info("판매 상품 요청글 작성");
        log.info("*************");
        return "/request/register";
    }
    @PostMapping("/request/register")
    public String register(RequestVo requestVo, RedirectAttributes rttr){
        log.info("*************");
        log.info("판매 상품 요청글 등록");
        log.info("*************");
        // 판매 상품 요청글 등록
        return new RedirectView("/request/list");
    }

    @GetMapping("/request/list")
    public String getList(Model model){
        log.info("*************");
        log.info("상품 요청 리스트");
        log.info("*************");
        // 상품 요청 리스트
        return "/request/list";
    }

    @GetMapping("/request/detail")
    public String read(Long rno, Model model){
        log.info("*************");
        log.info("상품 요청글 상세");
        log.info("*************");
        // 상품 요청글 상세
        return "/request/detail";
    }

    @GetMapping("/request/modify")
    public String modify(Long rno){
        log.info("*************");
        log.info("상품 요청글 수정");
        log.info("*************");
        // 상품 요청글 수정
        return "/request/modify";
    }
    @PostMapping("/request/modify")
    public String modify(Long rno, RedirectAttributes rttr){
        log.info("*************");
        log.info("상품 요청글 수정 완료");
        log.info("*************");
        // 상품 요청글 수정 완료
        return new RedirectView("/request/list");
    }
}
