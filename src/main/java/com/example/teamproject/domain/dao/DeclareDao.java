package com.example.teamproject.domain.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DeclareDao {
    // 신고 목록
    public List<BoardVo> getList(){

    };

    // 신고 등록
    public void register(BoardVo boardVO){

    };

//    // 신고 상세보기
//    public BoardVO read(long boardBno){
//
//    };

//    // 신고 삭제
//    public boolean remove(long boardBno){
//
//    };

//    // 신고 수정
//    public boolean modify(BoardVO boardVO){
//
//    };
}
