import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        List<Livro> livros = new ArrayList<>();
        List<Emprestimo> emprestimos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Principal:");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Cadastrar Livro");
            System.out.println("3. Realizar Empréstimo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Nome da Pessoa: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    Pessoa pessoa = new Pessoa(nome, cpf, email, endereco, telefone);
                    pessoas.add(pessoa);
                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;

                case 2:
                    System.out.print("Título do Livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autores: ");
                    String autores = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    System.out.print("Edição: ");
                    int edicao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Editora: ");
                    String editora = scanner.nextLine();

                    Livro livro = new Livro(titulo, autores, ano, edicao, editora);
                    livros.add(livro);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 3:
                    if (pessoas.isEmpty() || livros.isEmpty()) {
                        System.out.println("É necessário cadastrar pelo menos uma pessoa e um livro antes de realizar um empréstimo.");
                    } else {
                        System.out.print("Escolha uma pessoa pelo Nome: ");
                        String nomePessoa = scanner.nextLine();
                        System.out.print("Escolha um livro pelo título: ");
                        String tituloLivro = scanner.nextLine();

                        Pessoa pessoaSelecionada = null;
                        Livro livroSelecionado = null;

                        for (Pessoa p : pessoas) {
                            if (p.getCpf().equals(nomePessoa)) {
                                pessoaSelecionada = p;
                                break;
                            }
                        }

                        for (Livro l : livros) {
                            if (l.getTitulo().equals(tituloLivro)) {
                                livroSelecionado = l;
                                break;
                            }
                        }

                        if (pessoaSelecionada != null && livroSelecionado != null) {
                            Emprestimo emprestimo = new Emprestimo(pessoaSelecionada, livroSelecionado);
                            emprestimos.add(emprestimo);
                            System.out.println("Empréstimo realizado com sucesso!");
                        } else {
                            System.out.println("Pessoa ou livro não encontrados. Verifique os dados e tente novamente.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}