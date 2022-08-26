class ExcepcionEdad extends Exception {
    /* Crear la clase, constructores uno sin argumentos y otro con argumentos, y generar error */
    public ExcepcionEdad(){     
    }
    public ExcepcionEdad(String arg) {
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
            //System.out.println(e.getMessage());
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

    public static void main (String [] args) {
        menor_deEdad(16);
    }

}