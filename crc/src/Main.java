public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        float height = (float) 1.58;
        int weight = 69;
        float index = service.calculate(height, weight);
        System.out.println(index);

    }
}