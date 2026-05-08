package Java_Lista_11_ForEach_com_Vetor;

public class _atividade_8 {
    public static void main(String[] args) {
        String[] w1 = { "Java", "Programação", "Jogos", "Computador", "Nostálgia", "Desenvolvimento", "Antiguidades", "Algoritmo", "Internet", "Bola" };

        System.out.println("Palavras com mais de 5 letras:");

        for (String w2 : w1) {
            if (w2.length() > 5) {
                System.out.println(w2);
            }
        }
    }
}
