package jyq.observer.observerPattern;

/**
 * 具体的目标对象，负责把有关的状态存入到相应的观察者对象中
 */
public class ConcreteWeatherSubject extends WeatherSubject {

    //目标对象的状态
    //获取天气的内容信息
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
