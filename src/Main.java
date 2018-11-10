public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
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
}
