import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    //método que serve para escrever no arquivo
    public void escrever(Veiculo veiculo){
        //instanciando os objetos que permitirão a escrevita de dados
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            //abriando a saida de dados
            os = new FileOutputStream("veiculos.txt", true); //nome do arquivo onde sera salvo
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            //flag que indica onde começa as informações do veiculo
            bw.write("+++Veiculos+++ \n");
            bw.write(veiculo.getMarca() + "\n");
            bw.write(veiculo.getModelo() + "\n");
            bw.write(veiculo.getAno() + "\n");
            bw.write(veiculo.getKmRodados() +"\n");
        }catch(Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Veiculo> ler(){
        ArrayList<Veiculo> veiculoEncontrado = new ArrayList<>();
        //classes que permitem leitura de dados do arquivo
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        //variavel aux que servirá de flag para o while
        String linhaLer;

        try {
            // Instanciando os objetos
            is=new FileInputStream("veiculos.txt");
            isr=new InputStreamReader(is);
            br=new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer=br.readLine();

            while (linhaLer!=null){
                //comparando se o que esta em linhaLer é igual a minha flag
                if (linhaLer.contains("+++Veiculos+++")){
                    //variavel aux para veiculo
                    Veiculo veiculoAux = new Veiculo();

                    //criando um objeto do tipo livro com as váriaveis auxiliares
                    veiculoAux.setMarca(br.readLine());
                    veiculoAux.setModelo(br.readLine());
                    //para a quantidade de ano e  kmRodados fazer a conversão de String para Int
                    veiculoAux.setAno(Integer.parseInt(br.readLine()));
                    veiculoAux.setKmRodados(Double.parseDouble(br.readLine())); //conversão

                    //adicionando veiculos no array de veiculos
                    veiculoEncontrado.add(veiculoAux);
                }
                linhaLer= br.readLine();
            }
        }catch(Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println("ERRO: "+e);
            }
        }
        return veiculoEncontrado;
    }
}

