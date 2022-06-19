package com.example.teamproject.service.board;

import com.example.teamproject.domain.dao.board.BoardReplyDAO;
import com.example.teamproject.domain.vo.BoardReplyVO;
import com.example.teamproject.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardReplyServiceImpl implements ReplyService {
    private final BoardReplyDAO boardReplyDAO;

    // 다이어리 댓글 등록
    public void register(BoardReplyVO boardReplyVO) {
        boardReplyDAO.register(boardReplyVO);
    }

    @Override
    // 다이어리 댓글 1개 조회
    public BoardReplyVO read(Long rno) {
        return boardReplyDAO.read(rno);
    }

    // 다이어리 댓글 전체 목록 조회
    @Override
    public List<BoardReplyVO> getList(Long bno, Criteria criteria) {
        return boardReplyDAO.getList(bno, criteria);
    }

    // 다이어리 댓글 삭제
    public int modify(BoardReplyVO boardReplyVO) {
        return boardReplyDAO.modify(boardReplyVO);
    }

    // 다이어리 댓글 수정
    @Override
    public int remove(Long rno) {
        return boardReplyDAO.remove(rno);
    }

    // 다이어리 댓글 개수
    @Override
    public int getTotal(Long bno) {
        return boardReplyDAO.getTotal(bno);
    }

}
