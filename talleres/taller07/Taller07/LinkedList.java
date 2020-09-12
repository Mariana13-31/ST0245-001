
/**
 * 
 * 
 * @author Mariana Quintero, Isabella Serna
 * @version 2
 */
import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class LinkedList 
{
    private Node first;
    private int size;
    public LinkedList()
    {
        size = 0;
        first = null;   
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
         * @throws IndexOutOfBoundsException
     */
    public int get(int index) {
        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return temp.data;
    }

    // Retorna el tamaño actual de la lista
    public int size()
    {
        return size;
    }

    // Inserta un dato en la posición index
    public void insert(int data, int index) throws IndexOutOfBoundsException
    {
        if (index == 0) {
            Node nuevo = new Node(data);
            nuevo.next = first;
            first = nuevo;
            size++;
        } else if(index != 0){
            Node temp = getNode(index - 1);
            Node nuevo = new Node(data);
            nuevo.next = temp.next;
            temp.next = nuevo;
            size++;
        }else 
        {
            throw new IndexOutOfBoundsException();
        }
    }

    // Borra el dato en la posición index
    public void remove(int index)
    {
        if (index == 0) {
            first = first.next;
            first.next = null;
            size--;
        } else if(index != 0){
            Node temp = getNode(index - 1);
            temp.next = null;
            size--;
        }
    }

    // Verifica si está un dato en la lista
    public boolean contains(int data)
    {
        try {
            for (int i = 0; i < size; i++) {
                if (get(i) == data) {
                    return true;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La posicion no existe");
        }
        return false;
        
    }

}