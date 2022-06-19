<<<<<<< HEAD
//package com.example.teamproject.service.request;
//
//import com.example.teamproject.domain.dao.request.RequestDAO;
//import com.example.teamproject.domain.vo.RequestVO;
//import com.example.teamproject.service.BoardService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class RequestServieceImpl implements BoardService {
//    public final RequestDAO requestDAO;
//
//    // 판매 상품 요청 등록
//    public void register(RequestVO requestVO) { }
//
//    // 판매 상품 요청 수정
//    public boolean modify(RequestVO requestVO) {
//        return false;
//    }
//
//    // 판매 상품 요청 삭제
//    @Override
//    public boolean remove(Long bno) {
//        return false;
//    }
//
//    // 판매 상품 요청 상세
//    @Override
//    public RequestVO read(Long bno) {
//        return null;
//    }
//
//    // 판매 상품 요청 목록
//    @Override
//    public List<RequestVO> getList(Criteria criteria) {
//        return null;
//    }
//}
=======
package com.example.teamproject.service.request;

import com.example.teamproject.domain.dao.request.RequestDAO;
import com.example.teamproject.domain.vo.RequestVO;
import com.example.teamproject.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestServieceImpl implements BoardService {
    public final RequestDAO requestDAO;

    // 판매 상품 요청 등록
    public void register(RequestVO requestVO) {
        requestDAO.register(requestVO);
    }

    // 판매 상품 요청 수정
    public int modify(RequestVO requestVO) {
        return requestDAO.modify(requestVO);
    }

    // 판매 상품 요청 삭제
    @Override
    public int remove(Long rno) {
        return requestDAO.remove(rno);
    }

    // 판매 상품 요청 상세
    @Override
    public RequestVO read(Long rno) {
        return requestDAO.read(rno);
    }

    // 판매 상품 요청 목록
    @Override
    public List<RequestVO> getList(Criteria criteria) {
        return requestDAO.getList(criteria);
    }
}
>>>>>>> d8861bedc3b6c0c410020b48a8b1c936d06867d5
