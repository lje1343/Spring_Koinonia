
package com.example.teamproject.controller;

import com.example.teamproject.domain.vo.Criteria;
import com.example.teamproject.domain.vo.ProductFileVO;
import com.example.teamproject.domain.vo.ProductVO;
import com.example.teamproject.service.board.BoardServiceImpl;
import com.example.teamproject.service.product.ProductFileServiceImpl;
import com.example.teamproject.service.product.ProductServieceImpl;
import com.example.teamproject.service.request.RequestServieceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
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
    private final ProductServieceImpl productServiece;
    private final RequestServieceImpl requestServiece;
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
//        boardService.getlist();
//         상품 리스트
        List<ProductVO> productList = productServiece.getList(new Criteria(1, 15));
        model.addAttribute("productList", productList) ;
//         상품 썸네일 리스트
        String uploadFolder = "C:/upload/";
        List<String> productThumfileUrlList = new ArrayList<>();
        for(ProductVO p : productList){
            List<ProductFileVO> productFileList = productFileService.getList(p.getPno());
            if(!productFileList.isEmpty()){
                String thumFileName = "s_" + productFileList.get(0).getFileName();
                productThumfileUrlList.add(thumFileName);
//                Resource resource = new FileSystemResource(uploadFolder + thumFileName);
//                productThumfileUrlList.add(resource);
            }
        }
//        log.info(productThumfileUrlList.get(0).toString());
        model.addAttribute("productThumfileUrlList", productThumfileUrlList);
        return "/main/main";
    }
}

