package oop;


public class ArabaSeyhat {
double depo; 
double yakitTuketimOrani;

public ArabaSeyhat(double baslangicDepo){
this.depo =baslangicDepo;
this.yakitTuketimOrani=5;
}    
public void yakitEkle(double litre){
depo+=litre;
    System.out.println("depoya benzin eklendi yeni depo:"+depo);
}  
public void seyehatEt(double km){
double gerekenYakit =(km/100)*yakitTuketimOrani;

if (yakitTuketimOrani > depo) {
            double gidebilenKm = (depo / yakitTuketimOrani) * 100.0;
            System.out.println("Yakit bitti " );
            depo = 0;
        } else {
            depo -= gerekenYakit;
            System.out.println("Araba " + km + " km yol yapti. Kalan yakit: " + depo + " litre");
        }
    }

    public double getYakit() {
        return depo;
    }
}


    
