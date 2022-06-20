<<<<<<< HEAD
//package com.example.teamproject.domain.dao.product;
//
//import com.example.teamproject.domain.vo.ProductReplyVO;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//@RequiredArgsConstructor
//public class ProductReplyDAO {
//    private final PreplyMapper productReplyMapper;
//
//    // 판매 상품 댓글 작성
//    public void register(ProductReplyVO productReplyVO){
//
//    };
//
//    // 판매 상품 댓글 1개 조회
//    public ProductReplyVO read(Long rno){
//
//    };
//
//    // 판매 상품 댓글 전체 목록 조회
//    public List<ProductReplyVO> getList(Long pno, Criteria criteria){
//
//    };
//
//    // 판매 상품 댓글 삭제
//    public boolean remove(Long rno){
//
//    };
//
//    // 판매 상품 댓글 수정
//    public boolean modify(ProductReplyVO productReplyVO){
//
//    };
//
//    // 판매 상품 댓글 개수
//    public int getTotal(Long pno){
//
//    };
//
//}
=======
package com.example.teamproject.domain.dao.product;

import com.example.teamproject.domain.vo.ProductReplyVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductReplyDAO {
    private final PreplyMapper productReplyMapper;

    // 판매 상품 댓글 작성
    public void register(ProductReplyVO productReplyVO){
        productReplyMapper.insert(productReplyVO);
    };

    // 판매 상품 댓글 1개 조회
    public ProductReplyVO read(Long rno){
        return productReplyMapper.getReply(rno);
    };

    // 판매 상품 댓글 전체 목록 조회
    public List<ProductReplyVO> getList(Long pno, Criteria criteria){
        return productReplyMapper.getList(pno, criteria);
    };

    // 판매 상품 댓글 삭제
    public boolean remove(Long rno){
        productReplyMapper.delete(rno);
    };

    // 판매 상품 댓글 수정
    public boolean modify(ProductReplyVO productReplyVO){
        return productReplyMapper.update(productReplyVO);
    };

    // 판매 상품 댓글 개수
    public int getTotal(Long pno){
        productReplyMapper.getTotal(pno);
    };

}
>>>>>>> d8861bedc3b6c0c410020b48a8b1c936d06867d5
