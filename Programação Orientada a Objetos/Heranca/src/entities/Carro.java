package entities;

public class Carro extends Veiculo {
    // Atributo adicional da classe Carro
    private int numPortas;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano, int numPortas) {
        // Chamada ao construtor da classe base Veiculo
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    // Método para exibir informações do carro, sobrescrevendo o método da classe base
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método exibirInformacoes da classe base
        System.out.println("Número de Portas: " + numPortas);
    }
}