/**
 * Created by karim on 10/05/2016.
 */
public class Pasajero {
    int idPasajero;
    String Nombre;

    public Pasajero(String Nombre) {
        this.idPasajero = idPasajero;
    }

    public Pasajero(int idPasajero, String nombre) {
        this.idPasajero = idPasajero;
        Nombre = nombre;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
