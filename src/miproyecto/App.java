package miproyecto;
import java.util.Scanner; // Importamos la clase para leer datos

public class App { // Nombre de la clase
    public static void main(String[] args) { // Método principal
        Scanner scanner = new Scanner(System.in); // Creamos el lector de teclado    
          

        final int NUMERO_PRODUCTOS = 3;
        String[] nombresProductos = new String[NUMERO_PRODUCTOS];
        int[] cantidades = new int[NUMERO_PRODUCTOS];

       
       
        
        for (int i = 0; i < NUMERO_PRODUCTOS; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            nombresProductos[i] = scanner.next();
            System.out.print("Ingresa la cantidad de " + nombresProductos[i] + ": ");
            cantidades[i] = scanner.nextInt();
        }

       
        
        System.out.println("\n--- Resumen de Cantidades ---");
        for (int i = 0; i < NUMERO_PRODUCTOS; i++) {
            System.out.println("Cantidad de " + nombresProductos[i] + ": " + cantidades[i]);
            }
        scanner.close(); // Cerramos el lector de teclado
    } 
}
