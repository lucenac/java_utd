package application;

import entities.Carro;

public class Program {
    public static void main(String[] args) {
        // Criando objeto da classe Carro
        Carro carro = new Carro("Toyota", "Corolla", 2022, 75000.00);

        // Exibindo informações do carro
        System.out.println("Informações do Carro:");
        carro.exibirInformacoes();

        // Modificando o preço do carro usando o método setter
        carro.setPreco(80000.00);

        // Exibindo informações atualizadas do carro
        System.out.println("\nInformações do Carro após alteração de preço:");
        carro.exibirInformacoes();
    }
}
