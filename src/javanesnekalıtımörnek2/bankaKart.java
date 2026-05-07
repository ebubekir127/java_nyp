package javanesnekalıtımörnek2;

public class bankaKart {
protected double bakiye;
protected String kullanici;
public bankaKart(String kullanici,double bakiye){
this.kullanici=kullanici;
this.bakiye=bakiye;
}
public void Alisveris(int tutar){
if(tutar>this.bakiye){
    System.out.println("islem basarisiz kartda bu kadar para yok ");
}else if(tutar<0){
    System.out.println("tutar yanlis islem basarisiz");
}else{
this.bakiye=this.bakiye-tutar;
    System.out.println("islem basarili");
}
}
public void bilgi(){
    System.out.println("kart sahibi: "+this.kullanici);
    System.out.println("kart bakiyesi: "+this.bakiye);
    System.out.println("");
}}
