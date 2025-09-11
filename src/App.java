import java.util.Scanner; // Importamos la clase para leer datos

public class App { // Nombre de la clase
    public static void main(String[] args) { // Método principal
        Scanner scanner = new Scanner(System.in); // Creamos el lector de teclado

        System.out.print("Ingresa el primer número (a): ");
        int a = scanner.nextInt(); // Leemos el primer número

        System.out.print("Ingresa el segundo número (b): ");
        int b = scanner.nextInt(); // Leemos el segundo número

        System.out.print("Ingresa el tercer número (c): ");
        int c = scanner.nextInt(); // Leemos el tercer número

        int suma = a + b + c; // Calculamos la suma
        scanner.close(); // Cerramos el recurso



        System.out.println("La suma de a + b + c es: " + suma); // Mostramos el resultado
    }
}
