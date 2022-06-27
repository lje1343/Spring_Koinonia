package com.example.teamproject.controller.product;

import com.example.teamproject.domain.vo.*;
import com.example.teamproject.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/product/*")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    // 상품

    @GetMapping("/register")
    public String register() {
        log.info("*************");
        log.info("판매 상품정보 작성");
        log.info("*************");
        return "/product/product";
    }

    @PostMapping("/register")
    public RedirectView register(ProductVO productVO, RedirectAttributes rttr) {
        log.info("*************");
        log.info("판매 상품 등록");
        log.info("*************");
        productService.register(productVO);
        rttr.addFlashAttribute("pno", productVO.getPno());

        return new RedirectView("/product/list");
    }

    @GetMapping("/list")
    public String getList(Criteria criteria, Model model, Long pno, ProductDTO productDTO) {
        log.info("*************");
        log.info("상품 리스트");
        log.info("*************");
        List<PFileVO> pFileVOS = productService.getOldFiles();
        model.addAttribute("productList", productService.getList(criteria));
        model.addAttribute("pageDTO", new PageDTO(criteria, productService.getTotal()));
        return "/product/sell_list";
    }

    @GetMapping("/detail")
    public String read(Long pno, Model model, Criteria criteria) {
        log.info("*************");
        log.info("상품 상세");
        log.info("*************");
        log.info(productService.read(pno).toString());
        model.addAttribute("product", productService.read(pno));
        return "/product/sell_detail";
    }



    @GetMapping("/modify")
    public String modify(Long pno, Criteria criteria, Model model) {
        log.info("*************");
        log.info("상품 수정");
        log.info("*************");
        log.info(criteria.toString());
        model.addAttribute("product", productService.read(pno));
        // 상품 수정
        return "/product/product_modify";
    }

    @PostMapping("/modisucces")
    public RedirectView modisucces(Long pno, ProductVO productVO, Criteria criteria, RedirectAttributes rttr) {
        log.info("*************");
        log.info("상품 수정 완료");
        log.info("*************");
        // 다이어리 수정 완료
        productService.modify(productVO);
        rttr.addAttribute("pno", productVO.getPno());
        rttr.addAttribute("pageNum", criteria.getPageNum());
        rttr.addAttribute("amount", criteria.getAmount());

        return new RedirectView("/product/sell_detail");
}

    ///////////////////////////////////////////////////
    // ResponsBody

    // 카테고리별 상품 목록


}
