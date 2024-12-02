
public class Majorityelement {
    public int majorityElement(int[] nums){
        int count = 0;
        int element = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                count+=1;
                element = nums[i];
            }
            else if(element == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count_again = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == element){
                count_again++;
            }
            if(count_again>(nums.length/2)){
                return element;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Majorityelement obj = new Majorityelement();
        int[] nums = {3,2,3};
        int result = obj.majorityElement(nums);
        if(result !=0 ){
            System.out.println(result);
        }
        else{
            System.out.println("No Majority Element");
        }
        
    }
}
