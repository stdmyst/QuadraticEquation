import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner a0 = new Scanner(System.in);
        Scanner b0 = new Scanner(System.in);
        Scanner c0 = new Scanner(System.in);
        int a = a0.nextInt();
        int b = b0.nextInt();
        int c = c0.nextInt();


        int dis = b*b - 4*a*c;
        if (dis < 0) {
            System.out.print("No roots");
        }
        else {
            if (dis == 0) {
                double x = (double)(-1*b) / (2*a);
                System.out.print("x = " + x);
            }
            else {
                double sqrt = Math.sqrt(dis);
                double x1 = (-1*b + sqrt) / 2*a;
                double x2 = (-1*b - sqrt) / 2*a;
                System.out.println("x1 = " + x1);
                System.out.print("x2 = " + x2);
            }
        }
    }
}