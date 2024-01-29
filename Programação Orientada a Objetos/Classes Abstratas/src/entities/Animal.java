package entities;

public abstract class Animal {
    // Método abstrato (sem implementação) que deve ser sobrescrito pelas subclasses
    public abstract void emitirSom();

    // Método concreto (com implementação) compartilhado por todas as subclasses
    public void dormir() {
        System.out.println("O animal está dormindo.");
    }
}