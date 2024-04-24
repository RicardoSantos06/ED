import java.util.LinkedList;
import java.util.Queue;

public class fila {
    public static void main(String[] args) {

        Queue<String> carros = new LinkedList<>();

        carros.add("Chevrolet");
        carros.add("Jeep");
        carros.add("Honda");
        carros.add("Ford");
        carros.add("Fiat");

        String front = carros.poll();
        System.out.println("O elemento removido é " + front);

        System.out.println("O elemento que está no topo da fila é " + carros.peek());

        boolean Queue = carros.isEmpty();
        System.out.println("A fila está vazia? " + Queue);
    }
}
