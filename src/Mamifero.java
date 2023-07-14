public abstract class Mamifero {
    protected String nome;
    protected double vida;

    //construtor mamifero
    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    //metodos
    public abstract void emitirSom();

    public void mostraInfo(){
        System.out.println("Dados da classe Mamifero");
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
    }

}
