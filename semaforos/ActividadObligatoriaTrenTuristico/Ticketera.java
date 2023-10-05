package ActividadObligatoriaTrenTuristico;

public class Ticketera {
    public int conteo;

    public Ticketera() {
        this.conteo = 0;
    }

    public synchronized int comprar(PasajeroTren pasajeroTren) {
        System.out.println(pasajeroTren.getName()+" Comprando ticket..");
        conteo++;
        return (int) (Math.random()*100+1);
    }

    public synchronized void mostrarCantTickets() {
        System.out.println("Cantidad de tickets vendidos: "+ conteo);
    } 
}
