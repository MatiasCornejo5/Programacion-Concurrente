package ActividadObligatoriaTrenTuristico;

public class PasajeroTren extends Thread {

    public TrenTuristico tren;
    public Ticketera ticketera;

    public PasajeroTren(TrenTuristico tren, Ticketera ticketera) {
        this.tren = tren;
        this.ticketera = ticketera;
    }

    public void run() {
        int ticket = ticketera.comprar(this);
        System.out.println(Thread.currentThread().getName() + " tiene el ticket numero: " + ticket);
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
