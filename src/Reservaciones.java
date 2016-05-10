import java.util.ArrayList;
import java.util.List;

/**
 * Created by karim on 10/05/2016.
 */
public  class Reservaciones {
    public static List<Reservacion> reserva=new ArrayList<>();

    //private static final Card[][] CARDFACTORY = new Card[Suit.values().length][Rank.values().length];

    public static void setReserv(List<Reservacion> reserv) {
        reserva = reserv;
    }

    public static Boolean addReservacion(Reservacion res){

        reserva.add(res);
        return true;

    }

    public static List<Reservacion> getReserva() {
        return reserva;
    }

}
