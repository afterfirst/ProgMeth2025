import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        double diagonalLength = kbd.nextDouble();
        double angleDegree = kbd.nextDouble();

        double angleRadian = Math.toRadians(angleDegree);
        double height = diagonalLength * Math.sin(angleRadian);
        double base = diagonalLength * Math.cos(angleRadian);

        System.out.printf("Height : %f\nBase : %f\n", height, base);
    }
}
