package exercicios;

public class ex2 {
    public static void main(String[] args) {


        for (int j = 0; j < 6; j++) {
            int checagem = 0;
            for (int i = 0; i < 6; i++) {
                int numero = (int) (Math.random() * 60) + 1;
                while (numero == checagem) {
                    numero = (int) (Math.random() * 60) + 1;
                }
                System.out.printf("%d ", numero);
                checagem = numero;
            }

            System.out.println("\n");
        }
    }
}
