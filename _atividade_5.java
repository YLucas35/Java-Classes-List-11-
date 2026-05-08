package Java_Lista_11_ForEach_com_Vetor;

public class _atividade_5 {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Tabuada do número 5:");

        for (int n2 : n1) {
            int result = 5 * n2;
            
            System.out.println("5 x "+n2+" = "+result);
        }
    }
}
