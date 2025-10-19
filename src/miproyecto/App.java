package miproyecto;
import java.util.ArrayList; 

public class App { 
    public static void main(String[] args) {
       
        final ArrayList<Producto> productos = new ArrayList<>();
        final ArrayList<Categoria> categorias = new ArrayList<>();

        categorias.add(new Categoria("Verduras"));
        categorias.add(new Categoria("Frutas"));
        categorias.add(new Categoria("Condimentos"));        
        
        final CrudProductos crudProd = new CrudProductos(productos, categorias);
        final CrudCategorias crudCat = new CrudCategorias(categorias);

        int opcion;
        do {
            System.out.println("\n=== Bienvenido a la verdulería \"LA SALUDABLE\" ===");
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1) Ver opciones de Productos");
            System.out.println("2) ver opciones de Categorías");
            System.out.println("0) Salir");
            System.out.print("Opción ?: ");
            String linea = crudProd.scanner.nextLine();
            
            try {
                opcion = Integer.parseInt(linea.trim());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1 -> {
                    int op;
                    do {
                        System.out.println("\n--- Opciones de Productos ---");
                        crudProd.mostrarOpciones();
                        op = crudProd.leerEntero("");
                        switch (op) {
                            case 1 -> crudProd.crear();
                            case 2 -> crudProd.listar();
                            case 3 -> crudProd.actualizar();
                            case 4 -> crudProd.eliminar();
                            case 0 -> System.out.println("regresando a opciones de productos...");
                            default -> System.out.println("upss, algo salió mal! Intenta de nuevo.");
                        }
                    } while (op != 0);
                }
                case 2 -> {
                    int op;
                    do {
                        System.out.println("\n--- Opciones de Categorías ---");
                        crudCat.mostrarOpciones();
                        op = crudCat.leerEntero("");
                        switch (op) {
                            case 1 -> crudCat.crear();
                            case 2 -> crudCat.listar();
                            case 3 -> crudCat.actualizar();
                            case 4 -> crudCat.eliminar();
                            case 0 -> System.out.println("Regresando a las opciones de categorías...");
                            default -> System.out.println("upss, algo salió mal! Intenta de nuevo.");
                        }
                    } while (op != 0);
                }
                case 0 -> System.out.println("¡Felicidades, regrese pronto!");
                default -> System.out.println("upsss, algo salió mal! Intenta de nuevo.");
            }
        } while (opcion != 0);
    }
    } 

