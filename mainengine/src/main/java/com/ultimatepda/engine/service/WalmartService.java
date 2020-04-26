package com.ultimatepda.engine.service;

import com.ultimatepda.engine.model.Walmart.Product;

import java.io.IOException;

public interface WalmartService {

    Product getProductAll() throws IOException;
    Product getProductById(String id)  throws IOException;
}
