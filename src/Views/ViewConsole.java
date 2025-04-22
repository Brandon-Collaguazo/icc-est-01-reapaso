package Views;
import Models.Persona;
public class ViewConsole {
    public void printPersonaArray(Persona [] persons) {
        for(Persona persona : persons) {
            System.out.print(persona + " | ");
        }
    }
    public void printMesssage(String message) {
        System.out.println(message);
    }
}
