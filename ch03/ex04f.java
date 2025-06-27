public class ex04f {
    public static void main(String[] args) {
        double a = 42, b = 30;
        double x = a;
        System.out.println("Value A: "+ a);
        System.out.println("Value B: "+ b);
        a = b;
        b = x;
        System.out.println("Value A: "+ a);
        System.out.println("Value B: " + b);
    }
}
