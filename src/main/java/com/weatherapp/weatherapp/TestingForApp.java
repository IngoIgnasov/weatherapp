package com.weatherapp.weatherapp;

import com.weatherapp.weatherapp.models.*;
import com.weatherapp.weatherapp.services.InputStreamService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TestingForApp {
    public static void main(String[] args) throws Exception {
        Day night1 = new Day();
        night1.setPhenomenon("pilvine");
        night1.setTempmax("11");
        night1.setTempmin("7");
        night1.setText("Täna on pilvine");
        List<DayPlace> dayPlaces = new ArrayList<>();
        DayPlace dayPlace1 = new DayPlace();
        DayPlace dayPlace2 = new DayPlace();

        dayPlace1.setName("võõpsu");
        dayPlace1.setPhenomenon("Päike");
        dayPlace1.setTempmax("10");

        dayPlace2.setName("räpina");
        dayPlace2.setPhenomenon("äike");
        dayPlace2.setTempmax("11");

        dayPlaces.add(dayPlace1);
        dayPlaces.add(dayPlace2);
        night1.setDayPlaces(dayPlaces);

        List<Wind> winds = new ArrayList<>();
        Wind wind1 = new Wind();
        Wind wind2 = new Wind();
        wind1.setDirection("Southwest wind");
        wind1.setName("Kanala");
        wind1.setSpeedmax("6");
        wind1.setSpeedmin("3");
        wind2.setDirection("Northwest wind");
        wind2.setName("Rannu");
        wind2.setSpeedmax("5");
        wind2.setSpeedmin("2");
        winds.add(wind1);
        winds.add(wind2);
        night1.setWinds(winds);

        JAXBContext jaxbContext = JAXBContext.newInstance(Day.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Marshal the employees list in console
        jaxbMarshaller.marshal(night1, System.out);

        JAXBContext axbContext = JAXBContext.newInstance(Forecasts.class);
        Unmarshaller jaxbUnmarshaller = axbContext.createUnmarshaller();

        //We had written this file in marshalling example
        Forecasts forecast = (Forecasts) jaxbUnmarshaller.unmarshal(new File("C:\\Users\\Ingo\\Desktop\\Kool\\sügis2019\\1oT\\weatherappv2\\src\\main\\resources\\templates\\ilm3.xml"));

/*        System.out.println(forecast.getText());
        System.out.println(forecast.getTempmax());
        System.out.println(forecast.getNightPlaces());
        System.out.println(forecast.getNightPlaces().get(0).getTempmax());
        System.out.println(forecast.getWinds().get(0).getDirection());
        System.out.println(forecast.getSea());*/
        System.out.println(forecast.getForecasts().get(0).getDate());


        InputStreamService sv = new InputStreamService();
        InputStream is = sv.getWeatherAPIInputStream();

        Forecasts forecasts2 = (Forecasts) jaxbUnmarshaller.unmarshal(is);
        System.out.println(forecasts2.getForecasts().get(0).getDate());
    }
}
