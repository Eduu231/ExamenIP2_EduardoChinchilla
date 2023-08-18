
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
    
    @Override
    public int getVision() {
        return vision;
    }
    @Override
    public void setVision(int vision) {
        int r = 1 + rand.nextInt(12);
        int num = r * 12;
        if (num >= 70 && num <= 100){
            super.setVision(num);
        }
       
    }

    @Override
    public int getPassing() {
        return passing;
    }
    @Override
    public void setPassing(int passing) {
        int r = 1 + rand.nextInt(12);
        int num = r * 12;
        if (num >= 70 && num <= 100){
            super.setPassing(num);
        }
        
    }

    @Override
    public int getRegate() {
        return regate;
    }
    @Override
    public void setRegate(int regate) {
        int r = 1 + rand.nextInt(12);
        int num = r * 12;
        if (num >= 70 && num <= 100){
            super.setRegate(num);
        }
       
    }

    @Override
    public String toString() {
        return "Mediocampista" + "\n"+"vision: " + vision + "\n"+"passing: " + passing + "\n"+"regate: " + regate + "\n";
    }

    @Override
    public int rating() {
        int total =0;
        total += this.passing + this.regate + this.vision;
        int promedio = total/3;
        
        return promedio;
    }
    
    
}
