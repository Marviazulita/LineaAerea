import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	    Pasajero karim=new Pasajero(1,"Karim");
        Pasajero juan=new Pasajero(2,"Juan");
        Pasajero angel=new Pasajero(3,"Angel");
        Pasajero viri=new Pasajero(4,"Viri");
        Pasajero hector=new Pasajero(5,"Hector");

        List<Pasajero> pasajeros=new ArrayList<>();
        pasajeros.add(karim);
        pasajeros.add(juan);
        pasajeros.add(angel);
        pasajeros.add(viri);
        pasajeros.add(hector);


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

        Simulacion simulacion=new Simulacion(100,pasajeros,vuelos,terminales);

        simulacion.hacer();



    }
}
