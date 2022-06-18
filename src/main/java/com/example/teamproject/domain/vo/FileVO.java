package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class FileVO {
    private String uuid;
    private String uploadpath;
    private String fileName;
    private String image;
    private int bno;
    private int fileSize;
}
