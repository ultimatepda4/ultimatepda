package com.ultimatepda.engine.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Urls {

    @Value("${secure}")
    private static Boolean IsSecure;

    @Value("${api.external.type}")
    private static String ApiExternalType;

    public static String GoogleCustomSearch()
    {
        if(ApiExternalType.equalsIgnoreCase("live"))
        {
            return String.format(
                    Constants.GOOGLE_CUSTOM_SEARCH_BASE_URL,
                    Constants.GOOGLE_CUSTOM_SEARCH_CX,
                    Constants.GOOGLE_CUSTOM_SEARCH_API_KEY);
        }
        else if(ApiExternalType.equalsIgnoreCase("sample"))
        {
            return Constants.SAMPLE_SERVICE_BASE_URL + Constants.SAMPLE_SERVICE_GOOGLE_CUSTOM_SEARCH_URL;
        }
        else if(ApiExternalType.equalsIgnoreCase("mock"))
        {
            return Constants.SAMPLE_SERVICE_BASE_URL + Constants.SAMPLE_SERVICE_GOOGLE_CUSTOM_SEARCH_URL;
        }
        else
        {
            return Constants.SAMPLE_SERVICE_BASE_URL + Constants.SAMPLE_SERVICE_GOOGLE_CUSTOM_SEARCH_URL;
        }
    }
}
