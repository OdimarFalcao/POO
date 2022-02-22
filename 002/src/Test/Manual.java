package Test;

import automóvel.Car;

public class Manual {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car);
        //pass: 0, gas: 0, km: 0
        car.enter();
        car.enter();
        System.out.println(car);
        //pass: 2, gas: 0, km: 0
        car.enter();
        //fail: limite de pessoas atingido
        System.out.println(car);
        //pass: 2, gas: 0, km: 0
        car.leave();
        car.leave();
        car.leave();
        //fail: nao ha ninguem no carro
        System.out.println(car);
        //pass: 0, gas: 0, km: 0

        System.out.println();

        car = new Car();
        car.fuel(60);
        System.out.println(car);
        //pass: 0, gas: 60, km: 0

        System.out.println();

        car.drive(10);
        //fail: nao ha ninguem no carro

        System.out.println();

        car.enter();
        car.drive(10);
        System.out.println(car);
        //pass: 1, gas: 50, km: 10
        System.out.println();

        car.drive(70);
        //fail: tanque vazio apos andar 50 km
        car.drive(10);
        //fail: tanque vazio
        System.out.println(car);
        //pass: 1, gas: 0, km: 60
        System.out.println();

        car.fuel(200);
        System.out.println(car);
        //pass: 1, gas: 100, km: 60
    }
}
