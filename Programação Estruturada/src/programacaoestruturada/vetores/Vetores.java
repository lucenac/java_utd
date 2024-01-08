package programacaoestruturada.vetores;

public class Vetores {
    public static void main(String[] args) {
        // Declaração e inicialização de um vetor de inteiros
        int[] vetorInteiros = new int[5]; // Vetor de inteiros com 5 elementos

        // Atribuindo valores ao vetor
        vetorInteiros[0] = 10;
        vetorInteiros[1] = 20;
        vetorInteiros[2] = 30;
        vetorInteiros[3] = 40;
        vetorInteiros[4] = 50;

        // Acessando valores do vetor
        int primeiroElemento = vetorInteiros[0]; // Primeiro elemento do vetor
        int tamanhoVetor = vetorInteiros.length; // Tamanho do vetor (número de elementos)

        System.out.println("Primeiro elemento: " + primeiroElemento);
        System.out.println("Tamanho do vetor: " + tamanhoVetor);
    }
}
