
/**
 * This class contains the solutions of five
 * differents exercises made in CodingBat, 
 * all of them about a second level of recursion.
 * 
 * @author Mariana Quintero, Isabella Pérez.
 * 
 */
public class Recursion2
{
    //splitArray
    public boolean splitArray(int[] nums) {
        return   splitArray ( 0 , 0 , 0 , nums);
    }

    public  boolean  splitArray ( int  start , int  rest1 , int  rest2 , int [] nums ) {
        if (nums.length <= start){
            return rest1 == rest2;//c1
        } 
        else {
            return   splitArray (start + 1 , rest1 + nums [start], rest2, nums)
            ||   splitArray (start + 1 , rest1, rest2 + nums [start], nums);//c2+T(n+1)+T(n+1)
        } 
    }

    //split53
    public boolean split53(int[] nums) {
        return split53Aux(0, 0, 0, nums);
    }

    private boolean split53Aux(int start, int rest1, int rest2, int[] nums) {
        if (nums.length <= start){
            return rest1 == rest2;
        }else if (nums[start] % 5 == 0){
            return split53Aux(start + 1, rest1 + nums[start], rest2, nums);
        }else if (nums[start] % 3 == 0){
            return split53Aux(start + 1, rest1, rest2 + nums[start], nums);
        }else{
            return split53Aux(start + 1, rest1 + nums[start], rest2, nums) 
            || split53Aux(start + 1, rest1, rest2 + nums[start], nums);
        }
    }

    //groupNoAdj
    public boolean groupNoAdj(int start, int[] nums, int target){
        if(start >= nums.length)
            return target == 0;//c1
        return groupNoAdj(start + 2, nums, target - nums[start])
        || groupNoAdj(start + 1, nums, target);//c2+T(n-2)+T(n-1)
    }

    //groupSum6
    public boolean groupSum6(int start, int[] nums, int target){
        if(start >= nums.length || nums.length == 0)
            return target == 0; // T(n) = c1
        if(nums [start] == 6)
            return groupSum6(start + 1, nums, target - nums[start]); //T(n) = c2+T(n+1)
        else
            return groupSum6(start + 1, nums, target - nums[start])
            || groupSum6(start + 1, nums, target);//T(n) = c2+T(n+1)+T(n+1)
    }

    //groupSum5
    public boolean groupSum5(int start, int[] nums, int target){
        if(start >= nums.length || nums.length == 0)
            return target == 0;
        if (nums[start]%5 == 0)
            if((start+1<nums.length) && nums[start+1] == 1)
                return groupSum5(start+2, nums, target-nums[start]);
            else
                return groupSum5(start + 1, nums, target-nums[start]);
        else
            return groupSum5(start + 1, nums, target - nums[start])
            || groupSum5(start + 1, nums, target);
    }
}