class MoveallZeroes{
    public void moveZeroes(int [] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
            if (i != count) {
            nums[count] = nums[count] ^ nums[i];
            nums[i] = nums[count] ^ nums[i];
            nums[count] = nums[count] ^ nums[i];
        }
        count++;
    }
    }
}
    public static void main(String[] args) {
        MoveallZeroes obj = new MoveallZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        obj.moveZeroes(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}