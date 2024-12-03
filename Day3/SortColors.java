import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++; 
            } else { 
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        SortColors sc = new SortColors();
        
        // Example 1
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        sc.sortColors(nums1);
        System.out.println(Arrays.toString(nums1)); // Output: [0, 0, 1, 1, 2, 2]

        // Example 2
        int[] nums2 = {2, 0, 1};
        sc.sortColors(nums2);
        System.out.println(Arrays.toString(nums2)); // Output: [0, 1, 2]
    }
}

    
