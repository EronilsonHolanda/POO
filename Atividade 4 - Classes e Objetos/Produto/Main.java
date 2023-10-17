package Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço de custo do produto: ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Digite o preço de venda do produto: ");
        double precoVenda = scanner.nextDouble();

        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPrecoCusto(precoCusto);
        produto.setPrecoVenda(precoVenda);

        double margemLucro = produto.calcularMargemLucro();
        double margemLucroPorcentagem = produto.getMargemLucroPorcentagem();

        System.out.println("Margem de Lucro: R$" + margemLucro);
        System.out.println("Margem de Lucro (%): " + margemLucroPorcentagem + "%");

        scanner.close();
    }
}
