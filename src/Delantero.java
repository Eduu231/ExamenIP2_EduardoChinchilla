
public class Delantero extends Jugador{
    private int ritmo;
    private int disparo;
    private int regate;

    public Delantero(int ritmo, int disparo, int regate) {
        this.ritmo = ritmo;
        this.disparo = disparo;
        this.regate = regate;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
        this.disparo = disparo;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
    }

    @Override
    public String toString() {
        return "Delantero{" + "ritmo=" + ritmo + ", disparo=" + disparo + ", regate=" + regate + '}';
    }
    
    
}
