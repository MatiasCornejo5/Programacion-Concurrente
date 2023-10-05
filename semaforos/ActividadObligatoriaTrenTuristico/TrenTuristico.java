package ActividadObligatoriaTrenTuristico;

import java.util.concurrent.Semaphore;

public class TrenTuristico {

    public Semaphore subirse = new Semaphore(1);
    public Semaphore viajar = new Semaphore(0);
    public Semaphore bajarse = new Semaphore(0);
    protected int capacidad;

    public TrenTuristico() {
        this.capacidad = 5;
    }

    public boolean subirse() {
        boolean resp = false;
        try {
            if (capacidad > 0) {
                subirse.acquire();
                capacidad--;
                resp = true;
                subirse.release();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return resp;
    }

    public boolean bajarse() {
        boolean resp = false;
        try {
            if (capacidad < 5) {
                bajarse.acquire();
                capacidad++;
                resp = true;
                bajarse.release();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return resp;
    }

    public void comenzarRecorrido() {
        viajar.release();
    }

    public void viajar() {
        try {
            viajar.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void bajarPasajeros() {
        bajarse.release();
    }
}