import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");

        int input = scanner.nextInt();

        System.out.println(checkEvenOrOdd(input));
        scanner.close();
    }

    public static String checkEvenOrOdd(int value) {                                                

        return (value % 2 == 0) ? "Even Number" : "Odd Number";
    }

}