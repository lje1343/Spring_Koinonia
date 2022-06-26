package com.example.teamproject.mapper;


<<<<<<< HEAD
=======
import com.example.teamproject.domain.vo.BoardDTO;
>>>>>>> 7c63baf3c9cd7749d6fef87933b0335a23abcc37
import com.example.teamproject.domain.vo.BoardVO;
import com.example.teamproject.domain.vo.Criteria;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public List<BoardVO> getList(Criteria criteria);
    public void insert(BoardVO boardVO);
    public int update(BoardVO boardVO);
    public BoardVO get(Long bno);
    public int delete(Long bno);
    public int getTotal();

<<<<<<< HEAD
=======
    //다이어리 페이지 리스트(검색조건 포함)
    public List<BoardDTO> getListBySearch(Criteria criteria);

>>>>>>> 7c63baf3c9cd7749d6fef87933b0335a23abcc37





}
