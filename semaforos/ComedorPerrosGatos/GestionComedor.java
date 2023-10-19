package SemaforosGenericos.ProblmaComedor;

import java.util.concurrent.Semaphore;

public class GestionComedor {

    private Semaphore comenPerros = new Semaphore(0);
    private Semaphore comenGatos = new Semaphore(0);
    private Semaphore cuentas = new Semaphore(1);
    private int gatosEnEspera = 0;
    private int perrosEnEspera = 0;
    private int topeComedor = 0;
    private int enComedor = 0;
    private int terminoComer = 0;

    public GestionComedor(int cantidadMaxima) {
        this.topeComedor = cantidadMaxima;
        aDespertar();
    }

    // En comer y terminar de comer deberia ser mutex de principio de la funcion
    // hasta que termine,
    // sino se mezclan las cuentas
    // Metodo para iniciar a comer imparcial
    private void aDespertar() {
        int wakeUp = (int) Math.floor(Math.random() * 2 + 1);
        if (wakeUp == 1) {
            System.out.println("Primero comen gatos");
            this.comenGatos.release(this.topeComedor);
        } else {
            System.out.println("Primero comen perros");
            this.comenPerros.release(this.topeComedor);
        }
    }

    public void comerPerros() {
        try {
            ponerPerroEspera();
            System.out.println("perrito en espera");
            this.comenPerros.acquire();
            System.out.println("Come 1 perro");
            sumarEnComedor();
            sacarPerroEspera();
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    public void terminoComerPerros() {
        System.out.println("termino de comer 1 perro");
        sumarTerminaComer();
        try {
            this.cuentas.acquire();
            if (this.terminoComer == this.enComedor) { // comparar("terminoComer==enComedor")
                this.terminoComer = 0;
                this.enComedor = 0;
                if (this.gatosEnEspera != 0) {
                    System.out.println("se van los perritos y vienen los gatitos");
                    this.comenGatos.release(topeComedor);
                } else {
                    if (this.perrosEnEspera != 0) {
                        System.out.println("No hay mas gatos, entran mas perritos");
                    } else {
                        System.out.println("No hay mas animales que alimentar");
                    }
                    this.comenPerros.release(topeComedor);
                }
            }
            this.cuentas.release();

        } catch (InterruptedException e) {
            e.getStackTrace();
        }

    }

    // GATOS
    public void comerGatos() {
        try {
            ponerGatoEspera();
            System.out.println("gatito en espera");
            this.comenGatos.acquire();
            System.out.println("Come 1 gato");
            sumarEnComedor();
            sacarGatosEspera();
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    public void terminoComerGatos() {
        System.out.println("termino de comer 1 gato");
        sumarTerminaComer();
        try {
            this.cuentas.acquire();
            if (this.terminoComer == this.enComedor) { // comparar("terminoComer==enComedor")
                this.terminoComer = 0;
                this.enComedor = 0;
                if (this.perrosEnEspera != 0) {
                    System.out.println("Se van los gatitos vienen los perritos");
                    this.comenPerros.release(topeComedor);
                } else {
                    if (this.gatosEnEspera != 0) {
                        System.out.println("No hay mas perros, entran mas gatitos");
                    } else {
                        System.out.println("No hay mas animales que alimentar");
                    }
                    this.comenGatos.release(topeComedor);
                }
            }
            this.cuentas.release();

        } catch (InterruptedException e) {
            e.getStackTrace();
        }
    }

    public void sumarTerminaComer() {
        try {
            this.cuentas.acquire();
            this.terminoComer++;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.cuentas.release();
    }

    public  void sumarEnComedor() {
        try {
            this.cuentas.acquire();
            this.enComedor++;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.cuentas.release();
    }

    public  void ponerPerroEspera() {
        try {
            this.cuentas.acquire();
            this.perrosEnEspera++;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.cuentas.release();
    }

    public  void sacarPerroEspera() {
        try {
            this.cuentas.acquire();
            this.perrosEnEspera--;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.cuentas.release();
    }

    public  void ponerGatoEspera() {
        try {
            this.cuentas.acquire();
            this.gatosEnEspera++;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.cuentas.release();
    }

    public  void sacarGatosEspera() {
        try {
            this.cuentas.acquire();
            this.gatosEnEspera--;
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.cuentas.release();
    }

}
