package estabelecimento;

import equipamento.Musica.ReproduzirMusica;
import equipamento.Musica.navegador.NavegadorInternet;
import equipamento.Musica.telefone.AparelhoTelefonico;
import equipamentoIphone.EquipamentoIphone;

public class Fabrica {
        public static void main(String[] args) {
            EquipamentoIphone iphone = new EquipamentoIphone();
            ReproduzirMusica musica = (ReproduzirMusica) iphone;
            AparelhoTelefonico telefonico = (AparelhoTelefonico) iphone;
            NavegadorInternet internet = (NavegadorInternet) iphone;


            System.out.println("Musica");
            musica.selecionarMusica();
            musica.tocar();
            musica.pausar();
            System.out.println(" ‴(⁰O⁰)‴ ");
            System.out.println(" ");

            System.out.println("Telefone");
            telefonico.ligar();
            telefonico.atender();
            telefonico.iniciarCorreioVoz();
            System.out.println(" (✿◠‿◠) ");
            System.out.println(" ");

            System.out.println("Internet");
            internet.pagina();
            internet.adicionandoNovaPagina();
            internet.atualizaPagina();
            System.out.println(" (. ❛ ᴗ ❛.)  ");
        }
}
