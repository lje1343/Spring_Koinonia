package com.example.teamproject.service.product;

import com.example.teamproject.domain.vo.Criteria;
import com.example.teamproject.domain.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ProductServiceTests {
<<<<<<< HEAD
//    @Autowired
//    private ProductServieceImpl productServiece;
=======
    @Autowired
    private ProductServieceImpl productServiece;

    @Test
    public void getListTest(){
        productServiece.getList(new Criteria(1, 15)).stream().map(ProductVO::toString).forEach(log::info);
    }
<<<<<<< HEAD

    @Test
    public void modifyTest(){
        Long pno = 3L;
        ProductVO productVO = productServiece.read(pno);
        if(productVO == null) { log.info("NO product"); return;}

        if(productServiece.modify(productVO)>0){
            log.info("UPDATE SUCCESS");
        }else{
            log.info("UPDATE FAIL");
        }
    }
=======
>>>>>>> 7c63baf3c9cd7749d6fef87933b0335a23abcc37
>>>>>>> 8537ee2bff201341253e72108c09067ecd7632a9
}
