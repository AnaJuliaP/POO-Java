public class Carro {
    String cor;
    String marca;
    double velocidadeMax;
    double velocidadeAtual;
    Motor motor;

    Carro(){
        this.motor = new Motor();
    }

    void ligar(){
        System.out.println("Carro ligado");
    }

    void acelerar(){
        System.out.println("O carro esta acelerando");
    }

    void mostraInfor(){
        System.out.println("A cor do carro e: "+cor);
        System.out.println("A marca do carro e: "+marca);
        System.out.println("A velocidade maxima do carro e: "+velocidadeMax);
        System.out.println("A velocidade atual do carro e: "+velocidadeAtual);

    }
}
