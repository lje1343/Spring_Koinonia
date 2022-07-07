package com.example.teamproject.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserDTOB {
    private String name;
    private String registerdate;
    private String title;
    private Long bno;
}
