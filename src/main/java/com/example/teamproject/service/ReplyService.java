<<<<<<< HEAD
//package com.example.teamproject.service;
//
//import com.example.teamproject.domain.vo.BoardReplyVO;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public interface ReplyService {
//    public BoardReplyVO read(Long rno);
//    public List<BoardReplyVO> getList(Long bno, Criteria criteria);
//    public boolean remove(Long rno);
//    public int getTotal(Long bno);
//}
=======
package com.example.teamproject.service;

import com.example.teamproject.domain.vo.BoardReplyVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReplyService {
    public BoardReplyVO read(Long rno);
    public List<BoardReplyVO> getList(Long bno, Criteria criteria);
    public int remove(Long rno);
    public int getTotal(Long bno);
}
>>>>>>> d8861bedc3b6c0c410020b48a8b1c936d06867d5
