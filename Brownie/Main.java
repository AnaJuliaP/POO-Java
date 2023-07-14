public class Main {
    public static void main(String[] args) {
        BrownieNutella bn = new BrownieNutella("BrownieNutella", 15, "Nutella");
        BrownieCafe bc = new BrownieCafe("BrownieCafe", 10, "Café");
        BrownieDoceDeLeite bd = new BrownieDoceDeLeite("BrownieDoceDeLeite",20, "Doce de Leite");

        bn.mostraInfo();
        bn.adicionaNutella();


        bc.mostraInfo();
        bc.adicionaCafe();

        bd.mostraInfo();
        bd.adicionaDoceDeLeite();

    }
}
