package com.example.teamproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
    private final BoardDAO boardDAO;

//    다이어리 등록
    @Override
    public void register(BoardVO boardVO) {

    }

//    다이어리 수정
    @Override
    public boolean modify(BoardVO boardVO) {
        return false;
    }

//    다이어리 삭제
    @Override
    public boolean remove(Long bno) {
        return false;
    }

//    다이어리 상세
    @Override
    public BoardVO read(Long bno) {
        return null;
    }

//    다이어리 목록
    @Override
    public List<BoardVO> getList(Criteria criteria) {
        return null;
    }
}
