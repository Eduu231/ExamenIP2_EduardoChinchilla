
public class Defensa extends Jugador{
    
    private int fisico;
    private int ritmo;
    private int entrada;

    public Defensa(int fisico, int ritmo, int entrada) {
        this.fisico = fisico;
        this.ritmo = ritmo;
        this.entrada = entrada;
    }

    public Defensa(int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        super(agarre, lanzamiento, fisico, ritmo, entrada, vision, passing, regate, disparo);
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Defensa" + "\n"+"fisico: " + fisico + "\n"+"ritmo: " + ritmo + "\n"+"entrada: " + entrada +"\n";
    }

    @Override
    public int rating() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
