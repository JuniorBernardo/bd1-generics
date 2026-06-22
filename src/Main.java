public class Main {
    public static void main(String[] args) {

        Lista<Integer> lista = new ListaVetor<>();

        lista.add(10);
        lista.add(5);
        lista.add(20);
        lista.add(15);

        System.out.println("Quantidade: " + ListaUtil.count(lista));
        System.out.println("Maior: " + ListaUtil.max(lista));
        System.out.println("Menor: " + ListaUtil.min(lista));
    }
}