public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num ;
        System.out.println("Enter a number");
        num = inp.nextInt();
        if(num%2==0){
            System.out.println("The entered number is even");

        }
        else {
            System.out.println("The entered number is odd");
        }
