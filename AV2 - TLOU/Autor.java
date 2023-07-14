public class Autor {
    //Atributos do autor
    String nome; // nome do autor
    int anoNascimento; // ano de nascimento do autor
    String profissao; // profissao do autor


    //metodos da classe autor
    void mostraInfos(){ // ou public void mostraInfos //this é um ponteiro, referenciando a nossa classe
        System.out.println("---INFOS DO AUTOR---");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Ano de nascimento: "+ this.anoNascimento);
        System.out.println("Profissão: "+ this.profissao);
    }
}
