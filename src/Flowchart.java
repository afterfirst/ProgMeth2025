public class Flowchart {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        int n = 5;

        while (x <= n) {
            y = 0;
            while (y <= x) {
                y += 1;
            }
            x += 1;
            z += y;
        }

        System.out.println(z);
    }
}
