import java.util.Stack;

public class pilha {
    public static void main(String[] args) {

        Stack<String> carros = new Stack<>();

        carros.push("Chevrolet");
        carros.push("Jeep");
        carros.push("Honda");
        carros.push("Ford");
        carros.push("Fiat");

        String front = carros.pop();
        System.out.println("O elemento removido é " + front);

        System.out.println("O elemento que está no topo da fila é " + carros.peek());

        boolean FilaVazia = carros.isEmpty();
        System.out.println("A fila está vazia? " + FilaVazia);
    }
}