package java_test;
import java.util.Scanner;
public static class Book{
    public String title;
    public int price;
    public double rating;
    public void printBook(){
        System.out.println("Highest rated book information:");
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("Rating: "+rating);
    }
}
public static class EBook extends Book{
    public EBook(String Title, int Price, double Rating,int FileSize){
        this.title=Title;
        this.price=Price;
        this.rating=Rating;
        this.fileSize=FileSize;
    }
    @Override
    public void printBook(){
        System.out.println("Highest rated book information:");
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("Rating: "+rating);
        System.out.println("File size: "+fileSize);
    }
    public int fileSize;
}
public static class PrintedBook extends Book{
    public PrintedBook(String Title, int Price, double Rating,int PageCount){
        this.title=Title;
        this.price=Price;
        this.rating=Rating;
        this.pageCount=PageCount;
    }
    @Override
    public void printBook(){
        System.out.println("Highest rated book information:");
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("Rating: "+rating);
        System.out.println("PageCount: "+pageCount);
    }
    public int pageCount;
}

public class g2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[3];
        for(int i=0;i<3;i++){
            
            String type=sc.nextLine();
            if(!type.equals("EBook") && !type.equals("PrintedBook")){
                System.out.println("Invalid book type. Please enter 'EBook' or 'PrintedBook'.");
                i--;
                continue;
            }
            
            String name=sc.nextLine();
            int priceInt;
            double ratingDouble;
            int infoInt;
            
            String price=sc.nextLine();
            try{
                priceInt=Integer.parseInt(price);
            }catch(Exception ignored){
                System.out.println("잘못된 입력입니다.처음부터 다시 입력하세요.");
                i--;
                continue;
            }
            
            String rating=sc.nextLine();
            try{
                ratingDouble=Double.parseDouble(rating);
            }catch(Exception ignored){
                System.out.println("잘못된 입력입니다.처음부터 다시 입력하세요.");
                i--;
                continue;
            }
            
            String info=sc.nextLine();
            try{
                infoInt=Integer.parseInt(info);
            }catch(Exception ignored){
                System.out.println("잘못된 입력입니다.처음부터 다시 입력하세요.");
                i--;
                continue;
            }
            
            if(type.equals("EBook")){
                books[i]=new EBook(name,priceInt,ratingDouble,infoInt);
            }
            else{
                books[i]=new PrintedBook(name,priceInt,ratingDouble,infoInt);
            }
        }
        double highestRating=-1;
        int HighestIdx=-1;
        for(int i=0;i<3;i++){
            if(books[i].rating>highestRating){
                highestRating=books[i].rating;
                HighestIdx=i;
            }
        }
        books[HighestIdx].printBook();
    }
}
