import java.util.ArrayList;
import java.util.List;

public class Livro {

    int id;
    String titulo;
    String autor;
    boolean disponivel;
    String dataCadastro;
    String dataAtualizacao;

    public Livro(int id, String titulo, String autor, boolean disponivel, String dataCadastro, String dataAtualizacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    private List<Livro> livros = new ArrayList<>();

    public Livro() {

    }

    public List<Livro> listarLivros() {
        return livros;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "id=" + getId() +
                ", titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", disponivel='" + isDisponivel() + '\'' +
                '}';
    }

    public Livro findByName(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}



