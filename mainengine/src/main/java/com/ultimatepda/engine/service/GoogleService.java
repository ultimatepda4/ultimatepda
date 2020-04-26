package com.ultimatepda.engine.service;

import com.ultimatepda.engine.model.Google.CustomSearch.GCS;
import org.springframework.stereotype.Component;

import java.io.IOException;

public interface GoogleService {
    GCS getResultAll() throws IOException;
    GCS getResultByCount(int count)  throws IOException;
    GCS getResultsFor(String criteria) throws IOException;
}
