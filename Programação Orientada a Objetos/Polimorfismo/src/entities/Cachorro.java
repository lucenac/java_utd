package entities;

public class Cachorro extends Animal {
    // Sobrescrita do método fazerSom para o comportamento específico de Cachorro
    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}
