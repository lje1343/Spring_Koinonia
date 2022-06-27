package com.example.teamproject.domain.dao.product;

import com.example.teamproject.domain.vo.PFileVO;
import com.example.teamproject.mapper.PFileMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@RequiredArgsConstructor
public class  PFileDAO {
    private final PFileMapper PfileMapper;

    public void register(PFileVO pFileVO){ PfileMapper.insert(pFileVO);};

    public void remove(Long pno){ PfileMapper.delete(pno); }

    public List<PFileVO> findByPno(Long pno){
        return PfileMapper.findByPno(pno);
    }

    public List<PFileVO> getOldFiles(){ return PfileMapper.getOldFiles(); }
}