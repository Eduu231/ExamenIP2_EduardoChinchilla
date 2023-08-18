
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
    @Override
    public void setRitmo(int ritmo) {
        int r = 1 + rand.nextInt(12);
        int num = r * 12;
        if (num >= 70 && num <= 100){
            super.setRitmo(num);
        }
        
    }

    public int getDisparo() {
        return disparo;
    }
    @Override
    public void setDisparo(int disparo) {
        int r = 1 + rand.nextInt(12);
        int num = r * 12;
        if (num >= 70 && num <= 100){
            super.setDisparo(num);
        }
        
    }

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
        return "Delantero" + "\n"+"ritmo: " + ritmo + "\n"+"disparo: " + disparo + "\n"+"regate: " + regate + "\n";
    }

   @Override
    public int rating() {
        int total =0;
        total += this.disparo + this.regate+ this.ritmo;
        int promedio = total/3;
        
        return promedio;
    }
    
    
}
