public class Atividade {
    public String nome_aluno;
    public int matricula;
    public int numeroRegistro;
    public int grupoAtividade;
    public String descricaoAtividade;
    public boolean statusAproveitamento;
    public int cargaHorariaConsiderada;

    public Atividade(String nome_aluno, int matricula, int numeroRegistro, int grupoAtividade,
        String descricaoAtividade, boolean statusAproveitamento, int cargaHorariaConsiderada) {
        this.nome_aluno = nome_aluno;
        this.matricula = matricula;
        this.numeroRegistro = numeroRegistro;
        this.grupoAtividade = grupoAtividade;
        this.descricaoAtividade = descricaoAtividade;
        this.statusAproveitamento = statusAproveitamento;
        this.cargaHorariaConsiderada = cargaHorariaConsiderada;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public int getGrupoAtividade() {
        return grupoAtividade;
    }

    public void setGrupoAtividade(int grupoAtividade) {
        this.grupoAtividade = grupoAtividade;
    }

    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }

    public void setDescricaoAtividade(String descricaoAtividade) {
        this.descricaoAtividade = descricaoAtividade;
    }

    public boolean isStatusAproveitamento() {
        return statusAproveitamento;
    }

    public void setStatusAproveitamento(boolean statusAproveitamento) {
        this.statusAproveitamento = statusAproveitamento;
    }

    public int getCargaHorariaConsiderada() {
        return cargaHorariaConsiderada;
    }

    public void setCargaHorariaConsiderada(int cargaHorariaConsiderada) {
        this.cargaHorariaConsiderada = cargaHorariaConsiderada;
    }
    
}
