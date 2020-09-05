
/**
 * This class contains a lot of methods that give solutions for the
 * CodingBat exercises of the category Array3.
 * 
 * @author Isabella Pérez, Mariana Quintero
 * 
 * @version 1
 */
public class Array3
{
    public int countClumps (int [] nums) {
        int cont = 0;
        for (int i = 0; i <nums.length-1; i ++) {
            if (nums [i] == nums [i + 1]){
                if(i == 0 || nums [i-1]!= nums [i]){
                    cont = cont + 1;
                }
            }
        }
        return cont;
    }

    public boolean canBalance(int[] nums) {
        int s1 = 0;
        int s2 = 0;
        for(int n=0; n<nums.length; n++){
            s1= s1+ nums[n];
        }
        for(int i=0; i< nums.length; i++){
            s1=s1-nums[i];
            s2= s2+nums[i];
            if(s1==s2){
                return true;
            }
        }
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        int cont=0;
        int n=0;
        for(int i=0; i< outer.length; i++){
            if((n< inner.length)&& outer[i]== inner[n]){
                cont=cont+1;
                n=n+1;
            }
        }
        if(cont==inner.length){
            return true;
        }
        return false;
    }

    public int[] seriesUp(int n) {
        int len = (n * (n + 1)) / 2;
        int array[] = new int[len];
        int in = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                array[in] = j;
                in++;
            }
        }
        return array;
    }

    public int maxSpan(int[] nums){
        if(nums.length<=1)
            return nums.length;      
        int cont = 1;      
        for (int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    if((j - i + 1) > cont){
                        cont = j - i + 1;
                    }
                }
            }
        }
        return cont;
    }
}
