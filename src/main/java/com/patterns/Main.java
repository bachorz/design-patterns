package com.patterns;


import com.patterns.notification.Email;
import com.patterns.notification.MobilaApp;
import com.patterns.notification.TextMessage;
import com.patterns.order.Order;
import com.patterns.order.OrderStatus;
import com.patterns.weather.InternetNews;
import com.patterns.weather.RadioNews;
import com.patterns.weather.TvNews;
import com.patterns.weather.WeatherForecast;

public class Main {

    public static void main(String[] args) {

      // ORDER
//        Order order = new Order(110L, OrderStatus.ZAREJESTROWEANE);
//
//        TextMessage textMessage = new TextMessage();
//        MobilaApp mobilaApp = new MobilaApp();
//        Email email = new Email();
//
//        order.registerObserver(textMessage);
//        order.registerObserver(mobilaApp);
//        order.registerObserver(email);
//
//        order.notifyObserves();
//
//        System.out.println("_________________________");
//
//        order.changeOrderStatus(OrderStatus.WYSLANE);
//
//        order.unregisterObserver(mobilaApp);
//        System.out.println("_________________________");
//
//        order.changeOrderStatus(OrderStatus.ODEBRANE);

        //WEATHER FORECAST

        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego:");
        weatherForecast.updateForecast(18, 1007);


    }
}
