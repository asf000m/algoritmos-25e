import java.util.*;
public class ex04i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Efetuar a leitura de um valor numérico inteiro e apresentar o resultado do valor lido elevado ao quadrado, sem efetuar o armazenamento do resultado em memória. */

        System.out.print("Valor inteiro -> ");
        int number = sc.nextInt();

        double square = Math.pow(number, 2);

        System.out.println("O quadrado de "+ number +" é "+ square);
    }
}
