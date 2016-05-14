import java.sql.*;

/**
 * Created by karim on 11/05/2016.
 */
public class ReservacionDAO {

    public ReservacionDAO() {
        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM reservaciones ");
            ps.executeUpdate();

        } catch (SQLException e) {

        }
    }

    public Reservacion crear(int id, String terminal, String pasajero, int asiento , String vuelo) {
        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO reservaciones VALUES( NULL ,?,?,?,? )");
            ps.setString(1,terminal);
            ps.setString(2, pasajero);
            ps.setString(3, vuelo);
            ps.setInt(4, asiento);
            ps.executeUpdate();
            return new Reservacion(terminal,pasajero,asiento,vuelo);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return new Reservacion(terminal,pasajero,asiento,vuelo);
    }
    public Reservacion crear(Reservacion r) {
        try {
            Connection conn = Conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement("INSERT INTO reservaciones VALUES( NULL ,?,?,?,? )");

            ps.setString(1,r.pasajero);
            ps.setString(2, r.vuelo);
            ps.setInt(3, r.asiento);
            ps.setString(4, r.terminal);

            ps.executeUpdate();
            return r;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public void eliminar(int id) {

        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("DELETE  resevaciones WHERE id= ? ");
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {

        }
    }

    public void actualizar(String Numbre) {

    }

    public Reservacion consulta(String Numbre) {
        return null;
    }

    public Reservacion estaOcupado(int id){
        try {
            Connection conn = Conexion.getConexion();
            String query;
            query="SELECT * FROM reservaciones WHERE id= ? ";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1 ,id);

            ResultSet rs = ps.executeQuery(query);

            return new Reservacion(rs.getString("terminal"),rs.getString("pasajero"),rs.getInt("asiento"),rs.getString("vuelo"));

        } catch (SQLException e) {

        }
        return null;
    }

    public Reservacion estaOcupado(String vuelo,int asiento){
        try {
            Connection conn = Conexion.getConexion();
            Statement sta=conn.createStatement();
            String query;
            query="SELECT *  FROM reservaciones WHERE vuelo=? AND asiento=?";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1,vuelo);
            ps.setInt(2 ,asiento);


            ResultSet rs = ps.executeQuery();
            rs.next();
            return new Reservacion(rs.getString("terminal"),rs.getString("pasajero"),rs.getInt("asiento"),rs.getString("vuelo"));

        } catch (SQLException e) {
           // System.out.println(e);
        }
        return null;
    }

}
