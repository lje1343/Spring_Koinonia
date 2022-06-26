package com.example.teamproject.mapper;

import com.example.teamproject.domain.vo.PFileVO;

import java.util.List;

public interface PFileMapper {
    public void insert(PFileVO pFileVO);
    public void delete(Long pno);
    public List<PFileVO> findByPno(Long pno);
    public List<PFileVO> getOldFiles();

}
