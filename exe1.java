package atv1;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, soma;
        System.out.println("Digite o primeiro número: ");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = ler.nextInt();
        soma = n1 + n2;
        System.out.println("O resultado é: " + soma);

    }
}