//EJERCICIO 1 - TRABAJO PRACTICO 1
public class Cliente_hilo extends Thread {
    public void run() {
        System.out.println("soy" + Thread.currentThread().getName());
        Recurso.uso();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        ;
    };

}

