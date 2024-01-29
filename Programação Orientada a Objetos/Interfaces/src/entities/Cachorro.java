package entities;

public class Cachorro implements Animal {
    // Implementação do método emitirSom da interface Animal para Cachorro
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo: Au au!");
    }

    // Implementação do método dormir da interface Animal para Cachorro
    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo.");
    }
}