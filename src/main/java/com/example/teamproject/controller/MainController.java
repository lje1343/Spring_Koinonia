
package com.example.teamproject.controller;


import com.example.teamproject.domain.vo.*;
import com.example.teamproject.service.board.BoardFileServiceImpl;
import com.example.teamproject.service.board.BoardServiceImpl;
<<<<<<< HEAD
import com.example.teamproject.service.product.ProductService;
import com.example.teamproject.service.product.ProductServiceImpl;
=======
import com.example.teamproject.service.product.ProductFileServiceImpl;
import com.example.teamproject.service.product.ProductServieceImpl;
>>>>>>> 7c63baf3c9cd7749d6fef87933b0335a23abcc37
import com.example.teamproject.service.request.RequestServieceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/")
@RequiredArgsConstructor
public class MainController {
    private final BoardServiceImpl boardService;
    private final ProductService productServiece;
    private final RequestServieceImpl requestServiece;
    private final BoardFileServiceImpl boardFileService;
    private final ProductFileServiceImpl productFileService;

    @GetMapping("/")
    public String goToMain(HttpSession session, Model model){
        log.info("*************");
        log.info("메인페이지");
        log.info("*************");
//        세션정보
        log.info((String) session.getAttribute("name"));
        model.addAttribute("user" ,(String) session.getAttribute("name"));
//         다이어리 리스트
        List<BoardVO> boardList = boardService.getList(new Criteria(1, 6));
        model.addAttribute("boardList", boardList) ;
//        썸네일 리스트 공통
        String uploadFolder = "/images/";
//         다이어리 썸네일 리스트
        String boardThumFileName = "";
        List<String> boardThumfileUrlList = new ArrayList<>();
        for(BoardVO b : boardList){
            List<FileVO> boardFileList = boardFileService.getList(b.getBno());
            if(!boardFileList.isEmpty()){
                boardThumFileName = "s_" + boardFileList.get(0).getFileName();
            }else{
                boardThumFileName = "no_image.gif";
            }
            String boardThumfileUrl = uploadFolder + boardThumFileName;
            boardThumfileUrlList.add(boardThumfileUrl);
            log.info(boardThumfileUrl);
        }
        model.addAttribute("boardThumfileUrlList", boardThumfileUrlList);
//         상품 리스트
        List<ProductVO> productList = productServiece.getList(new Criteria(1, 15));
        model.addAttribute("productList", productList) ;
//         상품 썸네일 리스트
        String productThumFileName = "";
        List<String> productThumfileUrlList = new ArrayList<>();
        for(ProductVO p : productList){
            List<ProductFileVO> productFileList = productFileService.getList(p.getPno());
            if(!productFileList.isEmpty()){
                productThumFileName = "s_" + productFileList.get(0).getFileName();
            }else{
                productThumFileName = "no_image.gif";
            }
            String productThumfileUrl = uploadFolder + productThumFileName;
            productThumfileUrlList.add(productThumfileUrl);
            log.info(productThumfileUrl);
        }
        model.addAttribute("productThumfileUrlList", productThumfileUrlList);
        return "/main/main";
    }
}

