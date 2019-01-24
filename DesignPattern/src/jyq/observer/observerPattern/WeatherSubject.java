package jyq.observer.observerPattern;


import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道它的观察者，并提供注册（添加）和删除观察者的接口
 */
public class WeatherSubject {

    //用来保存注册的观察者对象
    private List<WeatherObserver> observers = new ArrayList<WeatherObserver>();

    //添加指定的观察者到集合中
    //把订阅天气的人添加到订阅者列表
    public void attach(WeatherObserver observer){
        observers.add(observer);
    }

    //删除集合中指定的观察者
    //把删除订阅天气的人从列表移出
    public void detach(WeatherObserver observer){
        observers.remove(observer);
    }

    //像所有注册者发送消息
    protected void notifyObservers(){
        for (WeatherObserver observer : observers) {
            observer.update(this);
        }
    }
}
