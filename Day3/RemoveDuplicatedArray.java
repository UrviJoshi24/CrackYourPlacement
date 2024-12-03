public class RemoveDuplicatedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0; 
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { 
                nums[i + 1] = nums[j]; 
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatedArray rda = new RemoveDuplicatedArray();
        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int newLength = rda.removeDuplicates(nums);

        System.out.println("Length of array with unique elements: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
