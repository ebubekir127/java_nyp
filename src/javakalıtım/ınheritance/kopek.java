// eger bı fonksıyonu veya degıskenı private yaparsak onu alt classlarda Override ile miras alamayız
package javakalıtım.ınheritance;


public class kopek extends hayvan {
   int ayakSayisi = 4;
    public kopek(){
        String ad ="Kopek";
        System.out.println("kopek olusturuldu  "+ad);
        this.sesCıkar();

    }
    
@Override    
    public void  sesCıkar(){
    super.sesCıkar();
        System.out.println("kopek havliyor");
    }
@Override // aynı fonksıyonu miraas aldıgı ust classtan alırken özelleştiriyoruz
    public void Beslen(){
        super.Beslen(); // üst sınıftaki fonksıyonu degıstırmeden cagırır
        System.out.println("kopek et yiyor");
    }
}
