public class Humano extends Personagem implements Aprimorar, Lutar {
    //Atributos
    private String nome;
    private int idade;
    private boolean vagalume;
    private double energia;
    private double distanciaEscuta;

    Arma arma; // agregação se o humano tem ou não uma arma

    //metodos
    public void mostraInfo(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("Vagalume: "+this.vagalume);
        System.out.println("Energina: "+this.energia);
        System.out.println("Distancia escuta: " +this.distanciaEscuta);
        super.mostraInfo();
    }

    public void addArma(Arma arma){
        this.arma = arma; // A arma desta instancia receba uma nova arma
    }

    @Override
    public void modificarArma() {
        int varAux = arma.getForca(); // Var auxiliar para atualizar valor da forca
        this.arma.setForca(varAux+5); // Settando +5 na arma
        this.arma.mostraInfo(); // Mostrando novas infos da arm
    }

    @Override
    public void modificarHabilidade(String tipoHabilidade, int qtdPilulas) {
        if (qtdPilulas <= 0){ // Caso numero inserido seja negativo ou zero
            System.out.println("Quantidade de pilulas invalidas, favor informar um valor maior que 0");
        } else {
            if (qtdPilulas >= 1 && qtdPilulas <= 10){ // De 0 a 10 pilulas
                if(tipoHabilidade.equalsIgnoreCase("Energia")){
                    energia = (double) (energia+(energia*0.02)); // Modificando energia atual
                    System.out.println("Energia modificada: "+this.energia);
                } else if(tipoHabilidade.equalsIgnoreCase("Escuta")){
                    distanciaEscuta = distanciaEscuta + 0.2; // Modificando distancia de escuta
                    System.out.println("Distancia de escuta modificada: "+this.energia);
                }
            } else if(qtdPilulas >10 && qtdPilulas <= 15){ // de 10 a 15 piluas
                if(tipoHabilidade.equalsIgnoreCase("Energia")){
                    energia = (double) (energia+(energia*0.04)); // Modificando energia atual
                    System.out.println("Energia modificada: "+this.energia);
                } else if(tipoHabilidade.equalsIgnoreCase("Escuta")){
                    distanciaEscuta = distanciaEscuta + 0.5; // Modificando distancia de escuta
                    System.out.println("Energia modificada: "+this.energia);
                }
            }
        }
    }

    @Override
    public void atacar() {
        System.out.println("O "+this.nome+" esta atacando com a arma de "+arma.getTipoArma());
        this.arma.mostraInfo();
    }

    @Override
    public void defender() {
        System.out.println("O "+this.nome+"Esta se defendendo com: "+arma.getTipoArma());
        this.arma.mostraInfo();
    }

    //gettes e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVagalume(boolean vagalume) {
        this.vagalume = vagalume;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public void setDistanciaEscuta(double distanciaEscuta) {
        this.distanciaEscuta = distanciaEscuta;
    }
}
