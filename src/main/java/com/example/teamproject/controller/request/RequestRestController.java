package com.example.teamproject.controller.request;

import com.example.teamproject.domain.vo.RequestVO;
import com.example.teamproject.service.request.RequestServieceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/request_rest/*")
@RequiredArgsConstructor
public class RequestRestController {
    private final RequestServieceImpl requestServiece;

    // 상품사진 업로드(상품요청글 작성페이지)
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

    // 카테고리별 상품 목록
    @GetMapping("/list/{#카테고리}") // #카테고리 변수명 미정
    public List<RequestVO> getList(@PathVariable("#카테고리") String #카테고리){
        return null;
    }
    // 무한 스크롤
    @GetMapping("/list/{#카테고리}/{#페이지번호}")
    public List<RequestVO> getList(@PathVariable("#카테고리") String #카테고리 @PathVariable("#페이지번호") int #페이지번호){
        return null;
    }
}

