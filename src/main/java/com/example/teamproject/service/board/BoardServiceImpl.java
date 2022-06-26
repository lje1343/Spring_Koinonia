package com.example.teamproject.service.board;

import com.example.teamproject.domain.dao.board.BoardDAO;
<<<<<<< HEAD
import com.example.teamproject.domain.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

=======
import com.example.teamproject.domain.vo.BoardDTO;
import com.example.teamproject.domain.vo.BoardVO;
import com.example.teamproject.domain.vo.Criteria;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

>>>>>>> 7c63baf3c9cd7749d6fef87933b0335a23abcc37
@Service
@RequiredArgsConstructor
public class BoardServiceImpl {
    private final BoardDAO boardDAO;

//    다이어리 등록
    public void register(BoardVO boardVO) {
        boardDAO.register(boardVO);
    }

//    다이어리 수정
    public int modify(BoardVO boardVO) {
        return boardDAO.modify(boardVO);
    }

//    다이어리 삭제
    public int remove(Long bno) {
        return boardDAO.remove(bno);
    }

//    다이어리 상세
    public BoardVO read(Long bno) {
        return boardDAO.read(bno);
    }

//    다이어리 목록
<<<<<<< HEAD
//    public List<BoardVO> getList(Criteria criteria) {
//        return boardDAO.getList(criteria);
//    }
=======
    public List<BoardVO> getList(Criteria criteria) {
        return boardDAO.getList(criteria);
    }

    //다이어리 페이지 리스트(검색조건 포함)
    public List<BoardDTO> getListBySearch(Criteria criteria){ return boardDAO.getListBySearch(criteria); }
>>>>>>> 7c63baf3c9cd7749d6fef87933b0335a23abcc37
}

