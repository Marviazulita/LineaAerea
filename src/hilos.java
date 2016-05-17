import java.util.List;
import java.util.concurrent.Semaphore;

public class Hilos implements  Runnable {
    private final Semaphore semaphore = new Semaphore(5, true);
    int nhilos;
    int simulaciones;
    Thread[] nHilos;
    List<Pasajero> lp;
    List<Vuelo> lv;
    Terminal lt;

    public Hilos(int nhilos, int simulaciones,List<Pasajero> lp, java.util.List<Vuelo> lv, Terminal lt) {

        this.nhilos = nhilos;
        this.simulaciones = simulaciones;
        this.lp=lp;
        this.lv=lv;
        this.lt=lt;
        nHilos=new Thread[nhilos];
        crearHilos();
        correr();
    }

    private void correr() {
        for (int i = 0; i < nhilos; i++) {
            nHilos[i].start();
        }
    }


    @Override
    public void run() {

        Simulacion s=new Simulacion(lp,lv,lt);
        try{
            semaphore.acquire();
            for (int i = 0; i <simulaciones ; i++) {
                //System.out.println("simulacion"+i);
                s.hacerAleatorio();
                Thread.sleep(2000);
            }

        }catch(InterruptedException e){
            System.out.println("Error de sincronizacion");
        } finally {
            semaphore.release();
        }

    }
    private void crearHilos(){
        for (int i = 0; i < nhilos; i++) {
            //new Thread(p).start();
            nHilos[i]=new Thread(this);
        }
    }



}
