package jyq.observer.observableObserverPattern;

import java.util.Observable;

//天气目标的具体实现类
public class ContreteWeatherSubject extends Observable {
    //天气情况的内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        //notifyObservers带参数为推模式，不带参数为拉模式
        this.notifyObservers(content);
    }
}
