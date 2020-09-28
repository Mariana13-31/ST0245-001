/**
 * This class is in charge of describing the attributes of a request
 * 
 * @author Mariana Quintero, Isabella Pérez
 * @version 1
 */
public class Requests {
    private String name;
    private int numberFrid;

    public Requests(String name, int numberFrid) {
        this.name = name;
        this.numberFrid = numberFrid;
    }

    public String getName() {
        return name;
    }

    public int getNumberFridges() {
        return numberFrid;
    }

    public String toString() {
        return "Name: " + this.name + "   Number of fridges: " + this.numberFrid;
    }
}