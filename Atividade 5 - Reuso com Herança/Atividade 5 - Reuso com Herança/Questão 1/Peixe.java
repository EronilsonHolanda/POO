public class Peixe extends Animal {
    public String caracteristica;
	public Peixe(String caracteristica, String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMédia) {
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMédia);
        this.caracteristica = caracteristica;
    }

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
    
    public void dados() {
        super.dados();
        System.out.println("Característica: " + this.caracteristica);
    }
}
