import java.util.Scanner;
/**
 * Write a description of class Permutacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Permutacion
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Cadena a permutar: ");
        cadena = sc.nextLine();
        permutacionAux(cadena);
    }
    
    public static void permutacionAux(String str) { 
        permutacion("", str); 
    }

    private static void permutacion(String prefix, String str) {
        int n = str.length();
        if (n == 0){ 
            System.out.println(prefix);
        }
        else {
            for (int i = 0; i < n; i++){
                permutacion(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
            }
        }
    }
}
