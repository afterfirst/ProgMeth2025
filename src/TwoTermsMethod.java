import java.util.Scanner;

public class TwoTermMethod {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter 5 inputs (a, x, b, r, n) : ");
        int a = kbd.nextInt();
        int x = kbd.nextInt();
        int b = kbd.nextInt();
        int r = kbd.nextInt();
        int n = kbd.nextInt();
        System.out.printf("Inputs (a,x,b,r,n) = %d,%d,%d,%d,%d\n", a, x, b, r, n);
        System.out.printf("Output (y) = %d\n", eq(a, x, b, r, n));
    }

    public static int eq(int a, int x, int b, int r, int n) {
        return (a*x + b)*r*r + ((n * (n+1) * (2*n + 1))/6)*r;
    }
}
