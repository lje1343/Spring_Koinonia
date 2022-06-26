package com.example.teamproject.controller.board;

import com.example.teamproject.domain.vo.BoardVO;
import com.example.teamproject.domain.vo.Criteria;
import com.example.teamproject.domain.vo.RequestVO;
import com.example.teamproject.service.board.BoardServiceImpl;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

@Controller
@Slf4j
@RequestMapping("/board/*")
@RequiredArgsConstructor
public class BoardController {
    private final BoardServiceImpl boardService;
    // 다이어리

    @GetMapping("/register")
    public String register(){
        log.info("*************");
        log.info("다이어리 작성");
        log.info("*************");
        return "/diary/board_write";
    }

    // 진행 예정 공연 등록 페이지 이동
    @PostMapping("/register")
    public RedirectView register(BoardVO boardVO, RedirectAttributes rttr) {
        boardVO.setName("테스트");
        boardService.register(boardVO);
        rttr.addFlashAttribute("bno", boardVO.getBno());
        return new RedirectView("/diary/index");
    }
    
//    @PostMapping("/register")
//    public String register(BoardVO boardVO, RedirectAttributes rttr){
//        log.info("*************");
//        log.info("다이어리 등록");
//        log.info("*************");
//        // 다이어리 등록
//        return new RedirectView("/board/list");
//    }

    @GetMapping("/modify")
    public String modify(Long bno, Model model){
        log.info("*************");
        log.info("다이어리 수정내용 작성/삭제");
        log.info("*************");
        bno = 39L;
        // 다이어리 수정
        model.addAttribute("diary", boardService.read(bno));
        return "/diary/board_modify";
    }
//    @PostMapping("/modify")
//    public String modify(Long bno, RedirectAttributes rttr){
//        log.info("*************");
//        log.info("다이어리 수정");
//        log.info("*************");
//        // 다이어리 수정 완료
//        return new RedirectView("/board/list");
//    }
//    @PostMapping("/remove")
//    public String remove(Long bno, RedirectAttributes rttr){
//        log.info("*************");
//        log.info("다이어리 삭제");
//        log.info("*************");
//        // 다이어리 삭제
//        return new RedirectView("/board/list");
//    }

    @GetMapping("/detail")
    public String read(Long bno, Model model){
        log.info("*************");
        log.info("다이어리 상세");
        log.info("*************");
        // 다이어리 상세
        return "/diary/detail";
    }

    @GetMapping("/list")
    public String getList(Criteria criteria, Model model){
        log.info("*************");
        log.info("다이어리 리스트");
        log.info("*************");
        // 다이어리 리스트
        return "/diary/index";
    }

    ///////////////////////////////////////////////////
    // ResponsBody

    // 상품사진 업로드(상품요청글 작성페이지)
    @PostMapping("/uploadImg")
    @ResponseBody
    public void uploadImg(MultipartFile[] uploadFile) throws IOException {
        String uploadFolder = "C:/upload";
        for(MultipartFile file : uploadFile){
            log.info("--------------------------------");
            log.info("Upload File Name : " + file.getOriginalFilename());
            log.info("Upload File Size : " + file.getSize());

            File saveFile = new File(uploadFolder, file.getOriginalFilename());
            file.transferTo(saveFile);
        }
    }

    // 카테고리별 상품 목록
    @GetMapping("/list/{bcate}") // #카테고리 변수명 미정
    @ResponseBody
    public List<RequestVO> getList(@PathVariable("bcate")String bcate){
        return null;
    }

    // 무한 스크롤
    @GetMapping("/list/{bcate}/{pageNum}")
    @ResponseBody
    public List<RequestVO> getMoreList(@PathVariable("bcate") String bcate, @PathVariable("pageNum") int pageNum){
        return null;
    }

    // 좋아요 목록에 추가
    @GetMapping("/wish")
    @ResponseBody
    public boolean wish(Long bno){
        return false;
    }
//
//    @ResponseBody
//    @PostMapping("/fileUpload")
//    public void fileUpload(MultipartFile file, HttpServletRequest request,
//                           HttpServletResponse response) throws Exception {
////        response.setContentType("text/html;charset=utf-8");
////        PrintWriter out = response.getWriter();
////        String file_name = file.getOriginalFilename();
////        String server_file_name = fileDBName(file_name, save_folder);
////        System.out.println("server file : " + server_file_name);
////        file.transferTo(new File(save_folder + server_file_name));
////        out.println("resources/upload"+server_file_name);
////        out.close();
//    }
//
//    private String fileDBName(String fileName, String saveFolder) {
//        Calendar c = Calendar.getInstance();
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH);
//        int date = c.get(Calendar.DATE);
//
//        String homedir = saveFolder + year + "-" + month + "-" + date;
//        System.out.println(homedir);
//        File path1 = new File(homedir);
//        if (!(path1.exists())) {
//            path1.mkdir();
//        }
//        Random r = new Random();
//        int random = r.nextInt(100000000);
//
//        int index = fileName.lastIndexOf(".");
//
//        String fileExtension = fileName.substring(index + 1);
//        System.out.println("fileExtension = " + fileExtension);
//
//        String refileName = "bbs" + year + month + date + random + "." + fileExtension;
//        System.out.println("refileName = " + refileName);
//
//        String fileDBName = "/" + year + "-" + month + "-" + date + "/" + refileName;
//        System.out.println("fileDBName = " + fileDBName);
//
//        return fileDBName;
//    }

//    @RequestMapping(value="/summer_image.do", produces = "application/json; charset=utf8")
//    @ResponseBody
//    public String uploadSummernoteImageFile(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest request ) throws IOException {
//        JsonObject json = new JsonObject();
//
//        String fileRoot = EgovProperties.getProperty("Globals.tempDir");
//        String originalFileName = multipartFile.getOriginalFilename();	//오리지날 파일명
//        String extension = originalFileName.substring(originalFileName.lastIndexOf(".")); //파일 확장자
//
//        String savedFileName = UUID.randomUUID() + extension;	//저장될 파일 명
//        File targetFile = new File(fileRoot + savedFileName);
//
//        try {
//            // 파일 저장
//            InputStream fileStream = multipartFile.getInputStream();
//            FileUtils.copyInputStreamToFile(fileStream, targetFile);
//
//            // 파일을 열기위하여 common/getImg.do 호출 / 파라미터로 savedFileName 보냄.
//            json.addProperty("url", "common/getImg.do?savedFileName="+savedFileName);
//            json.addProperty("responseCode", "success");
//
//        } catch (IOException e) {
//            FileUtils.deleteQuietly(targetFile);
//            json.addProperty("responseCode", "error");
//            e.printStackTrace();
//        }
//        String jsonvalue = json.toString();
//
//        return jsonvalue;
//    }

//    @PostMapping("/fileUpload")
//    @ResponseBody
////    public ResponseEntity<?> summerimage(@RequestParam("file") MultipartFile img, HttpServletRequest request) throws IOException {
//    public ResponseEntity<?> summerimage(@RequestParam("file") MultipartFile img, HttpServletRequest request) throws IOException {
//    }

}
