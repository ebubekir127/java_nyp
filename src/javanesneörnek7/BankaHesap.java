
package javanesneörnek7;


public class BankaHesap {
 public String name;
 private int id;
 private int bakiye;
 

    public BankaHesap(String name) {
        this.name = name;
        
    }
public void paraYatır(int deger){
if (deger<=0){
    System.out.println("negatif deger girdiniz o yuzden islem yapilmadi");
}
else{
this.bakiye=+deger;
    System.out.println(deger+"tl yatirdiniz");
    System.out.println("");
}
} 
public void paraCek(int deger){
if(deger>this.bakiye){
        System.out.println(" bakiyenizde bu kadar para yok islem gercekleştirilemiyor");
}
else{
this.bakiye= this.bakiye-deger;
    System.out.println(deger+"tl cektiniz");
    System.out.println("");
}}
void bilgiGoster(){
    System.out.println("-------banka hesabi---------");
    System.out.println("isim: "+this.name);
    System.out.println("bakiye:"+this.bakiye+"tl");
    System.out.println("----------------------------");
    System.out.println("");
}



}
