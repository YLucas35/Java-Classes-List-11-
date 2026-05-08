package Java_Lista_11_ForEach_com_Vetor;

import java.util.Random;

public class _atividade_9 {
    public static void main(String[] args) {
        char[] w1 = new char[20];
        Random random = new Random();

        for (int i = 0; i < w1.length; i++) {
            w1[i] = (char) (random.nextInt(26) + 'A');
        }

        System.out.print("Vetor gerado: ");
        for (char c : w1) {
            System.out.print(c);
        }
        System.out.println();
        
        int total = 0;
        for (char w2 : w1) {
            if (isVogal(w2)) {
                total++;
            }
        }

        System.out.println("Total de vogais encontradas: "+total);
    }
    
    public static boolean isVogal(char c) {
        c = Character.toUpperCase(c);
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
