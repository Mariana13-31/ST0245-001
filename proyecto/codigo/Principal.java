
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Principal
{
    public static final int LeerDatos = 1;
    public static final int TerminarPrograma = 10;

    private Scanner in;

    protected Matriz arreglo;

    public Principal() {
        arreglo = new Matriz();
        in = new Scanner(System.in);
    }

    private int pedirOpcion() {
        System.out.println("=====");
        System.out.println("Por favor escoja entre las siguientes opciones:");
        System.out.println(LeerDatos + ". Leer datos");
        System.out.println(TerminarPrograma +". Terminar el programa");

        in = new Scanner(System.in);
        int opcion = in.nextInt();
        return opcion;
    }

    private void procesarOpcion(int opcion){
        if (opcion == LeerDatos){
            LeerDatos();
        }else if(opcion == TerminarPrograma){
            System.out.println("El programa ha terminado. Gracias.");
        }else{
            System.out.println("Opción inválida. Por favor intente de nuevo");
        }

    }

    public static void main(String [] args) {

        Principal p = new Principal();
        int opcion = p.pedirOpcion();
        while (opcion != TerminarPrograma) {
            p.procesarOpcion(opcion);
            opcion = p.pedirOpcion();
        }
        System.out.println("El programa ha terminado. Gracias.");
    }

    private void LeerDatos(){
        try {
            System.out.println("Por favor ingrese la ubicación del archivo a leer con el siguiente formato como ejemplo: C:\\Users\\DELL\\Desktop\\0_test_balanced_5000.csv ");
            String nombreArchivo = in.next();

            arreglo.LeerArchivo(nombreArchivo);

        } catch(Exception e){
            System.out.println("El archivo no existe " + e.getMessage());
        }

    }
}