import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * Created by karim on 10/05/2016.
 */
public class Simulacion {

    private static final int MAX_AVAILABLE = 10;
    private final Semaphore disponible = new Semaphore(MAX_AVAILABLE, true);

    List<Pasajero> pasajeros=new ArrayList<>();
    List<Vuelo> vuelos=new ArrayList<>();
    List<Terminal> terminales=new ArrayList<>();
    Random  rnd = new Random();


    int rango=30;
    int inicial=0;
    int simulaciones;

    public void hacer(){

        for (int i = 0; i < simulaciones; i++) {

            Reservacion res=new Reservacion(terminales.get(TerminalAlearotio()).getNombre(),pasajeros.get(PasajeroAlearotio()).getNombre(),acientoAlearotio(),vuelos.get(VueloAlearotio()) );
            while(!Reservaciones.addReservacion(res)){
                imprimeError(res.terminal,res.pasajero,res.vuelo.nombre,res.vuelo.getDe(),res.vuelo.getHacia());
            }


        }

    }

    private void imprimeError(String terminal, String pasajero, String nombre, String de, String hacia) {
        System.out.println("¡ACIENTO OCUPADO!");
        System.out.println(terminal+"pasajero: "+pasajero+"Avion: "+nombre+"Ruta:"+de+"-"+hacia);

    }


    public Simulacion(int simulaciones) {
        this.simulaciones = simulaciones;
        hacer();
    }

    private int acientoAlearotio(){
        return  (int) (rnd.nextDouble() * rango + inicial);
    }

    private int PasajeroAlearotio(){
        return  (int) (rnd.nextDouble() * pasajeros.size() + 0);
    }

    private int VueloAlearotio(){
        return  (int) (rnd.nextDouble() *  vuelos.size()+ 0);
    }

    private int TerminalAlearotio(){
        return  (int) (rnd.nextDouble() *  terminales.size()+ 0);
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Simulacion( int simulaciones,List<Pasajero> pasajeros, List<Vuelo> vuelos, List<Terminal> terminales) {
        this.pasajeros = pasajeros;
        this.vuelos = vuelos;
        this.terminales = terminales;
        this.simulaciones = simulaciones;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public void setTerminales(List<Terminal> terminales) {
        this.terminales = terminales;
    }

    public void imprimirVuelos(){

    }


}
