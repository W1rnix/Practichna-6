public class Task2 {
    public static void main(String[] args) {
        int[] angles = {60, 60, 60}; 
        int sum = 0;

        for (int angle : angles) sum += angle;

        if (sum == 180 * (angles.length - 2)) {
            System.out.println("Багатокутник може існувати.");
        } else {
            System.out.println("Багатокутник НЕ може існувати.");
        }
    }
}