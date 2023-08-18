
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
    @Override
    public void setFisico(int fisico) {
        int r = 1 + rand.nextInt(12);
        int num = r * 12;
        if (num >= 70 && num <= 100){
            super.setFisico(num);
        }
        
    }

    public int getRitmo() {
        return ritmo;
    }
    @Override
    public void setRitmo(int ritmo) {
        int r = 1 + rand.nextInt(12);
        int num = r * 12;
        if (num >= 70 && num <= 100){
            super.setRitmo(num);
        }
        
    }

    public int getEntrada() {
        return entrada;
    }
    @Override
    public void setEntrada(int entrada) {
        int r = 1 + rand.nextInt(12);
        int num = r * 12;
        if (num >= 70 && num <= 100){
            super.setEntrada(num);
        }
       
    }

    @Override
    public String toString() {
        return "Defensa" + "\n"+"fisico: " + fisico + "\n"+"ritmo: " + ritmo + "\n"+"entrada: " + entrada +"\n";
    }

    @Override
    public int rating() {
        int total =0;
        total += this.entrada + this.ritmo + this.fisico;
        int promedio = total/3;
        
        return promedio;
    }
    
    
}
