package com.patterns.weather;

public class TvNews implements ObserverWeather{

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure()+"hPa");
    }
}
