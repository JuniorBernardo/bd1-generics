public class Main {
    public static void main(String[] args) {

        Lista<String> lista = new ListaVetor<>();

        // Inserindo valores
        lista.add("Banana");
        lista.add("Maçã");
        lista.add("Laranja");
        lista.add("Abacaxi");

        System.out.println("Lista inicial:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // Inserindo em posição específica
        lista.add("Uva", 1);

        System.out.println("\nApós adicionar Uva na posição 1:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // Removendo por posição
        System.out.println("\nRemovido da posição 2: " + lista.remove(2));

        // Removendo por valor
        System.out.println("Removeu Banana? " + lista.remove("Banana"));

        System.out.println("\nLista final:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // Utilizando ListaUtil
        System.out.println("\nCount: " + ListaUtil.count(lista));
        System.out.println("Max: " + ListaUtil.max(lista));
        System.out.println("Min: " + ListaUtil.min(lista));
    }
}