package Produto;

class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        if (precoVenda >= precoCusto) {
            this.precoVenda = precoVenda;
        } else {
            System.out.println("O preço de venda não pode ser inferior ao preço de custo.");
        }
    }

    public double calcularMargemLucro() {
        margemLucro = precoVenda - precoCusto;
        return margemLucro;
    }

    public double getMargemLucroPorcentagem() {
        if (precoCusto > 0) {
            return (calcularMargemLucro() / precoCusto) * 100;
        }
        return 0.0;
    }
}
