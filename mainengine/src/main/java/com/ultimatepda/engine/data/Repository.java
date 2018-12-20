package com.ultimatepda.engine.data;

import com.ultimatepda.engine.model.Product;

import java.util.List;

public interface Repository {

    List<Product> getProducts();
    Product getProducts(String productId);
    boolean updateProduct(Product product);
    boolean insertProduct(Product product);
    boolean deleteProduct(String productId);

}
