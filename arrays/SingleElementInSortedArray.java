import java.util.Scanner;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) mid--;          // make mid even

            if (nums[mid] == nums[mid + 1]) { // pair is intact, single is on the right
                left = mid + 2;
            } else {                          // pair is broken, single is at mid or on the left
                right = mid;
            }
        }
        return nums[left];
    }
}

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size (must be odd): ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int result = sol.singleNonDuplicate(nums);

        System.out.println("Single element: " + result);
        sc.close();
    }
}