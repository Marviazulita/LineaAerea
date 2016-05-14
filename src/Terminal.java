/**
 * Created by karim on 10/05/2016.
 */
public class Terminal    {
    int idTerminal;
    String nombre;
    ReservacionDAO rdao;

    public void setRdao(ReservacionDAO rdao) {
        this.rdao = rdao;
    }

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


    public boolean vender(Pasajero p, Vuelo v, int asiento){
        Reservacion r=new Reservacion(this.getNombre(),p.getNombre(),asiento,v.getNombre());
        Reservacion r2=null;
        Reservacion r3=rdao.estaOcupado(r.vuelo,r.asiento);
        if(r3==null){
            r2=rdao.crear(r);

        }else{
            System.out.println("Ocupado por:"+r3.pasajero);
        }



        if(r2!=null) {
            return true;

            }
        return false;

    }
}
