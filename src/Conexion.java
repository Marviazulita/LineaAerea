import java.sql.Connection;
import java.sql.DriverManager;

// Singleton
public class Conexion {
    //Configuracion de los datos de la BD
    public static Connection con = null;



    public Conexion() {

    }
    //Metodo que se devuelve la conexion o null si hubo un error
    public static Connection getConexion(){
        if(con!=null){
            return con;
        }
        String usuario = "ka";
        String pass = "toor";
        String host = "localhost";
        String nombre_BD = "aerolinea";
        try{
            //jdbc:mysql://localhost:3306/test
            Class.forName("com.mysql.jdbc.Driver").newInstance( );
            String servidor = "jdbc:mysql://"+host+"/"+nombre_BD;
            con = DriverManager.getConnection(servidor,usuario,pass);
            return con;
        }catch(Exception e){
            e.printStackTrace();
            return con;
        }


    }
}