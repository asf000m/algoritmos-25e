import java.util.*;
public class ex04a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F ← C * 9 / 5 + 32, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. */

        System.out.print("Temperatura em celcius -> ");
        double celcius = sc.nextDouble();

        double fahrenheit = celcius * 9 / 5 + 32;

        System.out.println("Temperatura em Fahrenheit: "+ fahrenheit +" ºF");
    }
}
