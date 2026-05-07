
package javanesnecomposition;


public class Car {
String model;
int yil;
Motor motor;

    public Car(String model, int yil, String motorTipi) {
        this.model = model;
        this.yil = yil;
        this.motor=new Motor(motorTipi);
    }

    void calistir(){
    this.motor.calistir();
        System.out.println(this.model+" araba calisiyor");
    }



}
