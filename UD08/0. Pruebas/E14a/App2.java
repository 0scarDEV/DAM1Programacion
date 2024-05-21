package E14a;

import com.mysql.cj.jdbc.result.ResultSetImpl;

import java.sql.*;

public class App2 {

    public static void main(String[] args) throws Exception {


        Connection conexionBD = conectarBD();
        if (conexionBD == null) {
            System.out.println("Error al conectar con la BD");
        } else {
            // Trabajar con la BD...


            String sql = "SELECT nombre FROM ALUMNO";
            Statement consulta = conexionBD.createStatement();
            ResultSet rs = consulta.executeQuery(sql);
            ResultSetImpl rs2 = (ResultSetImpl) rs;
            rs2.setResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE);
       //     ((ResultSetImpl) rs).setResultSetType();
            while (rs2.next()) {
                System.out.println(rs.getString("nombre"));
                rs2.previous();

            }
            consulta.close();


            conexionBD.close();
        }

    }

    static private Connection conectarBD() {
        Connection con;
        String url = "jdbc:mysql://" + BDDatos.HOST + "/" + BDDatos.DATABASE;
        try {
            return DriverManager.getConnection(url, BDDatos.USER, BDDatos.PASSWD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
