public abstract class Personagem {
    //Atributos
    private static int numPersonagens = 0; //quantidade personagens começa em 0
    private int vida;
    private int idPersonagem;

    //Construtor de personagem
    Personagem(){
        this.numPersonagens++;
        this.idPersonagem = numPersonagens;
    }

    //metodos
    public void mostraInfo(){
        System.out.println("-- DADOS DO PERSONAGEM --");
        System.out.println("ID: "+this.idPersonagem);
        System.out.println("Vida: " +this.vida);
    }

    //setters
    public void setVida(int vida) {
        this.vida = vida;
    }

    public static int getNumPersonagens() {
        return numPersonagens;
    }
}
