import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by karim on 11/05/2016.
 */
public class TerminalDAO {

    public TerminalDAO() {
        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM terminal ");
            ps.executeUpdate();

        } catch (SQLException e) {

        }
    }

    public Terminal crear(String nombre) {

        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO terminal VALUES( ? )");
            ps.setString(1, nombre);
            ps.executeUpdate();
            return new Terminal(nombre);
        } catch (SQLException e) {

        }
        return null;
    }

    public Terminal crear(Terminal t) {

        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO terminal VALUES( ? )");
            ps.setString(1, t.getNombre());
            ps.executeUpdate();
            return new Terminal(t.getNombre());
        } catch (SQLException e) {

        }
        return null;
    }

    public void eliminar(String terminal) {

        try {
            Connection conn = Conexion.getConexion();
            PreparedStatement ps = conn.prepareStatement("DELETE  terminal WHERE nombre= ? ");
            ps.setString(1, terminal);
            ps.executeUpdate();

        } catch (SQLException e) {

        }


    }

    public void actualizar(String Numbre) {

    }
    public int getTerminalesNum() {
        try {
            Connection conn = Conexion.getConexion();
            String query;
            query = "SELECT COUNT(*) FROM terminal ";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            return rs.getInt(1);

        } catch (SQLException e) {

        }
        return 0;
    }

}
