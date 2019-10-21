package com.weatherapp.weatherapp.controllers;

import com.weatherapp.weatherapp.models.DayPlace;
import com.weatherapp.weatherapp.models.Forecast;
import com.weatherapp.weatherapp.models.Forecasts;
import com.weatherapp.weatherapp.services.ForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController()
public class MainController {
    ForecastService forecastService;

    @Autowired
    public MainController(ForecastService forecastService) {
        this.forecastService = forecastService;}

    @RequestMapping(path = "/forecasts", method = RequestMethod.GET,produces = {"application/json"})
    public Forecasts getForecasts() throws Exception {
        return forecastService.getAllForecasts();
    }

    @RequestMapping(path = "/tmrw", method = RequestMethod.GET,produces = {"application/json"})
    public Forecast getTomorrowsForecast() throws  Exception{
        return forecastService.getTomorrowsForecast();
    }

    @RequestMapping(path = "/names", method = RequestMethod.GET,produces = {"application/json"})
    public List<String> getPlacesNames() throws Exception{
        return forecastService.getAllPlaceNames();
}
    @RequestMapping(path = "/places", method = RequestMethod.GET,produces = {"application/json"})
    public List<DayPlace> getForecastByPlaceName(@RequestParam("name") String name) throws Exception{
        return forecastService.getForecastByPlace(name);
    }

}
