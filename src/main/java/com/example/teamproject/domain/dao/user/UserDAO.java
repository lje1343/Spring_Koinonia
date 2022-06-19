//package com.example.teamproject.domain.dao.user;
//
//import com.example.teamproject.domain.vo.UserVO;
//import com.example.teamproject.mapper.UserMapper;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//@RequiredArgsConstructor
//public class UserDAO {
//    private final UserMapper userMapper;
//
//    // 회원 등록
//    public void register(UserVO userVO){
//        userMapper.insert(userVO);
//    };
//
//    // 아이디 조회(중복체크)
//    public int checkId(String email){
//        return  userMapper.checkId(email);
//    }
//
//    // 로그인
//    public UserVO login(UserVO userVO){
//        return userMapper.login(userVO);
//    }
//
//    // 회원 1명 조회
//    public UserVO read(String email){
//        return userMapper.find(email);
//    };
//
//    // 회원 수정
//    public int modify(UserVO userVO){
//        return userMapper.update(userVO);
//    };
//
//    // 회원 이름 수정
//    public int updateName(UserVO userVO){
//        return userMapper.nameupdate(userVO);
//    }
//
//    // 회원 삭제
//    public int remove(String email, String pw){
//        return userMapper.delete(email,pw);
//    };
//
////    // 회원 리스트
////    public List<UserVO> getList(){
////
////    };
//}
