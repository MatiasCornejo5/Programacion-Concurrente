package ReservasOnline;

public class Visitante extends Thread {

    private int area;
    private int id;
    private ParqueTematico parque;

    public Visitante(int id, ParqueTematico parque) {
        this.parque = parque;
        this.id = id;
        area = (int) (Math.random() * (3 - 1 + 1) + 1);
    }

    public void run() {
        parque.realizarReserva(id, area);
    }
}
