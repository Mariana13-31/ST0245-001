
/**
 * This class contains a lot of methods that give solutions for the
 * CodingBat exercises of the category Array2.
 * 
 * @author Isabella Pérez, Mariana Quintero
 * 
 * @version 1
 */

public class Array2{

    public int sum13(int[] nums) {
        return sum13(nums, 0, 0);
    } 

    private int sum13(int[] nums, int i , int sum ){
        if(i>= nums.length){
            return sum;
        }
        if(nums[i]==13){

            return sum13(nums, i+2, sum);
        }
        else{
            sum= sum + nums[i]; 
            return sum13(nums, i+1, sum);
        }
    }

    public int[] fizzArray(int n) {
        int m[] = new int[n];
        for ( int i =0; i< n; i++){
            m[i]=i;
        }
        return m;
    }

    public int[] notAlone(int[] nums) {
        int [] array= new int[nums.length];
        for(int i=0; i<nums.length ;i++){
            if(i!=0 && i!= nums.length-1){

                if(nums[i-1]!= nums[i] && nums[i+1]!=nums[i])
                    array[i]=Math.max(nums[i], Math.max(nums[i-1], nums[i+1]));
                else
                    array[i]= nums[i];

            } else
                array[i]= nums[i];

        }
        return array;
    }

    public boolean lucky13(int[] nums) {
        boolean r = true;
        for (int i = 0; i <= nums.length-1; i ++) {
            if (nums[i] == 1 || nums[i] == 3)
                r = false;
        }
        return r;
    }

    public int countEvens(int[] nums) {
        int cont = 0;
        for (int i = 0; i <= nums.length-1; i ++) {
            if (nums [i] % 2 == 0){
                cont=cont+1;
            }
        }
        return cont;
    }

}
