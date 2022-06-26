package com.example.teamproject.mapper;

import com.example.teamproject.domain.vo.FileVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
    public interface FileMapper {
        public void insert(FileVO fileVO);
        public void delete(Long bno);
        public List<FileVO> findBno(Long bno);
        public List<FileVO> getOldFiles();
<<<<<<< HEAD

=======
        public List<FileVO> getList(Long bno);
>>>>>>> 7c63baf3c9cd7749d6fef87933b0335a23abcc37
    }

