
package test;


public class ogrenci {
    String ad;
    String soyAd;
    int ogrNO;
    int yas;

    public ogrenci( String ad, String soyAd,int ogrNO, int yas) {
        this.ogrNO = ogrNO;
        this.ad = ad;
        this.soyAd = soyAd;
        this.yas = yas;
    }

    public String al(Kitap kitap ){
       if(kitap.mevcutmu){
           kitap.mevcutmu = false;
           return this.ad+" "+kitap.oduncAlındı(kitap);
       }else{
           return this.ad+" '"+kitap.isim +"' kitab suan için başka bir oğrenci tarafindan  alinmis";
       }
    }

    public String iadeVer(Kitap kitap){
        if(kitap.mevcutmu){
            return this.ad+" iade etmeye çalistiginiz kitap sizde degil";
        }else{
            kitap.mevcutmu = true;
            return this.ad+" "+kitap.iadeEdildi(kitap);
        }
    }

}