package com.weatherapp.weatherapp.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "wind")
@XmlAccessorType(XmlAccessType.FIELD)
public class Wind {
    private String name;
    private String direction;
    private String speedmin;
    private String speedmax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeedmin() {
        return speedmin;
    }

    public void setSpeedmin(String speedmin) {
        this.speedmin = speedmin;
    }

    public String getSpeedmax() {
        return speedmax;
    }

    public void setSpeedmax(String speedmax) {
        this.speedmax = speedmax;
    }
}
