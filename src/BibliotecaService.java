import java.util.*;

public class BibliotecaService {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Livro> livros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();
    private int proximoIdEmprestimo = 1;

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    public Cliente buscarClientePorId(int id) {
        return clientes.stream()
                .filter(cliente -> cliente.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Livro buscarLivroPorId(int id) {
        return livros.stream()
                .filter(livro -> livro.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Livro> buscarLivrosPorTituloOuAutor(String busca) {
        return livros.stream()
                .filter(livro ->
                        livro.getTitulo().toLowerCase().contains(busca.toLowerCase()) ||
                                livro.getAutor().toLowerCase().contains(busca.toLowerCase()))
                .toList();
    }

    public boolean realizarEmprestimo(int clienteId, int livroId) {
        Cliente cliente = buscarClientePorId(clienteId);
        Livro livro = buscarLivroPorId(livroId);

        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return false;
        }

        if (livro == null) {
            System.out.println("Livro não encontrado!");
            return false;
        }

        if (!livro.isDisponivel()) {
            System.out.println("Livro não está disponível para empréstimo!");
            return false;
        }

        // Criar empréstimo
        Emprestimo emprestimo = new Emprestimo(
                proximoIdEmprestimo++,
                clienteId,
                livroId,
                cliente.getNome(),
                livro.getTitulo()
        );

        emprestimos.add(emprestimo);
        livro.setDisponivel(false); // Marcar livro como indisponível

        System.out.println("Empréstimo realizado com sucesso!");
        System.out.println("Data de devolução: " + emprestimo.getDataDevolucao());
        return true;
    }

    public List<Emprestimo> consultarHistoricoEmprestimos() {
        return emprestimos;
    }

    public List<Emprestimo> consultarEmprestimosPorCliente(int clienteId) {
        return emprestimos.stream()
                .filter(emprestimo -> emprestimo.getClienteId() == clienteId)
                .toList();
    }

    public boolean devolverLivro(int emprestimoId) {
        Emprestimo emprestimo = emprestimos.stream()
                .filter(e -> e.getId() == emprestimoId && !e.isDevolvido())
                .findFirst()
                .orElse(null);

        if (emprestimo == null) {
            System.out.println("Empréstimo não encontrado ou já devolvido!");
            return false;
        }

        emprestimo.setDevolvido(true);

        // Marcar livro como disponível novamente
        Livro livro = buscarLivroPorId(emprestimo.getLivroId());
        if (livro != null) {
            livro.setDisponivel(true);
        }

        System.out.println("Livro devolvido com sucesso!");
        return true;
    }
}