package Java_Lista_11_ForEach_com_Vetor;

public class _atividade_4 {
    public static void main(String[] args) {
        double[] n1 = {8.5, 7.0, 4.5, 9.2, 3.8, 6.5, 10.0, 5.2};

        System.out.println("Verificação de Notas:");

        for (double n2 : n1) {
            
            if (n2 < 5.0) {
                System.out.println("ALERTA: Nota "+n2+" está abaixo da média permitida!");
            }
        }

        System.out.println("Verificação concluída!");
    }
}
