package Java_Lista_11_ForEach_com_Vetor;

import java.util.Scanner;

public class _atividade_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n1 = {5, 12, 8, 5, 20, 5, 33, 8, 1, 5};

        System.out.println("Temos um vetor de números pré-definidos.");
        System.out.print("Digite um número para você poder pesquisar: ");
        int target = sc.nextInt();

        int c = 0;

        for (int n2 : n1) {
            if (n2 == target) {
                c++;
            }
        }

        System.out.println("O número "+target+" apareceu "+c+" vezes no vetor.");

        sc.close();
    }
}
