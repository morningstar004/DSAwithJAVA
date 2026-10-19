package sort;

public class nonDuplicate {

    public static int nonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid == 0 && (n == 1 || nums[mid] != nums[mid + 1])) {
                return mid;
            }

            if (mid == n - 1 && nums[mid] != nums[mid - 1]) {
                return mid;
            }

            if (mid > 0 && mid < n - 1
                    && nums[mid] != nums[mid - 1]
                    && nums[mid] != nums[mid + 1]) {
                return mid;
            }

            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    s = mid + 2;
                } else {
                    e = mid - 1;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        return -1;
    }

    static void main() {
        int[] arr = {10,10,20,20,30,30,40,40,50,60,60,70,70};

        System.out.println(nonDuplicate(arr));
    }
}
