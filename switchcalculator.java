import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {

        double num1,num2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        num2= scanner.nextDouble();

        System.out.println("Enter operator");
        char operator =scanner.next().charAt(0);

        scanner.close();
        double output;

        switch (operator){
            case '+':
                output=num1+num2;
                break;

            case '-':
                output=num1-num2;
                break;

            case '*':
                output=num1*num2;
                break;

            case '/':
                output=num1/num2;
                break;

            default:
                System.out.println("You have entered wrong operator");
                return;
        }
        System.out.println(num1+" "+operator+" "+num2+"="+output);


    }
