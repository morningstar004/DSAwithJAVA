package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class missing_element {

    public List<Integer> missingelement(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        // Mark numbers that exist
        for (int num : nums) {
            int value = Math.abs(num);
            int position = value - 1;

            if (nums[position] > 0) {
                nums[position] = -nums[position];
            }
        }

        // Positive positions represent missing numbers
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}
