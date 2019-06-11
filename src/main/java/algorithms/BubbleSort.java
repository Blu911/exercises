package algorithms;

class BubbleSort {

    void sort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    void sortKobietyDoKodu(int[] collection) {
        for (int i = 0; i < collection
                .length; i++) {
            for (int j = 1; j < collection.length; j++) {
                if (collection[j] < collection[j - 1]) {
                    int temp = collection[j - 1];
                    collection[j - 1] = collection[j];
                    collection[j] = temp;
                }
            }
        }
    }
}
