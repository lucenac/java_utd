package programacaoestruturada.repeticoes;

public class A05_Repticoes {
    public static void main(String[] args) {
        // Exemplo de while: executa o bloco de código enquanto a condição é verdadeira
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Exemplo de do-while: executa o bloco de código pelo menos uma vez e continua enquanto a condição é verdadeira
        int i = 0;
        do {
            System.out.println("i: " + i);
            i++;
        } while (i < 3);

        // Exemplo de for: executa um bloco de código um número específico de vezes
        for (int j = 0; j < 4; j++) {
            System.out.println("j: " + j);
        }

        // Exemplo de for-each: percorre elementos em um array ou coleção
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }
    }
}
