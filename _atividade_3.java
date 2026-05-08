package Java_Lista_11_ForEach_com_Vetor;

public class _atividade_3 {
    public static void main(String[] args) {
        int[] n1 = {12, 5, 8, 21, 30, 44, 7, 10, 15, 2, 19, 50, 3, 6, 88};

        int cp = 0;
        
        for (int n2 : n1) {
            if (n2 % 2 == 0) {
                cp++;
            }
        }
        
        System.out.println("O vetor contém "+cp+" números pares.");
    }
}
