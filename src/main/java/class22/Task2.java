package class22;

public class Task2 {
    public double averageFromArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        return sum / arr.length;
    }
}
