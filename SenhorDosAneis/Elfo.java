public class Elfo extends Habitante implements Cura{
    //Atributos
    private String tribo;

    //metodos
    public void viajar(){
        System.out.println("O elfo esta viajando");
    }

    @Override
    public void mostraInfo(){
        System.out.println("INFOS DO ELFO");
        super.mostraInfo(); // Chamando o método infos da classe mãe
        //adicionando os atributos do elfo
        System.out.println("Tribo: "+this.tribo);
    }

    @Override
    public void atacar(){
        System.out.println("Elfo esta atacando!!!");
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

    //stter da tribo
    public void setTribo(String tribo) {
        this.tribo = tribo;
    }


}
