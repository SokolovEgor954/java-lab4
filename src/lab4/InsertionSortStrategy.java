package lab4;

public class InsertionSortStrategy implements SortStrategy {

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

        for (int i = 1; i < array.length; i++){
            byte key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}


// 3 5 6 2 7 4
// 3 5 5 6 7 4
// 2 3 5 6 7 4