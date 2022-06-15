package com.example.teamproject.domain.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardDao {
    // 다이어리 목록
    public List<BoardVo> getList(){

    };

    // 다이어리 등록
    public void register(BoardVo boardVO){

    };

    // 다이어리 상세보기
    public BoardVO read(long boardBno){

    };

    // 다이어리 삭제
    public boolean remove(long boardBno){

    };

    // 다이어리 수정
    public boolean modify(BoardVO boardVO){

    };
}
