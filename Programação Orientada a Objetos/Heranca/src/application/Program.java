package application;

import entities.Carro;

public class Program {
    public static void main(String[] args) {
        // Criando objeto da classe Carro
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);

        // Exibindo informações do carro
        System.out.println("Informações do Carro:");
        carro.exibirInformacoes();
    }
}
