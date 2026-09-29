package com.cfs.Weather_App.dto;

public class Root {

    public Forecast forecast;
    public Location location;
    public Current current;

    public Root() {
    }

    public Root(Forecast forecast, Location location, Current current) {
        this.forecast = forecast;
        this.location = location;
        this.current = current;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}
