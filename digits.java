 public void test() {
            Scanner inp = new Scanner(System.in);
            int num;
            System.out.println("Enter a number from 1 to 99:");
            num = inp.nextInt();
            if (num > 0 && num < 10) {
                System.out.println("you have entered a single digit number");
            } else {
                System.out.println("you have entered double digit number");
            }

        }
