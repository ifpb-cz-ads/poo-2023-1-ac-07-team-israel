/**
Implemente e execute no NetBeans uma nova classe semelhante à da 
Atividade 1, mas desta vez modifi que os parâmetros da estrutura for
para forçar a saída de um erro no sistema, forçando o lançamento de uma Exception
(vide caixa de ênfase anterior).
 */

public class CBBAtividade04 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < 101; i++) {
            array[i] = i;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);
        }
    }
}
