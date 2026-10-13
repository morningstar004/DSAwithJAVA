package sort;

public class SQRT {

    public static int sqrt(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Negative number");
        }

        int start = 0;
        int end = x;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }

            if (square > x) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }

        return ans;
    }

    public static double presizedSqrt(int x, int precisionValue) {
        if (x < 0 || precisionValue < 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        double ans = sqrt(x);
        double factor = 0.1;

        for (int round = 1; round <= precisionValue; round++) {
            while (ans * ans <= x) {
                double next = ans + factor;

                if (next * next > x) {
                    break;
                }

                ans = next;
            }

            factor /= 10;
        }

        return ans;
    }


    static void main() {
        System.out.println(sqrt(25));
        System.out.println(presizedSqrt(24,1));
    }
}
