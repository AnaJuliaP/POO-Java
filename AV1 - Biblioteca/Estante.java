public class Estante {
    //Atributos
    int idEstante;
    char letra;

    //construtor estante
    public Estante(int idEstante, char letra) {
        this.idEstante = idEstante;
        this.letra = letra;
    }

    //array implicita
    Livro livros[] = new Livro[160];


    //metodos
    void addLivros(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                break;
            }
        }
    }


    // Declarando variaveis auxiliares de contagem para cada genero
    void porcentagemGen() {
        double Drama = 0; // conta
        double Suspense = 0; // conta
        double Outros = 0; // conta
        double totalLivros = 0;

        double ptgDrama = 0;
        double ptgSuspense = 0;
        double ptgOutros = 0;

        // Percorrendo array de livros
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                totalLivros++;
                if (livros[i].genLiterario.equalsIgnoreCase("drama")) {
                    Drama++;
                } else if (livros[i].genLiterario.equalsIgnoreCase("suspense")) {
                    Suspense++;
                } else {
                    Outros++;
                }
            }
        }
        // Lógica caso tente realzar alguma operação sem livro
        if(totalLivros == 0){
            System.out.println("NÃO NENHUM LIVRO CADASTRADO AINDA");

        } else {
            // Lógica para descobrir porcentagem de cada livro
            ptgSuspense = (Suspense/totalLivros)*100;

            ptgDrama = (Drama/totalLivros)*100;

            ptgOutros = (Outros/totalLivros)*100;

            // Mostrando porcentagens
            System.out.println("As porcentagem de cada gênero foram as seguintes: ");
            System.out.println("Suspense: "+ptgSuspense+"%");
            System.out.println("Drama: "+ptgDrama+"%");
            System.out.println("Outros: "+ptgOutros+"%");
        }

    }

        void livroMaisEMenosPag () {
            // Variaveis auxiliares
            int livroMais = 0;
            int livroMenos = 9999999;
            int isalvaMaior = 0;
            int isalvaMenor = 0;

            for (int i = 0; i < livros.length; i++) {
                if (livros[i] != null) {
                    if (livros[i].qtdFolhas > livroMais) {
                        livroMais = livros[i].qtdFolhas;
                        isalvaMaior = i;
                    }
                    if (livros[i].qtdFolhas < livroMenos) {
                        livroMenos = livros[i].qtdFolhas;
                        isalvaMenor = i;
                    }
                }
            }

            if(livroMais == 0){
                System.out.println("NÃO NENHUM LIVRO CADASTRADO AINDA");
            } else {
                // Apresentando menorLivro maiorLivro
                System.out.println("O livro com mais paginas é:");
                livros[isalvaMaior].mostraInfos();
                System.out.println();
                System.out.println("O livro com menos paginas é: ");
                livros[isalvaMenor].mostraInfos();
            }
        }

        void mostraInfos () {
            System.out.println("ID da estante: " + this.idEstante);
            System.out.println("A letra da estante é: " + this.letra);

            for (int i = 0; i < livros.length; i++) {
                if(livros[i] != null){
                    System.out.println("Titulo, gênero, quantidade de folhas e editora: ");
                    System.out.println(livros[i].titulo+" "+livros[i].genLiterario+" "+livros[i].qtdFolhas+" "+livros[i].editora);
                    System.out.println();
                }
            }
        }
    }




