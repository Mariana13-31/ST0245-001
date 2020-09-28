
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/**
 * This class is in charge of implementing an algorithm that receives the
 * fridges in the order in which they are in the warehouse next to
 * requests according to the order in which they arrive, all this for later
 * Print which store fridges you have assigned to each store.
 * 
 * @author Mariana Quintero, Isabella Pérez
 * @version 1
 */

public class Main

{ 
    public static void main(String []args){
        Stack <Fridge> Fridges = new Stack<>();
        Queue <Requests> Requests = new LinkedList<>();

        Requests s1= new Requests("Store1",3);
        Requests s2= new Requests("Store2",1);

        Requests.add(s1);
        Requests.add(s2);

        Fridge n1= new Fridge(1,"Brand1");
        Fridge n2= new Fridge(2,"Brand2");
        Fridge n3= new Fridge(3,"Brand3");
        Fridge n4= new Fridge(3,"Brand4");

        Fridges.push(n1);
        Fridges.push(n2);
        Fridges.push(n3);
        Fridges.push(n4);

        assigned(Fridges, Requests);

    }

    public static void assigned(Stack<Fridge> Fridges, Queue<Requests> Requests){
        for(Requests Request : Requests) {
            System.out.println("Name of the store : "+Request.getName());
            System.out.println("Number of fridges requested: "+Request.getNumberFridges());
            for(int i=0;i<Request.getNumberFridges();i++) {
                Fridge Fridge = Fridges.pop();
                System.out.println("Code:"+ Fridge.getCode());
                System.out.println("Description:"+ Fridge.getDescription());
            }
            System.out.println("");
        }
    }
}