package jyq.proxy;

public class CarTimeProxy implements Moveable {

    public CarTimeProxy(Moveable moveable) {
        super();
        this.moveable = moveable;
    }

    private Moveable moveable;

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        moveable.move();
        long endTime = System.currentTimeMillis();
        System.out.println("行驶结束... 汽车行驶时间："+(endTime-startTime) + "毫秒");
    }
}
