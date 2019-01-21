package jyq.proxy;

public class Test {
    public static void main(String[] args) {
       /* Car car = new Car();
        car.move();*/

        /*Moveable car1 = new Car1(new Car());
        car1.move();*/

        Car car = new Car();
        CarLogProxy carLogProxy = new CarLogProxy(car);
        CarTimeProxy carTimeProxy = new CarTimeProxy(carLogProxy);
        carTimeProxy.move();
    }
}
