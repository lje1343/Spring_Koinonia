package com.example.teamproject.domain.dao;

import com.example.teamproject.domain.dao.board.BoardDAO;
import com.example.teamproject.domain.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BoardDAOTests {
    @Autowired
    private BoardDAO boardDAO;

    // 게시글 등록
    @Test
    public void registerTest(){
        BoardVO boardVO = new BoardVO();
        boardVO.setTitle("Test");
        boardVO.setContent("Test");
        boardVO.setName("Tester");
        boardDAO.register(boardVO);
    }
}
