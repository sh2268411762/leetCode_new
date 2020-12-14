package _ShiYan;


class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("启动-->Car");
    }

    @Override
    public void stop() {
        System.out.println("刹车-->car");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("启动-->bike");
    }

    @Override
    public void stop() {
        System.out.println("刹车-->bike");
    }
}


public class VechicleDemo {
    public static void main(String[] args) {
        Vehicle baoMa = new Car();
        Vehicle ziXingC = new Bike();

        baoMa.start();
        ;
        baoMa.stop();

        ziXingC.start();
        ziXingC.stop();
    }
}
