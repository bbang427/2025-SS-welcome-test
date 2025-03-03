package java_test;
import java.util.Scanner;


public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.next();
        
        int flag=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='a') {
                flag=1;
                break;
            }
            else if(input.charAt(i)=='e') {
                flag=1;
                break;
            }
            if(input.charAt(i)=='i') {
                flag=1;
                break;
            }
            if(input.charAt(i)=='o') {
                flag=1;
                break;
            }
            if(input.charAt(i)=='u') {
                flag=1;
                break;
            }
        }
        
        if(flag==1) System.out.print('O');
        else System.out.print('X');


    }

}
