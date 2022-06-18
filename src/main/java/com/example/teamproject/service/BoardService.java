package com.example.teamproject.service;

import com.example.teamproject.domain.vo.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    public boolean remove(Long bno);
    public BoardVO read(Long bno);
    public List<BoardVO> getList(Criteria criteria);
}
