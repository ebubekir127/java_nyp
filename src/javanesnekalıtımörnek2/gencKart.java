
package javanesnekalıtımörnek2;

public class gencKart extends bankaKart{
protected double bonus;

    public gencKart(String kullanici, double bakiye) {
        super(kullanici, bakiye);
    }
@Override
public void Alisveris(int deger){
super.Alisveris(deger);
bonus=bonus+(deger/10);
}
@Override
public void bilgi(){
System.out.println("kart sahibi: "+this.kullanici);
    System.out.println("bonus para: "+this.bonus);
    System.out.println("");
}    
    
}
