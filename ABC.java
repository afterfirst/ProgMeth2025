
public class ABC {

    public static void main(String[] args) {
        int sum = 200;
        for (int a = 0; a < Math.sqrt(sum); a++){
            for (int b = 0; b < Math.sqrt(sum); b++){
                for (int c = 0; c < Math.sqrt(sum); c++){
                    if (a*a + b*b + c*c != 200) { continue; }

                    System.out.printf("%d %d %d\n", a, b, c);
                }
            }
        }
    }
}
