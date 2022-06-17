package com.example.teamproject.service.declare;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeclareServiece {
    private final ProductDAO productDAO;

    // 신고 등록
    public void register(DeclareVO declareVO){

    };

    // 신고 당한 횟수 조회
    public int getTotal(String name){

    };

    // 회원 1명의 신고 목록 조회
    public List<DeclareVO> getList(String name, Criteria criteria){

    };
}
