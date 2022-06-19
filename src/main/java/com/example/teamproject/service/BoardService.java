<<<<<<< HEAD
//package com.example.teamproject.service;
//
//import com.example.teamproject.domain.vo.BoardVO;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public interface BoardService {
//    public boolean remove(Long bno);
//    public BoardVO read(Long bno);
//    public List<BoardVO> getList(Criteria criteria);
//}
=======
package com.example.teamproject.service;

import com.example.teamproject.domain.vo.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    public int remove(Long bno);
    public BoardVO read(Long bno);
    public List<BoardVO> getList(Criteria criteria);
}
>>>>>>> d8861bedc3b6c0c410020b48a8b1c936d06867d5
