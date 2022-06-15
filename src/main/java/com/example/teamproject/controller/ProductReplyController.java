package com.example.teamproject.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/productReply/*")
@RequiredArgsConstructor
public class ProductReplyController {
    private final ProductReplyService productReplyService;

    // 댓글 작성


    //    댓글 1개 조회


    //    댓글 전체 목록 조회


    //    댓글 삭제


    //    댓글 수정

}
