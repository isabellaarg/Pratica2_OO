import java.util.Scanner;

public class Transacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Compra \n2.Venda ");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("Ingresse o modelo do carro");
                String modelo = sc.nextLine();
                System.out.println("Ingresse a marca do carro");
                String marca = sc.nextLine();
                System.out.println("Ingresse o ano do carro");
                int ano = sc.nextInt();
                System.out.println("Ingresse o valor do carro");
                double valor = sc.nextDouble();
            case 2:
                System.out.println("Ingresse o modelo do carro");
                modelo = sc.nextLine();
                System.out.println("Ingresse a marca do carro");
                marca = sc.nextLine();
                System.out.println("Ingresse o ano do carro");
                ano = sc.nextInt();
                System.out.println("Ingresse o valor do carro");
                valor = sc.nextDouble();

        }

    }
}
