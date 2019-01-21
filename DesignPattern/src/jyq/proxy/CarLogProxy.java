package jyq.proxy;

public class CarLogProxy implements Moveable {

    public CarLogProxy(Moveable moveable) {
        super();
        this.moveable = moveable;
    }

    private Moveable moveable;

    @Override
    public void move() {
        System.out.println("日志开始...");
        moveable.move();
        System.out.println("日志结束...");
    }
}
