public class OverloadingSum {
    public static void main(String[] args) {
        System.out.println("sum(int a) result for a = 10 : " + sum(10));
        System.out.println("sum(int a) result for a = 5 b = 10 : " + sum(5, 10));
        System.out.println("sum(int a) result for a = 5 b = 10 c = 2: " + sum(5, 10, 2));
    }

    public static int sum(int a) {
        int sum = 0;

        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sum(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sum(int a, int b, int c) {
        int sum = 0;

        for (int i = a; i <= b; i += c) {
            sum += i;
        }
        return sum;
    }
}
