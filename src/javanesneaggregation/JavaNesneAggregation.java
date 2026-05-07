package javanesneaggregation;

public class JavaNesneAggregation {

   
    public static void main(String[] args) {
       Book bk1 = new Book("kasagi",200);
       Book bk2 = new Book("1984",400); 
       Book bk3 = new Book("suc ve ceza",300); 
       Book bk4 =  new  Book("atesten gomlek",500); 
    
     Book[] books={bk1,bk2,bk3,bk4};  // nesnelerı diziye kaydetmek
     
       
        
         Libary libary = new Libary("nohu",2016,books);   
        System.out.println("");
          libary.BilgiLibary();
    }
}
