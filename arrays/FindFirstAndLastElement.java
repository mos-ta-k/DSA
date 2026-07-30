//leetcode 34
class FirstAndLastElement {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        result[0] = findFirst(nums, target);
        if(result[0] == -1){
            return result;
        }

        nums = new int[]{10, 20, 30, 40, 50};

        result[1] = findLast(nums, target);

        return result;
    }

    private int findFirst(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                ans = mid;
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return ans;
    }

    private  int findLast(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                ans = mid;
                left = mid + 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}