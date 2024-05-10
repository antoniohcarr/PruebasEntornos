import java.util.Scanner;

public class SaludoPersonalizado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar un mensaje de bienvenida
        System.out.println("¡Bienvenido al programa de saludo personalizado!");

        String nombre = "";
        boolean nombreValido = false;

        // Solicitar al usuario que ingrese su nombre
        while (!nombreValido) {
            System.out.print("Por favor, ingresa tu nombre: ");
            nombre = scanner.nextLine().trim(); // Eliminar espacios en blanco al inicio y final

            // Validar que se haya ingresado al menos un carácter
            if (!nombre.isEmpty()) {
                nombreValido = true;
            } else {
                System.out.println("Error: Debes ingresar al menos un carácter.");
            }
        }

        // Imprimir un mensaje personalizado
        System.out.println("Hola, " + nombre + "! Este es mi programa mejorado en Java.");

        // Cerrar el scanner al finalizar para liberar recursos
        scanner.close();
    }
}
