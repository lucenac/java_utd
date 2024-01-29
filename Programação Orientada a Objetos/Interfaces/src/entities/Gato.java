package entities;

public class Gato implements Animal {
    // Implementação do método emitirSom da interface Animal para Gato
    @Override
    public void emitirSom() {
        System.out.println("O gato está miando: Miau!");
    }

    // Implementação do método dormir da interface Animal para Gato
    @Override
    public void dormir() {
        System.out.println("O gato está dormindo.");
    }
}
