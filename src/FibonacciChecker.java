import java.util.Scanner;
import java.util.HashSet;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        // Constrói a sequência de Fibonacci
        HashSet<Integer> fibonacciSet = new HashSet<>();
        int a = 0, b = 1;

        fibonacciSet.add(a);
        fibonacciSet.add(b);

        while (b < numero) {
            int proximo = a + b;
            fibonacciSet.add(proximo);
            a = b;
            b = proximo;
        }

        // Verifica se o número pertence à sequência
        if (fibonacciSet.contains(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
