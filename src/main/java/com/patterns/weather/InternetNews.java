package com.patterns.weather;

public class InternetNews implements ObserverWeather{

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure()+"hPa");
    }
}
