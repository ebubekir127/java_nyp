
package javanesncompositionörnek;

public class Bilgisayar {
private String BilgisayarAdi;
private Cpu islemci;

    public Bilgisayar(String BilgisayarAdi, String model,int hiz) {
        this.BilgisayarAdi = BilgisayarAdi;
        this.islemci = new Cpu(model,hiz);
    }
public void calistir(){
    System.out.println(this.BilgisayarAdi+" adli bilgisayar"+islemci.getModel()+"model cpu ve"+islemci.getHiz()+"hizindaki bilgisayar ile calisiiyor");


}
}
