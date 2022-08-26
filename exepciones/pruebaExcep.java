import java.util.Random;
import java.util.Scanner;

class ExcepcionEdad extends Exception {
    /*
     * Crear la clase, constructores uno sin argumentos y otro con argumentos, y
     * generar error
     */
    public ExcepcionEdad() {
    }

    public ExcepcionEdad(String arg) {
        super(arg);
    }

}

class ExcepcionRuleta extends Exception {
    public ExcepcionRuleta(){        
    }
    public ExcepcionRuleta(String arg){
        super(arg);
    }
}

public class pruebaExcep {
    /*
     * metodo que recibe la edad de una persona y dispara una exepcion si
     * la persona es menor de edad
     */
    public static void menor_deEdad(int edad) {
        try {
            verificarEdad(edad);
        } catch (ExcepcionEdad e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void verificarEdad(int edad) throws ExcepcionEdad {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            throw new ExcepcionEdad("Es menor de edad");
        }
    }

    /*
     * metodo que recibe un numero de la ruleta y dispara una excepcion si
     * no sale dicho numero
     */
    public static void ruleta() {
        Scanner sc = new Scanner(System.in);
        int numero;
        try {
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
            Random aleatorio= new Random();
            int n=aleatorio.nextInt(36);
            verificarNumero(numero,n);
        } catch (ExcepcionRuleta e) {
            e.printStackTrace();
        }

    }
    public static void verificarNumero(int numero, int aleatorio) throws ExcepcionRuleta{
        if (numero==aleatorio) {
            System.out.println("FELICITACIONES HA GANADO");
        } else {
            throw new ExcepcionRuleta("El numero ganador es: <"+aleatorio+">.Lo siento, su numero no ha salido");           
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*menor_deEdad(16);*/
        String respuesta="si";
        while (respuesta.equals("si")) {
            ruleta();
            System.out.println("Desea seguir jugando?");
            respuesta=sc.nextLine();
        }
    }

}