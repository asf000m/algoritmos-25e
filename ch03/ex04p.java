import java.util.*;
public class ex04p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Elaborar um programa que leia o valor numérico correspondente ao salário mensal (variável SM) de um trabalhador e também fazer a leitura do valor do percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS) após o armazenamento do cálculo em memória. */

        System.out.print("Digite salario mensal -> ");
        double sm = sc.nextDouble();
        System.out.print("Digite percentual de reajuste -> ");
        double pr = sc.nextDouble() / 100;

        double ns = sm * (1 + pr);
        
        System.out.println("Novo salario -> " + ns);
    }
}
