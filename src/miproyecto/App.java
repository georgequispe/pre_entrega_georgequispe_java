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

        System.out.println("Ingrese el nombre del primer producto:");
        String nombreProducto = scanner.next();       
        System.out.print("Ingresa la cantidad de " + nombreProducto + ": ");
        int cantidad1 = scanner.nextInt();

        System.out.println("Ingrese el nombre del segundo producto:");
        String nombreProducto2 = scanner.next();
        System.out.print("Ingresa la cantidad de " + nombreProducto2 + ": ");
        int cantidad2 = scanner.nextInt();

        System.out.println("Ingrese el nombre del tercer producto:");
        String nombreProducto3 = scanner.next();       
        System.out.print("Ingresa la cantidad de " + nombreProducto3 + ": ");
        int cantidad3 = scanner.nextInt();

        System.out.println("Desea comprobar la cantidad de productos? (s/n)");
        String respuesta = scanner.next();

        if (respuesta.equalsIgnoreCase("s")) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Cantidad de " + (i == 1 ?
                 nombreProducto : i == 2 ?
                 nombreProducto2 : nombreProducto3) + ": " + (i == 1 ? cantidad1 : i == 2 ? cantidad2 : cantidad3));
            }
        }
        System.out.println("\n--- Resumen de Cantidades ---");
        for (int i = 0; i < NUMERO_PRODUCTOS; i++) {
            System.out.println("Cantidad de " + nombresProductos[i] + ": " + cantidades[i]);
            }
        scanner.close(); // Cerramos el lector de teclado
    } 
}
