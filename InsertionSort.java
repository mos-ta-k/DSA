public class InsertionSort {
    public static void main(String[] args){
        
        int nums[] = {1,8,5,11,9,15,2};
        int size = nums.length;

        for(int i = 0; i < size; i++){
            int key = nums[i];
            int j = i - 1;

           while(j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j]; // shifting large value to the right
                j--;
            }

            nums[j + 1] = key;
        }


        System.out.println("After sorting...");
        for(int num : nums){ // enhanced for loop 
            System.out.print(num + " ");
        }

    }
}
