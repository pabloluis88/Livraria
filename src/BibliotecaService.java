import java.util.*;

public class BibliotecaService {

    private List<Cliente> clientes = new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

}
