import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        //Atribuindo as caracteristicas
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a cor, modelo, velocidade maxima e atual do carro 1:  ");
        carro1.cor = entrada.next();
        carro1.marca = entrada.next();
        carro1.velocidadeMax = entrada.nextDouble();
        carro1.velocidadeAtual = entrada.nextDouble();

        System.out.println("Insira a cor, modelo, velocidade maxima e atual do carro 2:  ");
        carro2.cor = entrada.next();
        carro2.marca = entrada.next();
        carro2.velocidadeMax = entrada.nextDouble();
        carro2.velocidadeAtual = entrada.nextDouble();

        System.out.println("Insira a potencia e o tipo de motor do carro 1: ");
        carro1.motor.potencia = entrada.nextInt();
        carro1.motor.tipoMotor = entrada.next();

        System.out.println("Insira a potencia e o tipo de motor do carro 2: ");
        carro2.motor.potencia = entrada.nextInt();
        carro2.motor.tipoMotor = entrada.next();

        entrada.close();

        //Chamando os metodos
        carro1.ligar();
        carro1.acelerar();
        carro1.mostraInfor();
        carro1.motor.mostraInfos();
        System.out.println();
        carro2.ligar();
        carro2.acelerar();
        carro2.mostraInfor();
        carro2.motor.mostraInfos();
    }
}
