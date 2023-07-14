public class TerraMedia {
    //Arrays de habitantes
    private Habitante [] herois = new Habitante[100];

    //metodos
    public void addHabitante(Habitante habitante){
        // Percorrendo array de herois
        for (int i = 0; i < herois.length; i++) {
            if(herois[i] == null){
                herois[i] = habitante;
                break;
            }
        }
    }

    public void listarHabitantes() {
        for (int i = 0; i < herois.length; i++) {
            if (herois[i] != null) {
                if (herois[i] instanceof Anao) {
                    // Realizando casting para Anao
                    Anao auxAnao = (Anao) herois[i];
                    auxAnao.mostraInfo();
                    auxAnao.minerar();
                    auxAnao.atacar();
                } else if (herois[i] instanceof Elfo) {
                    // Realizando casting para Elfo
                    Elfo auxElfo = (Elfo) herois[i];
                    auxElfo.mostraInfo();
                    auxElfo.atacar();
                    auxElfo.viajar();
                    auxElfo.curar();
                } else {
                    // Realizando casting para Mago
                    Mago auxMago = (Mago) herois[i];
                    auxMago.mostraInfo();
                    auxMago.lancarFeitico();
                    auxMago.atacar();
                    auxMago.curar();
                }

            }

        }

    }

}
