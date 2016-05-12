/**
 * Created by karim on 10/05/2016.
 */
public class Terminal implements Runnable  {
    int idTerminal;
    String nombre;
    ReservacionDAO rdao=new ReservacionDAO();

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

    @Override
    public void run() {

    }

    public boolean vender(Pasajero p, Vuelo v, int asiento){
        Reservacion r=new Reservacion(this.getNombre(),p.getNombre(),asiento,v.getNombre());

        if(rdao.crear(r)!=null)
            return true;
        return false;

    }
}
