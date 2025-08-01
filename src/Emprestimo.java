import java.time.LocalDate;

public class Emprestimo {
    private int id;
    private int clienteId;
    private int livroId;
    private String nomeCliente;
    private String tituloLivro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean devolvido;

    public Emprestimo(int id, int clienteId, int livroId, String nomeCliente, String tituloLivro) {
        this.id = id;
        this.clienteId = clienteId;
        this.livroId = livroId;
        this.nomeCliente = nomeCliente;
        this.tituloLivro = tituloLivro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = LocalDate.now().plusDays(15); // 15 dias para devolução
        this.devolvido = false;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id=" + id +
                ", cliente='" + nomeCliente + '\'' +
                ", livro='" + tituloLivro + '\'' +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", devolvido=" + devolvido +
                '}';
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getLivroId() {
        return livroId;
    }

    public void setLivroId(int livroId) {
        this.livroId = livroId;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
}