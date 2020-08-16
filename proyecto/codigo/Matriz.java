import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream; 
/**
 * Write a description of class ColeccionMatriz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matriz
{
    public ArrayList<String> archivo;
    
    /*
     * Este es el constructor de la clase Matriz en donde se inicializa
     * el ArrayList de los datos
     */
    public Matriz() {
        archivo = new ArrayList<>();
    }

    
    /*
     * Este metodo lee un archivo de datos del disco
     * Los datos quedan guardados en el ArrayList de archivo.
     */
    public void LeerArchivo(String nombreArchivo){
        
        try{
            Scanner archivo = new Scanner(new File(nombreArchivo));
            
            //Encabezado
            if(archivo.hasNextLine()){
                String linea = archivo.nextLine();
            }
            
            //Datos
            while(archivo.hasNextLine()){//devuelve boolean, si hay mas datos
                String linea = archivo.nextLine();

                String[] elementos = linea.split(";");
                
                for(int i =0; i==elementos.length; i++){
                   this.archivo.add(elementos[i]);
                }
                
            }
            System.out.println("Se ha leído y guardado correctamente.");
            archivo.close();

        }catch(FileNotFoundException ex){
            System.out.println("error: "+ ex.getMessage());
        }
        
    }   
}