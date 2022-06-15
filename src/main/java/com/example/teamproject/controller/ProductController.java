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
@RequestMapping("/product/*")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    // 상품

    @GetMapping("/product/register")
    public String register(){
        log.info("*************");
        log.info("판매 상품정보 작성");
        log.info("*************");
        return "/product/register";
    }
    @PostMapping("/product/register")
    public String register(ProductVO productVO, RedirectAttributes rttr){
        log.info("*************");
        log.info("판매 상품 등록");
        log.info("*************");
        // 판매 상품 등록
        return new RedirectView("/product/list");
    }

    @GetMapping("/product/list")
    public String getList(Model model){
        log.info("*************");
        log.info("상품 리스트");
        log.info("*************");
        // 상품 리스트
        return "/product/list";
    }
    // 무한스크롤 - rest

    @GetMapping("/product/detail")
    public String read(Long pno, Model model){
        log.info("*************");
        log.info("상품 상세");
        log.info("*************");
        // 상품 상세
        return "/product/detail";
    }

    @GetMapping("/product/modify")
    public String modify(Long pno){
        log.info("*************");
        log.info("상품 수정");
        log.info("*************");
        // 상품 수정
        return "/product/modify";
    }
    @PostMapping("/product/modify")
    public String modify(Long pno, RedirectAttributes rttr){
        log.info("*************");
        log.info("상품 수정 완료");
        log.info("*************");
        // 다이어리 수정 완료
        return new RedirectView("/product/list");
    }
}
