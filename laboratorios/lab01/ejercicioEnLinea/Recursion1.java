
/**
 * This class contains the solutions of five
 * differents exercises made in CodingBat, 
 * all of them about the first level of recursion..
 * 
 * @author Isabella Pérez, Mariana Quintero
 * 
 */
public class Recursion1
{
    //bunnyEars
    public int bunnyEars(int bunnies){
        if(bunnies == 0)
            return 0;//c1
        else
            return 2 + bunnyEars(bunnies - 1);//c2+T(n-1)
    }

    //triangle
    public int triangle(int rows){
        if(rows > 1)
            return rows + triangle(rows - 1);//c1+n+T(n-1)
        else
            return rows;//c2
    }

    //factorial
    public int factorial(int n){
        if (n == 1)
            return n;//c1
        else
            return factorial (n-1) * n;//c2+T(n-1)
    }

    //powerN
    public int powerN(int base, int n){
        if(base >=1 && n>=1){
            int resultado = (int)Math.pow(base, n);
            return resultado;//c1
        }else
            return powerN(base+1, n+1);//c2+T(n+1)
    }

    //fibonacci
    public int fibonacci(int n){
        if (n <= 1)
            return n; //c1
        else
            return fibonacci (n - 1) + fibonacci (n - 2);// c2 + T(n - 1)+T(n - 2)
    }
}
