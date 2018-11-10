import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File arquivoDeEntrada = new File("input.txt");
        ReadFile(arquivoDeEntrada);
    }

    /**
     * Metodo que le linha por linha os dados de um arquivo
     * @param file Arquivo a ser lido
     */
    public static void ReadFile(File file) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;

            for(int i = 1; (st=br.readLine()) != null; i++){
                processaEntrada(st, i);
            }

        }catch (java.io.FileNotFoundException e){
            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Após ler o arquivo de entrada, deve-se inserir cada um dos nós na árvore balanceada.
        No final deve ser salvo a saída do resultado da árvore em um arquivo,
        onde a primeira linha deve conter o valor dos nós em percurso em-ordem
        e a segunda em pré-ordem. Existem três tipos de percursos/caminhamentos
        em árvores binárias (pré-ordem, em-ordem, pós-ordem).
     * @param st
     * @param i
     */
    private static void processaEntrada(String st, int i) {

        System.out.println(st);

    }
}
