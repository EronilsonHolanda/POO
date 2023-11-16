public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 5000);
        funcionario1.aumentoSalarial(5000);

        Assistente assistente1 = new Assistente("Maria", 6000, 123);
        assistente1.aumentoSalarial(6000);

        Tecnico tecnico1 = new Tecnico("Carlos", 7000, 456, 2000);

        Administrativo administrativo1 = new Administrativo("Ana", 8000, 789, "noite", 5000);

        funcionario1.exibeDados();
        System.out.println("Ganho Anual: " + funcionario1.ganhoAnual());
        System.out.println("------------------------");

        assistente1.exibeDados();
        System.out.println("Ganho Anual: " + assistente1.ganhoAnual());
        System.out.println("------------------------");

        tecnico1.exibeDados();
        System.out.println("Ganho Anual: " + tecnico1.ganhoAnual());
        System.out.println("------------------------");

        administrativo1.exibeDados();
        System.out.println("Ganho Anual: " + administrativo1.ganhoAnual());
    }
}