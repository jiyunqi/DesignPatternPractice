package jyq.observer.observableObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

    //观察者名称的变量
    private String observerName;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    /**
     *
     * @param o 拉模式参数，目标的引用
     * @param arg 推模式参数，推送内容
     */
    @Override
    public void update(Observable o, Object arg) {
        //推模式
        System.out.println(observerName+"收到了消息，目标推送过来的是："+arg);

        //拉模式
        String content = ((ContreteWeatherSubject) o).getContent();
        System.out.println(this.observerName +"收到了消息，主动到目标对象中去拉，拉的内容是："+content);
    }
}
