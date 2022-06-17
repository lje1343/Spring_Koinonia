package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BoardVO {
    private int Bno;
    private String Title;
    private String Content;
    private String Name;
    private String RegisterDate;
    private String UpdateDate;
}
