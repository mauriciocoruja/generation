import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {

        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/restaurante?serverTimezone=GMT-3","root","");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Conectado");
    }
}
