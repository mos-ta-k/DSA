public class BubbleSort {
    public static void main(String[] args){

        int nums[] = {1,3,5,7,9,15,2};
        int temp;

        for(int i = 0; i<nums.length; i++)
        {
            for(int j = 0; j<nums.length-1; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }

        System.out.println("After sorting...");
        for(int num : nums){ // enhanced for loop 
            System.out.print(num + " ");
        }
    }
}
