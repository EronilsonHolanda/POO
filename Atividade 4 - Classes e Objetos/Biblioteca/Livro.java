public class Livro {
    private String titulo;
    private String autores;
    private int ano;
    private int edicao;
    private String editora;

    public Livro(){

    }

    public Livro(String titulo, String autores, int ano, int edicao, String editora) {
        this.titulo = titulo;
        this.autores = autores;
        this.ano = ano;
        this.edicao = edicao;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}