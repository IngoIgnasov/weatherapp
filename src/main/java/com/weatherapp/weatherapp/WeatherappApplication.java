package com.weatherapp.weatherapp;

import com.weatherapp.weatherapp.models.Night;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@SpringBootApplication
public class WeatherappApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherappApplication.class, args);
    }
}

