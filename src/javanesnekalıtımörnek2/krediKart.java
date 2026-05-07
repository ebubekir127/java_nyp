
package javanesnekalıtımörnek2;

public class krediKart extends bankaKart {
protected double krediLimit;
protected double krediBorcu;
    public krediKart(double krediLimit, String kullanici, double bakiye) {
        super(kullanici, bakiye);
        this.krediLimit = krediLimit;
    }
@Override
public void Alisveris(int tutar){
if(tutar>this.krediLimit){
    System.out.println("limitiniz yetersiz");
}else if(tutar<0){
    System.out.println("gecersiz islem hatali tutar");
}else{
this.krediLimit=this.krediLimit-tutar;
this.krediBorcu=this.krediBorcu+tutar;
}        
}
@Override
public void bilgi(){
System.out.println("kart sahibi: "+this.kullanici);
    System.out.println("kredi karti limiti: "+this.krediLimit);
    System.out.println("kredi borcu: "+this.krediBorcu);
    System.out.println("");
}
    
    
    
}
