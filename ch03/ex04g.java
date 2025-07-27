import java.util.*;
public class ex04g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Ler quatro valores numéricos inteiros e apresentar os resultados armazenados em memória das adições e multiplicações utilizando o mesmo raciocínio aplicado quando do uso de propriedades distributivas para a máxima combinação possível entre as quatro variáveis. Não é para calcular a propriedade distributiva, deve-se apenas usar a sua forma de combinação. Considerando a leitura de valores para as variáveis A, B, C e D, devem ser feitas seis adições e seis multiplicações, ou seja, deve ser combinada a variável A com a variável B, a variável A com a variável C, a variável A com a variável D. Depois, é necessário combinar a variável B com a variável C e a variável B com a variável D e, por fim, a variável C será combinada com a variável D. */

        System.out.println("Digite 4 valores ->");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int add_ab = a + b;
        int add_ac = a + c;
        int add_ad = a + d;
        int add_bc = b + c;
        int add_bd = b + d;
        int add_cd = c + d;
        int mult_ab = a * b;
        int mult_ac = a * c;
        int mult_ad = a * d;
        int mult_bc = b * c;
        int mult_bd = b * d;
        int mult_cd = c * d;
        System.out.println("A+B: "+ add_ab);
        System.out.println("A+C: "+ add_ac);
        System.out.println("A+D: "+ add_ad);
        System.out.println("B+C: "+ add_bc);
        System.out.println("B+D: "+ add_bd);
        System.out.println("C+D: "+ add_cd);
        System.out.println("A*B: "+ mult_ab);
        System.out.println("A*C: "+ mult_ac);
        System.out.println("A*D: "+ mult_ad);
        System.out.println("B*C: "+ mult_bc);
        System.out.println("B*D: "+ mult_bd);
        System.out.println("C*D: "+ mult_cd);
    }
}
