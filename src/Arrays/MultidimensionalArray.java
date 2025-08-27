package Arrays;

public class MultidimensionalArray {

    static void main() {
        int[][] intArray = new int[10][20];

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        int[] ints = new int[20];
        insertIntoArray(ints, 0, 10);
        removeFromArray(ints, 10);
    }

    public static void insertIntoArray(int[] array, int insertIndex, int newValue) {
        //move elements below insertion point.
        for (int i = array.length - 1; i > insertIndex; i--) {
            array[i] = array[i - 1];
        }

        //insert new value
        array[insertIndex] = newValue;
    }

    public static void removeFromArray(int[] array, int removeIndex) {

        for (int i = removeIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }
}
