
public class Mediocampista extends Jugador{
    private int vision;
    private int passing;
    private int regate;

    public Mediocampista(int vision, int passing, int regate) {
        this.vision = vision;
        this.passing = passing;
        this.regate = regate;
    }

    public Mediocampista(String nombre, int edad, String nacionalidad, String pieHabil, int rating, String equipo) {
        super(nombre, edad, nacionalidad, pieHabil, rating, equipo);
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
    }

    @Override
    public String toString() {
        return "Mediocampista" + "\n"+"vision: " + vision + "\n"+"passing: " + passing + "\n"+"regate: " + regate + "\n";
    }

    @Override
    public int rating() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
