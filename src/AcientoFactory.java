import java.util.ArrayList;
import java.util.List;

/**
 * Created by karim on 10/05/2016.
 */
public class AcientoFactory {

    public static Aciento getAciento(int numero){
        return new Aciento(numero);
    }

    public static List<Aciento> getAcientos(int cantidad){
        List<Aciento> acientos=new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            acientos.add(getAciento(i));
        }
        return acientos;
    }

}
