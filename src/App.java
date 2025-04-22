
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos",22),
            new Persona("Ana",28),
            new Persona("Luis",35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)
        };
        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();
        vC.printMesssage("Personas");
        vC.printPersonaArray(personas);
        pC.ordenarPorEdad(personas);
        System.out.println();
        vC.printMesssage("Personas Ordenadas por edad: ");
        vC.printPersonaArray(personas);
        System.out.println();
        vC.printMesssage("Buscar persona con edad 99");
        Persona pB = pC.buscarPorEdad(personas, 99);
        if(pB == null) {
            vC.printMesssage("\tNo hay persona con esa edad");
        } else {
            vC.printMesssage("\tLa persona con edad 40 es: ");
            vC.printMesssage("\t" + pB);
        }

        
        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD
    }
}
