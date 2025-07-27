import java.util.*;
public class ex04b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de conversão é C ← ((F – 32) * 5) / 9, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. */

        System.out.print("Temperatura em Fahrenheit -> ");
        double fahrenheit = sc.nextDouble();

        double celcius = ((fahrenheit - 32) * 5) / 9;
        
        System.out.println("Temperatura em Celcius: "+ celcius +" ºC");
    }
}
