package com.weatherapp.weatherapp.models;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement(name = "forecast")
@XmlAccessorType(XmlAccessType.FIELD)
public class Forecast {
    @XmlAttribute
    private String date;
    @XmlElement(name = "night")
    private List<Night> nights = null;
    @XmlElement(name = "day")
    private List<Day> days = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Night> getNights() {
        return nights;
    }

    public void setNights(List<Night> nights) {
        this.nights = nights;
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }
}