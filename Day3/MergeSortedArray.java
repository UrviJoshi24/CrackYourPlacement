import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[last] = nums1[m - 1];
                m -= 1; 
            } else {
                nums1[last] = nums2[n - 1];
                n -= 1;
            }
            last -= 1;
        }
        while (n > 0) {
            nums1[last] = nums2[n - 1];
            n -= 1;
            last -= 1;
        }
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 0, 0, 0}; 
        int[] arr2 = {2, 4, 6};         
        
        MergeSortedArray sortedArray = new MergeSortedArray();
        sortedArray.merge(arr1, 5, arr2, 3);
        
        System.out.println(Arrays.toString(arr1)); 
    }
}
