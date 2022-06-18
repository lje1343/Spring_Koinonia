package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BoardReplyVO {
    private int rno;
    private int bno;
    private String content;
    private String name;
    private String registerDate;
    private String updateDate;

}
