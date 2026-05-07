package test;


public class test {
    public static void main(String[] args){

        Kitap kitap1 = new Kitap("1984","George Orwell Yazarı",320);
        Kitap kitap2 = new Kitap("Suc ve Ceza Kitabi","Fyodor Dostoevsky Yazarı",700);
        Kitap kitap3 = new Kitap("Aylak adam Kitabi","Yusuf Atılgan Yazarı",300);
        Kitap kitap4 = new Kitap("Atesten Gomlek Kitabi","Halide Edip Adıvar Yazarı",200);
        Kitap kitap5 = new Kitap("Huzur Kitabi","Ahmet Hamdi Tanpınar Yazarı",550);
        Kitap kitap6 = new Kitap("Tutunamayanlar Kitabi","Oguz atay Yazarı",700);
        
        ogrenci ogrenci1 = new ogrenci("Ayse","Tas",0001,18);
        ogrenci ogrenci2 = new ogrenci("ahmet","Agca",0002,18);
        ogrenci ogrenci3 = new ogrenci("Alperen","sengun",0003,18);
        ogrenci ogrenci4 = new ogrenci("barıs","yılmaz",0004,18);
        ogrenci ogrenci5 = new ogrenci("ebubekir","aktas",0005,18);

        
        System.out.println(ogrenci1.al(kitap1));
        System.out.println(ogrenci2.al(kitap1));
        System.out.println(ogrenci3.al(kitap2));
      
        System.out.println();
        
        System.out.println(ogrenci1.iadeVer(kitap1)); 
        System.out.println(ogrenci5.al(kitap1));
        System.out.println(ogrenci4.iadeVer(kitap3));
        System.out.println(ogrenci5.al(kitap6));
    }

}