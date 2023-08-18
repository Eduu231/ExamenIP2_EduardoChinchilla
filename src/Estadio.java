
import java.util.ArrayList;


public class Estadio {
 
    private String nombre;
    private String ciudad;
    private int cantidad;
    private ArrayList<Equipo> e;

    public Estadio() {
    }

    public Estadio(String nombre, String ciudad, int cantidad, ArrayList e) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.cantidad = cantidad;
        this.e = e;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList getE() {
        return e;
    }

    public void setE(ArrayList e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Estadio" + "\n"+"nombre: " + nombre + "\n"+"ciudad: " + ciudad + "\n"+"cantidad: " + cantidad + "\n"+"e: " + e + "\n";
    }
    
    
}
