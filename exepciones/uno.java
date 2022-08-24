public class uno {
    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("42");
            valor = valor + 1;
            System.out.println("Valor al final del try: " + valor);
        } catch (NumberFormatException e) {
            // TODO: handle exception
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }
    }
}
