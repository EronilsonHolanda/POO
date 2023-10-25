public class Animal {
    public String nome;
    public float comprimento;
    public int numeroPatas;
    public String cor;
    public String ambiente;
    public float velocidadeMédia;

    public Animal(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMédia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMédia = velocidadeMédia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidadeMédia() {
        return velocidadeMédia;
    }

    public void setVelocidadeMédia(float velocidadeMédia) {
        this.velocidadeMédia = velocidadeMédia;
    }

    protected void dados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ambiente: " + this.ambiente);
        System.out.println("Comprimento: " + this.comprimento);
        System.out.println("Número de Patas: " + this.numeroPatas);
        System.out.println("Velocidade Média: " + this.velocidadeMédia);
    }
}
