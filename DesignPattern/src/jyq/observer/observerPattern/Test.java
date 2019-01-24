package jyq.observer.observerPattern;

public class Test {
    public static void main(String[] args) {
        //1.创建目标
        ConcreteWeatherSubject concreteWeatherSubject = new ConcreteWeatherSubject();

        //2.创建观察者
        ConcreteWeatherObserver observerOne = new ConcreteWeatherObserver();
        observerOne.setObserverName("Jerry");
        observerOne.setRemindThings("做什么什么事...");

        ConcreteWeatherObserver observerTwo = new ConcreteWeatherObserver();
        observerTwo.setObserverName("Tom");
        observerTwo.setRemindThings("做另外一些事...");

        //3.注册观察者
        concreteWeatherSubject.attach(observerOne);
        concreteWeatherSubject.attach(observerTwo);

        //4.目标发布天气
        concreteWeatherSubject.setSubjectState("应该做");
    }
}
