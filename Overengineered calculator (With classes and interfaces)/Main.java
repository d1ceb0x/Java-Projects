package Ishan;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What is the operation? (+, plus | -, minus | *, multiply, | /, divide)");
            String operation = scanner.next();

            System.out.println("What is the first number?");
            int firstNumber = scanner.nextInt();
            System.out.println("What is the second number?");
            int secondNumber = scanner.nextInt();

            evaluateOperation(operation, firstNumber, secondNumber);
            if (wannaStop(scanner)) break;


        }
    }

    private static boolean wannaStop(Scanner scanner) {
        System.out.println("\nDo you want to calculate something else? y/n");
        if(!scanner.next().equals("y")) {
            return true;
        }
        return false;
    }


    public static void evaluateOperation(String operation, int a, int b) {
        int result;
        switch (operation) {
            case "+", "plus": Addition result1 = new Addition(operation, a, b); result1.PrintOutput(); break;
            case "-", "minus": Subtraction result2 = new Subtraction(operation, a, b); result2.PrintOutput(); break;
            case "*", "multiply": Multiplication result3 = new Multiplication(operation, a, b); result3.PrintOutput(); break;
            case "/", "divide": Division result4 = new Division(operation, a, b); result4.PrintOutput(); break;
            default: System.out.println("Not a valid operation"); result = 0;

        };

    }

}