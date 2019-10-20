package com.weatherapp.weatherapp.models;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "day")
@XmlAccessorType(XmlAccessType.FIELD)
public class Day {
    private String phenomenon;
    private String tempmin;
    private String tempmax;
    private String text;
    @XmlElement(name = "place")
    private List<DayPlace> dayPlaces = null;
    @XmlElement(name = "wind")
    private List<Wind> winds = null;

    private String sea;
    private String peipsi;

    public String getSea() {
        return sea;
    }

    public void setSea(String sea) {
        this.sea = sea;
    }

    public String getPeipsi() {
        return peipsi;
    }

    public void setPeipsi(String peipsi) {
        this.peipsi = peipsi;
    }

    public List<Wind> getWinds() {
        return winds;
    }

    public void setWinds(List<Wind> winds) {
        this.winds = winds;
    }

    public List<DayPlace> getDayPlaces() {
        return dayPlaces;
    }

    public void setDayPlaces(List<DayPlace> dayPlaces) {
        this.dayPlaces = dayPlaces;
    }
    public String getPhenomenon() {
        return phenomenon;
    }

    public void setPhenomenon(String phenomenon) {
        this.phenomenon = phenomenon;
    }

    public String getTempmin() {
        return tempmin;
    }

    public void setTempmin(String tempmin) {
        this.tempmin = tempmin;
    }

    public String getTempmax() {
        return tempmax;
    }

    public void setTempmax(String tempmax) {
        this.tempmax = tempmax;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
