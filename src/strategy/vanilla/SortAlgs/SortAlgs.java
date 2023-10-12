public class SortAlgs {
    void bubbleSortInts(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) { // swap
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    void insertionSortInts(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j;
            for (j = i - 1; j >= 0 && data[j] > key; j--) {
                data[j + 1] = data[j];
            }
            data[j + 1] = key;
        }
    }

    void selectionSortInts(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIdx]) { // swap
                    minIdx = j;
                }
            }
            int temp = data[minIdx];
            data[minIdx] = data[i];
            data[i] = temp;
        }
    }

    void printInts(int[] data) {
        for (int i : data) {
            System.out.println(i);
        }
    }
}
