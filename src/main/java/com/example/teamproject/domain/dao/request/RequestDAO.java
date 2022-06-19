<<<<<<< HEAD
//package com.example.teamproject.domain.dao.request;
//
//import com.example.teamproject.domain.vo.RequestVO;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//@RequiredArgsConstructor
//public class RequestDAO {
//    private final RequestMapper requestMapper;
//
//    // 판매 상품 요청 목록
//    public List<RequestVO> getList(){
//
//    };
//
//    // 판매 상품 요청 등록
//    public void register(RequestVO requestVO){
//
//    };
//
//    // 판매 상품 요청 상세보기
//    public RequestVO read(Long rno){
//
//    };
//
//    // 판매 상품 요청 삭제
//    public boolean remove(Long rno){
//
//    };
//
//    // 판매 상품 요청 수정
//    public boolean modify(RequestVO requestVO){
//
//    };
//}
=======
package com.example.teamproject.domain.dao.request;

import com.example.teamproject.domain.vo.RequestVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RequestDAO {
    private final RequestMapper requestMapper;

    // 판매 상품 요청 목록
    public List<RequestVO> getList(Criteria criteria){
        return requestMapper.getList(criteria);
    };

    // 판매 상품 요청 등록
    public void register(RequestVO requestVO){
        return requestMapper.insert(requestVO);
    };

    // 판매 상품 요청 상세보기
    public RequestVO read(Long rno){
        return requestMapper.get(rno);
    };

    // 판매 상품 요청 삭제
    public int remove(Long rno){
        return requestMapper.delete(rno);
    };

    // 판매 상품 요청 수정
    public int modify(RequestVO requestVO){
        return requestMapper.update(requestVO);
    };
}
>>>>>>> d8861bedc3b6c0c410020b48a8b1c936d06867d5
