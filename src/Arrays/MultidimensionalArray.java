package Arrays;

public class MultidimensionalArray {

    static void main() {
        int[][] intArray = new int[10][20];

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }

    }
}
