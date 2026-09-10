//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Viralbhai Patel
 */
public class Lab1 {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }

    public static double average(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return (double) total / nums.length;
    }

    public static int max(int[] nums) {
        int maxValue = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }

    public static int min(int[] nums) {
        int minValue = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        int[] array = {5, 9, 3, 12, 7, 3, 11, 5};
        System.out.println("=== ARRAY OUTPUT ===");
        System.out.print("Array in order (while loop): ");
        int index = 0;
        while (index < array.length) {
            System.out.print(array[index] + " ");
            index++;
        }
        System.out.println();
        System.out.print("Array in reverse (for loop): ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("First value: " + array[0]);
        System.out.println("Last value: " + array[array.length - 1]);

        System.out.println("\n=== METHOD CALLS ===");
        System.out.println("max(10, 5) = " + max(10, 5));
        System.out.println("min(10, 5) = " + min(10, 5));
        System.out.println("sum(array) = " + sum(array));
        System.out.println("average(array) = " + average(array));
        System.out.println("max(array) = " + max(array));
        System.out.println("min(array) = " + min(array));
    }
}
