import java.util.*;
public class ex04d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /* Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 quilômetros por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto (variável TEMPO) e a velocidade média (variável VELOCIDADE) durante a viagem. Dessa forma, será possível obter a distância percorrida com a fórmula DISTÂNCIA ← TEMPO * VELOCIDADE. A partir do valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS ← DISTÂNCIA / 12. O programa deve apresentar os valores da velocidade média, tempo gasto na viagem, a distância percorrida e a quantidade de litros utilizada na viagem. */
        
        System.out.print("Tempo total da viagem em horas -> ");
        float time = sc.nextFloat();
        System.out.print("Velocidade média em km/h -> ");
        float velocity = sc.nextFloat();

        float distance = time * velocity;  // in km
        System.out.println("Distancia percorrida -> " + distance + " km");
        
        float gas_used = distance / 12;  // 12 km per L
        System.out.println("O combustível usado foi "+ gas_used +" L");
    }
}
