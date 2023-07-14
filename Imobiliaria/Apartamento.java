public class Apartamento {
    //Atributos apartamento
    String endereco;
    int numQuartos;
    double area;
    double aluguel;

    public Apartamento(String endereco, int numQuartos, double area, double aluguel) {
        this.endereco = endereco;
        this.numQuartos = numQuartos;
        this.area = area;
        this.aluguel = aluguel;
    }

    //metodos
    void mostraInfo(){
        System.out.println("O endereço do apartamento: "+endereco);
        System.out.println("O numero de quartos do aparatamento: "+numQuartos);
        System.out.println("A area do apartamento: "+area);
        System.out.println("O valor do aluguel do apartamento: "+aluguel);
    }
}
