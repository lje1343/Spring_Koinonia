<<<<<<< HEAD
//package com.example.teamproject.service.board;
//
//import com.example.teamproject.domain.dao.board.BoardDAO;
//import com.example.teamproject.domain.vo.BoardVO;
//import com.example.teamproject.service.BoardService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class BoardServiceImpl implements BoardService {
//    private final BoardDAO boardDAO;
//
////    다이어리 등록
//    public void register(BoardVO boardVO) { }
//
////    다이어리 수정
//    public boolean modify(BoardVO boardVO) {
//        return false;
//    }
//
////    다이어리 삭제
//    @Override
//    public boolean remove(Long bno) {
//        return false;
//    }
//
////    다이어리 상세
//    @Override
//    public BoardVO read(Long bno) {
//        return null;
//    }
//
////    다이어리 목록
//    @Override
//    public List<BoardVO> getList(Criteria criteria) {
//        return null;
//    }
//}
=======
package com.example.teamproject.service.board;

import com.example.teamproject.domain.dao.board.BoardDAO;
import com.example.teamproject.domain.vo.BoardVO;
import com.example.teamproject.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
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
    @Override
    public int remove(Long bno) {
        return boardDAO.remove(bno);
    }

//    다이어리 상세
    @Override
    public BoardVO read(Long bno) {
        return boardDAO.read(bno);
    }

//    다이어리 목록
    @Override
    public List<BoardVO> getList(Criteria criteria) {
        return boardDAO.getList(criteria);
    }
}
>>>>>>> d8861bedc3b6c0c410020b48a8b1c936d06867d5
