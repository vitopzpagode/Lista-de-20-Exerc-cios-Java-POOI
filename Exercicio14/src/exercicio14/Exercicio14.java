
package exercicio14;

public class Exercicio14 {

    public static void main(String[] args) {
  Midia m1 = new Musica("Chatão", 3.5, "Mc Lele JP");
        Midia m2 = new Filme("Vingadores", 2.5, "Marvel");
        Midia m3 = new Podcast("Podpah", 1.8, "Flow");
        Midia m4 = new Audiolivro("Pequeno Príncipe", 6.0, "Antoine de Saint-Exupéry");

        m1.reproduzir();
        m2.reproduzir();
        m3.reproduzir();
        m4.reproduzir();
    }
    
}
