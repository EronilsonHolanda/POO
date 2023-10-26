public class Aluno {
    public String nome_completo;
    public String curso;
    public int matricula;
    public int cargaHorariaTotal;
    public int quantidadeAtividades;

    public Aluno(String nome_completo, String curso, int matricula, int cargaHorariaTotal, int quantidadeAtividades) {
        this.nome_completo = nome_completo;
        this.curso = curso;
        this.matricula = matricula;
        this.cargaHorariaTotal = cargaHorariaTotal;
        this.quantidadeAtividades = quantidadeAtividades;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCargaHorariaTotal() {
        return cargaHorariaTotal;
    }

    public void setCargaHorariaTotal(int cargaHorariaTotal) {
        this.cargaHorariaTotal = cargaHorariaTotal;
    }

    public int getQuantidadeAtividades() {
        return quantidadeAtividades;
    }

    public void setQuantidadeAtividades(int quantidadeAtividades) {
        this.quantidadeAtividades = quantidadeAtividades;
    }  
}
