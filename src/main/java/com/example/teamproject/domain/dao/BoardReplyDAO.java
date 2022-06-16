package com.example.teamproject.domain.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardReplyDAO {
    private final BoardReplyMapper boardReplyMapper;

    // 다이어리 댓글 작성
    public void register(BoardReplyVO boardReplyVO){

    };

    // 다이어리 댓글 1개 조회
    public BoardReplyVO read(Long rno){

    };

    // 다이어리 댓글 전체 목록 조회
    public List<BoardReplyVO> getList(Long bno, Criteria criteria){

    }

    // 다이어리 댓글 삭제
    public boolean remove(Long rno){

    };

    // 다이어리 댓글 수정
    public boolean modify(BoardReplyVO boardReplyVO){

    };

    // 다이어리 댓글 개수
    public int getTotal(Long bno){

    };

}
