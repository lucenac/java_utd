package entities;

public class Gato extends Animal {
    // Sobrescrita do método fazerSom para o comportamento específico de Gato
    @Override
    public void fazerSom() {
        System.out.println("Miau!");
    }
}

