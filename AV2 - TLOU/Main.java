public class Main {
    public static void main(String[] args) {
        //Criando a cidade
        Cidade cidade = new Cidade();

        //Criando humano e zumbi
        Humano humano1 = new Humano();
        humano1.setNome("Jose");
        humano1.setIdade(25);
        humano1.setVagalume(false);
        humano1.setDistanciaEscuta(5.5);
        humano1.setVida(5);
        humano1.setEnergia(100);

        //criando um zumbi
        Zumbi zumbi1 = new Zumbi();
        zumbi1.setDiasInfeccao(12);
        zumbi1.setVida(5);

        //criando uma arma
        Arma arma = new Arma();
        arma.setForca(5);
        arma.setTipoArma("Arma vermelha");

        //chamando metodos do humano
        humano1.addArma(arma);
        humano1.modificarHabilidade("Energia", 14);

        //adicionando na cidade
        cidade.adicionarPersonagens(humano1);
        cidade.adicionarPersonagens(zumbi1);

        //mostrando as informações dos personagens
        cidade.listarPersonagem();
    }
}
