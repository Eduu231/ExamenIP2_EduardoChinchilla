
import java.util.Random;


public abstract class Jugador {
    Random rand = new Random();
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String pieHabil;
    private int rating;
    private String equipo;
    
    //especificas
    private int agarre;
    private int lanzamiento;
    private int fisico;
    private int ritmo;
    private int entrada;
    private int vision;
    private int passing;
    private int regate;
    private int disparo;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, String nacionalidad, String pieHabil) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pieHabil = pieHabil;
    }

    
    public Jugador(String nombre, int edad, String nacionalidad, String pieHabil, int rating, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pieHabil = pieHabil;
        this.rating = rating;
        this.equipo = equipo;
    }

    public Jugador(int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        this.agarre = agarre;
        this.lanzamiento = lanzamiento;
        this.fisico = fisico;
        this.ritmo = ritmo;
        this.entrada = entrada;
        this.vision = vision;
        this.passing = passing;
        this.regate = regate;
        this.disparo = disparo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPieHabil() {
        return pieHabil;
    }

    public void setPieHabil(String pieHabil) {
        this.pieHabil = pieHabil;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getAgarre() {
        return agarre;
    }

    public void setAgarre(int agarre) {
        int r = 1 + rand.nextInt(5);
        int num = r * 13;
        if (num >= 70 && num <= 100){
             this.agarre = num;
        }
       
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        int r = 1 + rand.nextInt(5);
        int num = r * 13;
        if (num >= 70 && num <= 100){
             this.lanzamiento = num;
        }
       
        this.lanzamiento = lanzamiento;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        int r = 1 + rand.nextInt(5);
        int num = r * 13;
        if (num >= 70 && num <= 100){
             this.fisico = num;
        }
      
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        int r = 1 + rand.nextInt(5);
        int num = r * 13;
        if (num >= 70 && num <= 100){
             this.ritmo = num;
        }
        
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        int r = 1 + rand.nextInt(5);
        int num = r * 13;
        if (num >= 70 && num <= 100){
             this.entrada = num;
        }
        
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        int r = 1 + rand.nextInt(5);
        int num = r * 13;
        if (num >= 70 && num <= 100){
             this.vision = num;
        }
        
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        int r = 1 + rand.nextInt(5);
        int num = r * 13;
        if (num >= 70 && num <= 100){
             this.passing = num;
        }
        
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        int r = 1 + rand.nextInt(5);
        int num = r * 13;
        if (num >= 70 && num <= 100){
             this.regate = num;
        }
      
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
        int r = 1 + rand.nextInt(5);
        int num = r * 13;
        if (num >= 70 && num <= 100){
             this.disparo = num;
        }
        
    }
    public abstract int rating();
    @Override
    public String toString() {
        return "Jugador"+ "\n"+ "nombre:" + nombre + "\n"+"edad: " + edad + "\n"+"nacionalidad: " + nacionalidad + "\n"+"pieHabil: " + pieHabil + "\n"+"rating: " + rating + "\n"+"equipo: " + equipo + "\n"+"agarre: " + agarre + "\n"+"lanzamiento: " + lanzamiento + "\n"+"fisico: " + fisico + "\n"+"ritmo: " + ritmo + "\n"+"entrada: " + entrada + "\n"+"vision: " + vision + "\n"+"passing: " + passing + "\n"+"regate: " + regate + "\n"+"disparo: " + disparo +"\n";
    }
    
    
    
    
    
}
