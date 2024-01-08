package programacaoestruturada.principaisfuncoes;

import java.util.*;
import java.text.SimpleDateFormat;


public class A03_principaisFuncoes {
    public static void main(String[] args) {
        // Scanner: usada para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("Você digitou: " + numero);


        // Locale: controla a formatação de dados com base na localização
        double valor = 1234.56;
        Locale.setDefault(Locale.US); // Define a localização para os EUA (ponto como separador decimal)
        System.out.println("Valor formatado: " + valor); // Imprime como 1234.56


        // Math: contém funções matemáticas comuns
        double raizQuadrada = Math.sqrt(25); // Raiz quadrada
        double seno = Math.sin(Math.PI / 2); // Seno de 90 graus (π/2 radianos)
        double potencia = Math.pow(2, 3); // 2 elevado a 3 (2^3)
        double arredondado = Math.round(4.6); // Arredonda para o número inteiro mais próximo


        System.out.println("Raiz quadrada de 25: " + raizQuadrada);
        System.out.println("Seno de 90 graus: " + seno);
        System.out.println("2 elevado a 3: " + potencia);
        System.out.println("Arredondado: " + arredondado);


        // String: para manipulação e operações com strings
        String texto = "Exemplo de texto";
        int tamanho = texto.length(); // Tamanho da string
        String maiusculas = texto.toUpperCase(); // Converte para maiúsculas
        boolean contem = texto.contains("Exemplo"); // Verifica se contém uma substring


        System.out.println("Tamanho da string: " + tamanho);
        System.out.println("Texto em maiúsculas: " + maiusculas);
        System.out.println("Contém 'Exemplo'?: " + contem);


        // Arrays: para operações com arrays (vetores)
        int[] numeros = {5, 2, 8, 1, 9};
        Arrays.sort(numeros); // Ordena o array
        int[] copiaNumeros = Arrays.copyOf(numeros, 3); // Copia os 3 primeiros elementos do array

        System.out.println("Array ordenado: " + Arrays.toString(numeros));
        System.out.println("Cópia dos primeiros 3 elementos: " + Arrays.toString(copiaNumeros));


        // Date e SimpleDateFormat: para manipular datas e formatá-las
        Date dataAtual = new Date(); // Data atual
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = formato.format(dataAtual);

        System.out.println("Data atual: " + dataFormatada);

        // Criando um objeto da classe Random
        Random gerador = new Random();

        // Gerando números aleatórios
        int numeroInteiro = gerador.nextInt(); // Gera um número inteiro aleatório
        double numeroDouble = gerador.nextDouble(); // Gera um número double entre 0.0 e 1.0
        boolean booleanAleatorio = gerador.nextBoolean(); // Gera um valor booleano aleatório

        // Gerando números dentro de um intervalo específico
        int numeroIntervalo = gerador.nextInt(100); // Gera um número inteiro entre 0 e 99

        System.out.println("Número inteiro aleatório: " + numeroInteiro);
        System.out.println("Número double aleatório: " + numeroDouble);
        System.out.println("Valor booleano aleatório: " + booleanAleatorio);
        System.out.println("Número entre 0 e 99: " + numeroIntervalo);
    }
}
