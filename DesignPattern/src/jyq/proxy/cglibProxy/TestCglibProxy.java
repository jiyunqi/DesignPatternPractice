package jyq.proxy.cglibProxy;

public class TestCglibProxy {

    public static void main(String[] args) {

        CglibProxy cglibProxy = new CglibProxy();
        Train train = (Train)cglibProxy.getProxy(Train.class);
        train.move();
    }

}
