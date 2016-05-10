/**
 * Created by karim on 10/05/2016.
 */
public class Terminal {
    int idTerminal;
    String nombre;

    public Terminal(int idTerminal) {
        this.idTerminal = idTerminal;
    }


    public void vender(String pasajero,String vuelo,int aciento){

    }

    public Terminal(String nombre) {
        this.idTerminal = idTerminal;
        this.nombre = nombre;
    }

    public int getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(int idTerminal) {
        this.idTerminal = idTerminal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
