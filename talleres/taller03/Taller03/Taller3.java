/**
 *
 * La clase Taller3 tiene como objtivo dar solución a los puntos del taller 3
 *
 * @author Mariana Quintero Montoya, Isabella Pérez
 * 
 */

public class Taller3 {

    /**
     *
     * El método combinations es un auxiliar del proceso 
     * @param s es la cadena a permutar
     */
    public static void combinations(String s) { 
        combinationsAux("", s); 
    }

    /**
     *
     * El método combinationsAux es el core del proceso, en el se busca conseguir
     * las posibles permutaciones que puede tener la cadena s 
     * @param s es la cadena a permutar
     * @param prefix cadena auxiliar donde se guarda la cadena de salida
     *
     * Las cadenas de salida tienes una longitud desde 0 hasta el lenght de la cadena s
     * por simplicidad del ejercicio no se repiten letras y el orden de la secuencia 
     * no supone importancia, es decir, la cadena AB es igual a la cadena BA.
     * Ej: para la cadena ABC se tiene la salida: { A, AB, ABC, AC, B, BC, C}
     *
     */
    private static void combinationsAux(String prefix, String s) {  
        if(s.length()==0) System.out.println(prefix);
        else{
            combinationsAux(prefix+s.substring(0,1),s.substring(1));
            combinationsAux(prefix,s.substring(1));
        }
    }

    /**
     *
     * El método permutation es un auxiliar del proceso 
     * @param str es la cadena a permutar
     */
    public static void permutation(String str) {
        permutationAux("",str); 
    }

    /**
     *
     * El método permutationAux es el core del proceso, en el se busca conseguir
     * las posibles permutaciones que puede tener la cadena str 
     * @param str es la cadena a permutar
     * @param prefix cadena auxiliar donde se guarda la cadena de salida
     *
     * Las cadenas de salida tienes una longitud de lenght de la cadena s
     * Ej: para la cadena AB se tiene la salida: { ABC,ACB,BAC,BCA,CAB,CBA }
     * donde los caracteres no se repiten pero el orden tiene un papel importante.
     *
     */

    private static void permutationAux(String respuesta, String pregunta) {
        if (pregunta.length() == 0){
            System.out.println(respuesta);
            System.out.println(AdvancedEncryptionStandard.desencriptarArchivo(respuesta));
        }
        else
            for (int i = 0; i < pregunta.length(); i++)
                permutationAux(pregunta.substring(1),//""+pregunta[i],
                    pregunta.substring(0,i) + pregunta.substring (i+1));
        //las que empiezan por a, las que empiezan las que b, las que empiezan por c
        //permutationAux(""+"a", quitarUnaLetra(pregunta, "a") );
        // permutationAux(""+"b", quitarUnaLetra(pregunta, "b"));
        // permutationAux(""+"c", quitarUnaLetra(pregunta, "c"));
        // permutationAux(""+"d", quitarUnaLetra(pregunta, "d"));

    }
}
