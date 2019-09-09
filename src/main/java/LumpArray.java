import java.util.Scanner;

public class LumpArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array = new int[array1.length + array2.length];

        System.out.println("Enter array 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter element " + (i + 1) + " :");
            array1[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Enter array 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter element " + (i + 1) + " :");
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array[array1.length + i] = array2[i];
        }
        System.out.println("New Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
