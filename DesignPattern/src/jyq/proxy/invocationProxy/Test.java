package jyq.proxy.invocationProxy;

import jyq.proxy.Car;
import jyq.proxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    /**
     * JDK 动态代理测试类
     * @param args
     */
    public static void main(String[] args) {
        Car car = new Car();
        /*
            loader 类加载器
            interface 实现接口
            h InvocationHandler
         */
        //时间代理
        Object o = Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(),new TimeHandler(car));
        //日志代理
        Moveable moveable = (Moveable) Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new LogHandler(o));
        moveable.move();
        System.out.println("----------------------------------------");

        Car car1 = new Car();
        //日志代理
        Object o1 = Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(),new LogHandler(car1));
        //时间代理
        Moveable moveable1 = (Moveable) Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new TimeHandler(o1));
        moveable1.move();
    }

}
