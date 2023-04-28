/**
 * Implemente e execute uma nova classe que construa um array com capacidade de armazenar 100 inteiros, mas dessa vez inicialize cada elemento 
do array com os números de 1 até 100 e imprima-os por meio de uma estrutura for, 
conforme foi exemplifi cado.
 */

public class CBBAtividade02 {
    public static void main(String[] args) {
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}