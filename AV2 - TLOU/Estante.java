public class Estante {
    //Atributos explicitos
    int idEstante; // id da estante
    char letra; // letra que identifica a estante

    //atributos implicitos
    Livro livros[] = new Livro[120]; // array de livros do moises

    //construtor classe estante
    public Estante(int idEstante, char letra) {
        this.idEstante = idEstante;
        this.letra = letra;
    }

    //metodos da estante
    //1. metodo para add livro na estante
    void addLivros(Livro livro) {
        //percorrendo o array de livros
        for (int i = 0; i < livros.length; i++) {
            //verificação se a posição esta vazia
            if (livros[i] == null) {
                livros[i] = livro; // add livro ao array
                break; // parando a sobreposição / sem o breack causa sobreposição
            }
        }
    }


    void porcentagemGen() {
        // criando variaveis locais para contar a quantidade de livro de cada genereno
        int contraDrama = 0; // variaveis de contagem de livros de drama
        int contraSuspense = 0; // variaveis de contagem de livros de suspense
        int contaOutros = 0; // variaveis de contagem de livros outros generos
        int qtdLivrosEstante = 0; //Armazena a quantidade de livros

        //percorrer o array de livros
        for (int i = 0; i < livros.length; i++) {
            //verificando se existe um livro na posição i
            if(livros[i] != null){
                //verificando os generos literarios dos livros
                if (livros[i].genLiterario.equalsIgnoreCase("Drama"))
                    contraDrama++; // incremento contador de drama
                if (livros[i].genLiterario.equalsIgnoreCase("Suspense"))
                    contraSuspense++; // incremento contador de suspense
                else
                    contaOutros++; // incremento contador de outros tipos

                qtdLivrosEstante++; // incrementando a qcontagem de livros
            }
        }

        //apresentando as informações relativas a porcentagem de livros da estante
        System.out.println("Porcentagem de livros de cada genero");
        System.out.println("Drama: " +((double)contraDrama/qtdLivrosEstante)*100+ "%");
        System.out.println("Suspense: " +((double)contraSuspense/qtdLivrosEstante)*100+ "%");
        System.out.println("Outros generos: " +((double)contaOutros/qtdLivrosEstante)*100+ "%");

      //  double Drama = 0; // conta
        //double Suspense = 0; // conta
        //double Outros = 0; // conta
        //double totalLivros = 0;
        //double ptgDrama = 0;
        //double ptgSuspense = 0;
        //double ptgOutros = 0;
        // Percorrendo array de livros

        //for (int i = 0; i < livros.length; i++) {
          //  if (livros[i] != null) {
           //     totalLivros++;
            //    if (livros[i].genLiterario.equalsIgnoreCase("drama")) {
            //        Drama++;
             //   } else if (livros[i].genLiterario.equalsIgnoreCase("suspense")) {
                //    Suspense++;
              //  } else {
                    //Outros++;
              //  }
           // }
          //  ptgSuspense = (Suspense / totalLivros) * 100;
          //  ptgDrama = (Drama / totalLivros) * 100;
         //   ptgOutros = (Outros / totalLivros) * 100;
      // }

    }

        void livroMaisEMenosPag () {
            //variaveis locais para controle de fluxo
            int maiorNumPags = 0; // armazena maior numeros de paginas
            int menorNumPags = 999; // armazena menor numeros de paginas
            int posMaior = 0; // armazena a posição onde esta o livro com maior paginas
            int posMenor = 0; // armazena a posição onde esta o livro com menor paginas

            for (int i = 0; i < livros.length; i++) {
                if (livros[i] != null) {
                    if (livros[i].qtdFolhas > maiorNumPags) {
                        posMaior =i; // coletando a posição do livro com maior paginas
                        maiorNumPags = livros[i].qtdFolhas; // atribuindo a variavel o valor de paginas do livro

                    }
                    if (livros[i].qtdFolhas < menorNumPags) {
                        posMenor =i; // coletando a posição do livro com menor paginas
                        menorNumPags = livros[i].qtdFolhas; // atribuindo a variavel o valor de paginas do livro
                    }

                }

            }
            // mostrando informações
            if (posMaior == 0 && posMenor==0){
                System.out.println("Não ha informações de livros cadastrados");
            }else{
                //apresentando as informações dos livros
                System.out.println("Livros mais paginas");
                livros[posMaior].mostraInfos();

                System.out.println("Livros menos paginas");
                livros[posMenor].mostraInfos();
            }
        }

        //4. metodo para apresentar informações do livro e da estante
        void mostraInfos(){
            System.out.println("ID: " + this.idEstante);
            System.out.println("Letra: " + this.letra);
            System.out.println("INFOS DO LIVRO");

            for (int i = 0; i < livros.length; i++) {
                if (livros[i] != null) {
                    livros[i].mostraInfos();
                }
            }
        }
    }




