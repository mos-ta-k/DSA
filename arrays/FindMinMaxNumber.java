public class FindMinMaxNumber {
    public static void main(String[] args){

        int[] arr = {18, 12, -7, 3, 14,28};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    // arr.length != 0
    //return the min value in the array
    static int min(int[] arr){
       int ans = arr[0];

       for(int i = 0; i<arr.length; i++){
           if(arr[i] < ans){
               ans = arr[i];
           }
       }
       return ans;
    }

    //return the max value in the array
    static int max(int[] arr){
        int ans = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
