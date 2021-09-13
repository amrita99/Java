import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number 1");
        int num1=scanner.nextInt();
        System.out.println("Enter a number 2");
        int num2=scanner.nextInt();
        System.out.println("Enter a number 3");
        int num3=scanner.nextInt();

        int sum=(num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3);
        System.out.println("Three numbers are:"+num1 +num2+ num3);
        System.out.println("Sum of their squares are :"+sum);

    }
}
