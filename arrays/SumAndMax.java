import java.util.Scanner;

public class SumAndMax {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array items: ");
        for(int i = 0; i< n; i++)
            arr[i] = scanner.nextInt();

        for (int i = 0; i< n; i++){
            sum += arr[i];
        }

        int max = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("largest element is: " + max);
        System.out.print("sum of the array is: " + sum);
    }
}
