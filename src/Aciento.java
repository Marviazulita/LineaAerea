/**
 * Created by karim on 10/05/2016.
 */
public class Aciento {
    int numero;
    boolean reservado;

    public Aciento(int numero) {
        this.numero = numero;
        this.reservado=false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
}
