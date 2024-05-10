import java.util.Scanner;

public class MiPrograma {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Imprimir un mensaje personalizado
        System.out.println("Hola, " + nombre + "! Este es mi programa mejorado en Java.");
        
        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
