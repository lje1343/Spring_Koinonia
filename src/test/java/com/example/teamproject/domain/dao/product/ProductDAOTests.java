package com.example.teamproject.domain.dao.product;

import com.example.teamproject.domain.dao.product.ProductDAO;
import com.example.teamproject.domain.dao.user.UserDAO;
<<<<<<< HEAD
import lombok.extern.slf4j.Slf4j;
=======
import com.example.teamproject.domain.vo.Criteria;
import com.example.teamproject.domain.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
>>>>>>> 7c63baf3c9cd7749d6fef87933b0335a23abcc37
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ProductDAOTests {
    @Autowired
    private ProductDAO productDAO;
<<<<<<< HEAD
=======

    @Test
    public void getListTest(){
        productDAO.getList(new Criteria(1, 15)).stream().map(ProductVO::toString).forEach(log::info);
    }
>>>>>>> 7c63baf3c9cd7749d6fef87933b0335a23abcc37
}
