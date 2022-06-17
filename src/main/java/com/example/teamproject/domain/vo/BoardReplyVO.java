package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BoardReplyVO {
    private int Rno;
    private int Bno;
    private String Content;
    private String Name;
    private String RegisterDate;
    private String UpdateDate;

}
