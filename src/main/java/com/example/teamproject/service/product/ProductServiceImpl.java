package com.example.teamproject.service.product;

import com.example.teamproject.domain.dao.product.PFileDAO;
import com.example.teamproject.domain.dao.product.ProductDAO;
import com.example.teamproject.domain.vo.Criteria;
import com.example.teamproject.domain.vo.PFileVO;
import com.example.teamproject.domain.vo.ProductVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDAO productDAO;
    private final PFileDAO pFileDAO;

    @Override
    public List<PFileVO> getOldFiles(){return pFileDAO.getOldFiles();}

    @Override
    public List<PFileVO> getList(Long pno) { return pFileDAO.findByPno(pno); }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void register(ProductVO productVO) {
        //게시글 추가
        productDAO.register(productVO);
        //게시글에 업로드된 첨부파일 정보 중 게시글 번호를 따로 추가
        if(productVO.getFileList() != null) {
            productVO.getFileList().forEach(pFileVO ->  {
                pFileVO.setPno(productVO.getPno());
                pFileDAO.register(pFileVO);
            });
        }
    }

    @Override
    public ProductVO read(Long pno) { return productDAO.read(pno); }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int modify(ProductVO productVO) {
        pFileDAO.remove(productVO.getPno());

        if(productVO.getFileList() != null) {
            productVO.getFileList().forEach(pFileVO -> {
                pFileVO.setPno(productVO.getPno());
                pFileDAO.register(pFileVO);
            });
        }
        return productDAO.modify(productVO);
    }

    @Override
    public int remove(Long pno) {
        return productDAO.remove(pno);
    }

    @Override
    public List<ProductVO> getList(Criteria criteria) {
        return productDAO.getList(criteria);
    }

    @Override
    public int getTotal() { return productDAO.getTotal(); }


}
