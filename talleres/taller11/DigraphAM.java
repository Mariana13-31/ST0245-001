import java.util.ArrayList;

/**
 * Implementacion de un grafo dirigido usando matrices de adyacencia
 *
 * @author Mauricio Toro, Mateo Agudelo
 * @ version 1
 * 
 * @author Isabella Pérez, Mariana Quintero
 * @ version 2
 */
public class DigraphAM extends Digraph {

    int[][] list = new int[size][size];

    /**
     * Constructor para el grafo dirigido
     * 
     * @param vertices el numero de vertices que tendra el grafo dirigido
     *
     */
    public DigraphAM(int size) {
        super(size);
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
            throw new Exception("Index: " + source + ", " + destination);
        list[source][destination] = weight;
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
        for (int i = 0; i < size; i++) {
            if (list[vertex][i] != 0)
                successors.add(i);
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
    public int getWeight(int source, int destination) throws Exception{
        if (source >= size || destination >= size)
            throw new Exception("Index: " + source + ", " + destination);
        return list[source][destination];
    }

    public void printCodeForGraphViz() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (list[i][j] != 0)
                    System.out.println("\"" + i + "\" -> \"" + j + "\"[ label = \"" + list[i][j] + "\"]");
            }
        }
    }
}