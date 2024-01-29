package entities;

public class Cachorro extends Animal {
    // Implementação do método emitirSom para a classe Cachorro
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo: Au au!");
    }
}