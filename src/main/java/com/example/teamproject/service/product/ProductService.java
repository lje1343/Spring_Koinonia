package com.example.teamproject.service.product;

import com.example.teamproject.domain.vo.Criteria;
import com.example.teamproject.domain.vo.PFileVO;
import com.example.teamproject.domain.vo.ProductDTO;
import com.example.teamproject.domain.vo.ProductVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public List<PFileVO> getList(Long pno);
    public List<PFileVO> getOldFiles();
    public List<ProductDTO> getAll(ProductDTO productDTO);

    // 판매 상품 등록
    public void register(ProductVO productVO);
    // 판매 상품 수정
    public int modify(ProductVO productVO);
    // 판매 상품 삭제
    public int remove(Long pno);
    // 판매 상품 상세
    public ProductVO read(Long pno);
    // 판매 상품 목록
    public List<ProductVO> getList(Criteria criteria);

    public int getTotal();

}






