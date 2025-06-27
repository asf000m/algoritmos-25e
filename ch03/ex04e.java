public class ex04e {
    public static void main(String[] args) {
        double value = 405.34;  // in dolars
        double interest_rate = 2;  // in % a.m.
        int time = 36;  // in months
        double installment = value + (value * (interest_rate / 100) * time);
        System.out.println("The installment will be $ "+ installment +" per month");
    }
}
