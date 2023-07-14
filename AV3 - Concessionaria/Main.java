import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criando um arquivo
        Arquivo arq = new Arquivo();
        //criando um veiculo
        Veiculo veiculo = new Veiculo();
        //entrada de dados
        Scanner sc=new Scanner(System.in);
        //flag de controle do while
        boolean flag = true;

        while (flag){
            // ArrayList auxiliar com os veiculos - retorno a partir do método de leitura
            ArrayList<Veiculo> veiculos=arq.ler();

            System.out.println("BEM VINDO AO MENU");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Informações dos veículos");
            System.out.println("3 - Ordenar os veículos em ordem decrescente de ano");
            System.out.println("4 - Mostrar a quantidade de veículo de cada marca disponivel no estoque");
            System.out.println("5 -  SAIR");
            System.out.println("Entre com a sua opção: ");

            int opcao = sc.nextInt(); // entrada de opção do usuario
            sc.nextLine(); // limpando o buffer

            switch (opcao){
                case 1:
                    System.out.println("ADICIONANDO UM VEÍCULO");

                    try {
                        System.out.println("Marca: ");
                        veiculo.setMarca(sc.nextLine());
                        //verificando o digitado pelo usuario
                        if (!(veiculo.getMarca().equalsIgnoreCase("Rolls-Royce")
                                || veiculo.getMarca().equalsIgnoreCase("Bentley"))){
                            throw new ValorInvalidoException("SELECIONE UMA DAS DUAS MARCAS\n Rolls-Royce - Bentley"); // Lançando a exceção
                        }

                        System.out.println("Modelo: ");
                        veiculo.setModelo(sc.nextLine());

                        System.out.println("Ano do carro: ");
                        veiculo.setAno(sc.nextInt());
                        //verificando o ano do veiculo
                        if (veiculo.getAno() < 1960 || veiculo.getAno() > 2024){
                            throw new ValorInvalidoException("ANO INVÁLIDO");
                        }
                        System.out.println("KM Rodado: ");
                        veiculo.setKmRodados(sc.nextDouble());
                        //verificando o valor de km rodado
                        if (veiculo.getKmRodados() < 0){
                            throw new ValorInvalidoException("KM RODADO INVÁLIDO");
                        }

                        System.out.println("Potencia do motor: ");
                        veiculo.motor.setPotencia(sc.nextDouble());
                        if(veiculo.motor.getPotencia() < 0 || veiculo.motor.getPotencia() == 0){
                            throw new ValorInvalidoException("POTÊNCIA INVÁLIDA");
                        }

                        System.out.println("Numero de cilindros: ");
                        veiculo.motor.setNumCilindros(sc.nextInt());
                        if(veiculo.motor.getNumCilindros() < 0 || veiculo.motor.getNumCilindros() == 0){
                            throw new ValorInvalidoException("NÚMERO DE CILINDROS INVÁLIDO");
                        }
                    }catch (ValorInvalidoException valor){
                        System.out.println(valor);
                        break; // Para a execução e não permite o cadastro do livro
                    }
                    arq.escrever(veiculo); //salvando no arquivo o veiculo
                    break;

                case 2:
                    //apresentando as informações do veiculo
                    for (int i = 0; i < veiculos.size(); i++) {
                        veiculos.get(i).mostraInfo();
                    }
                    break;

                case 3:
                    Collections.sort(veiculos); // Ordenando os veiculos em ordem crescente
                    Collections.reverse(veiculos); // Revertendo a ordem de ordenação, logo em ordem decrescente
                    // Mostrando as informações do veiculo em ordem decrescente
                    for(int i=0;i<veiculos.size();i++){
                        veiculos.get(i).mostraInfo();
                    }
                    break;

                case 4:
                    int AuxRolls = 0;
                    int AuxBen = 0;
                    // Percorrendo veiculos
                    for (int i = 0; i < veiculos.size(); i++) {
                        if(veiculos.get(i).getMarca().equals("Rolls-Royce")){
                            AuxRolls++;
                        } else {
                            AuxBen++;
                        }
                    }
                    // Mostrando a quantidade
                    System.out.println("Veiculos Rolls-Royce presentes no estoque: "+AuxRolls);
                    System.out.println("Veiculos Bentley presentes no estoque: "+AuxBen);
                    break;

                case 5:
                    flag=false;
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA !!!!");
                    break;
            }

        }
        sc.close(); //encerrando a entrada de dados
    }
}
