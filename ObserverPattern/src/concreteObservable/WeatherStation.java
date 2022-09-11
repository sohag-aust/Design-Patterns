package concreteObservable;

import observable.Observable;
import observers.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class WeatherStation implements Observable {
    private Double temperature;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this.getTemperature());
        }
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void startCheckingWeather() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // generate a random weather in celcius between 20-40 degree
                int maxWeatherInCelcius = 40;
                int minWeatherInCelcius = 20;

                // it could be an API call
                double todayWeatherInCelcius = Math.random()*(maxWeatherInCelcius - minWeatherInCelcius + 1) + minWeatherInCelcius;
                setTemperature(todayWeatherInCelcius);

                // exit the timer
                timer.cancel();
                timer.purge();
            }
        }, 0, 10000); // run code every 10 second
    }
}
