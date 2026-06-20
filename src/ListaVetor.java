public class ListaVetor<T> implements Lista<T> {
    private T[] itens = (T[]) new Object[100];
    private int tamanho = 0;

    @Override
    public void add(T valor, int pos) {
        for (int i = tamanho; i > pos; i--) {
            itens[i] = itens[i - 1];
        }
        itens[pos] = valor;
        tamanho++;
    }

    @Override
    public void add(T valor) {
        itens[tamanho] = valor;
        tamanho++;
    }

    @Override
    public T get(int pos) {
        return itens[pos];
    }

    @Override
    public T remove(int pos) {
        T valor = itens[pos];
        for (int i = pos; i < tamanho - 1; i++) {
            itens[i] = itens[i + 1];
        }
        tamanho--;
        return valor;
    }

    @Override
    public boolean remove(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (itens[i].equals(valor)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return tamanho;
    }
}