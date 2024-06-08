public class ReprodutorMusical extends Iphone{
    public void iniciarAplicativo(){
        System.out.println("Iniciando aplicativo de música");
        selecionarMusica(null);
        tocar();
        pausar();
    }

    public void tocar(){
        System.out.println("Tocando música");
    }

    public void pausar(){
        System.out.println("Pausado a música");
    }

    public void selecionarMusica(String musica){
        musica = "musica.mp3";
        System.out.println("Selecionando música: " + musica);
    }
}
