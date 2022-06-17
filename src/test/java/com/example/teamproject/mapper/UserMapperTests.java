package com.example.teamproject.mapper;

import com.example.teamproject.domain.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserMapperTests {
    @Autowired
    private  UserMapper userMapper;


    @Test
    public void insertTest(){
        BoardVO boardVO = new BoardVO();
        boardVO.setBoardTitle("새로운 게시글 제목2");
        boardVO.setBoardContent("새로운 게시글 내용2");
        boardVO.setBoardWriter("hds1111");

        boardMapper.insert(boardVO);

        log.info("게시글 번호 : " + boardVO.getBoardBno());
    }


}














