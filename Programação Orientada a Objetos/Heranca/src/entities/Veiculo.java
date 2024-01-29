package entities;

public class Veiculo {
    // Atributos da classe base Veiculo
    private String marca;
    private String modelo;
    private int ano;

    // Construtor da classe base Veiculo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para exibir informações do veículo
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}