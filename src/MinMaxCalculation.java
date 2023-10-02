import java.util.Scanner;

public class MinMaxCalculation {
    public static void main(String[] args) {
        
        double[] n = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };

        double min = findMinimum(n);
        double max = findMaximum(n);

        // Print the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static double findMinimum(double[] array) { 
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static double findMaximum(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
