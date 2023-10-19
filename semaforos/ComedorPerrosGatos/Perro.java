package SemaforosGenericos.ProblmaComedor;

public class Perro extends Thread {

    protected GestionComedor comedor;

    public Perro(GestionComedor comedor) {
        this.comedor = comedor;
    }

    public void run() {
        try {
            this.comedor.comerPerros();
            Thread.sleep(1000);
            this.comedor.terminoComerPerros();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
