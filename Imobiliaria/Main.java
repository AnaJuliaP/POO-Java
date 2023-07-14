import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner sc = new Scanner(System.in);

        // instanciando a imobiliaria
        Imobiliaria imobiliaria = new Imobiliaria("MeTiraDaRua", "555","Santa Rita");

        boolean flag = true; // flag de controle do while

        while (flag){
            System.out.println("Bem vindo a imobiliaria " + imobiliaria.nome);
            System.out.println("1 - Cadastra um apartamento novo");
            System.out.println("2 - Ajuste aluguel do apartamento");
            System.out.println("3 - Area do apartamento");
            System.out.println("4 - Informações imobilida ou apartamentos cadastrados");
            System.out.println("5 - Sair do sistema");

            // atribuindo a entrada de dados
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    //Criando cadastro do apartamento
                    System.out.println("Endereço do apartamento: ");
                    String endereco = sc.nextLine();
                    System.out.println("Quantidade de quartos? ");
                    int numQuartos = sc.nextInt();
                    System.out.println("Area do apartamento? ");
                    double area = sc.nextDouble();
                    System.out.println("Valor do aluguel? ");
                    double aluguel = sc.nextDouble();

                    // criando um apartamento
                    Apartamento apto = new Apartamento(endereco, numQuartos, area, aluguel);

                    imobiliaria.addApartamento(apto);
                    break;

                case 2:
                    imobiliaria.ajustaAluguel();
                    break;

                case 3:
                    imobiliaria.mediaArea();
                    break;

                case 4:
                    imobiliaria.mostraInfo();
                    break;

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
            }
        }
        sc.close(); // encerrando entrada de dados
    }
}
