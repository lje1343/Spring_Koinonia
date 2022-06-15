package com.example.teamproject.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReplyService {
    public void register(ReplyVO replyVO);
    public ReplyVO read(Long rno);
    public List<ReplyVO> getList(Long bno, Criteria criteria);
    public boolean modify(ReplyVO replyVO);
    public boolean remove(Long rno);
    public int getTotal(Long bno){
    }
}
