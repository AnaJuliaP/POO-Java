public class Imobiliaria {
    //Atributos imobiliaria
    String nome;
    String telefone;
    String cidade;

    Apartamento apartamentos[] = new Apartamento[30];

    //construtor da imobiliaria
    public Imobiliaria(String nome, String telefone, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    //metodos
    void addApartamento(Apartamento apto){
        for (int i = 0; i < apartamentos.length; i++) {
            if (apartamentos[i] == null){
                apartamentos[i] = apto;
                break;
            }
        }

    }

    void mostraInfo(){
        System.out.println("INFOS DA IMOBILIARIA");
        System.out.println("Nome: "+this.nome);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Cidade: "+this.cidade);

        for (int i = 0; i < apartamentos.length; i++) {
            if (apartamentos[i] !=null){
                apartamentos[i].mostraInfo();
            }

        }
    }

    void ajustaAluguel(){
        double aux;
        for (int i = 0; i < apartamentos.length; i++) {
            if (apartamentos[i] != null){
                aux = (apartamentos[i].aluguel * 0.05);
                apartamentos[i].aluguel += aux;
                System.out.println("Ajuste valor aluguel: " + apartamentos[i].aluguel);
                break;
            }
        }
    }

    int mediaArea(){
        for (int i = 0; i < apartamentos.length; i++) {
            if (apartamentos[i] != null){
                if (apartamentos[i].numQuartos <= 2){
                    double media = apartamentos[i].area / apartamentos[i].numQuartos;
                    System.out.println("A media da area e: " + media);
                }
            }
        }

        return 0;
    }


}
