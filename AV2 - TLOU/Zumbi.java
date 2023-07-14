public class Zumbi extends Personagem implements Lutar, Infectar{
    //Atributos
    private int diasInfeccao;
    private boolean cego;

    //metodos
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Dias infectado: "+this.diasInfeccao);
        System.out.println("Cego? "+this.cego);
        // Lógica para determinar que tipo de zumbi é
        if (diasInfeccao >=2 && diasInfeccao <=14){
            System.out.println("O zumbi é um corredor");
        } else if(diasInfeccao >14 && diasInfeccao<=365){
            System.out.println("O zumbi é um perseguidor");
        } else {
            System.out.println("O zumbi é um estalador");
        }
    }

    public void transformacao(){
        // Lógica para determinar se o zumbi é cego ou nao
        if (diasInfeccao >=2 && diasInfeccao <=14){
            this.cego = false;
        } else if(diasInfeccao >14 && diasInfeccao<=365){
            this.cego = false;
        } else {
            this.cego = true;
        }
    }

    @Override
    public void infectou() {
        System.out.println("O zumbi mordeu e infectou um humano");

    }

    @Override
    public void atacar() {
        System.out.println("O zumbi atacou o humano");
    }

    @Override
    public void defender() {
        System.out.println("O zumbi se defendeu");
    }


    public void setDiasInfeccao(int diasInfeccao) {
        this.diasInfeccao = diasInfeccao;
    }

}
