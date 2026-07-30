public class CeilingOfNumber {
    public static void main(String[] args){

        int nums[] = {5,6,7,10,12};
        int target = 11;
        int low = 0;
        int high = nums.length - 1;

        int result = ceilingOfNumber(nums, target);

        if(result != -1){
            System.out.println("Element found at the index: " + result);
        }else{
            System.out.println("Element not found!");
        }
    }

    // return the index of smallest no >= target
    public static int ceilingOfNumber(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
