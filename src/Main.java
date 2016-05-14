import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

	    Pasajero p1=new Pasajero(1,"Karim");
        Pasajero p2=new Pasajero(2,"Juan");
        Pasajero p3=new Pasajero(3,"Angel");
        Pasajero p4=new Pasajero(4,"Viri");
        Pasajero p5=new Pasajero(5,"Hector");

        List<Pasajero> pasajeros=new ArrayList<>();
        pasajeros.add(p1);
        pasajeros.add(p2);
        pasajeros.add(p3);
        pasajeros.add(p4);
        pasajeros.add(p5);


        Linea aereo=new Linea("Nueva Aorolinea laLinea");

        Vuelo azul=new Vuelo("Azul");
        azul.setDe("Morelia");
        azul.setHacia("Tijuana");
        Vuelo rojo=new Vuelo("Rojo");
        rojo.setDe("Iguala");
        rojo.setHacia("Misantla");
        Vuelo negro=new Vuelo("Negro");
        negro.setDe("Valladolid");
        negro.setHacia("MexicoDF");

        List<Vuelo> vuelos=new ArrayList<>();
        vuelos.add(azul);
        vuelos.add(rojo);
        vuelos.add(negro);

        Terminal t1=new Terminal("T1");
        Terminal t2=new Terminal("T2");
        Terminal t3=new Terminal("T3");
        Terminal t4=new Terminal("T4");
        Terminal t5=new Terminal("T5");
        Terminal t6=new Terminal("T6");
        List<Terminal> terminales=new ArrayList<>();
        terminales.add(t1);
        terminales.add(t2);
        terminales.add(t3);
        terminales.add(t4);
        terminales.add(t5);
        terminales.add(t6);

        PasajeroDAO pdao=new PasajeroDAO();
        pdao.crear(p1);
        pdao.crear(p2);
        pdao.crear(p3);
        pdao.crear(p4);
        pdao.crear(p5);

        TerminalDAO tdao=new TerminalDAO();
        tdao.crear(t1);
        tdao.crear(t2);
        tdao.crear(t3);
        tdao.crear(t4);
        tdao.crear(t5);
        tdao.crear(t6);

        VueloDAO vdao=new VueloDAO();
        vdao.crear(azul);
        vdao.crear(rojo);
        vdao.crear(negro);

        ReservacionDAO rado=new ReservacionDAO();
        t1.setRdao(rado);
        t2.setRdao(rado);
        Hilos h1=new Hilos(2,10,pasajeros,vuelos,t1);
        Hilos h2=new Hilos(10,10,pasajeros,vuelos,t2);




        //simulacion.executor.submit(simulacion.vender);

       // IntStream.range(0, 1)
       //         .forEach(i -> simulacion.executor.submit(simulacion.vender));


    }
}
