import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de personas del listado: ");
        int cantidadPersonas = scanner.nextInt();
        scanner.nextLine();

        Persona[] personas = new Persona[cantidadPersonas];

        // Pedir al usuario que ingrese los datos de la persona 
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese el nombre de la persona: " + (i));
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad de la persona: " + (i));
            int edad = scanner.nextInt();
            scanner.nextLine();
            personas[i] = new Persona(nombre, edad);
        }

        System.out.println("Personas sin ordenar: ");
        for (Persona persona : personas) {
            System.out.print(persona.getEdad() + " | ");
        }
        System.out.println();

        // Ordenar personas por edad
        sortByEdad(personas);

        System.out.println("Personas ordenadas por edad: ");
        for (Persona persona : personas) {
            System.out.print(persona.getEdad() + " | ");
        }
        System.out.println();

        // Buscar persona por edad
        System.out.println("Ingrese la edad a buscar: ");
        int edadBuscada = scanner.nextInt();
        int index = findByEdad(personas, edadBuscada);
        
        if (index != -1) {
            System.out.println("Nombre encontrado: " + personas[index].getNombre());
        } else {
            System.out.println("No se encontró una persona con esa edad.");
        }
    }

    public static void sortByEdad(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[i].getEdad() > personas[j].getEdad()) {
                    Persona aux = personas[i];
                    personas[i] = personas[j];
                    personas[j] = aux;
                }
            }
        }
    }

    public static int findByEdad(Persona[] personas, int edad) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() == edad) {
                return i;
            }
        }
        return -1;
    }
}
