package miproyecto;

public class Categoria {

    private int id;
    private String nombre;

    private static int idcatergoria = 1;

    public Categoria(String nombre) {
        this.id = idcatergoria++;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Categoria{id=" + id + ", nombre='" + nombre + "'}";
    }
}
