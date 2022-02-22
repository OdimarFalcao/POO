package CalculadoraTest;

import Calc.Calculator;

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5);
        System.out.println(calc);
        //display = 0.00, battery = 0
        calc.chargeBattery(3);
        System.out.println(calc);
        //display = 0.00, battery = 3
        calc.chargeBattery(1);
        System.out.println(calc);
        //display = 0.00, battery = 4
        calc.chargeBattery(2);
        System.out.println(calc);
        //display = 0.00, battery = 5

        System.out.println();

        calc = new Calculator(4);
        calc.chargeBattery(2);
        System.out.println(calc);
        //display = 0.00, battery = 2
        calc.chargeBattery(3);
        System.out.println(calc);
        //display = 0.00, battery = 4

        System.out.println();

        calc = new Calculator(2);
        calc.chargeBattery(2);
        calc.sum(4, 3);
        System.out.println(calc);
        //display = 7.00, battery = 1
        calc.sum(2, 3);
        System.out.println(calc);
        //display = 5.00, battery = 0
        calc.sum(-4, -1);
        //fail: bateria insuficiente
        calc.chargeBattery(1);
        System.out.println(calc);
        //display = 5.00, battery = 1
        calc.sum(-4, -2);
        System.out.println(calc);
        //display = -6.00, battery = 0

        System.out.println();

        calc = new Calculator(3);
        calc.chargeBattery(3);
        calc.division(6, 3);
        calc.division(7, 0);
        //fail: divisao por zero
        System.out.println(calc);
        //display = 2.00, battery = 1
        calc.division(7, 2);
        calc.division(10, 2);
        //fail: bateria insuficiente
        System.out.println(calc);
        //display = 3.50, battery = 0

    }
}
