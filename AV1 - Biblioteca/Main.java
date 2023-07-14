import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner sc = new Scanner(System.in);

        //instanciando a classe Estante
        Estante estante = new Estante(1, 'A');

        boolean flag = true; //flag de controle do while

        while (flag){
            System.out.println("Ola! Bem vindo a Estante"+estante.idEstante+ "----");
            System.out.println("1 - Adicionar livros a estante");
            System.out.println("2 - Mostrar informações da estante de livros");
            System.out.println("3 - Apresentar porcentagem de cada genero");
            System.out.println("4 - Mostrar livro com mais paginas e livro com menos");
            System.out.println("5 - Sair do sistema");

            //atribuindo a entra de dados
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    //Adicionando um nome livro
                    System.out.println("Título do livro: ");
                    String titulo = sc.nextLine();

                    System.out.println("Gênero do livro: ");
                    String genLiterario = sc.nextLine();

                    System.out.println("Quantidade de folhas do livro:  ");
                    int qtdFolhas = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Editora do livro: ");
                    String editora = sc.nextLine();

                    System.out.println("Nome Autor: ");
                    String name = sc.nextLine();

                    System.out.println("Nascimento autor: ");
                    int nasc = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Profisao do autor: ");
                    String prof = sc.nextLine();

                    //criando um autor
                    Autor autor = new Autor(name,nasc,prof);

                    //Adicionando um livro
                    Livro livro = new Livro(titulo, genLiterario, qtdFolhas, editora, autor);

                    estante.addLivros(livro);
                    break;

                case 2:
                    estante.mostraInfos();
                    break;

                case 3:
                    estante.porcentagemGen();
                    break;

                case 4:
                    estante.livroMaisEMenosPag();
                    break;

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }
        }
        sc.close(); //encerrando a entrada de dados


    }
}
