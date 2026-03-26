
package exercicio17;


public class Exercicio17 {

    public static void main(String[] args) {
         ItemBiblioteca i1 = new Livro("Java Básico", "001", true);
        ItemBiblioteca i2 = new Revista("Tech Today", "002", true);
        ItemBiblioteca i3 = new Jornal("Diário News", "003", true);
        ItemBiblioteca i4 = new DVD("Matrix", "004", true);

        i1.emprestar();
        i2.emprestar();
        i3.emprestar();
        i4.emprestar();

        i1.devolver();
        i2.devolver();
        i4.devolver();
    }
    
}
