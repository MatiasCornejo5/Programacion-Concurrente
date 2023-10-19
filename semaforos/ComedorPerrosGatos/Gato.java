package SemaforosGenericos.ProblmaComedor;

public class Gato extends Thread {

    protected GestionComedor comedor;

    public Gato(GestionComedor comedor) {
        this.comedor = comedor;
    }

    public void run() {
        try {
            this.comedor.comerGatos();
            Thread.sleep(1000);
            this.comedor.terminoComerGatos();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
