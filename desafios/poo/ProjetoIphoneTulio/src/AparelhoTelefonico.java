public class AparelhoTelefonico extends Iphone{
    public void iniciarAplicativo(){
        System.out.println("Iniciando aplicativo");
        ligar(null);
        atender();
        iniciarCorreioVoz();
    }

    public void ligar(String numero){
        sinalRedeOperadora();
        numero = "1191234-5678";
        System.out.println("Ligando para " + numero);
    }

    public void atender(){
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

    private void sinalRedeOperadora(){
        System.out.println("Sinal da operadora disponivel");
    }
}
