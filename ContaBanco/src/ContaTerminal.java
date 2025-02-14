import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome completo");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o número da sua Agência");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta");
        int numero = sc.nextInt();

        System.out.println("Digite seu saldo");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ",conta " + numero + " e seu saldo " + saldo + " ja esta disponível para saque!");

        sc.close();
    }
}
