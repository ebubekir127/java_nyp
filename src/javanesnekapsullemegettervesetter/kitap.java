
package javanesnekapsullemegettervesetter;


public class kitap {
private String isim;
private int sayfaSayisi;
private String yazar;

    public kitap(String isim, int sayfaSayisi, String yazar) {
        this.isim = isim;
        if(sayfaSayisi<1){
        this.sayfaSayisi=1;
        }else{
        this.sayfaSayisi=sayfaSayisi;
        }
        this.yazar = yazar;
        
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }


public void setSayfaSayisi(int sayfaSayisi) {
   if(sayfaSayisi<1){
        this.sayfaSayisi=1;
        }else{
        this.sayfaSayisi=sayfaSayisi;
        }
}

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getYazar() {
        return yazar;
    }
}
