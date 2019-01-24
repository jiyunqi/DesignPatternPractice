package jyq.observer.observableObserverPattern;

public class Test {
    public static void main(String[] args) {
        //创建被观察者（目标）
        ContreteWeatherSubject subject = new ContreteWeatherSubject();

        //创建观察者
        ConcreteObserver concreteObserver = new ConcreteObserver();
        concreteObserver.setObserverName("Tmo");

        ConcreteObserver concreteObserver1 = new ConcreteObserver();
        concreteObserver1.setObserverName("Jerry");

        //注册观察者
        subject.addObserver(concreteObserver);
        subject.addObserver(concreteObserver1);

        //目标更新天气情况
        subject.setContent("天气晴...");

    }
}
