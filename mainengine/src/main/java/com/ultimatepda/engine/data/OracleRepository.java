package com.ultimatepda.engine.data;

import com.ultimatepda.engine.model.Product;

import java.util.List;

public class OracleRepository implements Repository {
    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public Product getProducts(String productId) {
        return null;
    }

    @Override
    public boolean updateProduct(Product product) {
        return false;
    }

    @Override
    public boolean insertProduct(Product product) {
        return false;
    }

    @Override
    public boolean deleteProduct(String productId) {
        return false;
    }
}
