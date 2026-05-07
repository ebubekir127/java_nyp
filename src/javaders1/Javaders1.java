
package javaders1;

import java.util.Scanner;


public class Javaders1 {  

    
     
    public static void main(String[] args) {
  /*  int sayi1, sayi2, sayi3;
int sayi4 = (sayi1 + sayi2 + sayi3);
System.out.println("SAYI 4 : " + sayi4);

String isim = "Ebubekir";
String soyIsim = "Aktaş";
System.out.println("Üniversitemize hoşgeldin " + isim + " " + soyIsim);*/

Scanner sc = new Scanner(System.in);/*
System.out.println("Lütfen tam sayı giriniz: ");
int deger = sc.nextByte();
System.out.println("Girdiğiniz değer: " + deger);
System.out.println("Lütfen adınızı giriniz: ");
String ad = sc.nextLine();
System.out.println("Girdiğiniz değer= " + deger + " Girdiğiniz isim= " + ad);

System.out.println("Sayı 1 giriniz: ");
int sayi1 = sc.nextInt();
System.out.println("Sayı 2 giriniz: ");
int sayi2 = sc.nextInt();
System.out.println("Sayı 3 giriniz: ");
int sayi3 = sc.nextInt();

int toplam = sayi1 + sayi2 + sayi3;
System.out.println("Sonuç : " + toplam);*/

System.out.println("Programlama vize notunu gir: ");
int not1 = sc.nextInt();
System.out.println("Programlama final notunu gir: ");
int not2 = sc.nextInt();
System.out.println("Matematik vize notunu gir: ");
int not3 = sc.nextInt();
System.out.println("Matematik final notunu gir: ");
int not4 = sc.nextInt();

int ortalama = (not1 + not2 + not3 + not4) / 4;
System.out.println("Ortalama: " + ortalama);    
        
        
        
  
        
    
}
}
      
    
    

