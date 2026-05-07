
package javanesne;


public class HesapMakinesi {
 
  int sayi1;
  int sayi2;
  String renk;
HesapMakinesi(int sayi1,int sayi2,String renk){
this.sayi1= sayi1;
this.sayi2=sayi2;

}
 public int toplama(){
 
 return this.sayi1+this.sayi2 ;
 }
public int cıkartma(){
 
 return this.sayi1-this.sayi2 ;
 }
  public int carpma(){
 
 return this.sayi1*this.sayi2 ;
 }
  public int bolme(){
 
 return this.sayi1/this.sayi2 ;
 }
}
