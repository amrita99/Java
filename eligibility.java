import java.util.Scanner;
public class Main{
     public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int total_classes,attended;
        float att_perc;
        System.out.println("Enter total classes held");
        total_classes=inp.nextInt();
        System.out.println("Enter total class attended");
        attended=inp.nextInt();
        att_perc=((float)attended/total_classes)*100;
        if(att_perc>=75.0){
            System.out.println("Eligible to take exam");
        
        }
        else{
            System.out.println("Not eligible to take exam");
        }
    }
}
