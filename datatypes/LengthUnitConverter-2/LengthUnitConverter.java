// Program that reads numbers in inches and converts it to meters
import java.util.Scanner;
public class LengthUnitConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println("Value in meters is:"+meters+" meters.");

    }
}
