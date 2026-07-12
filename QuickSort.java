public class QuickSort {

    public static void quickSort(int[] nums, int low, int high){
        if(low<high){

            int pi = partition(nums, low, high);

            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j<= high-1; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public static void main(String[] args){
        int nums[] = {1,8,5,11,9,15,2};
        int size = nums.length;
        quickSort(nums, 0, size - 1);
        // print sorted
        for(int n: nums) System.out.print(n + " ");
    }
}
