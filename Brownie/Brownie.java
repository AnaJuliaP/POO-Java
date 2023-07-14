public class Brownie {
    //Atributos
    protected String nome;
    protected double preco;
    protected String sabor;

    //Construtor Brownie
    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    // metodos
    public void addCarrinhoDeCompras(){
        System.out.println("Adicionando ao carrinho de compras: " + this.nome);
    }

    public void calculaValorTotalCompra(){
        System.out.println("Calculando o valor total de compras de um: " +this.nome + ": " +this.preco);
    }

    public void mostraInfo(){
        System.out.println("INFOS DOS BROWNIES");
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(sabor);
    }
}
