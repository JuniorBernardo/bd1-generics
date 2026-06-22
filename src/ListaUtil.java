public class ListaUtil {

    public static int count(Lista<?> lista) {
        return lista.size();
    }

    public static <T extends Comparable<? super T>> T max(Lista<T> lista) {
        if (lista.size() == 0) {
            return null;
        }

        T maior = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).compareTo(maior) > 0) {
                maior = lista.get(i);
            }
        }

        return maior;
    }

    public static <T extends Comparable<? super T>> T min(Lista<T> lista) {
        if (lista.size() == 0) {
            return null;
        }

        T menor = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).compareTo(menor) < 0) {
                menor = lista.get(i);
            }
        }

        return menor;
    }
}