package jyq.observer.observerPattern;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标状态保持一致
 */
public class ConcreteWeatherObserver implements WeatherObserver {

    //观察者的名字
    private String observerName;
    //天气内容
    private String weatherContent;
    //提醒内容
    private String remindThings;


    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThings() {
        return remindThings;
    }

    public void setRemindThings(String remindThings) {
        this.remindThings = remindThings;
    }

    /**
     * 获取目标类的状态同步 到观察者的状态中
     * @param subject 传入目标对象，方便获取相应目标对象的状态
     */
    @Override
    public void update(WeatherSubject subject) {
        weatherContent = ((ConcreteWeatherSubject)subject).getSubjectState();
        System.out.println(observerName+"收到了"+weatherContent+","+remindThings);
    }
}
