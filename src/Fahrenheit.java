import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        float celcius = kbd.nextInt();
        System.out.printf("Celcius : %f",  (celcius*1.8)+32);
    }
}
