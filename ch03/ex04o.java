import java.util.*;
public class ex04o {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Elaborar um programa que leia quatro valores numéricos inteiros (variáveis A, B, C e D). Ao final, o programa deve apresentar o resultado, armazenado em memória, do produto (variável P) do primeiro com o terceiro valor, e o resultado da soma (variável S) do segundo com o quarto valor. */

        System.out.print("Valor a -> ");
        int a = sc.nextInt();
        System.out.print("Valor b -> ");
        int b = sc.nextInt();
        System.out.print("Valor c -> ");
        int c = sc.nextInt();
        System.out.print("Valor d -> ");
        int d = sc.nextInt();

        int p = a * c;
        int s = b + d;

        System.out.println("Resultado produto a * c -> " + p);
        System.out.println("Resultado soma b + d -> " + s);
    }
}
