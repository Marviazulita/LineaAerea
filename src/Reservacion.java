/**
 * Created by karim on 10/05/2016.
 */
public class Reservacion {
    String terminal;
    String pasajero;
    int asiento;
    String vuelo;

    public Reservacion(String terminal, String pasajero, int asiento, String vuelo) {
        this.terminal = terminal;
        this.pasajero = pasajero;
        this.asiento = asiento;
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return "Reservacion{" +
                "terminal='" + terminal + '\'' +
                ", pasajero='" + pasajero + '\'' +
                ", asiento=" + asiento +
                ", vuelo=" + vuelo +
                '}';
    }
}
