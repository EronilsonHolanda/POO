public class Mamifero extends Animal {
    public String alimento;
    public Mamifero(String alimento, String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMédia) {
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMédia);
        this.alimento = alimento;
    }

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
    
    public void dados() {
        super.dados();
        System.out.println("Alimento: " + this.alimento);
    }
}