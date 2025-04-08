public class Principal {
    public static void main(String[] args) {
        // Pilha
        PilhaSimples pilha = new PilhaSimples(10);
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.desempilhar();
        pilha.imprimir();

        // Filas
        FilaSimples filaA = new FilaSimples(10);
        FilaSimples filaB = new FilaSimples(10);

        int[] dadosA = {12, 35, 52, 64};
        int[] dadosB = {5, 15, 23, 55, 75};

        for (int i = 0; i < 4; i++) filaA.enfileirar(dadosA[i]);
        for (int i = 0; i < 5; i++) filaB.enfileirar(dadosB[i]);

        filaA.imprimir();
        filaB.imprimir();

        FilaSimples filaC = MergeSimples.merge(filaA, filaB, 20);
        filaC.imprimir();
    }
}
