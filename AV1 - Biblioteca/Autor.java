public class Autor {
    //Atributos do autor
    String nome;
    int anoNascimento;
    String profissao;

    //construtor de autor


    public Autor(String nome, int anoNascimento, String profissao) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.profissao = profissao;
    }

    //metodos
    void mostraInfos(){
        System.out.println("O nome do autor e: "+ this.nome);
        System.out.println("O ano de nascimento e: "+ this.anoNascimento);
        System.out.println("A profissão do autor e: "+ this.profissao);
    }
}
