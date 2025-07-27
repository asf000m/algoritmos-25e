import java.util.*;
public class ex04l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Elaborar um programa que apresente o valor da conversão em dólar (US$) de um valor lido em real (R$). O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o usuário e armazenar em memória o valor da conversão antes da apresentação. */

        System.out.print("Valor em reais -> ");
        double reais = sc.nextDouble();
        System.out.print("Cambio em reais -> ");
        double exchange = sc.nextDouble();
    
        double dollar = reais / exchange;
        System.out.println("Valor em dolar -> " + dollar);
    }
}
