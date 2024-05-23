import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner info = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro valor");
        int parametroUm = info.nextInt();

        System.out.println("Digite o segundo valor");
        int parametroDois = info.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (interacaoInvalidaException exception) {
            throw new interacaoInvalidaException();
        }
    
    }

    static void contar(int parametroUm, int parametroDois) throws interacaoInvalidaException{
        if(parametroUm > parametroDois){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        //realizar o for para imprimir os números com base na variável contagem
        for(int inicio = parametroUm; inicio <= parametroDois; inicio++){
            System.out.println("Imprimindo o número " + inicio);
        }
    }
}
