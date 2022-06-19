<<<<<<< HEAD
//package com.example.teamproject.domain.dao.declare;
//
//import com.example.teamproject.domain.vo.DeclareVO;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//@RequiredArgsConstructor
//public class DeclareDAO {
//    private final DeclareMapper declareMapper;
//
//    // 신고 등록
//    public void register(DeclareVO declareVO){
=======
package com.example.teamproject.domain.dao.declare;

import com.example.teamproject.domain.vo.DeclareVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DeclareDAO {
    private final DeclareMapper declareMapper;

    // 신고 등록
    public void register(DeclareVO declareVO){
        declareMapper.insert(declareVO);
    };

    // 신고 당한 횟수 조회
    public int getTotal(String email){
        return declareMapper.getTotal(email);
    };

    // 회원 1명의 신고 목록 조회
    public List<DeclareVO> getList(String name, Criteria criteria){
        return declareMapper.getList(name, criteria);
    };

//    // 신고 목록
//    public List<DeclareVO> getList(){
>>>>>>> d8861bedc3b6c0c410020b48a8b1c936d06867d5
//
//    };
//
//    // 신고 당한 횟수 조회
//    public int getTotal(String name){
//
//    };
//
//    // 회원 1명의 신고 목록 조회
//    public List<DeclareVO> getList(String name, Criteria criteria){
//
//    };
//
////    // 신고 목록
////    public List<DeclareVO> getList(){
////
////    };
//
////    // 신고 상세보기
////    public BoardVO read(long boardBno){
////
////    };
//
////    // 신고 삭제
////    public boolean remove(long boardBno){
////
////    };
//
////    // 신고 수정
////    public boolean modify(BoardVO boardVO){
////
////    };
//}
