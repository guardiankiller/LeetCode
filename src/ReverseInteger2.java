import static java.lang.Math.abs;

public class ReverseInteger2 {
    public static void main(String[] args) {
        int x = 1234236467;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        long num = 0;
        int y;
//        int y = abs(x);
        if (x < 0) {
            y = -1 * x;
        } else {
            y = x;
        }
        while (y > 0) {
            num = num * 10 + y % 10;
            y = y / 10;
        }
        if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE){
            return 0;
        }
        if (x < 0) return -1 * (int) num;
        return (int) num;
    }
}
