import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BibliotecaService service = new BibliotecaService();

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
                    livro.setDisponivel(true); // Por padrão, o livro está disponível
                    livro.setDataCadastro(String.valueOf(LocalDate.now()));
                    livro.setDataAtualizacao(String.valueOf(LocalDate.now()));
                    service.cadastrarLivro(livro);
                    System.out.println("Livro cadastrado com sucesso.");

                }
                case 3 -> {
                        System.out.println("Listar Clientes");
                        service.listarClientes().forEach(System.out::println);

                }
                case 4  -> {
                    // Lógica para listar livros
                    System.out.println("Listar Livros");
                    // Implementar lógica de listagem
                }
                case 5  -> {
                    // Lógica para consultar histórico de empréstimos
                    System.out.println("Consultar histórico de empréstimos");
                    // Implementar lógica de consulta
                }

                case 6-> {
                    // Lógica para buscar livro por título ou autor
                    System.out.println("Buscar livro por título ou autor");
                    // Implementar lógica de busca
                }

                case 7 -> {
                    // Lógica para realizar empréstimo de livro
                    System.out.println("Realizar empréstimo de livro");
                    // Implementar lógica de empréstimo
                }
                case 0 -> System.out.println("Saindo...");

                default -> System.out.println("Opção inválida.");

            }

        } while (opcao != 0);

        sc.close();


    }


}
