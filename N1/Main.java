import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        List<Atividade> atividades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Cadastrar atividade complementar");
            System.out.println("3. Pesquisar atividades complementares de um aluno");
            System.out.println("4. Alterar status da atividade complementar");
            System.out.println("5. Mostrar carga horária total das atividades de todos os alunos");
            System.out.println("6. Mostrar carga horária total das atividades de um aluno");
            System.out.println("0. Sair");
            System.out.println("-----------------------------------");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                System.out.println("-----------------------------------");
                System.out.print("Nome do aluno: ");
                String nome = scanner.nextLine();
                System.out.print("Matrícula: ");
                int matricula = scanner.nextInt();
                scanner.nextLine();
                
                if (findAlunoByMatricula(alunos, matricula) != null) {
                    System.out.println("Já existe um aluno com a mesma matrícula.");
                } else if (findAlunoByNome(alunos, nome) != null) {
                    System.out.println("Já existe um aluno com o mesmo nome.");
                } else {
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    System.out.print("Carga Horária Total: ");
                    int cargaHorariaTotal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Quantidade de Atividades: ");
                    int quantidadeAtividades = scanner.nextInt();
                    scanner.nextLine();
                
                    Aluno novoAluno = new Aluno(nome, curso, matricula, cargaHorariaTotal, quantidadeAtividades);
                    alunos.add(novoAluno);
                    System.out.println("Aluno cadastrado com sucesso.");
                }
                break;

                case 2:
                    System.out.println("-----------------------------------");
                    System.out.print("Matrícula do aluno: ");
                    int matriculaAluno = scanner.nextInt();
                    scanner.nextLine();
                    Aluno aluno = findAlunoByMatricula(alunos, matriculaAluno);
                
                    if (aluno == null) {
                        System.out.println("Aluno não encontrado.");
                        break;
                    }
                
                    System.out.print("Descrição da atividade: ");
                    String descricaoAtividade = scanner.nextLine();
                
                    int numeroRegistro = atividades.size() + 1;
                
                    Atividade novaAtividade = new Atividade(
                        aluno.getNome_completo(), matriculaAluno, numeroRegistro, 0, descricaoAtividade, 
                        false, 0 
                    );
                
                    System.out.println("Confirma o cadastro da seguinte atividade complementar?");
                    System.out.println("Descrição: " + descricaoAtividade);
                    System.out.println("Aluno: " + aluno.getNome_completo());
                    System.out.println("Matrícula do aluno: " + matriculaAluno);
                    System.out.println("Número de Registro: " + numeroRegistro);
                    System.out.println("");
                    System.out.println("1. Confirmar");
                    System.out.println("2. Cancelar");
                    
                    int confirmChoice = scanner.nextInt();
                    scanner.nextLine(); 
                
                    if (confirmChoice == 1) {
                        atividades.add(novaAtividade);
                        System.out.println("Atividade complementar cadastrada com sucesso.");
                    } else {
                        System.out.println("Cadastro de atividade complementar cancelado.");
                    }
                    break;
                

                case 3:
                    System.out.println("-----------------------------------");
                    System.out.print("Matrícula do aluno: ");
                    int matriculaPesquisa = scanner.nextInt();
                    scanner.nextLine();

                    aluno = findAlunoByMatricula(alunos, matriculaPesquisa);

                    if (aluno == null) {
                        System.out.println("Aluno não encontrado.");
                        break;
                    }

                    System.out.println("Atividades complementares do aluno " + aluno.getNome_completo() + ":");
                    for (Atividade ativ : atividades) {
                        if (ativ.getMatricula() == matriculaPesquisa) {
                            System.out.println("Número de Registro: " + ativ.getNumeroRegistro());
                            System.out.println("Descrição: " + ativ.getDescricaoAtividade());
                            System.out.println("Status de Aproveitamento: " + ativ.isStatusAproveitamento());
                            System.out.println("Carga Horária Considerada: " + ativ.getCargaHorariaConsiderada() + " horas\n");
                            System.out.println("-----------------------------------");
                        }
                    }
                    break;

                case 4:
                    System.out.println("-----------------------------------");
                    System.out.print("Matrícula do aluno: ");
                    int matriculaAlteracao = scanner.nextInt();
                    scanner.nextLine();

                    aluno = findAlunoByMatricula(alunos, matriculaAlteracao);

                    if (aluno == null) {
                        System.out.println("Aluno não encontrado.");
                        break;
                    }

                    System.out.print("Número de Registro da atividade a ser alterada: ");
                    int numeroRegistroAlteracao = scanner.nextInt();
                    scanner.nextLine();

                    Atividade atividadeParaAlterar = findAtividadeByMatriculaENumeroRegistro(atividades, matriculaAlteracao, numeroRegistroAlteracao);

                    if (atividadeParaAlterar == null) {
                        System.out.println("Atividade não encontrada.");
                        break;
                    }

                    System.out.print("Novo status de aproveitamento (True/False): ");
                    boolean novoStatusAproveitamento = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Nova carga horária considerada: ");
                    int novaCargaHoraria = scanner.nextInt();
                    scanner.nextLine();

                    atividadeParaAlterar.setStatusAproveitamento(novoStatusAproveitamento);
                    atividadeParaAlterar.setCargaHorariaConsiderada(novaCargaHoraria);

                    if (novoStatusAproveitamento) {
                        aluno.setCargaHorariaTotal(aluno.getCargaHorariaTotal() + novaCargaHoraria);
                        aluno.setQuantidadeAtividades(aluno.getQuantidadeAtividades() + 1);
                    }
                    break;

                case 5:
                    System.out.println("-----------------------------------");
                    System.out.println("Carga horária total das atividades de todos os alunos:");
                    for (Aluno a : alunos) {
                        System.out.println("Nome: " + a.getNome_completo());
                        System.out.println("Matrícula: " + a.getMatricula());
                        System.out.println("Curso: " + a.getCurso());
                        System.out.println("Carga Horária Total: " + a.getCargaHorariaTotal() + " horas");
                        System.out.println("Quantidade de Atividades Complementares: " + a.getQuantidadeAtividades());
                    }
                    break;

                case 6:
                    System.out.println("-----------------------------------");
                    System.out.print("Matrícula do aluno: ");
                    int matriculaConsulta = scanner.nextInt();
                    scanner.nextLine();

                    aluno = findAlunoByMatricula(alunos, matriculaConsulta);

                    if (aluno == null) {
                        System.out.println("Aluno não encontrado.");
                    } else {
                        System.out.println("Nome: " + aluno.getNome_completo());
                        System.out.println("Matrícula: " + aluno.getMatricula());
                        System.out.println("Curso: " + aluno.getCurso());
                        System.out.println("Carga Horária Total das Atividades: " + aluno.getCargaHorariaTotal() + " horas");
                        System.out.println("Quantidade de Atividades Complementares: " + aluno.getQuantidadeAtividades());
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    private static Aluno findAlunoByMatricula(List<Aluno> alunos, int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        return null;
    }

    private static Atividade findAtividadeByMatriculaENumeroRegistro(List<Atividade> atividades, int matricula, int numeroRegistro) {
        for (Atividade atividade : atividades) {
            if (atividade.getMatricula() == matricula && atividade.getNumeroRegistro() == numeroRegistro) {
                return atividade;
            }
        }
        return null;
    }
    private static Aluno findAlunoByNome(List<Aluno> alunos, String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome_completo().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }
}
