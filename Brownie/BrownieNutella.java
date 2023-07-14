public class BrownieNutella extends Brownie {
    //construtor da classe BrownieNutella
    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    //metodos
    public void adicionaNutella(){
        System.out.println("Adicionando mais Nutella!!!");
    }

    @Override
    public void calculaValorTotalCompra(){
        System.out.println("Calculando o valor total de compras de um: " +this.nome + ": " +this.preco);
    }

}
