import java.util.Scanner;

public class CircumferenceCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the radius: ");
        double radius = Double.parseDouble(reader.nextLine());

        System.out.print("Circumference of the circle: " + (2 * Math.PI * radius));
    }
}