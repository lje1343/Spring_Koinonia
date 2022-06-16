package com.example.teamproject.domain.dao.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class WishboardDAO {
    private final WishboardMapper wishboardMapper;

    // 좋아요 목록에 추가
    public void register(WishboardVO wishboardVO){

    };

    // 회원 1명의 좋아요 목록
    public List<WishboardVO> getList(String name){

    };

}
