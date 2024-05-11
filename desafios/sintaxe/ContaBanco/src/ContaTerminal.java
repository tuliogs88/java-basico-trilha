import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo");
        String nomeCliente = sc.next();

        System.out.println("Digite sua agência");
        String agencia = sc.next();

        System.out.println("Digite seu número de conta");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o saldo inicial do cliente");
        double saldo = sc.nextDouble();

        if(saldo > 100.00){
            System.out.println("Por favor, corrija o valor inicial(O valor é de 100.00)");
            
            System.out.println("Digite o saldo inicial do cliente");
            saldo = sc.nextDouble();
        } else {
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
            ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        }
    }
}
