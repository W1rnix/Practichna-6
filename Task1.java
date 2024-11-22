import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10]; 
        Random random = new Random();
        int even = 0, odd = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50); 
            if (array[i] % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Масив: ");
        for (int num : array) System.out.print(num + " ");
        System.out.println("\nПарних: " + even + ", Непарних: " + odd);
    }
}