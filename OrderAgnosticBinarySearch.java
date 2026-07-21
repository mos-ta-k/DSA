// if you don't know the given array is in ascending or descending order
// then compare the first element and last element of the array

public class OrderAgnostincBinarySearch {
    public static void main(String[] args){
        int nums[] = {5,6,7,8,10,12};
        int target = 10;

        int result = orderAgnosticBinarySearch(nums, target);

        if(result != -1){
            System.out.println("Element found at the index: " + result);
        }else{
            System.out.println("Element not found!");
        }
    }

    public static int orderAgnosticBinarySearch(int[] nums, int target){

        int left = 0;
        int right = nums.length - 1;

        //find the array is sorted in ascending pr descending
        boolean isAscending;
        isAscending = nums[left] < nums[right]; // check if the array sorted in ascending or descending order




        while (left <= right) {
        int mid = (left + right) / 2; // find the middle of the array

            if (nums[mid] == target){
                return mid;
            }

            if(isAscending ){ // if the array sorted in ascending order
                if(nums[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }

            }else{ // if the array sorted in descending order
                if(nums[mid] > target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
