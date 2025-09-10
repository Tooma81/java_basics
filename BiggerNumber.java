import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        System.out.print("\nThe bigger of the two numbers was: " + Math.max(firstNumber, secondNumber));
    }
}
