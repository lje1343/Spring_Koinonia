package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class RequestVO {
    private int rno;
    private String name;
    private String title;
    private String content;
    private String registerDate;
    private String updateDate;
}
