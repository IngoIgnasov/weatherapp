package com.weatherapp.weatherapp.services;

import com.weatherapp.weatherapp.models.Day;
import com.weatherapp.weatherapp.models.DayPlace;
import com.weatherapp.weatherapp.models.Forecast;
import com.weatherapp.weatherapp.models.Forecasts;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.util.ArrayList;
import java.util.List;


@Service
public class ForecastService {
    InputStreamService sv = new InputStreamService();


    /**
     * @return Using JAXB, converts XML to Java objects and return all forecasts
     */
    public Forecasts getAllForecasts() throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Forecasts.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return (Forecasts) jaxbUnmarshaller.unmarshal(sv.getWeatherAPIInputStream());
    }


    public Forecast getTomorrowsForecast() throws Exception {
        return getAllForecasts().getForecasts().get(0);
    }


    /**
     * Returns a list of all DayPlace objects
     */
    private List<DayPlace> getDayPlaces() throws Exception {
        Forecasts forecasts = getAllForecasts();
        Forecast longForecast = forecasts.getForecasts().get(0);
        Day oneDayForecasts = longForecast.getDays().get(0);
        List<DayPlace> placesForecasts = oneDayForecasts.getDayPlaces();
        return placesForecasts;
    }

    public List<DayPlace> getForecastByPlace(String placeName) throws Exception {
        List<DayPlace> daylist = new ArrayList<>();
        for (DayPlace dayplace : getDayPlaces()) {
            String name = dayplace.getName();
            if (name.equals(placeName)) {
                daylist.add(dayplace);
            }
        }
        return daylist;
    }

    public List<String> getAllPlaceNames() throws Exception {
        List<String> namesList = new ArrayList<>();
        for (DayPlace dayplace : getDayPlaces()) {
            String name = dayplace.getName();
            if (!namesList.contains(name)) {
                namesList.add(name);
            }
        }
        return namesList;
    }
}
