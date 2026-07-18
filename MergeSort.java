public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right){

        int n1  = mid - left + 1; //length of left array
        int n2 = right - mid; // length of right array


        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for(int x = 0; x<n1; x++){ // for left array
            leftArr[x] = arr[left + x];
        }
        for(int x = 0; x<n2; x++){ // for right array
            rightArr[x] = arr[mid + 1 + x];
        }

        int i= 0;
        int j = 0;
        int k = left; // main array- array after merge

        while ( i < n1 && j < n2){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args){
        int[] arr = {1,4,3,5,2};

        mergeSort(arr, 0, arr.length - 1);

        for(int n : arr){
            System.err.print(n + "");
        }
    }
}
