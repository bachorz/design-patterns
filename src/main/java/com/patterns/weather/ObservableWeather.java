package com.patterns.weather;

public interface ObservableWeather {

    void registerObserver(ObserverWeather observerWeather);
    void unregisterObserver(ObserverWeather observerWeather);
    void notifyObservers();
}
