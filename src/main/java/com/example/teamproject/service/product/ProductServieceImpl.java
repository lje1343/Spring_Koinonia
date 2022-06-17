package com.example.teamproject.service.product;

import com.example.teamproject.domain.dao.product.ProductDAO;
import com.example.teamproject.domain.vo.ProductVO;
import com.example.teamproject.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServieceImpl implements BoardService {
    private final ProductDAO productDAO;

    // 판매 상품 등록
    public void register(ProductVO productVO) { }

    // 판매 상품 수정
    public boolean modify(ProductVO productVO) {
        return false;
    }

    // 판매 상품 삭제
    @Override
    public boolean remove(Long bno) {
        return false;
    }

    // 판매 상품 상세
    @Override
    public ProductVO read(Long bno) {
        return null;
    }

    // 판매 상품 목록
    @Override
    public List<ProductVO> getList(Criteria criteria) {
        return null;
    }
}
