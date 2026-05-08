package Java_Lista_11_ForEach_com_Vetor;

public class _atividade_1 {
    public static void main(String[] args) {
        int[] n1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int sum = 0;
        
        for (int n2 : n1) {
            sum += n2;
        }
        
        System.out.println("A soma de todos os elementos é: "+sum);
    }
}
