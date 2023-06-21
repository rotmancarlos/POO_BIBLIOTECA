// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("123456789", "Macunaíma", "Ficção", "Mario de Andrade");
        livro1.exibirInformacoes();

        livro1.registrarLivroApenasIsbn("987654321");

        livro1.registrarLivroIsbnNome("987654321", "O Sítio do Pica-pau Amarelo");

        livro1.registrarLivroIsbnNomeGenero("987654321", "Grande Sertão: Veredas", "Ficção");

        livro1.registrarLivroTodosAtributos("135792468", "Iracema", "Romance", "José de Alencar");

    }
}