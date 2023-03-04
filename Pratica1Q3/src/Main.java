import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Ingresse o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Ingresse a matricula: ");
        String matricula = sc.nextLine();
        System.out.println("Ingresse a nota da AV1: ");
        double notaAV1 = sc.nextDouble();
        System.out.println("Ingresse a nota da AV2: ");
        double notaAV2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresse o curso: ");
        String curso = sc.nextLine();
        System.out.println("Ingresse o periodo: ");
        String periodo = sc.nextLine();

        Aluno al = new Aluno(nome, matricula, notaAV1, notaAV2, curso, periodo);

        // System.out.println("1. Para avaliar aluno");
        //System.out.println("2. Para avaliar recuperação");
        // int n = sc.nextInt();

        System.out.println("Deseja alterar as notas do aluno? s/n ");
        char escolha = sc.next().charAt(0);

        switch (escolha){
            case 's':
                System.out.println("Digite a nota AV1");
                notaAV1 = sc.nextDouble();
                System.out.println("Digite a nota AV2");
                notaAV2 = sc.nextDouble();
                break;
            case 'n':
                System.out.println("Avalie as notas ingressadas do aluno");
                break;
            default:
                System.out.println("Escolha invalida");
        }

        System.out.println("-------Avaliar aluno-------");

        System.out.println("Aluno: " + al.getNome() + "\nCurso: " + al.getCurso() + "\nPeriodo: " + al.getPeriodo() + "\nNota: " + al.avaliarAluno());
        if(al.avaliarAluno() >= 60){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Recuperação");
            System.out.println("Ingresse a nota da AE: ");
            double notaAE = sc.nextDouble();
            al.avaliarRecuperacao();
        }
    }
}