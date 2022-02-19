package com.neil.gulimall.product;

import com.neil.gulimall.product.entity.BrandEntity;
import com.neil.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("苹果");
        Boolean result = brandService.save(brandEntity);
        System.out.println(result);
    }

}
