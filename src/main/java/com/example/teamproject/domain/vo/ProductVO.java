package com.example.teamproject.domain.vo;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProductVO {
    private int pno;
    private String name;
    private String pname;
    private String title;
    private String pinfo;
    private String price;
    private String psold;
    private String registerDate;
    private String updateDate;
}
