package com.example.teamproject.domain.dao.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductReplyDAO {
    private final ProductReplyMapper productReplyMapper;

    // 판매 상품 댓글 작성
    public void register(ProductReplyVO productReplyVO){

    };

    // 판매 상품 댓글 1개 조회
    public ProductReplyVO read(Long rno){

    };

    // 판매 상품 댓글 전체 목록 조회
    public List<ProductReplyVO> getList(Long pno, Criteria criteria){

    };

    // 판매 상품 댓글 삭제
    public boolean remove(Long rno){

    };

    // 판매 상품 댓글 수정
    public boolean modify(ProductReplyVO productReplyVO){

    };

    // 판매 상품 댓글 개수
    public int getTotal(Long pno){

    };

}
