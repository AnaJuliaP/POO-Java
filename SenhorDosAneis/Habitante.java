public abstract class Habitante {
    //Atributos
    public static int contador = 0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;

    Arma arma; //agregação se o habitante pode ter ou não uma arma

    //Construtor de habitante
    Habitante(){
        this.contador++;
        this.id = contador;
    }

    //metodos
    public void atacar(){
        if (this.arma == null){
            System.out.println("Este heroi nao tem arma");
        }else{
            System.out.println("INFO ARMA");
            System.out.println("Nome: "+arma.getNomeArma());
            System.out.println("Magica: "+arma.isMagica());

            if (arma.isMagica()){
                System.out.println("Ataque com arma magica");
                this.energia = this.energia-20;
                System.out.println("Energia apos o ataque: "+this.energia);
            }else{
                System.out.println("Ataque com arma normal");
                this.energia = this.energia-10;
                System.out.println("Energia apos o ataque: "+this.energia);
            }

        }
    }

    public void mostraInfo(){
        System.out.println("ID: " +this.id);
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Energia: "+this.energia);

    }

    //Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }
}
