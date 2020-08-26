
/**
 * This class give us a solution for the first problem
 * of the laboratory.
 * 
 * @author Mariana Quintero, Isabella Pérez 
 * 
 */
public class First
{
    /**
     * This method calls the auxiliary method with the parameters
     * str1, str2, and their respective extensions
     * @param s1 es una cadena
     * @param s2 es una cadena
     */
    public static int CommonChain(String str1, String str2){
        return CommonChainAux (str1, str2, str1.length(), str2.length());
    }

    /**
     * This method compares the strings and returns the 
     * longest common substring.
     */
    public static int CommonChainAux(String st1, String st2, int a, int b){
        if(a == 0 || b == 0){
            return 0; // c1
        }
        else if(st1.charAt(a-1) == st2.charAt(b-1)){
            return 1 + CommonChainAux(st1, st2, a-1, b-1); //c2 + T(a-1),T(b-1)    T(a-1,b-1)
        }else{
            int c = Math.max(CommonChainAux(st1, st2, a, b-1), CommonChainAux(st1, st2, a-1, b));
            return c; // c3 + T (a, b-1) + T (a-1, b)
        }
    }
}