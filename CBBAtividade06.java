
/** uma classe que, por meio do Scanner, solicita 
10 números inteiros ao usuário. Então utilize um array para armazenar o valor desses 
números, imprima todos eles e por último mostre o número de maior valor.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;

public class CBBAtividade06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];

        // Solicita os números ao usuário
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número inteiro: ");
            numeros[i] = input.nextInt();
        }

        // Imprime os números
        System.out.println("Números digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Encontra o maior número
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("\nMaior número digitado: " + maior);
    }
}

