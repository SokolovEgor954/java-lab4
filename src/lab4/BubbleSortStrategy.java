package lab4;

public class BubbleSortStrategy implements SortStrategy {
    @Override
    public void sort(byte[] array) {
        if (array == null){
            throw new NullPointerException("Масив не може бути null!");
        }
        if (array.length == 0){
            throw new IllegalArgumentException("Масив не може бути порожнім!");
        }
        if (array.length == 1){
            return;
        }

        boolean swapped;
        int n = array.length;
        do{
            swapped = false;
            for (int i = 0; i < n - 1; i++){
                if (array[i] > array[i + 1]){
                    byte temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}
