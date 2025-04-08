class MergeSimples {
    public static FilaSimples merge(FilaSimples a, FilaSimples b, int capacidadeTotal) {
        FilaSimples c = new FilaSimples(capacidadeTotal);

        while (!a.vazia() && !b.vazia()) {
            if (a.primeiro() <= b.primeiro()) {
                c.enfileirar(a.desenfileirar());
            } else {
                c.enfileirar(b.desenfileirar());
            }
        }

        while (!a.vazia()) {
            c.enfileirar(a.desenfileirar());
        }

        while (!b.vazia()) {
            c.enfileirar(b.desenfileirar());
        }

        return c;
    }
}
