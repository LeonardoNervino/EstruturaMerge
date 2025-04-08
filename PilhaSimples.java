class PilhaSimples {
    int[] pilha;
    int topo;
    int capacidade;

    public PilhaSimples(int capacidade) {
        this.capacidade = capacidade;
        pilha = new int[capacidade];
        topo = -1;
    }

    public void empilhar(int valor) {
        if (topo < capacidade - 1) {
            topo++;
            pilha[topo] = valor;
            System.out.println("Inserido: " + valor);
        } else {
            System.out.println("Pilha cheia.");
        }
    }

    public int desempilhar() {
        if (topo >= 0) {
            int valor = pilha[topo];
            topo--;
            System.out.println("Removido: " + valor);
            return valor;
        } else {
            System.out.println("Pilha vazia.");
            return -1;
        }
    }

    public void imprimir() {
        System.out.print("Pilha: ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }
}
