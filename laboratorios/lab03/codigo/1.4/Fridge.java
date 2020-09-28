/**
 * This class is in charge of defining the attributes of a fridge.
 *   
 * @author Mariana Quintero, Isabella Pérez
 * @version 1
 */
public class Fridge {
    private int code;
    private String description;

    public Fridge(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return "Code: " + this. code + " Description: " + this.description;
    }
}