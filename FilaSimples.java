class FilaSimples {
    int[] fila;
    int inicio, fim, tamanho, capacidade;

    public FilaSimples(int capacidade) {
        this.capacidade = capacidade;
        fila = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void enfileirar(int valor) {
        if (tamanho < capacidade) {
            fim = (fim + 1) % capacidade;
            fila[fim] = valor;
            tamanho++;
            System.out.println("Inserido: " + valor);
        } else {
            System.out.println("Fila cheia.");
        }
    }

    public int desenfileirar() {
        if (tamanho > 0) {
            int valor = fila[inicio];
            inicio = (inicio + 1) % capacidade;
            tamanho--;
            System.out.println("Removido: " + valor);
            return valor;
        } else {
            System.out.println("Fila vazia.");
            return -1;
        }
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public int primeiro() {
        if (tamanho > 0) {
            return fila[inicio];
        } else {
            return 99999; // valor alto para controle no merge
        }
    }

    public void imprimir() {
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            int index = (inicio + i) % capacidade;
            System.out.print(fila[index] + " ");
        }
        System.out.println();
    }
}
