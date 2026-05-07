package javanesneaggregation;


public class Libary {
    String isim;
    int yıl;
    Book[] books;

    public Libary(String isim, int yıl, Book[] books) {
        this.isim = isim;
        this.yıl = yıl;
        this.books = books;// agregation kısmı 
    }
void BilgiLibary(){

    System.out.println("kutuphane ismi: "+this.isim+"  acilis tarihi: "+this.yıl);
    System.out.println("");
    System.out.println("kutuphanedeki kitaplar");
    // döngü ile nesnelerı yazdırm
    for (Book  book :books){
            System.out.println(book.bilgiGoster());
     
        }
}



}






