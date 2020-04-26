package com.ultimatepda.engine.service.impl;

import com.ultimatepda.engine.model.Google.CustomSearch.GCS;
import com.ultimatepda.engine.service.GoogleService;
import com.ultimatepda.engine.util.Constants;
import com.ultimatepda.engine.util.JsonTransformer;
import com.ultimatepda.engine.util.RestHelper;
import com.ultimatepda.engine.util.Urls;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GoogleServiceImpl implements GoogleService {

    String sampleServiceGoogleBaseUrl = Constants.SAMPLE_SERVICE_BASE_URL + "googlecustomsearch/items/";

    @Override
    public GCS getResultAll() throws IOException {
        GCS gcs =
                JsonTransformer.stringToObject(
                        RestHelper.doHttpGet(sampleServiceGoogleBaseUrl + "all"),
                        GCS.class);
        return gcs;
    }

    @Override
    public GCS getResultByCount(int count) throws IOException {
        GCS gcs =
                JsonTransformer.stringToObject(
                        RestHelper.doHttpGet(sampleServiceGoogleBaseUrl + 1),
                        GCS.class);
        return gcs;
    }

    @Override
    public GCS getResultsFor(String criteria) throws IOException {
        GCS gcs =
                JsonTransformer.stringToObject(
                        RestHelper.doHttpGet(
                                String.format(Urls.GoogleCustomSearch(), criteria)),
                                GCS.class);
        return gcs;
    }
}
