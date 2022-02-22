package Calc;

import java.text.DecimalFormat;

public class Calculator {
    public int batteryMax = 5 ;
    public int battery;
    public float display;

    //Inicia os atributos, battery e display começam com o zero.
    public Calculator(int batteryMax){
        this.batteryMax = batteryMax;
        this.battery = 0;
        this.display = 0.0f;

    }
    //Aumenta a bateria, porém não além do máximo.
    public void chargeBattery(int value){
         while(this.battery<batteryMax){
            this.battery ++;
            value --;
            if(value ==0) break;
        }
    }

    //Tenta gastar uma unidade da bateria e emite um erro se não conseguir.
    public boolean useBattery(){
        if(this.battery==0){
            System.out.println("Bateria insuficiente!!");
            return false;
        }else{
            this.battery -= 1;
            return true;
        }
    }

    //Se conseguir gastar bateria, armazene a soma no atributo display.
    public void sum(int a, int b){
        useBattery();
        this.display = a + b;
    }
    //Se conseguir gastar bateria e não for divisão por 0.
    public void division(int num, int den){
        useBattery();
        if(den == 0) System.out.println("Erro!!");
        else this.display = num/den;
    }

    //Retorna o conteúdo do display com duas casas decimais.
    public String toString() {
        DecimalFormat form = new DecimalFormat("0.00");
        return "display = " + form.format(this.display).replace(",",".") + ", battery = " + this.battery;
    }
}
