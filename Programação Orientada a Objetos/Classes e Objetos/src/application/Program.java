package application;

import entities.Carro;

public class Program {
    public static void main(String[] args) {
        // Criando objetos da classe Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, 75000.00);
        Carro carro2 = new Carro("Honda", "Civic", 2023, 80000.00);

        // Exibindo informações dos carros
        System.out.println("Informações do Carro 1:");
        carro1.exibirInformacoes();

        System.out.println("\nInformações do Carro 2:");
        carro2.exibirInformacoes();
    }
}