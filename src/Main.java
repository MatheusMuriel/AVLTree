import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList<String> linhasEntrada = new ArrayList();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;

            for(int i = 1; (st=br.readLine()) != null; i++){
                linhasEntrada.add(st);
            }
            processaEntrada(linhasEntrada);

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
     * @param entrada Lista contendo as linahs de entrada
     */
    private static void processaEntrada(ArrayList<String> entrada) {
        int quantNosExist = 0;
        int noAInserir = 0;

        //Primeira linha
        quantNosExist = Integer.valueOf(entrada.get(0));


        //Segunda linha
        ArrayList<Integer> nosDaArvore = new ArrayList<Integer>();
        String segundaLinha = entrada.get(1);
        for(int i = 0; segundaLinha.length() != 0; i++){

            try{
                /**
                 * Pega o primeiro numero até o espaço e adiciona na lista
                 */
                String numDaVez = segundaLinha.substring(0, segundaLinha.indexOf(" "));
                nosDaArvore.add(Integer.valueOf(numDaVez));
                /**
                 * Retira da string o numero que já foi adicionado na lista
                 */
                segundaLinha = segundaLinha.substring(segundaLinha.indexOf(" ") + 1, segundaLinha.length());
            }catch (StringIndexOutOfBoundsException e){
                //Não encontrou nenhum espaço
                nosDaArvore.add(Integer.valueOf(segundaLinha));
                break;
            }

        }


        //Terceira linha
        noAInserir = Integer.valueOf(entrada.get(2));


        construirArvore(nosDaArvore);
    }

    /**
     * Metodo que recebe uma lista de valores e constroi uma arvore
     * Essa arvore é da clase AVLTree e é preenchida com a classe AVLTree.Node
     * @param nosDaArvore lista contendo os valores da arvore
     */
    private static void construirArvore(ArrayList<Integer> nosDaArvore) {

        AVLTree tree = new AVLTree();
        for (int i:nosDaArvore) {
            tree.inserir(i);
        }
        System.out.println("Teste");
    }
}
