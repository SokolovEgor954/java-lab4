package lab4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] array1 = {25, -10, 5, 0, -2};
        byte[] array2 = {50, 30, 10, -5, -20};
        byte[] array3 = {8, -3, 8, 0, -3};
        byte[] array4 = {5};

        byte[] array1Bubble = array1.clone();
        byte[] array2Bubble = array2.clone();
        byte[] array3Bubble = array3.clone();
        byte[] array4Bubble = array4.clone();

        SortContext context = new SortContext(new InsertionSortStrategy());

        System.out.println("----- Сортування вставкою (Insertion Sort) -----");
        context.executeStrategy(array1);
        context.executeStrategy(array2);
        context.executeStrategy(array3);
        context.executeStrategy(array4);

        System.out.println("Array 1 result: " + Arrays.toString(array1));
        System.out.println("Array 2 result: " + Arrays.toString(array2));
        System.out.println("Array 3 result: " + Arrays.toString(array3));
        System.out.println("Array 4 result: " + Arrays.toString(array4));

        System.out.println("\nПеревірка виняткових ситуацій (Insertion Sort):");
        try {
            context.executeStrategy(null);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            context.executeStrategy(new byte[]{});
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        System.out.println("\n----- Сортування бульбашкою (Bubble Sort) -----");
        context.setStrategy(new BubbleSortStrategy());

        context.executeStrategy(array1Bubble);
        context.executeStrategy(array2Bubble);
        context.executeStrategy(array3Bubble);
        context.executeStrategy(array4Bubble);

        System.out.println("Array 1 result: " + Arrays.toString(array1Bubble));
        System.out.println("Array 2 result: " + Arrays.toString(array2Bubble));
        System.out.println("Array 3 result: " + Arrays.toString(array3Bubble));
        System.out.println("Array 4 result: " + Arrays.toString(array4Bubble));

        System.out.println("\nПеревірка виняткових ситуацій (Bubble Sort):");
        try {
            context.executeStrategy(null);
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        try {
            context.executeStrategy(new byte[]{});
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}