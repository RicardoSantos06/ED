import java.util.ArrayList;
import java.util.List;

public class ListaDePlanetas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Júpiter");
        lista.add("Saturno");
        lista.add("Mercúrio");
        lista.add("Terra");

        System.out.println("A lista é:");
        System.out.println(lista);

        String Y = lista.remove(1);
        System.out.println("O elemento removido da lista foi " + Y);

        lista.set(1, "Uranio");
        System.out.println("A lista atualizada é " + lista);

        String elemento = lista.get(1);
        System.out.println("O segundo elemento da lista é: " + elemento);
    }
}
