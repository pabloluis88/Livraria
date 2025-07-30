import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {

    private List<Autor> autores = new ArrayList<>();

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public List<Autor> listarAutores() {
        return autores;
    }


}
