import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Enter the number of items: ");
        n = scanner.nextInt();

        int nums[] = new int[n];

        System.out.println("enter " + n + " elemets");
        for(int i = 0; i<n; i++){
            nums[i] = scanner.nextInt();
        }

        System.out.println("enter an item to search: ");
        int item = scanner.nextInt();
        
        for(int i = 0; i<n; i++){
            if(item == nums[i]){
                System.out.println("Element found at index: " + i);
            }
        }


        scanner.close();
    }
}