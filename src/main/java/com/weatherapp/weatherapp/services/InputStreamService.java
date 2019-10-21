package com.weatherapp.weatherapp.services;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * This class is for creating inputstream from the weather API url for repeated use
 */
public class InputStreamService {
    final private String urlAdress = "http://www.ilmateenistus.ee/ilma_andmed/xml/forecast.php?lang=eng";

    public InputStream getWeatherAPIInputStream() throws Exception {

        URL url = new URL(urlAdress);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.addRequestProperty("User-Agent", "Mozilla/5.0");
        InputStream is = http.getInputStream();
        return is;
    }
}

