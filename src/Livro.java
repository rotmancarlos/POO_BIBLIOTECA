class Livro {
    private String isbn;
    private String nome;
    private String genero;
    private String autor;

    public Livro(String isbn,String nome,String genero,String autor) {
        this.isbn = isbn;
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;


    }

    public void exibirInformacoes() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Autor: " + autor);
        System.out.println();

    }

    public void registrarLivroApenasIsbn(String isbn) {
        System.out.println("O Livro foi registrado com o ISBN" + isbn);
    }

    public  void registrarLivroIsbnNome(String isbn, String nome) {
        System.out.println("O livro foi registrado com o ISBN " + isbn + " e o nome " + nome);

    }

    public void  registrarLivroIsbnNomeGenero(String isbn, String nome, String genero) {
        System.out.println("O livro foi registrado com o ISBN " + isbn + ", o nome " + nome + " e o gênero " + genero);


    }

    public void registrarLivroTodosAtributos(String isbn, String nome, String genero, String autor) {
        System.out.println("O livro foi registrado com todos os atributos");
        Livro livro = new Livro(isbn,nome,genero,autor);
        livro.exibirInformacoes();
    }


}
