<<<<<<< HEAD
//package com.example.teamproject.domain.dao.product;
//
//import com.example.teamproject.domain.vo.ProductVO;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//@RequiredArgsConstructor
//public class ProductDAO {
//    private final ProductMapper productMapper;
//
//    // 판매 상품 목록
//    public List<ProductVO> getList(){
//
//    };
//
//    // 판매 상품 등록
//    public void register(ProductVO productVO){
//
//    };
//
//    // 판매 상품 상세보기
//    public ProductVO read(Long pno){
//
//    };
//
//    // 판매 상품 삭제
//    public boolean remove(Long pno){
//
//    };
//
//    // 판매 상품 수정
//    public boolean modify(ProductVO productVO){
//
//    };
//}
=======
package com.example.teamproject.domain.dao.product;

import com.example.teamproject.domain.vo.ProductVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductDAO {
    private final ProductMapper productMapper;

    // 판매 상품 목록
    public List<ProductVO> getList(Criteria criteria){
        return productMapper.getList(criteria);
    };

    // 판매 상품 등록
    public void register(ProductVO productVO){
        return productMapper.insert(productVO);
    };

    // 판매 상품 상세보기
    public ProductVO read(Long pno){
        return productMapper.get(pno);
    };

    // 판매 상품 삭제
    public int remove(Long pno){
        return productMapper.delete(pno);
    };

    // 판매 상품 수정
    public int modify(ProductVO productVO){
        return  productMapper.update(productVO);
    };
}
>>>>>>> d8861bedc3b6c0c410020b48a8b1c936d06867d5
