import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class classScanner {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number = scanner.nextInt();



        if (number % 3==0 && number % 5==0) {
            System.out.println("my theresa");
        } else if (number % 5 == 0) {
            System.out.println("theresa");
        } else if (number % 3 == 0){
            System.out.println("my ");
        }else
        {
            System.out.println("Entered " + number);
        }

    }
}

