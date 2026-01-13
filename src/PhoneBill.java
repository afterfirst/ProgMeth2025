import java.util.Scanner;
import java.math.BigDecimal;

public class PhoneBill {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int timeMinute = kbd.nextInt();

        double billBaht = 200 + Math.max(timeMinute - 200, 0) * 0.5 + Math.max(timeMinute - 500, 0) + Math.max(timeMinute - 1000, 0) * 2;

        System.out.println(billBaht);
    }
}
