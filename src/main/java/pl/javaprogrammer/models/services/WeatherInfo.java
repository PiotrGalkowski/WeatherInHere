package pl.javaprogrammer.models.services;

import pl.javaprogrammer.models.Utils;


public class WeatherInfo {
    private double temp;
    private int humidity;
    private int pressure;
    private int cloudy;
    private String cityName;

    public WeatherInfo(double temp, int humidity, int pressure, int cloudy, String cityName) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.cloudy = cloudy;
        this.cityName = cityName;
    }


    public String getCityName() {
        return cityName;
    }


    public double getTemperatureKelvin(){
        return temp;
    }

    public double getTemperatureCelsius(){
        return Utils.kelvinToCelsius(temp);
    }


    public int getHumidity() {
        return humidity;
    }


    public int getPressure() {
        return pressure;
    }


    public int getCloudy() {
        return cloudy;
    }
}
