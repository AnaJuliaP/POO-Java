public class Arma {
    //Atributos
    private int forca;
    private String tipoArma;

    //metodos
    public void mostraInfo(){
        System.out.println("-- INFORMAÇÕES DA ARMA --");
        System.out.println("Força: "+this.forca);
        System.out.println("Tipo da arma: "+this.tipoArma);

    }

    //Getters e setters
    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }
}
