
public class Estadio {
 
    private String nombre;
    private String ciudad;
    private int cantidad;
    private Equipo e;

    public Estadio() {
    }

    public Estadio(String nombre, String ciudad, int cantidad, Equipo e) {
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

    public Equipo getE() {
        return e;
    }

    public void setE(Equipo e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Estadio{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", cantidad=" + cantidad + ", e=" + e + '}';
    }
    
    
}
