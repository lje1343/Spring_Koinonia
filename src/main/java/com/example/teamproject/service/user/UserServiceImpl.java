<<<<<<< HEAD
//package com.example.teamproject.service.user;
//
//import com.example.teamproject.domain.dao.user.UserDAO;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class UserServiceImpl {
//    private final UserDAO userDAO;
//
//    // 회원 등록
//    public void register(UserVO userVO){
//
//    };
//
//    // 회원 1명 조회
//    public UserVO read(String name){
//
//    };
//
//    // 회원 수정
//    public boolean modify(UserVO userVO){
//
//    };
//
//    // 회원 삭제
//    public boolean remove(String name){
//
//    };
//
//    // 회원 이름 수정
//    public boolean modifyName(){
//        // user table의 이름 수정
//        // 그 외 table의 이름 수정 ...
//        return false;
//    }
//}
=======
package com.example.teamproject.service.user;

import com.example.teamproject.domain.dao.board.BoardDAO;
import com.example.teamproject.domain.dao.user.UserDAO;
import com.example.teamproject.domain.vo.BoardVO;
import com.example.teamproject.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {
    private final UserDAO userDAO;
    private final BoardDAO boardDAO;

    // 회원 등록
    public void register(UserVO userVO) {
        userDAO.register(userVO);
    }

    ;

    // 회원 1명 조회
    public UserVO read(String email) {
        return userDAO.read(email);
    }

    ;

    // 회원 수정
    public int modify(UserVO userVO) {
        return userDAO.modify(userVO);
    }

    ;

    // 회원 삭제
    public int remove(String email, String pw) {
        return userDAO.remove(email, pw);
    }

    ;

    // 회원 이름 수정
    public boolean modifyName(UserVO userVO, BoardVO boardVO) {
        if (userDAO.updateName(userVO) + boardDAO.updateName(boardVO) >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
>>>>>>> d8861bedc3b6c0c410020b48a8b1c936d06867d5
