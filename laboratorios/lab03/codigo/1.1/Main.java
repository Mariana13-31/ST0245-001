import java.util.ArrayList;
import java.util.HashMap;

/**
 * Main class.
 * 
 * @author Mauricio Toro 
 * @version 1
 * 
 * You can found it at: 
 * https://github.com/mauriciotoro/ST0245-Eafit/blob/master/laboratorios/lab03/spoiler/ejercicio-1.1/java/Main.java
 */

public class Main
{
    public static void main() {
        dataReader d = new dataReader();
        HashMap<Long, Node> nodes = d.readNodes();
        System.out.println(nodes.size());
        ArrayList<Triplet<Long, Long, Double>> edges = d.readEdges();
        System.out.println(edges.size());
        DataStructure e = new DataStructure(nodes, edges);
        System.out.println(e.adjGraph.size());
        System.out.println(nodes.get(new Long(287291920)).id);

        Long l = new Long(287291920);
        Long l2 = new Long(1397149003);

        ArrayList<Long> test1 = e.getSuccessors(l);
        System.out.println(test1.size());

        for(Long i : test1) {
            System.out.println(i);
        }
        System.out.println("Distance: " + e.getWeight(l, l2));
    }
}