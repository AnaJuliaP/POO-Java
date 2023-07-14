public class Livro {
    //Atributos do livro - exolicito
    String titulo; // titulo do livro
    String genLiterario; // genero literario do livro
    int qtdFolhas; // quantidade de paginas do livro
    String editora; // editora do livro

    //atributos do livro implicito
    Autor autor; // referencia para o meu autor

    //construtor da classe livro
    public Livro() {
        this.autor = new Autor(); // finalizada a composição entre livro e autor
    }

    //metodo da classe livro
    void mostraInfos(){
        System.out.println("----INFOS DO LIVRO----");
        System.out.println("Titulo  "+this.titulo);
        System.out.println("Gen. Literário  "+this.genLiterario);
        System.out.println("Quantidade de folhas   "+ this.qtdFolhas+ " folhas" );
        System.out.println("Editora "+ this.editora);

        //mostrando infos do autor
        autor.mostraInfos();
    }
}
