import dao.ClienteDAO;
import model.Cliente;

public class RestauranteApplication {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();

        Cliente diego = new Cliente();
        diego.setIdCliente(4);
        diego.setNome("Mauricio");
        clienteDAO.altera(diego);

        System.out.println(clienteDAO.lista().toString());
    }
}
