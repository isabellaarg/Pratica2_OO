public class EmpregoDaFaculdade {
    private String nome;
    private double salario;
    private  int horasAula;

    public EmpregoDaFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    double getGastos(){
        double bonus = horasAula * 40.00;
        this.salario = this.salario + bonus;
        return this.salario;
    }

    String getInfo(){
        return "nome:" + this.nome + " com salario R$ " + this.salario
                + ", salario com Bonus R$ " + getGastos();
    }
}
