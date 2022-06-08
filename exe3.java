package atv3;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3, media;
        String nome;
        System.out.println("Nome do aluno: ");
        nome = ler.nextLine();
        System.out.println("Insira a primeira nota do aluno: ");
        n1 = ler.nextInt();
        System.out.println("Insira a segunda nota do aluno: ");
        n2 = ler.nextInt();
        System.out.println("Insira a terceira nota do aluno: ");
        n3 = ler.nextInt();
        media = (n1 + n2 + n3) / 3;
        System.out.println("O aluno " + nome + " tem media total de: " + media);

    }
}
