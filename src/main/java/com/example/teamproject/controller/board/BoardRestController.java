package com.example.teamproject.controller.board;

import com.example.teamproject.domain.vo.BoardVO;
import com.example.teamproject.service.board.BoardServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/board_rest/*")
@RequiredArgsConstructor
public class BoardRestController {
    public final BoardServiceImpl boardService;

    // 썸네일 업로드
    @PostMapping("/uploadThum")
    public void uploadThum(MultipartFile[] uploadFile) throws IOException {
        String uploadFolder = "C:/upload";
        for(MultipartFile file : uploadFile){
            log.info("--------------------------------");
            log.info("Upload File Name : " + file.getOriginalFilename());
            log.info("Upload File Size : " + file.getSize());

            File saveFile = new File(uploadFolder, file.getOriginalFilename());
            file.transferTo(saveFile);
        }
    }

    // 다이어리 이미지 업로드
    @PostMapping("/uploadImg")
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

    // 무한 스크롤
    @GetMapping("/list/{#카테고리}/{#페이지번호}")
    public List<BoardVO> getList(@PathVariable("#카테고리")String #카테고리 @PathVariable("#페이지번호") int #페이지번호){
        return null;
    }
}
