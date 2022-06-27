package com.example.teamproject.service.product;

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
public class ProductServiceTests {
    @Autowired
    private ProductServieceImpl productServiece;
<<<<<<< HEAD
=======

    @Test
    public void getListTest() {
        productServiece.getList(new Criteria(1, 15)).stream().map(ProductVO::toString).forEach(log::info);
    }
<<<<<<< HEAD
>>>>>>> 7c63baf3c9cd7749d6fef87933b0335a23abcc37
=======

>>>>>>> d13089d406620e5be9aa20706d5e5a3235b67d59
}
