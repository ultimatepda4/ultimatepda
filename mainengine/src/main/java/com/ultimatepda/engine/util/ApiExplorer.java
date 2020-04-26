package com.ultimatepda.engine.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorer {
    public String callApi() throws IOException {
        StringBuilder urlBuilder = new StringBuilder("https://api.shop.com:8443/stores/v1/products/{prodID}".replace("{prodID}", URLEncoder.encode("874694776", "UTF-8")));
        urlBuilder.append("?");
        urlBuilder.append(URLEncoder.encode("allperms","UTF-8") + "=" + URLEncoder.encode("false", "UTF-8"));
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("apikey", "l7xxfb05bd935c4142a484d6d2bfff46a56e");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());

        return sb.toString();
    }
}