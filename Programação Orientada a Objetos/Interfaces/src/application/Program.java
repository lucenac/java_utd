package application;

import entities.Cachorro;
import entities.Gato;

public class Program {
    public static void main(String[] args) {
        // Criando objetos das classes Cachorro e Gato
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        // Chamando os métodos emitirSom e dormir de cada objeto
        cachorro.emitirSom();
        cachorro.dormir();

        gato.emitirSom();
        gato.dormir();
    }
}
