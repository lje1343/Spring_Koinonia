package com.example.teamproject.controller.board;

import com.example.teamproject.domain.vo.Criteria;
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
@RequestMapping("/board/*")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;
    // 다이어리

    @GetMapping("/board/register")
    public String register(){
        log.info("*************");
        log.info("다이어리 작성");
        log.info("*************");
        return "/board/register";
    }
    @PostMapping("/board/register")
    public String register(BoardVO boardVO, RedirectAttributes rttr){
        log.info("*************");
        log.info("다이어리 등록");
        log.info("*************");
        // 다이어리 등록
        return new RedirectView("/board/list");
    }

    @GetMapping("/board/modify")
    public String modify(Long bno){
        log.info("*************");
        log.info("다이어리 수정내용 작성/삭제");
        log.info("*************");
        // 다이어리 수정
        return "/board/modify";
    }
    @PostMapping("/board/modify")
    public String modify(Long bno, RedirectAttributes rttr){
        log.info("*************");
        log.info("다이어리 수정");
        log.info("*************");
        // 다이어리 수정 완료
        return new RedirectView("/board/list");
    }
    @PostMapping("/board/remove")
    public String remove(Long bno, RedirectAttributes rttr){
        log.info("*************");
        log.info("다이어리 삭제");
        log.info("*************");
        // 다이어리 삭제
        return new RedirectView("/board/list");
    }

    @GetMapping("/board/detail")
    public String read(Long bno, Model model){
        log.info("*************");
        log.info("다이어리 상세");
        log.info("*************");
        // 다이어리 상세
        return "/board/detail";
    }
    // 무한스크롤 - rest

    @GetMapping("/board/list")
    public String getList(Criteria criteria, Model model){
        log.info("*************");
        log.info("다이어리 리스트");
        log.info("*************");
        // 다이어리 리스트
        return "/board/list";
    }

    // 다이어리 좋아요(등록) - Rest
}
