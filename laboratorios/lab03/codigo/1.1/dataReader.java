import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.lang.Object;
import java.util.*;

/**
 * Class dataReader
 * 
 * @author Mauricio Toro 
 * @version 1
 * 
 * You can found it at: 
 * https://github.com/mauriciotoro/ST0245-Eafit/blob/master/laboratorios/lab03/spoiler/ejercicio-1.1/java/LectorDatos.java
 */
 
/**
 * The data reader class allows reading data that will 
 * be used in the algorithm that allows create a data 
 * structure with the map of a city.
 * 
 * @author Isabella Pérez, Mariana Quintero 
 * @version 2
 */

public class dataReader
{
    public dataReader() {
    }

    public HashMap<Long, Node> readNodes() {
        HashMap<Long, Node> nodes = new HashMap<>();
        try{
            FileReader f  = new FileReader("Vertices.txt");
            BufferedReader b = new BufferedReader(f);
            String line;
            int lineCount = 0;
            while((line = b.readLine()) != null) {
                if(lineCount != 0) {
                    String[] data = line.split(" ");
                    Long id = Long.parseLong(data[0]);
                    Node v = new Node(id);
                    nodes.put(v.id, v);  
                }
                lineCount++;
            }
            b.close();
            return nodes;
        }catch (IOException e) {
            System.out.println("Make sure you have the document '' Vertices ''");
        }
        return nodes;
    }

    public ArrayList<Triplet<Long, Long, Double>> readEdges() {
        ArrayList<Triplet<Long, Long, Double>> edges = new ArrayList<>();
        try{
            FileReader f  = new FileReader("Arcos.txt");
            BufferedReader b = new BufferedReader(f);
            String line;
            int lineCount = 0;
            while((line = b.readLine()) != null) {
                if(lineCount != 0) {
                    String[] data = line.split(" ");
                    Long source= Long.parseLong(data[0]);
                    Long destination = Long.parseLong(data[1]);
                    Double distance = Double.parseDouble(data[2]);
                    Triplet<Long, Long, Double> a = new Triplet(source, destination, distance);
                    edges.add(a);
                }
                lineCount++;
            }
            b.close();
        }catch (IOException e) {
            System.out.println("Make sure you have the document '' Arcos ''");
        }
        return edges;
    }
}