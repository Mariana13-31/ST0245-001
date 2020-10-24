import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Implementacion de un grafo dirigido usando listas de adyacencia
 *
 * @author Mauricio Toro, Mateo Agudelo
 * @ version 1
 * 
 * @author Isabella Pérez, Mariana Quintero
 * @ version 2
 */
public class DigraphAL extends Digraph {
    ArrayList<LinkedList<Pair<Integer, Integer>>> list = new ArrayList<>();

    /**
     * Constructor para el grafo dirigido
     * 
     * @param vertices el numero de vertices que tendra el grafo dirigido
     */
    public DigraphAL(int size) {
        super(size);
        for(int i = 0; i < size; i ++)
            list.add(new LinkedList<>());
    }

    /**
     * Metodo para añadir un arco nuevo, donde se representa cada nodo con un entero
     * y se le asigna un peso a la longitud entre un nodo fuente y uno destino
     * 
     * @param source      desde donde se hara el arco
     * @param destination hacia donde va el arco
     * @param weight      el peso de la longitud entre source y destination
     */
    public void addArc(int source, int destination, int weight) throws Exception {
        if (source >= size || destination >= size)
            throw new Exception();
        list.get(source).addLast(new Pair<Integer, Integer>(destination, weight));
    }

    /**
     * Metodo para obtener una lista de hijos desde un nodo, es decir todos los
     * nodos asociados al nodo pasado como argumento
     * 
     * @param vertex nodo al cual se le busca los asociados o hijos
     * @return todos los asociados o hijos del nodo vertex, listados en una
     *         ArrayList Para más información de las clases:
     * @see <a href=
     *      "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">
     *      Ver documentacion ArrayList </a>
     */
    public ArrayList<Integer> getSuccessors(int vertex) throws Exception {
        if (vertex >= size)
            throw new Exception("Index: " + vertex);
        ArrayList<Integer> successors = new ArrayList<Integer>();
        LinkedList<Pair<Integer, Integer>> temp = list.get(vertex);
        while (!temp.isEmpty()) {
            successors.add(temp.poll().first);
        }
        return successors;
    }

    /**
     * Metodo para obtener el peso o longitud entre dos nodos
     * 
     * @param source      desde donde inicia el arco
     * @param destination donde termina el arco
     * @return un entero con dicho peso
     */
    public int getWeight(int source, int destination) throws Exception {
        if (source >= size || destination >= size)
            throw new Exception();
        LinkedList<Pair<Integer, Integer>> temp = list.get(source);
        while (!temp.isEmpty()) {
            if (temp.peek().first == destination)
                return temp.peek().second;
            else
                temp.pop();
        }
        return -1;
    }

    public void printCodeForGraphViz() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < list.get(i).size(); j++){
                System.out.println("\"" + i + "\" -> \"" + list.get(i).get(j).first + "\"[ label = \"" + list.get(i).get(j).second + "\"]");
            }
        }    
    }
}