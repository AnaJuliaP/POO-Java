public class BrownieCafe extends Brownie{
    //Construtor da classe Cafe
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    //metodo
    public void adicionaCafe(){
        System.out.println("Adicionando mais café!!!");
    }

    @Override
    public void calculaValorTotalCompra(){
        System.out.println("Calculando o valor total de compras de um: " +this.nome + ": " +this.preco);
    }
}
