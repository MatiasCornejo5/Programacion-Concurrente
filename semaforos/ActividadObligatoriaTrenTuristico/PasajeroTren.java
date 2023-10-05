package ActividadObligatoriaTrenTuristico;

public class PasajeroTren extends Thread {

    public TrenTuristico tren;

    public PasajeroTren(TrenTuristico tren) {
        this.tren = tren;
    }

    public void run() {
        if (tren.subirse()) {
            System.out.println(Thread.currentThread().getName() + " subio al tren");
            if (tren.bajarse()) {
                System.out.println(Thread.currentThread().getName() + " bajo del tren");
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " debe esperar al siguiente recorrido");
        }
    }
}
