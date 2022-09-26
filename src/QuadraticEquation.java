public class QuadraticEquation {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = -3;

        int dis = b*b - 4*a*c;
        if (dis < 0) {
            System.out.print("No roots");
        }
        else {
            if (dis == 0) {
                double x = (-1*b) / 2*a;
                System.out.print("x = ");
                System.out.print(x); // как сделать то же в одной строке?
            }
            else {
                double sqrt = Math.sqrt(dis);
                double x1 = (-1*b + sqrt) / 2*a;
                double x2 = (-1*b - sqrt) / 2*a;
                System.out.print("x1 = ");
                System.out.println(x1); // как сделать то же в одной строке?
                System.out.print("x2 = ");
                System.out.print(x2); // как сделать то же в одной строке?
            }
        }
    }
}