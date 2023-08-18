
import java.util.ArrayList;


public class Equipo {

    private String nombre;
    private String pais;
    private int rating;
    private ArrayList<Jugador> j;

    public Equipo() {
    }

    public Equipo(String nombre, String pais, ArrayList<Jugador> j) {
        this.nombre = nombre;
        this.pais = pais;
        this.j = j;
    }

    public Equipo(String nombre, String pais, int rating, ArrayList<Jugador> j) {
        this.nombre = nombre;
        this.pais = pais;
        this.rating = rating;
        this.j = j;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<Jugador> getJ() {
        return j;
    }

    public void setJ(ArrayList<Jugador> j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "Equipo" + "\n"+"nombre: " + nombre + "\n"+"pais: " + pais + "\n"+"rating: " + rating + "\n"+"jugadores: " + j + "\n";
    }
    private int ratingEquipo(){
        
        return 0;
    }
    
}
