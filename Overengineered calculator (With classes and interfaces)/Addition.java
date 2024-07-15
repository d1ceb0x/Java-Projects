package Ishan;

public class Addition extends Calculate implements CalculatorInterface{
    Addition(String operation, int num1, int num2) {
        super(operation, num1, num2);
    }


    @Override
    public void PrintOutput() {
        int result = num1 + num2;
        System.out.println("Result is " + num1 + " " + operation + " " + num2 + " = " + result);
    }
}
