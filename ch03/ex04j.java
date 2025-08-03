import java.util.*;
public class ex04j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Ler dois valores numéricos inteiros (representados pelas variáveis A e B) e apresentar o resultado armazenado em memória do quadrado da diferença do primeiro valor (variável A) em relação ao segundo valor (variável B). */

        System.out.print("Valor A -> ");
        int a = sc.nextInt();
        System.out.print("Valor B -> ");
        int b = sc.nextInt();

        double result = Math.pow((a - b), 2);

        System.out.println("Resultado -> " + result);
    }
}
