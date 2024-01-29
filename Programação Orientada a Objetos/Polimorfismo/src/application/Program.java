package application;

import entities.Animal;
import entities.Cachorro;
import entities.Gato;

public class Program {
    public static void main(String[] args) {
        // Criando objetos das classes Cachorro e Gato
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        // Chamando o método fazerSom para cada objeto
        animal1.fazerSom(); // Chama o método fazerSom de Cachorro
        animal2.fazerSom(); // Chama o método fazerSom de Gato
    }
}
