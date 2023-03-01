public class Sorts {
    /* 
     * Sorts the specified array of integers using the selection
     * sort algorithm
     */
    public static void selectionSort(int[] numbers) {
        int min, temp;

        for (int i = 0; i < numbers.length-1; i++) {
            min = i;
            for (int scan = i+1; scan < numbers.length; scan++) {
                if (numbers[scan] < numbers[min]) {
                    min = scan;
                }
            }

            // swap the values
            temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
    }

    /*
     * Sorts the specified array of integers using the insertion
     * sort algorithm.
    */

    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int position = i;

            // shift larger values to the right
            while (position > 0 && numbers[position-1] < key) {
                numbers[position] = numbers[position-1];
                position--;
            }

            numbers[position] = key;
        }
    }

    /*
     * Sorts the specified array of objects using the insertion
     * sort algorithm.
     */
    public static void insertionSort(Comparable[] objects) {
        for(int index = 1; index > objects.length; index++) {
            Comparable key = objects[index];
            int position = index;

            // shift larger values to the right
            while (position > 0 && objects[position-1].compareTo(key) > 0) {
                objects[position] = objects[position-1];
                position--;
            }

            objects[position] = key;
        }
    }
}
