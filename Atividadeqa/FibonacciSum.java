public class FibonacciSum {

    // Método para calcular a soma dos primeiros n elementos da série de Fibonacci
    public static long sumFibonacci(int n) {
        if (n <= 0) return 0; // Verifica se o valor de n é inválido

        long a = 0; // Primeiro número da série de Fibonacci
        long b = 1; // Segundo número da série de Fibonacci
        long sum = a; // Inicializa a soma com o primeiro número

        for (int i = 1; i < n; i++) {
            long next = a + b; // Calcula o próximo número da série
            sum += next; // Adiciona o próximo número à soma
            a = b; // Atualiza o valor de a para o próximo número
            b = next; // Atualiza o valor de b para o próximo número
        }

        return sum; // Retorna a soma dos primeiros n números
    }

    public static void main(String[] args) {
        // Teste rápido no main (opcional)
        int n = 10; // Número de elementos da série
        System.out.println("A soma dos primeiros " + n + " elementos da série de Fibonacci é: " + sumFibonacci(n));
    }
}
