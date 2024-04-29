import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e capturar os dados da conta bancária
        System.out.println("Por favor, insira os dados da sua conta bancária:");
        System.out.print("Número da conta: ");
        @SuppressWarnings("unused")
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Saldo: R$");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem de boas-vindas com os dados fornecidos
        System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " e seu saldo é R$" + saldo + " já disponível para saque!");

        scanner.close();
    }
}
