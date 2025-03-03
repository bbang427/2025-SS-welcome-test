package java_test;
import java.util.Scanner;


public class c {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int age=scanner.nextInt();
        int height=scanner.nextInt();
        
        if(age>=14||height>=155) System.out.print('X');
        else System.out.print('O');


    }

}
