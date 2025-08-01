# 📚 Sistema de Gerenciamento de Biblioteca

Sistema desenvolvido como parte do desafio da **Trilha Java da Rocketseat**, focado no gerenciamento de empréstimos de livros em uma biblioteca.

## 🎯 Sobre o Desafio

Neste desafio, foi desenvolvido um sistema básico para gerenciar o empréstimo de livros em uma biblioteca. O foco principal está na listagem de livros disponíveis e na funcionalidade de empréstimo, proporcionando uma experiência completa de gerenciamento bibliotecário.

## ⚡ Funcionalidades

### 📋 Gerenciamento de Dados
- **Cadastro de Clientes**: Registre novos usuários da biblioteca
- **Cadastro de Livros**: Adicione novos títulos ao acervo
- **Listagem Completa**: Visualize todos os clientes e livros cadastrados

### 🔍 Consultas e Buscas
- **Busca Inteligente**: Encontre livros por título ou autor
- **Histórico Completo**: Consulte todos os empréstimos realizados
- **Empréstimos por Cliente**: Veja o histórico específico de cada usuário

### 📖 Sistema de Empréstimos
- **Realizar Empréstimos**: Empreste livros com controle de disponibilidade
- **Devolução de Livros**: Processe devoluções e libere livros para novos empréstimos
- **Controle de Prazos**: Sistema automático de data de devolução (15 dias)
- **Status de Disponibilidade**: Controle em tempo real da disponibilidade dos livros

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto
- **Collections Framework**: ArrayList para gerenciamento de dados
- **LocalDate**: Controle de datas de empréstimo e devolução
- **Scanner**: Interface de entrada de dados
- **Programação Orientada a Objetos**: Estrutura modular e organizada

## 📁 Estrutura do Projeto

```
src/
├── Pessoa.java              # Classe base para clientes e autores
├── Cliente.java             # Gerenciamento de clientes
├── Autor.java               # Gerenciamento de autores
├── Livro.java               # Entidade livro com controle de disponibilidade
├── Emprestimo.java          # Controle completo de empréstimos
├── BibliotecaService.java   # Lógica de negócio e operações principais
└── Main.java                # Interface do usuário e dados de exemplo
```

## 🚀 Como Executar

1. **Clone o repositório**
   ```bash
   git clone [seu-repositorio]
   cd sistema-biblioteca
   ```

2. **Compile o projeto**
   ```bash
   javac *.java
   ```

3. **Execute a aplicação**
   ```bash
   java Main
   ```

4. **Dados de Exemplo**
   O sistema já vem com dados pré-carregados para facilitar os testes:
   - 4 clientes cadastrados
   - 8 livros de diversos gêneros e autores

## 📖 Como Usar

### Menu Principal
```
=== MENU BIBLIOTECA ===
1 - Cadastrar Cliente
2 - Cadastrar Livro
3 - Listar Clientes
4 - Listar Livros
5 - Consultar histórico de empréstimos
6 - Buscar livro por título ou autor
7 - Realizar empréstimo de livro
8 - Devolver livro
9 - Consultar empréstimos de um cliente
0 - Sair
```

### Exemplo de Fluxo de Uso
1. **Visualizar Acervo**: Use a opção 4 para ver todos os livros disponíveis
2. **Buscar Livro**: Use a opção 6 para encontrar um título específico
3. **Realizar Empréstimo**: Use a opção 7 informando ID do cliente e do livro
4. **Acompanhar**: Use a opção 5 para ver o histórico completo

## 💡 Dados de Exemplo Inclusos

### Clientes Pré-cadastrados
- Ana Silva (ID: 1)
- Carlos Santos (ID: 2)
- Maria Oliveira (ID: 3)
- João Pereira (ID: 4)

### Livros Pré-cadastrados
- Dom Casmurro - Machado de Assis
- O Cortiço - Aluísio Azevedo
- Iracema - José de Alencar
- O Alquimista - Paulo Coelho
- 1984 - George Orwell
- O Pequeno Príncipe - Antoine de Saint-Exupéry
- Cem Anos de Solidão - Gabriel García Márquez
- Harry Potter e a Pedra Filosofal - J.K. Rowling

## 🔧 Principais Características Técnicas

- **Controle de Estado**: Livros alternam entre disponível/indisponível automaticamente
- **Validações**: Verificação de existência de clientes e livros antes de operações
- **Busca Flexível**: Busca por título ou autor com ignore case
- **Data Management**: Controle automático de datas de empréstimo e devolução
- **Interface Intuitiva**: Menu numerado com operações claras

## 🎓 Aprendizados do Desafio

- Uso efetivo de Collections e Streams
- Aplicação de conceitos de POO (herança, encapsulamento)
- Gerenciamento de estado e relacionamentos entre entidades
- Desenvolvimento de interface de usuário via console

## 🚧 Possíveis Melhorias Futuras

- Persistência de dados em arquivo ou banco de dados
- Interface gráfica com JavaFX ou Swing
- Sistema de multas por atraso
- Reserva de livros
- Relatórios estatísticos
- API REST para integração web

---

## 👨‍💻 Desenvolvido como parte da Trilha Java - Rocketseat

Este projeto demonstra a aplicação prática dos conceitos fundamentais de Java em um sistema real de gerenciamento, focando em boas práticas de programação e organização de código.
