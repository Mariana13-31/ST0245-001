import java.util.Scanner;
/**
 * Write a description of class TorresHanoi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * La fórmula para encontrar el número de movimientos
 * necesarios para transferir n discos desde un poste a otro es: 2n - 1.
 * Se llevan n-1 discos de la varilla origen a la auxiliar.
 * Se lleva un solo disco (el que queda) de la varilla origen a la destino
 * Se traen los n-1 discos de la varilla auxiliar a la destino.
 */
public class Hanoi
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        Hanoi(n,1,2,3);  //1:origen  2:intermedio 3:destino
    }
    
    public static void Hanoi(int n, int origen,  int auxiliar, int destino){
        if(n==1)
            System.out.println("Mover un disco de la torre " + origen + " a la torre " + destino);
        else{
            Hanoi(n-1, origen, destino, auxiliar);
            System.out.println("Mover un disco de la torre "+ origen + " a la torre " + destino);
            Hanoi(n-1, auxiliar, origen, destino);
        }
    }
}
