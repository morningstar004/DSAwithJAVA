package sort;

public class SQRT {
    public static int sqrt(int x) {
        int start = 0;
        int end = x;
        int ans = -1;

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

    static void main() {
        System.out.println(sqrt(25));
    }
}
