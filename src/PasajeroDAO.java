import java.awt.image.SampleModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by karim on 11/05/2016.
 */
public class PasajeroDAO {

    public PasajeroDAO() {
        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("DELETE  FROM pasajero ");
            ps.executeUpdate();

        } catch (SQLException e) {

        }
    }

    public Pasajero crear(String nombre) {
        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO pasajero VALUES( ? )");
            ps.setString(1, nombre);
            ps.executeUpdate();
            return new Pasajero(nombre);
        } catch (SQLException e) {

        }
        return null;
    }

    public Pasajero crear(Pasajero p) {
        try {
            Connection conn = Conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement("INSERT INTO pasajero VALUES( ? )");
            ps.setString(1,p.getNombre());
            ps.executeUpdate();
            return new Pasajero(p.getNombre());
        } catch (SQLException e) {

        }
        return null;
    }

    public void eliminar(String nombre) {

        try {
            Connection conn = Conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement("DELETE FROM  pasajero WHERE nombre= ? ");
            ps.setString(1, nombre);
            ps.executeUpdate();

        } catch (SQLException e) {

        }


    }

    public void actualizar(String Numbre) {

    }

    public Pasajero consulta(int id) {
        try {
            Connection conn = Conexion.getConexion();
            String query;
            query="SELECT * FROM pasajeros WHERE id=? ";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery(query);
            return new Pasajero(rs.getInt(1),rs.getString(2));

        } catch (SQLException e) {

        }
        return null;
    }

    public int getTotalPasajeros(){
        try {
            Connection conn = Conexion.getConexion();
            String query;
            query="SELECT COUNT(*) FROM pasajeros ";
            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            return rs.getInt(1) ;

        } catch (SQLException e) {

        }
        return 0;
    }


}
