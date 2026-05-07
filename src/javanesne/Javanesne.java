
package javanesne;


public class Javanesne {

    
 public static void main(String[] args) {
 HesapMakinesi m1 =new  HesapMakinesi(12,3,"yesil");
 HesapMakinesi m2 = new HesapMakinesi(15,5,"mavi");
     System.out.println(m1.sayi1+" "+m1.sayi2);
     System.out.println(m1.sayi1+"+"+m1.sayi2+"="+m1.toplama());
     System.out.println(m1.sayi1+"-"+m1.sayi2+"="+m1.cıkartma());
     System.out.println(m1.sayi1+"*"+m1.sayi2+"="+m1.carpma());
     System.out.println(m1.sayi1+"/"+m1.sayi2+"="+m1.bolme());
   
    
     
 }
}
