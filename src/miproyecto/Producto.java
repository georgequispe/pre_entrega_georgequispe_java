package miproyecto;

public abstract class Producto {

    private int id;              
    private String nombre;       
    private double precio;       

    private static int idcodigo = 1; 

    public Producto(String nombre, double precio) { 
        this.id = idcodigo++;       
        this.nombre = nombre;       
        this.precio = precio;       
    }

    public int getId() {            
        return id;
    }

    public String getNombre() {     
        return nombre;
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }

    public double getPrecio() {     
        return precio;
    }

    public void setPrecio(double precio) { 
        this.precio = precio;
    }

   
    public abstract double DescuentoEnEfectivo(); // Contrato a implementar en hijas
   // public abstract String mostrarDatos(); // Contrato a implementar en hijas
    @Override
    public String toString() {      // Representación legible
        return "Producto{id=" + id + ", nombre='" + nombre + "', precio=" + precio + "}";
    }
}
