import java.util.Scanner;

public class TwoTermsMethod {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter 5 inputs (a, x, b, r, n) : ");
        int a = kbd.nextInt();
        int x = kbd.nextInt();
        int b = kbd.nextInt();
        int r = kbd.nextInt();
        int n = kbd.nextInt();
        System.out.printf("Inputs (a,x,b,r,n) = %d,%d,%d,%d,%d\n", a, x, b, r, n);
        System.out.printf("Output (y) = %d\n", calculateY(a, x, b, r, n));
    }

    public static int axPlusB(int a, int x, int b) {
        return a * x + b;
    }

    public static int sumSquaredI(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) result += i*i;
        return result;
        //return ((n * (n+1) * (2*n + 1))/6);
    }
    public static int calculateY(int a, int x, int b, int r, int n) {
        return axPlusB(a, x, b) * r * r + sumSquaredI(n) * r;
    }
}
