package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProductFileVO {
    private String fileName;
    private String uploadPath;
    private String uuid;
    private boolean image;
    private Long pno;
}
