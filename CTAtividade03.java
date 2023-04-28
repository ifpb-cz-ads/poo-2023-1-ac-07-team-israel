/**
 * Crie um programa que armazene um vetor com as notas de dez alunos, 
calcule e imprima a média dessas notas e depois informe a quantidade 
de notas acima e abaixo da média calculada
 */


import java.util.Scanner;

public class CTAtividade03 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[10];
        double media = 0;
        int acimaMedia = 0;
        int abaixoMedia = 0;
        
        // solicita as notas e armazena no vetor
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i+1) + ": ");
            notas[i] = input.nextDouble();
            media += notas[i];
        }
        
        // calcula a média das notas
        media /= notas.length;
        
        // conta a quantidade de notas acima e abaixo da média
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acimaMedia++;
            } else if (notas[i] < media) {
                abaixoMedia++;
            }
        }
        
        // imprime a média e a quantidade de notas acima e abaixo da média
        System.out.println("A média das notas é: " + media);
        System.out.println("Quantidade de notas acima da média: " + acimaMedia);
        System.out.println("Quantidade de notas abaixo da média: " + abaixoMedia);
    }
    
}
