public class Usuario {
    public static void main(String[] args) {
        Iphone app = null;
        String opcao = "at";

        if(opcao.equals("rm"))
            app = new ReprodutorMusical();
        else if(opcao.equals("at"))
            app = new AparelhoTelefonico();
        else if(opcao.equals("net"))
            app = new NavegadorInternet();

        app.iniciarAplicativo();
    }
    
}
