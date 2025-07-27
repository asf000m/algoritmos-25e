import java.util.*;
public class ex04k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Elaborar um programa que apresente o valor da conversão em real (R$) de um valor lido em dólar (US$). O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário e armazenar em memória o valor da conversão antes da apresentação. */

        System.out.print("Valor em dolar -> ");
        double dollar = sc.nextDouble();
        System.out.print("Cambio em reais -> ");
        double exchange = sc.nextDouble();

        double reais = dollar * exchange;
        System.out.println("Valor em reais -> " + reais);
    }
}
