
package com.example.teamproject.controller.user;

import com.example.teamproject.domain.vo.*;
import com.example.teamproject.service.board.BoardFileServiceImpl;
import com.example.teamproject.service.board.BoardServiceImpl;
import com.example.teamproject.service.product.ProductFileServiceImpl;
import com.example.teamproject.service.product.ProductServieceImpl;
import com.example.teamproject.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;


import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/user/*")
@RequiredArgsConstructor
public class UserController {
    private final BoardServiceImpl boardService;
    private final UserServiceImpl userService;
    private final ProductServieceImpl productServiece;
    private final BoardFileServiceImpl boardFileService;
    private final ProductFileServiceImpl productFileService;
    // 회원가입/로그인/비밀번호찾기/마이페이지

    @GetMapping("/join")
    public String goToJoin(){
        log.info("*************");
        log.info("회원가입");
        log.info("*************");
        return "/user/join";
    }
    @PostMapping("/join")
    public String join(UserVO userVO){
        log.info("*************");
        log.info("회원등록");
        log.info("*************");
        // 회원등록
        userService.register(userVO);
        return "/user/login";
    }

    @GetMapping("/login")
    public String goToLogin(){
        log.info("*************");
        log.info("로그인");
        log.info("*************");
        return "/user/login";
    }
    @PostMapping("/login")
    public String login(String email, String pw, HttpSession session, Model model){
        log.info("*************");
        log.info("로그인 시도");
        log.info("*************");
        if(userService.login(email)==null || !(pw.equals(userService.login(email).getPw()))){
            // 로그인 실패
            model.addAttribute("msg", "아이디 혹은 비밀번호가 다릅니다.");
            return "/user/login";
        }
            // 로그인 성공
            session.setAttribute("email", email);
            session.setAttribute("name", userService.login(email).getName());

        String username = (String)userService.login(email).getName();


        List<String> productThumfileUrlList = new ArrayList<>();
        List<Long> pnumlist = new ArrayList<>();
        String pRequestUrl = "/productFile/display?fileName=";
        String productThumFileName = "";
        Long pnum = null;
        List<UserDTO> mysell = userService.mysell(username);
        for(UserDTO u : mysell){
            List<ProductFileVO> productFileList = productServiece.getList(u.getPno());
            if (!productFileList.isEmpty()) {
                pnum = productFileList.get(0).getPno();
                productThumFileName = pRequestUrl + productFileList.get(0).getUploadPath() + "/" + productFileList.get(0).getUuid() + "_" + productFileList.get(0).getFileName();
            } else {
                productThumFileName = "/images/no_image.gif";
            }
            productThumfileUrlList.add(productThumFileName);
            pnumlist.add(pnum);
        }



        log.info("넘버는" + pnumlist.toString());


        session.setAttribute("pnumlist", pnumlist);
        session.setAttribute("productThumfileUrlList", productThumfileUrlList);



//         다이어리 썸네일 리스트
        String bRequestUrl = "/boardFile/display?fileName=";
        String boardThumFileName = "";

        List<String> boardThumfileUrlList = new ArrayList<>();
        List<Long> bnumlist = new ArrayList<>();
        Long bnum = null;
        List<UserDTOB> mytravel = userService.mytravel(username);
        for(UserDTOB b : mytravel){
            List<FileVO> boardFileList = boardFileService.getList(b.getBno());
            if(!boardFileList.isEmpty()){
                bnum = boardFileList.get(0).getBno();
                boardThumFileName = bRequestUrl + boardFileList.get(0).getUploadPath() + "/"  + boardFileList.get(0).getUuid() + "_" + boardFileList.get(0).getFileName();
            }else{
                boardThumFileName = "/images/no_image.gif";
            }
            bnumlist.add(bnum);
            boardThumfileUrlList.add(boardThumFileName);
        }
        session.setAttribute("boardThumfileUrlList", boardThumfileUrlList);
        session.setAttribute("bnumlist",bnumlist);

            return "/user/mypage";

    }

    @GetMapping("/logout")
    public RedirectView logout(HttpSession session){
        log.info("*************");
        log.info("로그아웃");
        log.info("*************");
        session.invalidate(); // 세션 무효화
        return new RedirectView("/");
    }

    @GetMapping("/find_pw")
    public String goToFindPw(){
        log.info("*************");
        log.info("비밀번호찾기");
        log.info("*************");
        return "/user/find_pw";
    }


    @PostMapping("/find_pw")
    public String goToFindPw(String email, Model model){
        log.info("*************");
        log.info("비밀번호찾기");
        log.info("*************");
        if(userService.checkEmail(email) > 0){
            model.addAttribute("email", email);
            return "/user/new_pw";
        }else {
            model.addAttribute("msg", "등록된 회원이 아닙니다.");
            return "/user/find_pw";
        }
    }

    @GetMapping("/new_pw")
    public String goToNewPw(){
        log.info("*************");
        log.info("비밀번호재설정");
        log.info("*************");
        return "/user/new_pw";
    }
    @PostMapping("/new_pw")
    public String goToNewPw(String pw, String email, Model model){
        log.info("*************");
        log.info("비밀번호재설정");
        log.info("*************");
        userService.modifyPw(pw, email);
        model.addAttribute("msg","비밀번호가 재설정되었습니다.");
        return "/user/login";
    }


    @GetMapping("/modify")
    public String modify(Model model){
        log.info("*************");
        log.info("회원정보수정");
        log.info("*************");
        return "/user/update";
    }
//    @PostMapping("/modify")
//    public String modify(RedirectAttributes rttr){
//        log.info("*************");
//        log.info("회원정보수정");
//        log.info("*************");
//        return new RedirectView("/user/mypage");
//    }

    // 마이페이지

    @GetMapping("/mypage")
    public String goToMypage(HttpSession session){
        log.info("*************");
        log.info("마이페이지");
        log.info("*************");


        String name = (String)session.getAttribute("name");
        log.info("내이름은 " + name.toString());
        log.info(userService.mysell(name).toString());



        return "/user/mypage";
    }

    ///////////////////////////////////////////////////
    // ResponsBody

    // 이메일 중복확인
    @PostMapping("/checkEmail")
    @ResponseBody
    public boolean checkEmail(@RequestBody String email){
        log.info("*************");
        log.info("받은 데이터 : " + email);
        log.info("*************");
        if(userService.checkEmail(email) <= 0){
            return false;
        }
        return true;
    }

    // 이름 중복확인
    @PostMapping("/checkName")
    @ResponseBody
    public boolean checkName(@RequestBody String name){
        log.info("*************");
        log.info("받은 데이터 : " + name);
        log.info("*************");
        if(userService.checkName(name) <= 0){
            return false;
        }
        return true;
    }

    // 이름 수정
}
