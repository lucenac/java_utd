package programacaoestruturada.operadores;

public class Operadores {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Operadores aritméticos: são usados para realizar operações matemáticas
        int soma = a + b;       // Soma
        int subtracao = a - b;  // Subtração
        int multiplicacao = a * b;  // Multiplicação
        int divisao = a / b;    // Divisão
        int resto = a % b;      // Resto da divisão

        // Operadores de atribuição: são usados para atribuir valores a variáveis
        int c = 20;
        c += 5;  // Equivalente a: c = c + 5

        // Operadores de comparação: são usados para comparar valores
        boolean igual = (a == b);    // Igual a
        boolean diferente = (a != b); // Diferente de
        boolean maiorQue = (a > b);  // Maior que
        boolean menorQue = (a < b);  // Menor que
        boolean maiorIgual = (a >= b); // Maior ou igual a
        boolean menorIgual = (a <= b); // Menor ou igual a

        // Operadores lógicos: são usados para operações lógicas entre expressões
        boolean and = (a < 20 && b > 3); // AND lógico
        boolean or = (a < 20 || b > 3);  // OR lógico
        boolean not = !(a == b);         // NOT lógico

        // Operador de concatenação: usado para concatenar strings
        String texto1 = "Olá";
        String texto2 = "Mundo!";
        String resultado = texto1 + " " + texto2; // Resultado: "Olá Mundo!"
    }
}