public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("zezinho",8);
        Boi boi = new Boi("chico", 10);
        Lontra lontra = new Lontra("Joao", 5);

        cachorro.mostraInfo();
        cachorro.emitirSom();

        boi.mostraInfo();
        boi.emitirSom();

        lontra.mostraInfo();
        lontra.emitirSom();
    }
}
