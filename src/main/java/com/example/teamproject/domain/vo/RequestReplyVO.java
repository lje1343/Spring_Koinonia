package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class RequestReplyVO {
    private int rrno;
    private int rno;
    private String content;
    private String name;
    private String registerDate;
    private String updateDate;
}
