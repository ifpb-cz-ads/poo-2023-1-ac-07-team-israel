/**
Implemente e execute no NetBeans uma classe que constrói 
um array de Strings inicializado com os nomes dos sete dias da 
semana. Por exemplo:
String dias[ ] = {“Segunda”, “Terça”, “Quarta”, “Quinta”, “Sexta”, 
“Sábado”, “Domingo”};
Após isso, na mesma classe, utilize um laço while para imprimir o conteúdo desse array. 
Faça o mesmo com as declarações do-while e for.
 */

public class CBBAtividade05 {
    public static void main(String[] args) {
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        // Laço while
        int i = 0;
        while (i < dias.length) {
            System.out.println(dias[i]);
            i++;
        }

        // Laço do-while
        int j = 0;
        do {
            System.out.println(dias[j]);
            j++;
        } while (j < dias.length);

        // Laço for
        for (int k = 0; k < dias.length; k++) {
            System.out.println(dias[k]);
        }
    }
}

