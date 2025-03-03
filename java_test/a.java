package java_test;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] arr = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i) - '0';
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }


    }

}
