import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {


    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", dataNascimento='" + getDataNascimento() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }

}
