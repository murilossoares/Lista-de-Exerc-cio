package atv2;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, soma, div, mult, sub;
        System.out.println("Digite o primeiro número: ");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = ler.nextInt();
        soma = n1 + n2;
        div = n1 / n2;
        mult = n1 * n2;
        sub = n1 - n2;
        System.out.println("O resultado da soma é: " + soma);
        System.out.println("O resultado da divisão é: " + div);
        System.out.println("O resultado da multiplicação é: " + mult);
        System.out.println("O resultado da subtração é: " + sub);

    }
}
