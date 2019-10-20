package com.weatherapp.weatherapp.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "place")
@XmlAccessorType(XmlAccessType.FIELD)
public class NightPlace {
    private String name;
    private String phenomenon;
    private String tempmin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhenomenon() {
        return phenomenon;
    }

    public void setPhenomenon(String phenomenon) {
        this.phenomenon = phenomenon;
    }

    public String getTempmax() {
        return tempmin;
    }

    public void setTempmax(String tempmin) {
        this.tempmin = tempmin;
    }

}
