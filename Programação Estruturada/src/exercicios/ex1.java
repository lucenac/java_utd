package exercicios;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior, num1, num2, num3;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        maior = num1;

        if (num2 > maior) {
            maior = num2;
        }
        else if (num3 > maior) {
            maior = num3;
        }

        System.out.println(maior);
    }
}