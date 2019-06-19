import connection.ConnectionFactory;

import java.sql.*;
//import com.mysql.jdbc.Driver;


public class Select {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = new ConnectionFactory().getConnection();

            /*ConnectionFactory con = new ConnectionFactory();
            con.getConnection();*/

            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM cliente");

            while (rs.next()) {
                System.out.println(rs.getInt(1)+ " ----- " + rs.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
