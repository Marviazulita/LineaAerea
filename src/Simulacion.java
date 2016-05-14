import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;

/**
 * Created by karim on 10/05/2016.
 */
public class Simulacion   {

    private static final int MAX_AVAILABLE = 10;
    List<Pasajero> lp=new ArrayList<>();
    List<Vuelo> lv=new ArrayList<>();
    List<Terminal> lt=new ArrayList<>();


    private final Semaphore semaphore = new Semaphore(MAX_AVAILABLE, true);

    Random  rnd = new Random();

    ReservacionDAO rdao;
    PasajeroDAO pdao;
    VueloDAO vdao;
    TerminalDAO tdao;

    Terminal t=null;
    Vuelo va=null;
    Pasajero pa=null;

    int rango=30;
    int inicial=0;
    int simulaciones=0;
    int asiento;


    public void hacerAleatorio(){
            //t=terminalAlearotio();
            va=vueloAlearotio();
            pa=pasajeroAlearotio();
            asiento=asientoAlearotio(va);

            if(t.vender(pa,va,asiento)){
                imprimirVendido(t,pa,va,asiento);
            }else{
                imprimirNoVendido(t,pa,va,asiento);
            }




    }

    public void hacerPorterminal(){

    }

    public Simulacion(List<Pasajero> lp, List<Vuelo> lv,Terminal lt) {
        this.lp = lp;
        this.lv = lv;
        this.t = lt;


    }

    public Simulacion(int simulaciones,int nhilos, Terminal t) {
        this.simulaciones = simulaciones;
        this.t=t;
        hacerPorterminal();
    }

    private int asientoAlearotio(Vuelo v){
        return  (int) (rnd.nextDouble() * v.getCapacidad() + inicial);
    }

    private Pasajero pasajeroAlearotio(){
        return lp.get((int) (rnd.nextDouble() * lp.size() + 0));
    }

    private Vuelo vueloAlearotio(){
        return  lv.get((int) (rnd.nextDouble() *  lv.size()+ 0));
    }

    private Terminal terminalAlearotio(){
        return  lt.get((int) (rnd.nextDouble() *  tdao.getTerminalesNum()+ 0));
    }

    public void imprimirVendido(Terminal t, Pasajero p,Vuelo v,int asiento){
        System.out.println("\nVuelo Vendido!");
        System.out.println(t.getNombre()+"  pasajero: "+p.getNombre()+":  Avion: "+v.getNombre()+"   Ruta:"+v.getDe()+"-"+v.getHacia()
            +" "+ asiento
        );
    }

    public void imprimirNoVendido(Terminal t, Pasajero p,Vuelo v,int asi){
        System.out.println("\n!!!Error !¡");
        System.out.println("Asiento "+asi+" Ocupado");
        System.out.println(t.getNombre()+"  pasajero: "+p.getNombre()+":  Avion: "+v.getNombre()+"   Ruta:"+v.getDe()+"-"+v.getHacia());
    }

    public void addPasajero(Pasajero p){
     this.lp.add(p);
    }
    public void addTerminal(Terminal t){
        this.lt.add(t);
    }
    public void addVuelo(Vuelo v){
        this.lv.add(v);
    }


}
