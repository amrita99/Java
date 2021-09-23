public class Area {
    public void calcArea() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Area Calculation");
        System.out.println("1.Triangle");
        System.out.println("2.Rectangle");
        System.out.println("3.Parallelogram");
        System.out.println("4.Circle");

        System.out.println("5.Exit");
        System.out.println("Enter your choice 1 to 5");
        int ch = inp.nextInt();

        double area, base, ht, wid, r, a, b;
        switch (ch) {
            case 1:
                System.out.println("Enter base of triangle:");
                base = inp.nextDouble();
                System.out.println("Enter height of triangle:");
                ht = inp.nextDouble();
                area = 0.5 * base * ht;
                System.out.println("Area of Triangle is : " + area + "sq units");
                break;
            case 2:
                System.out.println("Enter width of Rectangle");
                wid = inp.nextDouble();
                System.out.println("Enter height of Rectangle");
                ht = inp.nextDouble();
                area = wid * ht;
                System.out.println("Area of rectangle is :" + area + "sq units");
                break;
            case 3:
                System.out.println("Enter base of parallelogram");
                base = inp.nextDouble();
                System.out.println("Enter height of parallelogram");
                ht = inp.nextDouble();
                area = base * ht;
                System.out.println("Area of parallelogram is :" + area + "sq units");
                break;
            case 4:
                System.out.println("Enter radius of circle");
                r = inp.nextDouble();
                area = 3.14159 * r * r;
                System.out.println("Area of parallelogram is :" + area + "sq units");
                break;
            case 5:
                System.out.println("Exiting");
                break;


        }
    }

    public static void main(String[] args) {
       Area in = new Area();
       in.calcArea();

    }
}
