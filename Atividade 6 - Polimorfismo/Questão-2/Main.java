import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList<>();

        Mouse mouse1 = new Mouse("Loja A", 30, "Mouse Optico, Saída USB. 1.600 dpi");
        Mouse mouse2 = new Mouse("Loja B", 20, "Mouse Sem Fio, Bluetooth. 2.000 dpi");

        carrinho.add(mouse1);
        carrinho.add(mouse2);

        Livro livro1 = new Livro("LivrosOnline", 50, "Autor A");
        Livro livro2 = new Livro("BooksRUs", 40, "Autor B");

        carrinho.add(livro1);
        carrinho.add(livro2);

        for (Produto produto : carrinho) {
            System.out.println("Loja: " + produto.getNomeloja());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Descricao: " + produto.getDescricao());
            System.out.println("--------------------------");
        }
    }
}
