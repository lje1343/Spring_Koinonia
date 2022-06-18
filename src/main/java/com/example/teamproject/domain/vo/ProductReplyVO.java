package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProductReplyVO {
    private int prno;
    private int pno;
    private String content;
    private String name;
    private String registerDate;
    private String updateDate;
}
