package com.example.teamproject.domain.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RequestReplyDAO {
    private final RequestReplyMapper requestReplyMapper;

    // 판매 상품 요청 댓글 작성
    public void register(RequestReplyVO requestReplyVO){

    };

    // 판매 상품 요청 댓글 1개 조회
    public RequestReplyVO read(Long rno){

    };

    // 판매 상품 요청 댓글 전체 목록 조회
    public List<RequestReplyVO> getList(Long rno, Criteria criteria){

    };

    // 판매 상품 요청 댓글 삭제
    public boolean remove(Long rno){

    };

    // 판매 상품 요청 댓글 수정
    public boolean modify(RequestReplyVO requestReplyVO){

    };

    // 판매 상품 요청 댓글 개수
    public int getTotal(Long pno){

    };
}
