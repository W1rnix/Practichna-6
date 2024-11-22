import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Масив: ");
        for (int num : array) System.out.print(num + " ");

        System.out.print("\nЯке число замінити? ");
        int oldValue = scanner.nextInt();

        System.out.print("На яке число замінити? ");
        int newValue = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) array[i] = newValue;
        }

        System.out.println("Оновлений масив: ");
        for (int num : array) System.out.print(num + " ");
    }
}