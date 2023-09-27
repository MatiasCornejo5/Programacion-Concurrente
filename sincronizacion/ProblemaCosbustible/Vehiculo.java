package ProblemaCosbustible;

public class Vehiculo extends Thread{
    
    protected String modelo;
    protected String marca;
    protected String patente;
    protected double km;
    protected double tanqueLleno;
    protected double tanque;
    protected double reserva;

    public Vehiculo(String unModelo, String unaMarca, String unaPatente, double km, double litros){
        this.modelo = unModelo;
        this.marca = unaMarca;
        this.patente = unaPatente;
        this.km = km;
        this.tanque = litros;
        this.tanqueLleno = 30;
        this.reserva = 10; 
    }

    public void run (){
        while (tanque>0 && tanque>reserva) {
            tanque = andar((int)(Math.random()*(100-10)+10));
        }
    }

    public double andar(int kilometros){
        //Cada 100km consume 10lts
            System.out.println("AUTO "+patente+" anduvo: "+kilometros+" kms");
            this.tanque -= (kilometros*10/100); 
            this.km+=kilometros;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return tanque;
    }
}
