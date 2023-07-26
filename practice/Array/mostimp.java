import java.util.Arrays;

public class ConvertIntegerArray {

    public static void main(String[] args) {
        // Create an integer array
        int[] array = {1, 2, 3, 4, 5};

        // Convert the array to a string
        String string = Arrays.toString(array);

        // Convert the string to an integer number
        int number = Integer.parseInt(string);

        // Convert the integer number to an integer array
        int[] newArray = new int[5];
        for (int i = 0; i < 5; i++) {
            newArray[i] = number % 10;
            number /= 10;
        }

        // Print the new array
        System.out.println(Arrays.toString(newArray));
    }
}
