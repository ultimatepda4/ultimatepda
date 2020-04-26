package com.ultimatepda.engine;

import com.ultimatepda.engine.model.Walmart.Product;
import com.ultimatepda.engine.service.WalmartService;
import com.ultimatepda.engine.service.impl.WalmartServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class WalmartServiceTest {

    @Autowired
    WalmartService walmartService;

    @Test
    public void getProductAllTest() {

        try {
            Product walmartProduct = walmartService.getProductAll();
            Assert.assertTrue(walmartProduct != null
                    && walmartProduct.getItems().size() > 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getProductByIdTest() {

        try {
            Product walmartProduct = walmartService.getProductById("15076191");
            Assert.assertTrue(walmartProduct != null
                    && walmartProduct.getItems().size() > 0
                    && walmartProduct.getItems().get(0).getItemId().equals(15076191));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
