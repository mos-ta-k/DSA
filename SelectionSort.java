public class SelectionSort {
    public static void main(String[] args){
        int nums[] = {1,3,5,7,9,15,2};
        int size = nums.length;
        int minIndex = -1;
        int temp;

        for(int i = 0; i < size - 1; i++){
            minIndex = i;
            for(int j = i; j < size; j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

        }

        System.out.println("After sorting...");
        for(int num : nums){ // enhanced for loop 
            System.out.print(num + " ");
        }

    }
}
