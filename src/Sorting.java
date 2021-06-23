public class Sorting {

    //sort an array of Comparable objects using selection sorting
    //Time complexity: O(n^2)
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length-1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                }
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }


    //sort an array of Comparable objects using insertion sorting
    //Time complexity: O(n^2)
    public static void insertionSort(Comparable[] list) {
        //iterate through the list starting the 2nd element
        for (int index = 1; index < list.length; index++) {
            //comparable element is iterated along the list
            Comparable key = list[index];
            int position = index;

            //comparing value in current position with the previous, swaps if smaller
            while ((position > 0) && key.compareTo(list[position-1]) < 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}
