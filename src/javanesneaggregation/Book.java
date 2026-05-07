package javanesneaggregation;

public class Book {
String ad;
int sayfa;

    public Book(String isim, int sayfa) {
        this.ad = isim;
        this.sayfa = sayfa;
    }

String bilgiGoster(){

return"kitap ismi:  "+this.ad+" Sayfa Sayisi: "+this.sayfa;
} 
    
    
    
    
}
