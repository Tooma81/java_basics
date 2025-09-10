import java.util.Scanner;

public class GradeAndPoints {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());

        if (points < 30) {
            System.out.print("Failed!");
        } else if (points < 35) {
            System.out.print("Grade: 1");
        } else if (points < 40) {
            System.out.print("Grade: 2");
        } else if (points < 45) {
            System.out.print("Grade: 3");
        } else if (points < 50) {
            System.out.print("Grade: 4");
        } else {
            System.out.print("Grade: 5");
        }
    }
}
