import java.util.Collections;
import java.util.Arrays;

public class MedianOfTwoSortedArrays {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int[] nums3 = new int [nums1.length + nums2.length];

            System.arraycopy(nums1, 0, nums3, 0, nums1.length);
            System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);

            Arrays.sort(nums3);

            int l = nums3.length;

            if(l % 2 == 0){
                return (nums3[l/2] + nums3[l/2-1]) / 2.0;
            }else{
                return nums3[l/2];
            }
        }

}
