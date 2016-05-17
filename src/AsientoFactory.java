import java.util.ArrayList;
import java.util.List;

public class AsientoFactory {

    public static Asiento getAciento(int numero){
        return new Asiento(numero);
    }

    public static List<Asiento> getAcientos(int cantidad){
        List<Asiento> asientos =new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            asientos.add(getAciento(i));
        }
        return asientos;
    }

}
