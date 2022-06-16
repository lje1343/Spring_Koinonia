package com.example.teamproject.service.request;

import com.example.teamproject.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestServieceImpl implements BoardService {
    public final ReguestDAO reguestDAO;

    // 판매 상품 요청 등록
    public void register(RequestVO requestVO) {

    }

    // 판매 상품 요청 수정
    public boolean modify(RequestVO requestVO) {
        return false;
    }

    // 판매 상품 요청 삭제
    @Override
    public boolean remove(Long bno) {
        return false;
    }

    // 판매 상품 요청 상세
    @Override
    public RequestVO read(Long bno) {
        return null;
    }

    // 판매 상품 요청 목록
    @Override
    public List<RequestVO> getList(Criteria criteria) {
        return null;
    }
}
