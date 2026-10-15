package sort;
import java.util.Arrays;

public class aggresiveCows {

    public static boolean isValid(int[] stalls, int k, int mid) {
        int cowCount = 1;
        int lastPosition = 0;

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - stalls[lastPosition] >= mid) {
                cowCount++;
                lastPosition = i;
            }

            if (cowCount >= k) {
                return true;
            }
        }

        return false;
    }

    public static int arrangeCows(int[] stalls, int k) {
        Arrays.sort(stalls);

        int n = stalls.length;
        int s = 1;
        int e = stalls[n - 1] - stalls[0];
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValid(stalls, k, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3;

        System.out.println(arrangeCows(stalls, k));
    }
}

