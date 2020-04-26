package com.ultimatepda.engine;

import com.ultimatepda.engine.util.ApiExplorer;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

public class ApiExplorerTest {

    @Ignore
    @Test
    public void callApiTest()
    {
        ApiExplorer apiExp = new ApiExplorer();
        String response = null;

        try {
            response = apiExp.callApi();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(response != null);
    }

    @Ignore
    @Test
    public void callGoogleApiTest()
    {
        ApiExplorer apiExp = new ApiExplorer();
        String response = null;

        try {
            response = apiExp.callApi();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(response != null);
    }

    @Ignore
    @Test
    public void callGoogleClientLoginTest()
    {
//        // HttpTransport used to send login request.
//        HttpTransport transport = new NetHttpTransport();
//        try {
//            // authenticate with ClientLogin
//            ClientLogin authenticator = new ClientLogin();
//            authenticator.transport = transport;
//            // Google service trying to access, e.g., "cl" for calendar.
//            authenticator.authTokenType = "cl";
//            authenticator.username = "";
//            authenticator.password = "0";
//            authenticator.authenticate();
//            System.out.println("Authentication succeeded.");
//        } catch (HttpResponseException e) {
//            // Likely a "403 Forbidden" error.
//            System.err.println(e.getStatusMessage());
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
