public class Mago extends Habitante implements Cura, Feitico{
    //Atributo
    private String cor;

    // Métodos reescritos
    @Override
    public void mostraInfo(){
        System.out.println("-- INFORMAÇÕES DO MAGO --");
        super.mostraInfo();
        // atributos
        System.out.println("Cor: "+this.cor);
    }

    @Override
    public void atacar(){
        System.out.println("Mago atacou");
        super.atacar();
    }

    @Override
    public void curar() {
        float energia=this.getEnergia();
        energia= (float) (energia+(energia*0.15));
        this.setEnergia(energia);
        System.out.println("O herói foi curado");
        System.out.println("Energia após a cura: "+this.getEnergia());
    }

    @Override
    public void lancarFeitico() {
        float energia=this.getEnergia();
        energia= (float)(energia-(energia*0.1));
        this.setEnergia(energia);
        System.out.println("O mago lançou um feitiço!");
        System.out.println("Sua energia atual: "+this.getEnergia());

    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
