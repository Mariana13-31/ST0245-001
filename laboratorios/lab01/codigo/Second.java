
/**
 * This class give us a solution for the second problem
 * of the laboratory.
 * @author Mariana Quintero, Isabella Pérez 
 * 
 */
public class Second
{
    /**
     * Find out how many ways you can fill a rectangle of
     * 2xn cm² with rectangles of 1x2 cm², receiving the parameter n.
     * 
     * @param n longitud n del rectángulo de 2xn
     */

    public static int Board(int n){
        if(n > 2)
            return Board(n-1) + Board(n-2);
        else
            return n;
    }
    
    public static void Second(){
        System.out.println("For 1: "+Second.Board(1));
        System.out.println("For 2: "+Second.Board(2));
        System.out.println("For 5: "+Second.Board(5));
        System.out.println("For 9: "+Second.Board(9));
        System.out.println("For 15: "+Second.Board(15));
    }
}
