package Ishan;

public class Division extends Calculate implements CalculatorInterface{
    Division(String operation, int num1, int num2) {
        super(operation, num1, num2);
    }

    @Override
    public void PrintOutput() {
        if(num2 == 0) {
            System.out.println("Dividing by 0 does not work!");
        } else{
            int result = num1 / num2;
            System.out.println("Result is " + num1 + " " + operation + " " + num2 + " = " + result);
    }

    }
}
