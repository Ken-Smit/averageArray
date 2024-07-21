//Kenneth Smith
//7-20-2024
//10.2

public class averageArrays {
    //Create short average array method
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    //Create int average array method
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    //Create long average array method
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    //Create double average array 
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Test arrays 
        short[] shortArray = {2, 4, 5, 8, 9};          
        int[] intArray = {100, 200, 300, 400};             
        long[] longArray = {10L, 20L, 30L};         
        double[] doubleArray = {1.6, 2.4, 3.3, 4.2, 5.5, 6.8}; 

        // Display original arrays and their averages
        // Display original arrays and their averages
        System.out.print("Original short array: ");
        printArray(shortArray);
        System.out.println("Average of short array: " + average(shortArray));

        System.out.print("\nOriginal int array: ");
        printArray(intArray);
        System.out.println("Average of int array: " + average(intArray));

        System.out.print("\nOriginal long array: ");
        printArray(longArray);
        System.out.println("Average of long array: " + average(longArray));

        System.out.print("\nOriginal double array: ");
        printArray(doubleArray);
        System.out.println("Average of double array: " + average(doubleArray));
    }

    
    // Helper method to print elements of short array
    public static void printArray(short[] array) {
        for (short num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Helper method to print elements of int array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Helper method to print elements of long array
    public static void printArray(long[] array) {
        for (long num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Helper method to print elements of double array
    public static void printArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
