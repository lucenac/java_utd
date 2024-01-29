package application;

import entities.Cachorro;
import entities.Gato;

public class Program {
    public static void main(String[] args) {
        // Não podemos criar uma instância direta de Animal, pois é uma classe abstrata
        // Animal animal = new Animal(); // Isso gera um erro de compilação

        // Podemos criar instâncias de Cachorro e Gato, que são subclasses de Animal
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        // Chamando os métodos emitirSom e dormir de cada objeto
        cachorro.emitirSom();
        cachorro.dormir();

        gato.emitirSom();
        gato.dormir();
    }
}
