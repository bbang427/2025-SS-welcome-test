package java_test;
import java.util.Scanner;

public class d {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        if (num >= 1) {
            long sum = 0;
            for (long i = num; i >= 1; i--) {
                sum += i;
            }
            System.out.print(sum);
        } else {
            System.out.println("X");
        }


    }

}
