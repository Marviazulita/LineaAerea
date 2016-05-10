import java.util.ArrayList;
import java.util.List;

/**
 * Created by karim on 10/05/2016.
 */
public class Linea {
    String nombre;
    List<Vuelo> aviones=new ArrayList<>();

    public Linea(String nombre) {
        this.nombre = nombre;
    }

    public void addVuelo(Vuelo vuelo){
        aviones.add(vuelo);
    }

}
