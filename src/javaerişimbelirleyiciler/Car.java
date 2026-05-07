
package javaerişimbelirleyiciler;

public class Car {
private int enginePower;// artık bu degışkene dışardan erişemeyiz
private int model;
public int speed;
protected String color; // sadece bu package içinde çalışır

    public Car(int enginePower, int model, int speed, String color) {
        this.enginePower = enginePower;
        this.model = model;
        this.speed = speed;
        this.color = color;
    }
private void Print(){
    System.out.println(this.model);

}
public void bilgiGoster(){
 Print();
    


}










}
