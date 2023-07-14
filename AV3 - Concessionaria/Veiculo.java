public class Veiculo implements Comparable<Veiculo> {
    //atributos de veiculo
    private String marca;
    private String modelo;
    private int ano;
    private double kmRodados;

    //compição
    Motor motor = new Motor();

    @Override
    public int compareTo(Veiculo o) {
        return Integer.compare(this.ano, o.ano); //comparação
    }

    //metodos
    public void mostraInfo(){
        System.out.println("++++ INFOS DO VEICULO ++++");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Ano: " +this.ano);
        System.out.println("KM Rodado: " +this.kmRodados);
    }

    //getters e setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
