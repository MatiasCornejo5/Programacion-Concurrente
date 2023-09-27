package ReservasOnline;

public class ParqueTematico {

    private int [] areasDisponibles = new int [3]; // 3 areas disponibles

    public ParqueTematico() {
        /*
         * for (int i = 0; i < numAreas; i++) {
         * // Cada area tendra un numero de espacios limitados disponibles, se asignan
         * de
         * // manera aleatoria
         * areasDisponibles[i] = (int) ((Math.random() * (25 - 5 + 1)) + 5);
         */
        
        for (int i = 0; i < areasDisponibles.length; i++) {
            areasDisponibles[i] = 5; // 5 lugares disponibles
        }
    }

    public synchronized boolean realizarReserva(int id,int area) {
        boolean disp = false;
        if(area <= areasDisponibles.length){
            disp = verificarDisponiblidad(id, area);
        }else{
            System.out.println("VISITANTE "+id+": Error ---> El area es inexistente");
        }
        return disp;
    }

    private boolean verificarDisponiblidad(int id, int area) {
        boolean resp = false;    
            if (areasDisponibles[area-1]>0) {
                resp = true;
                areasDisponibles[area-1]-=1;
                System.out.println("VISITANTE "+id+": Su reserva en el area "+ area +" fue registrada con exito!");
            }else{
                System.out.println("VISITANTE "+id+": No es posible registrar su reserva debido al espacio..");   
            }
        return resp;
    }
}
