
import java.util.Random;


public class Portero extends Jugador{
    Random rand = new Random();
    private int agarre;
    private int lanzamiento;
    private int passing;

    public Portero() {
    }

    public Portero(int agarre, int lanzamiento, int passing) {
        this.agarre = agarre;
        this.lanzamiento = lanzamiento;
        this.passing = passing;
    }

    public Portero(int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        super(agarre, lanzamiento, fisico, ritmo, entrada, vision, passing, regate, disparo);
    }

    @Override
    public int getAgarre() {
        return agarre;
    }

    @Override
    public void setAgarre(int agarre) {
         int r = 1 + rand.nextInt(12);
        int num = r * 12;
        if (num >= 70 && num <= 100){
            super.setAgarre(num);
        }
        
    }

    @Override
    public int getLanzamiento() {
        return lanzamiento;
    }

    @Override
    public void setLanzamiento(int lanzamiento) {
         int r = 1 + rand.nextInt(12);
        int num = r * 12;
        if (num >= 70 && num <= 100){
            super.setLanzamiento(num);
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
    public String toString() {
        return "Portero" + "\n"+"agarre: " + agarre + "\n"+"lanzamiento: " + lanzamiento + "\n"+"passing: " + passing +"\n";
    }

    
    @Override
    public int rating() {
        int total =0;
        total += this.agarre + this.lanzamiento + this.passing;
        int promedio = total/3;
        
        return promedio;
    }
    
    
}
