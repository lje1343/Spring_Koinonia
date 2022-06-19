package com.example.teamproject.service.product;

import com.example.teamproject.domain.dao.product.ProductReplyDAO;
import com.example.teamproject.domain.vo.ProductReplyVO;
import com.example.teamproject.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductReplyServieceImpl implements ReplyService {
    private final ProductReplyDAO productReplyDAO;

    // 판매 상품 댓글 작성
    public void register(ProductReplyVO productReplyVO) {
    }

    // 판매 상품 댓글 1개 조회
    @Override
    public ProductReplyVO read(Long rno) {
        return null;
    }

    // 판매 상품 댓글 전체 목록 조회
    @Override
    public List<ProductReplyVO> getList(Long pno, Criteria criteria) {
        return null;
    }

    // 판매 상품 댓글 삭제
    public boolean modify(ProductReplyVO productReplyVO) {
        return false;
    }

    // 판매 상품 댓글 수정
    @Override
    public boolean remove(Long rno) {
        return false;
    }

    // 판매 상품 댓글 개수
    @Override
    public int getTotal(Long pno) {
        return 0;
    }
}
