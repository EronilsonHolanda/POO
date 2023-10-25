public class TestarAnimais {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero("Ração", "Gato", 46, 4, "Preto com Branco", "Casa", 50.0f);
        Peixe peixe = new Peixe("Peixe Gigante", "Peixe lua", 1.8f, 0, "Azul", "Mar", 3.2f);

        System.out.println("Dados do Mamífero:");
        mamifero.dados();

        System.out.println("\nDados do Peixe:");
        peixe.dados();
    }
}
