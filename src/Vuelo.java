import java.util.List;

/**
 * Created by karim on 10/05/2016.
 */
public class Vuelo {
    String nombre;
    int capacidad;
    int acientosDisponibles;
    List<Asiento> asientos;

    String de;
    String hacia;

    public Vuelo(String nombre) {
        this.nombre = nombre;
        this.capacidad=10;

    }

    public Vuelo(String nombre, int capacidad, String de, String hacia) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.de = de;
        this.hacia = hacia;
    }

    public String getNombre() {
        return nombre;
    }

    public void addAciento(Asiento asiento){
        if(asientos.size()<capacidad)
            asientos.add(asiento);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getHacia() {
        return hacia;
    }

    public void setHacia(String hacia) {
        this.hacia = hacia;
    }

    public int acientosDisponibles(){
        int c=0;
        for(Asiento a: asientos){
            if(!a.isReservado()){
                c++;
            }
        }
        return c;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }


}
