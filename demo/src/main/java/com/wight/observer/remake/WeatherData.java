package com.wight.observer.remake;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {  // 不再需要自己存储观察者了
    }

    // 不在需要追踪观察者了，也不需要管理注册与删除（让超类干）。所以把注册、添加、通知的相关代码删除
    public void measurementsChanged() {
        setChanged();       // notifyObservers 前设置状态
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // “拉”
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
