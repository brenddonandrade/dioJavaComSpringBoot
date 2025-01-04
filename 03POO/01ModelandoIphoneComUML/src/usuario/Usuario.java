package usuario;

import reprodutorDeMusica.ReprodutorMusical;
import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import aparelhoCelular.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // implmentacao do reprodutor
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("She's a betty.");

        // implementacao do aparelho telefonico
        iphone.ligar("24999887766");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // implementacao do navegador de internet
        iphone.exibirPagina("google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
