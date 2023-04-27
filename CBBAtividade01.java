/**
 * implemente e execute uma classe que construa 
um array com capacidade de armazenar 100 inteiros. Inicialize então cada 
elemento do array com os números de 0 até 99 e imprima-os por intermédio de uma 
estrutura for, como foi exemplifi cado. 
 */

public class CBBAtividade01 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);
        }
    }
}