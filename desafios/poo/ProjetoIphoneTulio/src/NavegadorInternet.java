public class NavegadorInternet extends Iphone{
    public void iniciarAplicativo(){
        System.out.println("Iniciando navegador internet");
        exibirPagina(null);
        adicionarNovaAba();
        atualizarPagina();
    }

    public void exibirPagina(String url){
        sinalRedeInternet();
        url = "site.com.br";
        System.out.println("O site " + url + " está aberto");
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina(){
        System.out.println("Pagina atualizada");
    }

    private void sinalRedeInternet(){
        System.out.println("Sinal Disponivel");
    }
}
