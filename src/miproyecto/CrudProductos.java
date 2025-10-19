package miproyecto;

import java.util.ArrayList;

public class CrudProductos extends CrudMetodos<Producto> {
    
   
    private final ArrayList<Producto> productos;
    private final ArrayList<Categoria> categorias;

    public CrudProductos(ArrayList<Producto> productos, ArrayList<Categoria> categorias) {
        this.productos = productos;
        this.categorias = categorias;
    }

    @Override
    public void crear() {
        System.out.println("1) elegistes crear un Artículo");   
                    
            String nombre = leerTexto("Nombre de producto: ");
            double precio = leerDouble("Precio de producto: ");
            if (categorias.isEmpty()) {
                System.out.println("Actualmente no hay categorías.");
                return;
            }
            System.out.println("Categorías:");
            for (Categoria c : categorias) {
                System.out.println(c.getId() + ") " + c.getNombre());
            }
            int idCat = leerEntero("Elegí id de categoría: ");
            Categoria seleccionada = null;
            for (Categoria c : categorias) {
                if (c.getId() == idCat) { seleccionada = c; break; }
            }
            if (seleccionada != null) {
                productos.add(new Articulo(nombre, precio, seleccionada));
                System.out.println("Artículo creado.");
            } else {
                System.out.println("Categoría inválida.");
            }
        } 
    

    @Override
    public void listar() {
        if (productos.isEmpty()) {
            System.out.println("(sin productos)");
        } else {
            for (Producto p : productos) {                
                System.out.println(p);                 
                System.out.println(" Cobrar en Precio Efectivo: $" + p.DescuentoEnEfectivo());
            }
        }
    }

    @Override
    public void actualizar() {
        int id = leerEntero("Ingresa el codigo del producto: ");
        for (Producto p : productos) {
            if (p.getId() == id) {
               
                System.out.println("Producto encontrado: " + p);
                System.out.println("¿Quieres corregir el nombre? 1=Sí / 0=No");
                int camNom = leerEntero("Opción ?: ");
                if (camNom == 1) {
                    String nuevoNombre = leerTexto("Nuevo nombre: ");
                    p.setNombre(nuevoNombre);
                } else {
                    System.out.println("Excelente, no se modifica el nombre.");
                }
                System.out.println("¿Quieres corregir el precio? 1=Sí / 0=No");
                int camPre = leerEntero("Opción ?: ");
                if (camPre == 1) {
                    double nuevoPrecio = leerDouble("Nuevo precio: ");
                    p.setPrecio(nuevoPrecio);
                } else {
                    System.out.println("Excelente, no se modifica el precio.");
                }
                
                System.out.println("¿Queres corregir la categoría? 1=Sí / 0=No");
                if (p instanceof Articulo) {
                   
                    int cam = leerEntero("Opción ?: ");
                    if (cam == 1) {
                        for (Categoria c : categorias) {
                            System.out.println(c.getId() + ") " + c.getNombre());
                        }
                        int idCat = leerEntero("Elegí id de categoría: ");
                        for (Categoria c : categorias) {
                            if (c.getId() == idCat) { ((Articulo)p).setCategoria(c); break; }
                        }
                       
                    } else {
                        System.out.println("Excelente, no se modifica la categoría.");
                        break;
                    }
                     System.out.println("Actualizado: " + p);
                        return;
                }                

                
            }
        }
        System.out.println("No se encontró producto con id " + id);
    }

    @Override
    public void eliminar() {
        int id = leerEntero("Id del producto a eliminar: ");
        boolean eliminado = productos.removeIf(p -> p.getId() == id);
        System.out.println(eliminado ? "Producto eliminado." : "No existía ese id.");
    }
}
