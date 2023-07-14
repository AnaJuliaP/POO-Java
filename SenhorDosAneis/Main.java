public class Main {
    public static void main(String[] args) {
        //Criando a terra media
        TerraMedia terra = new TerraMedia();

        //criando armas para os herois
        Arma arma1 = new Arma();
        arma1.setNomeArma("Arco");
        arma1.setMagica(true);

        Arma arma2 = new Arma();
        arma2.setNomeArma("Espada");
        arma2.setMagica(false);

        Arma arma3 = new Arma();
        arma3.setNomeArma("Martelo");
        arma3.setMagica(false);

        //criando herois
        Anao anao=new Anao();
        anao.setNome("Nome de anão");
        anao.setEnergia(100);
        anao.setIdade(40);
        anao.setAltura(120);
        anao.setReino("Reindo do anão");
        anao.arma=arma3;

        Mago mago=new Mago();
        mago.setNome("Nome de mago");
        mago.setEnergia(1000);
        mago.setIdade(25);
        mago.setCor("Cor do mago");
        mago.arma=arma2;

        Elfo elfo=new Elfo();
        elfo.setNome("Nome de elfo");
        elfo.setEnergia(800);
        elfo.setIdade(32);
        elfo.setTribo("Tribo do elfo");
        elfo.arma=arma1;

        //adicionando os herois na terra media
        terra.addHabitante(anao);
        terra.addHabitante(elfo);
        terra.addHabitante(mago);

        // Mostrando as infos dos habitantes
        terra.listarHabitantes();
    }
}
