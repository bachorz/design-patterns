package com.patterns.weather;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements ObservableWeather {

    private int temperature;
    private int pressure;
    private Set<ObserverWeather> registeredObserversWeather = new HashSet<ObserverWeather>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(ObserverWeather observerWeather) {
        registeredObserversWeather.add(observerWeather);
    }

    @Override
    public void unregisterObserver(ObserverWeather observerWeather) {
        registeredObserversWeather.remove(observerWeather);
    }

    @Override
    public void notifyObservers() {
        for(ObserverWeather observerWeather: registeredObserversWeather){
            observerWeather.updateForecast(this);
        }
    }

    public void updateForecast(int temp, int pressure) {
        setTemperature(temp);
        setPressure(pressure);
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
