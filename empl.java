import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your name ,age,salary");
        Scanner input=new Scanner(System.in);
        String name =input.nextLine();
        double age=input.nextDouble();
        double sal=input.nextDouble();

        System.out.println(name +age + sal);


    }
}
