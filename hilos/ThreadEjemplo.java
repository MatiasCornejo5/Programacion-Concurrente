//EJERCICIO 3 - TRABAJO PRACTICO 1
public class ThreadEjemplo extends Thread {
    public ThreadEjemplo(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            System.out.println("Termina Thread " + getName());
        }
    }

    public static void main(String[] args) {
        /*
         * new ThreadEjemplo("Maria Jose").start();
         * new ThreadEjemplo("Jose Maria").start();
         */// forma thread
        Ejemplo mariaJose = new Ejemplo();
        Ejemplo joseMaria = new Ejemplo();

        Thread mj = new Thread(mariaJose, "Maria Jose");
        Thread jm = new Thread(joseMaria, "Jose Maria");

        mj.start();
        jm.start();

        System.out.println("Termina thread main");
    }
}

class Ejemplo implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
            System.out.println("Termina Thread " + Thread.currentThread().getName());
        }
    }
}
