package automóvel;

import java.text.DecimalFormat;

public class Car{
    public int pass; // Passageiros
    public int passMax; // limite de Passageiros
    public int gas; // tanque
    public int gasMax; // limite do tanque
    public int km; // quantidade de quilometragem

    public Car(){
        this.pass = 0;
        this.passMax = 2;
        this.gas = 0;
        this.gasMax = 100;
        this.km = 0;
    }

    public void enter(){
        if(this.pass < this.passMax){
            this.pass++;
        }else {
            System.out.println("Fail, limite de passageiros atingido");
        }
    }
    public void leave(){
        if(this.pass <= this.passMax && this.pass >0){
            this.pass--;
        }else {
            System.out.println("Fail, não há ninguém no carro");
        }
    }

    public void fuel(int gas){
        if(this.gas < this.gasMax){
            this.gas += gas;
            if(this.gas > this.gasMax){
                this.gas = this.gasMax;
            }
        }
    }

    public void drive (int km){
      if(this.pass > 0) {
          if (this.gas > 0) {
              if(this.gas == km) {
                  this.km += km;
                  this.gas = 0;
              }
              else if(km > gas){
                  this.km += gas;
                  System.out.println("Gasolina insuficiente após dirigir por "+ this.gas+" km");
                  this.gas = 0;
              }
              else if(km < gas) {
                  this.km += km;
                  this.gas -= km;
              }
          } else System.out.println("Gasosa insuficiente");

      } else{
          System.out.println("Não há ninguém no carro");
      }
    }
    public String toString(){
        return "//Pass = " + this.pass + ", gas = " + this.gas + ", km = " + this.km;
    }

}