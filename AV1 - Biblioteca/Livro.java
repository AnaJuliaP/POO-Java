public class Livro {
    //Atributos do livro
    String titulo;
    String genLiterario;
    int qtdFolhas;
    String editora;

    //Composição
    Autor autor;

    //construtor livros
    public Livro(String titulo, String genLiterario, int qtdFolhas, String editora, Autor autor) {
        this.titulo = titulo;
        this.genLiterario = genLiterario;
        this.qtdFolhas = qtdFolhas;
        this.editora = editora;
        this.autor = autor;
    }

    //metodo
    void mostraInfos(){
        System.out.println("O titulo do livro é: "+this.titulo);
        System.out.println("O gênero do livro é: "+this.genLiterario);
        System.out.println("A quantidade de folhas do livro é: "+this.qtdFolhas);
        System.out.println("A editora do livro é: "+this.editora);
        autor.mostraInfos();
    }
}
