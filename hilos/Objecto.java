
/*TENEMOS DOS FORMAS DE CREAR UN HILO: 
            . EXTENDIENDO LA CLASE THREAD
            . IMPLEMENTANDO LA INTERFAZ RUNNABLE 
Por ejemplo creamos una clase objeto (extends thread)
y otra clase objecto2 (runnable) */

class Objecto extends Thread {
    public void run() {
        try {
            System.out.println("Soy el " + this.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Objecto2 implements Runnable {
    private String nombre;
    public Objecto2 (String nombre){
        this.nombre=nombre;
    }
    public void run() {
        try {
            System.out.println("Soy el "+this.nombre);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/* Vamos a tener una clase Main donde probar la ejecucion de estos hilo */
class Main {
    public static void main(String[] args) {
       /*Forma 1 */
        Objecto objecto1 = new Objecto();
        objecto1.setName("Objecto 1");
        
        /*Forma 2 */
        Objecto2 objecto2 = new Objecto2("Objecto 2");//interfaz runnable
        Thread hiloObjecto2 = new Thread(objecto2);//hilo que implementa runnable

        objecto1.start();
        hiloObjecto2.start();

    }
}
