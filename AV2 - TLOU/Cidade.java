public class Cidade {
    //Atributos
    private String nome;
    //Arrays de personagem
    private Personagem [] personagens = new Personagem[10];

    //metodos
    public void adicionarPersonagens(Personagem p){
        // Percorrendo array de personagens
        for (int i = 0; i < personagens.length; i++) {
            if(personagens[i] == null){
                personagens[i] = p;
                break;
            }
        }

    }

    public void listarPersonagem(){
        for (int i = 0; i < personagens.length; i++){
            //verificando se existe algum personagem
            if (personagens[i] != null){
                //verificando qual tipo de personagem
                if (personagens[i] instanceof Humano){
                    //casting para humano
                    Humano auxHum = (Humano) personagens[i];
                    auxHum.mostraInfo();
                    auxHum.atacar();
                    auxHum.defender();
                    auxHum.modificarArma();
                }else if (personagens[i] instanceof Zumbi){
                    //casting zumbi
                    Zumbi auxZum = (Zumbi) personagens[i];
                    auxZum.transformacao();
                    auxZum.atacar();
                    auxZum.defender();
                    auxZum.infectou();
                    auxZum.mostraInfo();
                }
            }
        }
    }
}
