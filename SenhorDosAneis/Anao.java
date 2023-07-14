public class Anao extends Habitante implements Mineracao{
    //Atributos Anao
    private float altura;
    private String reino;

    //metodos
    @Override
    public void mostraInfo(){
        System.out.println("INFOS DO ANAO");
        super.mostraInfo(); // Chamando o método infos da classe mãe
        //adicionando os atributos do anao
        System.out.println("Altura: "+this.altura);
        System.out.println("Reino: "+this.reino);
    }

    @Override
    public void atacar(){
        System.out.println("Anão atacou");
        super.atacar();
    }

    @Override
    public void minerar() {
        System.out.println("O Anao esta mineirando");
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

}
