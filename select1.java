import java.util.Scanner;
public class Main{
     public static void main (String[] args) {
    
        Scanner inp=new Scanner(System.in);
        int num;
        System.out.println("Enter a number in between 1 and 99 :");
        num=inp.nextInt();
        if(num>0 && num<10){
            System.out.println("You have entered a single number");
        }
        else{
           if(num >=10 && num<100){
               System.out.println("You have entered a double digit number");
           }
           else{
               System.out.println("You have entered the number beyond its range");
        }  }
    }
}
