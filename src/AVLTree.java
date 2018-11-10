public class AVLTree {
    private Node root;

    public void inserir(int valor){
        if (root == null){
            //Arvore ainda esta vazia
            root = new Node(valor, null);
        } else {

            Node i = root;
            while(true){
                if (valor == i.getValor()){
                    //Esse numero já esta na lista
                    break;
                } else if(valor > i.getValor()){
                    //verifica se existe um nó
                    if (i.getDireito() != null){
                        //vai para a direita
                        i = i.getDireito();
                    }else{
                        //insere aqui
                        i.setDireito(new Node(valor, i));
                    }

                } else if (valor < i.getValor()){
                    //verifica se existe um nó
                    if (i.getEsquerdo() != null){
                        //vai para esquerda
                        i = i.getEsquerdo();
                    }else{
                        i.setEsquerdo(new Node(valor, i));
                    }
                }
                balanceia(root);
            }

            //balanceia



        }
    }

    private void balanceia(Node root) {
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
