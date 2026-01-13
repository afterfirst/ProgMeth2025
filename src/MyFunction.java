import java.util.Scanner;

public class MyFunction {
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);

        double x = kbd.nextDouble();

        if (-10 <= x & x <= -5) {
            x = -(x * x);
        }
        else if (-5 < x & x <= 0) {
            x = 0;
        }
        else if (-0 < x & x <= 5) {
            x = x * x;
        }
        else if (5 < x & x <= 10) {
            x = 0;
        }
        else {
            x = x * x * x;
        }

        System.out.println(x);
    }
}
