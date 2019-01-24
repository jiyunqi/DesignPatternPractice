package jyq.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道它的观察者，并提供注册（添加）和删除观察者的接口
 */
public class Subject {

    //用来保存注册的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    //添加指定的观察者到集合中
    public void attach(Observer observer){
        observers.add(observer);
    }

    //删除集合中指定的观察者
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //像所有注册者发送消息
    protected void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
