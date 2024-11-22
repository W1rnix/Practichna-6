import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Виберіть (1 - зростання, 2 - спадання): ");
        int choice = scanner.nextInt();

        boolean sorted = true;
        if (choice == 1) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) sorted = false;
            }
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) sorted = false;
            }
        }

        if (sorted) System.out.println("Масив впорядкований.");
        else System.out.println("Масив НЕ впорядкований.");
    }
}