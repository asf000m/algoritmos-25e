public class ex04d {
    public static void main(String[] args) {
        float time = 3;  // in hours
        float velocity = 80;  // in km/h
        float distance = time * velocity;  // in km
        float gas_used = distance / 12;  // 12 km per L
        System.out.println("The gas used was "+ gas_used +" L");
    }
}
