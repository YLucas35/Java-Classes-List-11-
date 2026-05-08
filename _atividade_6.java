package Java_Lista_11_ForEach_com_Vetor;

import java.util.Random;

public class _atividade_6 {
    public static void main(String[] args) {
        int[] n1 = new int[12];
        Random generator = new Random();

        for (int i = 0; i < n1.length; i++) {
            n1[i] = generator.nextInt(101);
        }
        
        System.out.print("Valores do vetor: ");
        for (int n : n1) {
            System.out.print(n);
        }
        
        int maior = n1[0];
        int menor = n1[0];
        
        for (int n2 : n1) {
            if (n2 > maior) {
                maior = n2;
            }
            if (n2 < menor) {
                menor = n2;
            }
        }
        
        System.out.println("O maior valor encontrado foi: "+maior);
        System.out.println("O menor valor encontrado foi: "+menor);
    }
}
