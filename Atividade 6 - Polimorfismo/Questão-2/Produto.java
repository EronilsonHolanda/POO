class Produto {
    private String nomeloja;
    private double preco;
    private String descricao;

    public Produto(String nomeloja, double preco) {
        this.nomeloja = nomeloja;
        this.preco = preco;
        this.descricao = "Produto de informática";
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNomeloja() {
        return nomeloja;
    }

    public double getPreco() {
        return preco;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
