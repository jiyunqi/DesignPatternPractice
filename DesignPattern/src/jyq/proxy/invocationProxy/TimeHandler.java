package jyq.proxy.invocationProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

    public TimeHandler(Object target) {
        super();
        this.target = target;
    }

    private Object target;

    @Override
    /**
     * proxy 被代理对象
     * method 被代理对象的方法
     * args 方法的参数
     * return 方法的返回值
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("开始行驶...");
        method.invoke(target);
        long endTime = System.currentTimeMillis();
        System.out.println("行驶结束... 行驶时间："+(endTime-startTime) + "毫秒");
        return null;
    }
}
