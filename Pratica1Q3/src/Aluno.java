public class Aluno {
    private String nome;
    private String matricula;
    private double notaAV1;
    private double notaAV2;
    private double notaAE;
    private String curso;
    private String periodo;

    public Aluno(String nome, String matricula, double notaAV1, double notaAV2, String curso, String periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }

    public void alteraNotaAV1(double novaNotaAV1) {
        this.notaAV1 = novaNotaAV1;
    }

    public void alteraNotaAV2(double novaNotaAV2) {
        this.notaAV2 = novaNotaAV2;
    }

    public void alteraNotaAE(double novaNotaAE) {
        this.notaAE = novaNotaAE;
    }

    public double avaliarAluno() {
        double soma = notaAV1 + notaAV2;
        if (soma >= 60){
        }
        else{
        }
        return soma;
    }


    public void avaliarRecuperacao(){
        double media = (notaAV1 + notaAV2) + notaAE / 2;

        if(media >= 60)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNotaAV1() {
        return notaAV1;
    }

    public void setNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public double getNotaAV2() {
        return notaAV2;
    }

    public double getNotaAE() {
        return notaAE;
    }

    public void setNotaAE(double notaAE) {
        this.notaAE = notaAE;
    }

    public void setNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
