package com.ultimatepda.engine.service.impl;

import com.ultimatepda.engine.model.Walmart.Product;
import com.ultimatepda.engine.service.WalmartService;
import com.ultimatepda.engine.util.Constants;
import com.ultimatepda.engine.util.JsonTransformer;
import com.ultimatepda.engine.util.RestHelper;

import java.io.IOException;

public class WalmartServiceImpl implements WalmartService {

    String sampleServiceWalmartBaseUrl = Constants.SAMPLE_SERVICE_BASE_URL + "walmart/product/";
    @Override
    public Product getProductAll() throws IOException {

        Product walmartProduct =
                JsonTransformer.stringToObject(
                        RestHelper.doHttpGet(sampleServiceWalmartBaseUrl + "all"),
                        Product.class);
        return walmartProduct;
    }

    @Override
    public Product getProductById(String id) throws IOException{
        Product walmartProduct =
                JsonTransformer.stringToObject(
                        RestHelper.doHttpGet(sampleServiceWalmartBaseUrl + "15076191"),
                        Product.class);
        return walmartProduct;
    }
}
