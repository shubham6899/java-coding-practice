// three digit sum calculator
import java.util.Scanner;
public class IntegerSum {

    public static void main(String[] Strings){
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int secondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;

        int  sum = firstDigit + secondDigit + thirdDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);
    }
}
