public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = (float) 1.85;
        int weight = 90;
        float index = service.calculate(height, weight);
        System.out.println(index);

    }
}