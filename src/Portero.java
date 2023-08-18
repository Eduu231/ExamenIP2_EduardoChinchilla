
public class Portero extends Jugador{
    private int agarre;
    private int lanzamiento;
    private int passing;

    public Portero(int agarre, int lanzamiento, int passing) {
        this.agarre = agarre;
        this.lanzamiento = lanzamiento;
        this.passing = passing;
    }

    public Portero(int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        super(agarre, lanzamiento, fisico, ritmo, entrada, vision, passing, regate, disparo);
    }

    public int getAgarre() {
        return agarre;
    }

    public void setAgarre(int agarre) {
        this.agarre = agarre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    @Override
    public String toString() {
        return "Portero{" + "agarre=" + agarre + ", lanzamiento=" + lanzamiento + ", passing=" + passing + '}';
    }
    
    
}
