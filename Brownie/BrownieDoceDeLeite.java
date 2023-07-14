public class BrownieDoceDeLeite extends Brownie{
    //Construtor classe DoceDeLeite
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    //metodo
    public void adicionaDoceDeLeite(){
        System.out.println("Adicionando mais doce de leite!!!");
    }

    @Override
    public void calculaValorTotalCompra(){
        System.out.println("Calculando o valor total de compras de um: " +this.nome + ": " +this.preco);
    }
}
