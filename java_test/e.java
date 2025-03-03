package java_test;
import java.util.Scanner;


public class e {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        
        if(month==4 || month==6 || month==9 || month==11)
            System.out.print(30);
        else if(month==1 || month==3 || month==5 || month==7 || month==8 ||month==10||month==12)
            System.out.print(31);
        else {
            if((year%4==0&&year%100!=0) || year % 400 ==0)
                System.out.print(29);
                
            else System.out.print(28);
        }


    }

}
