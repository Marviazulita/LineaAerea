import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by karim on 11/05/2016.
 */
public class VueloDAO {


    public VueloDAO() {
        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM  vuelo");
            ps.executeUpdate();
        } catch (SQLException e) {

        }
    }

    public Vuelo crear(String nombre,int capacidad,String desde,String hacia) {

        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO vuelo VALUES( ? )");
            ps.setString(1, nombre);
            ps.executeUpdate();
            return new Vuelo(nombre,capacidad, desde, hacia);
        } catch (SQLException e) {

        }
        return null;
    }

    public Vuelo crear(Vuelo v) {

        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO vuelo VALUES( ?,?,?,? )");
            ps.setString(1, v.getNombre());
            ps.setInt(2, v.getCapacidad());
            ps.setString(3, v.getDe());
            ps.setString(4, v.getHacia());
            ps.executeUpdate();
            return v;
        } catch (SQLException e) {

        }
        return null;
    }

    public void eliminar(String nombre) {

        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("DELETE  vuelo WHERE nombre= ? ");
            ps.setString(1, nombre);
            ps.executeUpdate();

        } catch (SQLException e) {

        }


    }

     public Vuelo getVuelo(String v){
        try {
            Connection conn = Conexion.getConexion();
            String query;
            query="SELECT * FROM vuelo WHERE vuelo= ? ";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1,v);

            ResultSet rs = ps.executeQuery(query);
            return new Vuelo(rs.getString("nombre"),rs.getInt("capacidad"),rs.getString("desde"),rs.getString("hacia"));

        } catch (SQLException e) {

        }
        return null;
    }

    public int getVuelosNum(){
        try {
            Connection conn = Conexion.getConexion();
            String query;
            query="SELECT COUNT(*) FROM vuelos ";
            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            return rs.getInt(1) ;

        } catch (SQLException e) {

        }
        return 0;
    }


}
