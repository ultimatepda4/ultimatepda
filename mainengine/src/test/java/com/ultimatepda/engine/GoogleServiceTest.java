package com.ultimatepda.engine;

import com.ultimatepda.engine.model.Google.CustomSearch.GCS;
import com.ultimatepda.engine.service.GoogleService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EngineApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@RestClientTest(GoogleService.class)
public class GoogleServiceTest {

    @Autowired
    private GoogleService googleService;

    @Test
    public void getProductAllTest() {

        try {
            GCS gcs = googleService.getResultAll();
            Assert.assertTrue(gcs != null
                    && gcs.getItems().size() > 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getProductByIdTest() {
        try {
            GCS gcs = googleService.getResultByCount(1);
            Assert.assertTrue(gcs != null
                    && gcs.getItems().size() == 1
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getResultsForTest() {
        try {
            GCS gcs = googleService.getResultsFor("paneer");
            Assert.assertTrue(gcs != null
                    && gcs.getItems().size() > 1
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
