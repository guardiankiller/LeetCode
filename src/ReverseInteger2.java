import static java.lang.Math.abs;

public class ReverseInteger2 {
    public static int reverse(int x) {
        long num = 0;
        int y = abs(x);
        while (y > 0) {
            num = num * 10 + y % 10;
            y = y / 10;
        }
        if (x < 0) return -1 * (int) num;
        return (int) num;
    }
}
