package programacaoestruturada.condicionais;

public class A04_Condicionais {

        public static void main(String[] args) {
            int numero = 20;

            // Exemplo de if: verifica se o número é maior que 10
            if (numero > 10) {
                System.out.println("O número é maior que 10");
            }

            // Exemplo de if...else: verifica se o número é positivo ou negativo
            if (numero >= 0) {
                System.out.println("O número é positivo ou zero");
            } else {
                System.out.println("O número é negativo");
            }

            // Exemplo de if...else if...else: verifica se o número é positivo, negativo ou zero
            if (numero > 0) {
                System.out.println("O número é positivo");
            } else if (numero < 0) {
                System.out.println("O número é negativo");
            } else {
                System.out.println("O número é zero");
            }

            // Exemplo de switch-case: verifica o valor de número e executa com base nos casos
            switch (numero) {
                case 1:
                    System.out.println("O número é 1");
                    break;
                case 2:
                    System.out.println("O número é 2");
                    break;
                case 3:
                    System.out.println("O número é 3");
                    break;
                default:
                    System.out.println("O número não é 1, 2 ou 3");
                    break;
            }
        }

}
