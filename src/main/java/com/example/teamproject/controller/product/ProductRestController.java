package com.example.teamproject.controller.product;

import com.example.teamproject.domain.vo.ProductVO;
import com.example.teamproject.domain.vo.RequestVO;
import com.example.teamproject.service.product.ProductServieceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/product_rest/*")
@RequiredArgsConstructor
public class ProductRestController {
    private final ProductServieceImpl productServiece;

    // 카테고리별 상품 목록
    @GetMapping("/list/{#카테고리}") // 변수명 미정
    public List<ProductVO> getList(@PathVariable("#카테고리")String #카테고리){
        return null;
    }

    // 무한 스크롤
    @GetMapping("/list/{#카테고리}/{#페이지번호}") // 변수명 미정
    public List<ProductVO> getList(@PathVariable("#카테고리") String #카테고리 @PathVariable("#페이지번호") int #페이지번호){
        return null;
    }
}
