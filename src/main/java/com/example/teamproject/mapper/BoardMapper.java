package com.example.teamproject.mapper;


import com.example.teamproject.domain.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    public void insert(BoardVO boardVO);
    public int update(BoardVO boardVO);
    public int updatename(String name);
    public BoardVO get(Long bno);
    public void delete(Long bno);






}
