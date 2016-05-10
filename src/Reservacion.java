/**
 * Created by karim on 10/05/2016.
 */
public class Reservacion {
    String terminal;
    String pasajero;
    int numeroAciento;
    Vuelo vuelo;

    public Reservacion(String terminal, String pasajero, int numeroAciento, Vuelo vuelo) {
        this.terminal = terminal;
        this.pasajero = pasajero;
        this.numeroAciento = numeroAciento;
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return "Reservacion{" +
                "terminal='" + terminal + '\'' +
                ", pasajero='" + pasajero + '\'' +
                ", numeroAciento=" + numeroAciento +
                ", vuelo=" + vuelo +
                '}';
    }
}
