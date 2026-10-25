
import java.util.*;

class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long sumMax = 0;
        long sumMin = 0;

        Stack<Integer> stack = new Stack<>();

        // Sum of subarray minimums
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() &&
                   (i == n || nums[stack.peek()] > nums[i])) {

                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                sumMin += (long) nums[mid]
                        * (mid - left) * (right - mid);
            }

            if (i < n) {
                stack.push(i);
            }
        }

        stack.clear();

        // Sum of subarray maximums
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() &&
                   (i == n || nums[stack.peek()] < nums[i])) {

                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;

                sumMax += (long) nums[mid]
                        * (mid - left) * (right - mid);
            }

            if (i < n) {
                stack.push(i);
            }
        }

        return sumMax - sumMin;
    }
}
