package Concierto;

public class Asiento {
    private boolean ocupado;
    private int nroAsiento;

    public Asiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
        this.ocupado = false;
    }

    public synchronized boolean getOcupado() {
        return ocupado;
    }

    public synchronized void setOcupado() {
        if (this.ocupado) {
            this.ocupado = false; 
        }else{
            this.ocupado = true;
        }
    }
}
