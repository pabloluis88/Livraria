import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Método para carregar dados de exemplo
    private static void carregarDadosExemplo(BibliotecaService service) {
        // Cadastrar clientes de exemplo
        Cliente cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Ana Silva");
        cliente1.setEmail("ana.silva@email.com");
        cliente1.setDataNascimento("15/03/1990");
        service.cadastrarCliente(cliente1);

        Cliente cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Carlos Santos");
        cliente2.setEmail("carlos.santos@email.com");
        cliente2.setDataNascimento("22/07/1985");
        service.cadastrarCliente(cliente2);

        Cliente cliente3 = new Cliente();
        cliente3.setId(3);
        cliente3.setNome("Maria Oliveira");
        cliente3.setEmail("maria.oliveira@email.com");
        cliente3.setDataNascimento("08/11/1995");
        service.cadastrarCliente(cliente3);

        Cliente cliente4 = new Cliente();
        cliente4.setId(4);
        cliente4.setNome("João Pereira");
        cliente4.setEmail("joao.pereira@email.com");
        cliente4.setDataNascimento("30/12/1988");
        service.cadastrarCliente(cliente4);

        // Cadastrar livros de exemplo
        Livro livro1 = new Livro();
        livro1.setId(1);
        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setDisponivel(true);
        livro1.setDataCadastro(String.valueOf(LocalDate.now()));
        livro1.setDataAtualizacao(String.valueOf(LocalDate.now()));
        service.cadastrarLivro(livro1);

        Livro livro2 = new Livro();
        livro2.setId(2);
        livro2.setTitulo("O Cortiço");
        livro2.setAutor("Aluísio Azevedo");
        livro2.setDisponivel(true);
        livro2.setDataCadastro(String.valueOf(LocalDate.now()));
        livro2.setDataAtualizacao(String.valueOf(LocalDate.now()));
        service.cadastrarLivro(livro2);

        Livro livro3 = new Livro();
        livro3.setId(3);
        livro3.setTitulo("Iracema");
        livro3.setAutor("José de Alencar");
        livro3.setDisponivel(true);
        livro3.setDataCadastro(String.valueOf(LocalDate.now()));
        livro3.setDataAtualizacao(String.valueOf(LocalDate.now()));
        service.cadastrarLivro(livro3);

        Livro livro4 = new Livro();
        livro4.setId(4);
        livro4.setTitulo("O Alquimista");
        livro4.setAutor("Paulo Coelho");
        livro4.setDisponivel(true);
        livro4.setDataCadastro(String.valueOf(LocalDate.now()));
        livro4.setDataAtualizacao(String.valueOf(LocalDate.now()));
        service.cadastrarLivro(livro4);

        Livro livro5 = new Livro();
        livro5.setId(5);
        livro5.setTitulo("1984");
        livro5.setAutor("George Orwell");
        livro5.setDisponivel(true);
        livro5.setDataCadastro(String.valueOf(LocalDate.now()));
        livro5.setDataAtualizacao(String.valueOf(LocalDate.now()));
        service.cadastrarLivro(livro5);

        Livro livro6 = new Livro();
        livro6.setId(6);
        livro6.setTitulo("O Pequeno Príncipe");
        livro6.setAutor("Antoine de Saint-Exupéry");
        livro6.setDisponivel(true);
        livro6.setDataCadastro(String.valueOf(LocalDate.now()));
        livro6.setDataAtualizacao(String.valueOf(LocalDate.now()));
        service.cadastrarLivro(livro6);

        Livro livro7 = new Livro();
        livro7.setId(7);
        livro7.setTitulo("Cem Anos de Solidão");
        livro7.setAutor("Gabriel García Márquez");
        livro7.setDisponivel(true);
        livro7.setDataCadastro(String.valueOf(LocalDate.now()));
        livro7.setDataAtualizacao(String.valueOf(LocalDate.now()));
        service.cadastrarLivro(livro7);

        Livro livro8 = new Livro();
        livro8.setId(8);
        livro8.setTitulo("Harry Potter e a Pedra Filosofal");
        livro8.setAutor("J.K. Rowling");
        livro8.setDisponivel(true);
        livro8.setDataCadastro(String.valueOf(LocalDate.now()));
        livro8.setDataAtualizacao(String.valueOf(LocalDate.now()));
        service.cadastrarLivro(livro8);

        System.out.println("✅ Dados de exemplo carregados com sucesso!");
        System.out.println("   - 4 clientes cadastrados");
        System.out.println("   - 8 livros cadastrados");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BibliotecaService service = new BibliotecaService();

        // Carregar dados de exemplo automaticamente
        carregarDadosExemplo(service);
        // Exibir mensagem de boas-vindas
        System.out.println("Bem-vindo ao sistema de Biblioteca!");
        System.out.println("Você pode gerenciar clientes, livros e empréstimos.");
        System.out.println("Para começar, escolha uma opção no menu abaixo:");
        int opcao;
        do {
            System.out.println("\n=== MENU BIBLIOTECA ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Livro");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Listar Livros");
            System.out.println("5 - Consultar histórico de empréstimos");
            System.out.println("6 - Buscar livro por título ou autor");
            System.out.println("7 - Realizar empréstimo de livro");
            System.out.println("8 - Devolver livro");
            System.out.println("9 - Consultar empréstimos de um cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1 -> {
                    Cliente cliente = new Cliente();
                    System.out.print("ID: ");
                    cliente.setId(Integer.parseInt(sc.nextLine()));
                    System.out.print("Nome: ");
                    cliente.setNome(sc.nextLine());
                    System.out.print("Email: ");
                    cliente.setEmail(sc.nextLine());
                    System.out.print("Data de Nascimento: ");
                    cliente.setDataNascimento(sc.nextLine());
                    service.cadastrarCliente(cliente);
                    System.out.println("Cliente cadastrado com sucesso.");
                }
                case 2 -> {
                    Livro livro = new Livro();
                    System.out.print("ID: ");
                    livro.setId(Integer.parseInt(sc.nextLine()));
                    System.out.print("Título: ");
                    livro.setTitulo(sc.nextLine());
                    System.out.print("Autor: ");
                    livro.setAutor(sc.nextLine());
                    livro.setDisponivel(true);
                    livro.setDataCadastro(String.valueOf(LocalDate.now()));
                    livro.setDataAtualizacao(String.valueOf(LocalDate.now()));
                    service.cadastrarLivro(livro);
                    System.out.println("Livro cadastrado com sucesso.");
                }
                case 3 -> {
                    System.out.println("\n=== LISTA DE CLIENTES ===");
                    List<Cliente> clientes = service.listarClientes();
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        clientes.forEach(System.out::println);
                    }
                }
                case 4 -> {
                    System.out.println("\n=== LISTA DE LIVROS ===");
                    List<Livro> livros = service.listarLivros();
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        livros.forEach(System.out::println);
                    }
                }
                case 5 -> {
                    System.out.println("\n=== HISTÓRICO DE EMPRÉSTIMOS ===");
                    List<Emprestimo> emprestimos = service.consultarHistoricoEmprestimos();
                    if (emprestimos.isEmpty()) {
                        System.out.println("Nenhum empréstimo encontrado.");
                    } else {
                        emprestimos.forEach(System.out::println);
                    }
                }
                case 6 -> {
                    System.out.print("Digite o título ou autor para buscar: ");
                    String busca = sc.nextLine();
                    List<Livro> resultados = service.buscarLivrosPorTituloOuAutor(busca);

                    if (resultados.isEmpty()) {
                        System.out.println("Nenhum livro encontrado.");
                    } else {
                        System.out.println("\n=== LIVROS ENCONTRADOS ===");
                        resultados.forEach(System.out::println);
                    }
                }
                case 7 -> {
                    System.out.println("\n=== REALIZAR EMPRÉSTIMO ===");
                    System.out.print("ID do Cliente: ");
                    int clienteId = Integer.parseInt(sc.nextLine());
                    System.out.print("ID do Livro: ");
                    int livroId = Integer.parseInt(sc.nextLine());

                    service.realizarEmprestimo(clienteId, livroId);
                }
                case 8 -> {
                    System.out.println("\n=== DEVOLVER LIVRO ===");
                    System.out.print("ID do Empréstimo: ");
                    int emprestimoId = Integer.parseInt(sc.nextLine());

                    service.devolverLivro(emprestimoId);
                }
                case 9 -> {
                    System.out.println("\n=== EMPRÉSTIMOS POR CLIENTE ===");
                    System.out.print("ID do Cliente: ");
                    int clienteId = Integer.parseInt(sc.nextLine());

                    List<Emprestimo> emprestimosCliente = service.consultarEmprestimosPorCliente(clienteId);
                    if (emprestimosCliente.isEmpty()) {
                        System.out.println("Nenhum empréstimo encontrado para este cliente.");
                    } else {
                        emprestimosCliente.forEach(System.out::println);
                    }
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}