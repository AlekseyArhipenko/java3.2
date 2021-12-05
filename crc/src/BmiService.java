public class BmiService {
    public float calculate(float height, int weight) {
        float index = weight / (height * height);
        return (float) index;
    }

}
