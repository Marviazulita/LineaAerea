import java.util.List;

/**
 * Created by karim on 10/05/2016.
 */
public class Vuelo {
    String nombre;
    int capacidad;
    int acientosDisponibles;
    List<Aciento>  acientos;

    String de;
    String hacia;

    public Vuelo(String nombre) {
        this.nombre = nombre;
        this.capacidad=10;

    }

    public void addAciento(Aciento aciento){
        if(acientos.size()<capacidad)
            acientos.add(aciento);
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
        for(Aciento a:acientos){
            if(!a.isReservado()){
                c++;
            }
        }
        return c;
    }

    public void setAcientos(List<Aciento> acientos) {
        this.acientos = acientos;
    }


}
