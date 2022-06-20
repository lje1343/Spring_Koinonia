<<<<<<< HEAD
//package com.example.teamproject.service.declare;
//
//import com.example.teamproject.domain.dao.declare.DeclareDAO;
//import com.example.teamproject.domain.vo.DeclareVO;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class DeclareServieceImpl {
//    private final DeclareDAO productDAO;
//
//    // 신고 등록
//    public void register(DeclareVO declareVO){
//
//    };
//
//    // 신고 당한 횟수 조회
//    public int getTotal(String name){
//        return 0;
//    };
//
//    // 회원 1명의 신고 목록 조회
//    public List<DeclareVO> getList(String name, Criteria criteria){
//        return null;
//    };
//}
=======
package com.example.teamproject.service.declare;

import com.example.teamproject.domain.dao.declare.DeclareDAO;
import com.example.teamproject.domain.vo.DeclareVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeclareServieceImpl {
    private final DeclareDAO declareDAO;

    // 신고 등록
    public void register(DeclareVO declareVO){
        declareDAO.register(declareVO);
    };

    // 신고 당한 횟수 조회
    public int getTotal(String name){
        return declareDAO.getTotal(name);
    };

    // 회원 1명의 신고 목록 조회
    public List<DeclareVO> getList(String name, Criteria criteria){
        return declareDAO.getList(name, criteria);
    };
}
>>>>>>> d8861bedc3b6c0c410020b48a8b1c936d06867d5
