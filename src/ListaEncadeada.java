public class ListaEncadeada<T> implements Lista<T> {
    private No<T> primeiro;
    private int tamanho = 0;

    private static class No<T> {
        T valor;
        No<T> proximo;

        No(T valor) {
            this.valor = valor;
        }
    }

    @Override
    public void add(T valor) {
        No<T> novo = new No<>(valor);
        if (primeiro == null) {
            primeiro = novo;
        } else {
            No<T> atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }

    @Override
    public void add(T valor, int pos) {
        if (pos == 0) {
            No<T> novo = new No<>(valor);
            novo.proximo = primeiro;
            primeiro = novo;
            tamanho++;
            return;
        }
        No<T> anterior = primeiro;
        for (int i = 0; i < pos - 1; i++) {
            anterior = anterior.proximo;
        }
        No<T> novo = new No<>(valor);
        novo.proximo = anterior.proximo;
        anterior.proximo = novo;
        tamanho++;
    }

    @Override
    public T get(int pos) {
        No<T> atual = primeiro;
        for (int i = 0; i < pos; i++) {
            atual = atual.proximo;
        }
        return atual.valor;
    }

    @Override
    public T remove(int pos) {
        if (pos == 0) {
            T valor = primeiro.valor;
            primeiro = primeiro.proximo;
            tamanho--;
            return valor;
        }
        No<T> anterior = primeiro;
        for (int i = 0; i < pos - 1; i++) {
            anterior = anterior.proximo;
        }
        No<T> removido = anterior.proximo;
        anterior.proximo = removido.proximo;
        tamanho--;
        return removido.valor;
    }

    @Override
    public boolean remove(T valor) {
        if (primeiro == null) {
            return false;
        }
        if (primeiro.valor.equals(valor)) {
            primeiro = primeiro.proximo;
            tamanho--;
            return true;
        }
        No<T> anterior = primeiro;
        while (anterior.proximo != null) {
            if (anterior.proximo.valor.equals(valor)) {
                anterior.proximo = anterior.proximo.proximo;
                tamanho--;
                return true;
            }
            anterior = anterior.proximo;
        }
        return false;
    }

    @Override
    public int size() {
        return tamanho;
    }
}