public class AVLTree {
    private Node root;

    public void inserir(int valor){
        if (root == null){
            //Arvore ainda esta vazia
            root = new Node(valor, null);
        } else {

            //Começa em um nó

            //ve se é maior ou menor

            //Vai para uma direção de acordo com isso

            //faz isso até chegar onde:
                //Não tem nó a esrda e nem a direita

            Node i = root;
            while(true){
                if (valor == i.getValor()){
                    //Esse numero já esta na lista
                    
                } else if(valor > i.getValor()){
                    //vai para a direita

                } else if (valor < i.getValor()){
                    //vai para esquerda

                }


            }



        }
    }


    /**
     * Classe do Objeto "Nó" que vai ser o dado da arvore
     * @author MatheusMuriel
     */
    public static class Node {
        int valor;
        int altura;
        Node esquerdo;
        Node direito;
        Node pai;

        public Node(int valor, Node pai) {
            this.valor = valor;
            this.pai   = pai;
        }

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        public Node getEsquerdo() {
            return esquerdo;
        }

        public void setEsquerdo(Node esquerdo) {
            this.esquerdo = esquerdo;
        }

        public Node getDireito() {
            return direito;
        }

        public void setDireito(Node direito) {
            this.direito = direito;
        }
    }
}
