<<<<<<< HEAD
//package com.example.teamproject.service.product;
//
//import com.example.teamproject.domain.dao.product.ProductDAO;
//import com.example.teamproject.domain.vo.ProductVO;
//import com.example.teamproject.service.BoardService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class ProductServieceImpl implements BoardService {
//    private final ProductDAO productDAO;
//
//    // 판매 상품 등록
//    public void register(ProductVO productVO) { }
//
//    // 판매 상품 수정
//    public boolean modify(ProductVO productVO) {
//        return false;
//    }
//
//    // 판매 상품 삭제
//    @Override
//    public boolean remove(Long bno) {
//        return false;
//    }
//
//    // 판매 상품 상세
//    @Override
//    public ProductVO read(Long bno) {
//        return null;
//    }
//
//    // 판매 상품 목록
//    @Override
//    public List<ProductVO> getList(Criteria criteria) {
//        return null;
//    }
//}
=======
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
    public void register(ProductVO productVO) {
        productDAO.register(productVO);
    }

    // 판매 상품 수정
    public int modify(ProductVO productVO) {
        return productDAO.modify(productVO);
    }

    // 판매 상품 삭제
    @Override
    public int remove(Long bno) {
        return productDAO.remove(bno);
    }

    // 판매 상품 상세
    @Override
    public ProductVO read(Long bno) {
        return productDAO.read(bno);
    }

    // 판매 상품 목록
    @Override
    public List<ProductVO> getList(Criteria criteria) {
        return productDAO.getList(criteria);
    }
}
>>>>>>> d8861bedc3b6c0c410020b48a8b1c936d06867d5
