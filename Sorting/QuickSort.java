public class QuickSort {

    public static void quickSort(int[] nums, int low, int high){
        if(low<high){

            int pi = partition(nums, low, high);

            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while(i <= j) {
            while(i <= high && arr[i] <= pivot) {
                i++;
            }
            while(j >= low && arr[j] > pivot) {
                j--;
            }
            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for(int i = 0; i < size; i++){
            nums[i] = scanner.nextInt();
        }

        quickSort(nums, 0, size - 1);

        System.out.println("Sorted array:");
        for(int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
        scanner.close();
    }
}
